package com.ibm.assignment.animal;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class FileHandling 
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		File file=new File("C:\\Users\\Ram\\eclipse-workspace\\Tanmai_Assignment1\\src\\com\\ibm\\assignment\\animal\\Data.txt");
		Scanner sc=null;
		try
		{
			sc=new Scanner(file);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		while(sc.hasNextLine())
			list.add(sc.next());
		
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(list);
		
		
	}

}
