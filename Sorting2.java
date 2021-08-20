package com.ibm.assignment.animal;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Sorting2 
{

    public static void main(String args[]) {
        Set<Fish> set = new TreeSet<>();
        set.add(new Fish(12));
        set.add(new Fish(10));
        set.add(new Fish(8));
        set.add(new Fish(7));
        set.add(new Fish(6));

        List<Fish> list = new ArrayList<>();
        list.addAll(set);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    static class Fish implements Comparable<Fish> {
        int size;

        public Fish(int size) {
            this.size = size;
        }

        public int compareTo(Fish size) {
            return size.size.compareTo(this.size);
        }

        public int toInt() {
            return this.size;
        }
    }
}