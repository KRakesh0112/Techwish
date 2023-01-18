package com.flm.session;

public class Person2 implements Comparable<Person2>
{
private String name;
private int age;
public Person2(String name, int age)
{
this.name = name;
this.age = age;
}
public int compareTo(Person2 other)
{
	return age;

}
public static void main(String[] args)
{
Person2 p1 = new Person2("Carlos",17);
Person2 p2 = new Person2("Lia",18);
Person2 p3 = new Person2("Asraf", 17);
Person2 p4 = new Person2("Lia", 17);
Person2 p5 = new Person2("Karla", 17);
System.out.println(p1.compareTo(p2));
System.out.println(p2.compareTo(p3));
System.out.println(p3.compareTo(p1));
System.out.println(p4.compareTo(p3));
System.out.println(p4.compareTo(p5));
}

}
