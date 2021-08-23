package com.ibm.assignment.animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;

import com.sun.tools.javac.util.List;

public class Runner {
	public static void main(String[] args) throws IOException
	{
		String str;
		List<Duck> ducklist=new ArrayList<>();
		List<Fish> fishlist=new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\\ducks.txt")))
		{
		while((str=br.readLine())!=null)
		{
			String[] duckattribute=str.split(",");
			if(duckAttribute!=null&&duckattribute.length>=3)
			{
				Duck duck=new Duck(Integer.parseInt(duckattribute[0]), duckattribute[1], duckattribute[2]);
				
			}
			ducklist.add(duck);
		}
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\\fishes.txt")))
		{
		while((str=br.readLine())!=null)
		{
			String[] fishattribute=str.split(",");
			if(fishAttribute!=null && fishattribute.length>=4)
			{
				Fish fish=new fish(Integer.parseInt(fishattribute[0]), fishattribute[1], Integer.parseInt(ishattribute[2]), Boolean.valueOf(fishattribute[3]));
			}
			fishlist.add(fish);
		}
		
		System.out.println("Before Sorting Fishes");
		for(Fish fish: fishlist)
			System.out.println(fish);
		Collections.sort(fishlist);
		System.out.println("After Sorting Fishes");
		for(Fish fish:fishlist)
			System.out.println(fish);
		System.out.println("After Sorting fishes in descending order");
		Collections.sort(fishlist, (o1.o2)->o1.getSizeInFt()<o2.getSizeInFt()?1:-1);
		for(Fish fish:fishlist)
			System.out.println(fish);
		System.out.println("Printig Ducks");
		for(Duck duck:duckList)
			System.out.println(duck);
		ducklist=ducklist.stream().filter(duck->duck.beakColor.equalsIgnoreCase("brown"))
				.sorted((d1,d2)->d1.getAge()>d2.getAge()?1:-1)
				.collect(Collectors.toList());
		System.out.println("Printing Ducks after filter and sort");
		for(Duck duck:ducklist)
			System.out.println(duck);
		}
}
