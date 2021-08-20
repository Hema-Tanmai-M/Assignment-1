package com.ibm.assignment.animal;

import java.util.*;

public class Fish
{
    private String name;
    private int size;
 
    public Fish(String name, int size)
    {
        this.name = name;
        this.size = size;
    }
 
    @Override
    public String toString()
    {
        return "{" +
                        "name='" + name + '\'' +
                        ", size=" + size +
                        '}';
    }
 
    public String getName() {
        return name;
    }
 
    public int getSize() {
        return size;
    }
}
 
/*
 * abstract class MyComparator implements Comparator<Fish> {
 * 
 * @Override public int compare(size s1,size s2) { if (s1.getSize() !=
 * s2.getSize()) { return s1.getSize() - s2.getSize(); } return
 * s1.getName().compareTo(s2.getName()); } }
 */
 
public class Sorting1
{
    public static void main(String[] args)
    {
        List<Fish> size = new ArrayList<>(Arrays.asList(
                                            new Fish("John", 15),
                                            new Fish("Sam", 25),
                                            new Fish("Will", 20),
                                            new Fish("Dan", 20),
                                            new Fish("Joe", 10)
                                        ));
 
        size.sort(Comparator.comparing(Fish::getSize)
                .thenComparing(Comparator.comparing(Fish::getName)));
        size.reverse(Comparator.comparing(Fish::getSize)
                .thenComparing(Comparator.comparing(Fish::getName)));

System.out.println(size);
    }
}