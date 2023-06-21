package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import modell.Student;

public class Control {
	
	List<Student> c=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void Insert()
	{
		System.out.print("Enter your Roll No :  ");
		int roll=Integer.parseInt(sc.nextLine());
		System.out.print("Enter your Name : ");
		String name=sc.nextLine();
		System.out.print("Enter your Address : ");
		String add=sc.nextLine();
		System.out.println(".......................................|");
		c.add(new Student(roll, name, add));
				
	}
	
	public void Show()
	{
		Iterator<Student> i=c.iterator();
		
		while(i.hasNext())
		{
			Student st=i.next();
			System.out.println(st);
			System.out.println(".......................................|");

		}
	}
	
	
	
	public void Search()
	{
		boolean found=false;
		
		System.out.print("Enter Roll No : ");
		int roll = Integer.parseInt(sc.nextLine());

		Iterator<Student> i=c.iterator();
		
		while (i.hasNext()) {
			Student st = i.next();

			if (st.getRoll() == roll)
			{
				System.out.println(st);
				System.out.println(".......................................|");
              found=true;
	     	}
		}
	
			if(!found)
			{
				System.out.println(" * Student is not found");
			}
		
	}
	
		public void Delete()
		{
			boolean found=false;
			
			System.out.print("Enter Roll No : ");
			int roll = Integer.parseInt(sc.nextLine());

			Iterator<Student> i=c.iterator();
			
			while (i.hasNext()) {
				Student st = i.next();

				if (st.getRoll() == roll) {
					
					i.remove();
					System.out.println("DATA-DELETE");
					found=true;
				
				}
				
			}
		
		if(!found)
		{
			System.out.println(" * Student is not found");
		}
		}
		
		
			public void Update()
			{
				boolean found=false;
				
				System.out.println("Enter Roll No : ");
				int roll = Integer.parseInt(sc.nextLine());

				ListIterator<Student> Li=c.listIterator();
				
				while (Li.hasNext()) 
				{
					Student st = Li.next();

					if (st.getRoll() == roll)
					{
				    System.out.print("Enter New Name : ");
				    String name=sc.nextLine();
				    System.out.println("NAME - UPDATE");
					System.out.println(".......................................|");

				    System.out.print("Enter New Address : ");
				    String add=sc.nextLine();
				    System.out.println("ADDRESS - UPDATE");

					System.out.println(".......................................|");

				    
				    Li.set(new Student(roll, name, add));
				    
				    found=true;
					
					}
					
				}
				if(!found)
				{
					System.out.println(" * Student is not found");
				}
					
		
}
}
