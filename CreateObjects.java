package com.ibm.assignment.animal;

import java.io.BufferedReader;
import java.io.IOException;

import com.sun.tools.javac.util.List;

public class CreateObjects {
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
		
	for(Duck duck:ducklist)
		System.out.println(duck);
	
	for(fish fish:fishlist)
		System.out.println(fish);
		
	}

}
