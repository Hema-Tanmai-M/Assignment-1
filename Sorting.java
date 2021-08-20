package com.ibm.assignment.animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
    Fish f1 = new Fish(12, True, 5, True, False, True);
    Fish f2 = new Fish(12, True, 5, True, False, True);
    Fish f3 = new Fish(12, True, 5, True, False, True);
    Fish f4 = new Fish(12, True, 5, True, False, True);
    Fish f5 = new Fish(12, True, 5, True, False, True);

    List<Fish> fish = new ArrayList<Fish>();
    fish.add(f1);
    fish.add(f2);
    fish.add(f3);
    fish.add(f4);
    fish.add(f5);

    // UnSorted List
    System.out.println(fish);

    Collections.sort(fish);

    // Default Sorting by employee id
    System.out.println(fish);
}
}