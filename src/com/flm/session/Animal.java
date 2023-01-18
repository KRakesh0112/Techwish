package com.flm.session;

 abstract class Animal {
	 public String name;
	 public int numLegs;
	 public abstract void speak();
	 public abstract void eat();

	 public static class Dog extends Animal
	 {
    
	 public void speak(){
		 System.out.println("woof");
	 }
	 public void eat() {
		System.out.println("num num");
	}
		 
	 }
	 public static void main(String[] args)
	 {
	 Dog myDog = new Dog();
	 myDog.speak();
	 myDog.eat();
	 }
	 }


