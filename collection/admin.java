package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class admin {
	static Scanner in=new Scanner(System.in);
	private HashSet<book> hs=new HashSet<book>();
	 
public HashSet<book> getHs() {
		return hs;
	}
	public void setHs(HashSet<book> hs) {
		this.hs = hs;
	}
public void addbook()
{
	//add book
	System.out.println("enter book isbn");
	int isbn=in.nextInt();
	System.out.println("enter book title");
	String t=in.next();
	System.out.println("enter book author");
	String at=in.next();
	System.out.println("enter book quantity");
	int q=in.nextInt();
	book b=new book(isbn,t,at,q);
	hs.add(b);
	
}
public void display()
{
	System.out.println(hs);
}
public void menu(admin a)
{
	 System.out.println("select 1 to add book");
	 System.out.println("select 2 display");
	 System.out.println("select 3 search book");
	 System.out.println("select 4 borrow book");
	 System.out.println("select 5 return book");
	 System.out.println("select option");
	 int n=in.nextInt();
	 switch(n)
	 {
	 case 1:
		 System.out.println("how many books you wnt to add");
		 int cnt=in.nextInt();
		 int i=1;
		 while(i<=cnt)
		 {
			a.addbook();
			i++;
		 }
		System.out.println("do you want to continue if yes enter 'y' if not enter 'n'");
		String c=in.next();
		if(c.equals("y"))
		{
			a.menu(a);
		}
		
		 break;
		
	 case 2:
		a.display();
		System.out.println("do you want to continue if yes enter 'y' if not enter 'n'");
		String c1=in.next();
		if(c1.equals("y"))
		{
			a.menu(a);
		}
		
		
		 break;
		
	 case 3:
		 a.search();
		 System.out.println("do you want to continue if yes enter 'y' if not enter 'n'");
			String c2=in.next();
			if(c2.equals("y"))
			{
				a.menu(a);
			}
			else
			{
			 break;
			}
	 
	 case 4:
		 a.borrowbook();
		 System.out.println("do you want to continue if yes enter 'y' if not enter 'n'");
			String c3=in.next();
			if(c3.equals("y"))
			{
				a.menu(a);
			}
			
			 break;
	 case 5:
		 a.returnbook();
		 System.out.println("do you want to continue if yes enter 'y' if not enter 'n'");
			String c4=in.next();
			if(c4.equals("y"))
			{
				a.menu(a);
			}
			
			 break;
	 }

}
public void search()
{
	System.out.println("enter isbn");
	int n=in.nextInt();
	for(book b:hs)
	{
		if(b.getIsbn()==n)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("not found");
		}
	}
}
public void borrowbook()
{
	System.out.println("enter name of book");
	String str=in.next();
	System.out.println("book borrowed");
	for(book b:hs)
	{
		if(b.getTitle().equalsIgnoreCase(str))
		{
			b.setQuantity(b.getQuantity()-1);
		}
	}
}
public void returnbook()
{

	System.out.println("enter name of book");
	String str=in.next();
	System.out.println("return book");
	for(book b:hs)
	{
		if(b.getTitle().equalsIgnoreCase(str))
		{
			b.setQuantity(b.getQuantity()+1);
		}
	}
}
public static void main(String args[])
{
 admin a=new admin();
 a.menu(a);
}

}
