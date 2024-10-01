package com.campusdual.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        String[] elements = {"ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD",
                "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"};
//        HashSet<String> newHashset = new HashSet<>();
//        for(String e: elements){
//            newHashset.add(e);
//        };
//        newHashset.addAll(Arrays.asList(elements));
        HashSet<String> newHashset = new HashSet<>(Arrays.asList(elements));
        System.out.println(newHashset);
        return newHashset;
    }

    public static Set<String> createTreeSet() {
        String[] elements = {"ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD",
                "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"};
//        TreeSet<String> newTreeset = new TreeSet<>();
//        for (String e: elements){
//            newTreeset.add(e);
//        }
        TreeSet<String> newTreeset = new TreeSet<>(Arrays.asList(elements));
        System.out.println(newTreeset);
        return newTreeset;
    }

    private static void printSet(Set<String> customSet) {
        for (String element: customSet){
            System.out.println(element);
        }
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
//        boolean addElement = set.add(elementToAdd);
//        return addElement;
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        HashSet<String> newHashset = (HashSet<String>) createHashSet();
        TreeSet<String> newTreeset = (TreeSet<String>) createTreeSet();
        addElementToSet(newHashset, "ELEMENT AAA");
        addElementToSet(newTreeset, "ELEMENT AAA");
        printSet(newHashset);
        printSet(newTreeset);
    }

}
