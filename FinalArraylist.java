import java.util.ArrayList;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;
import java.util.*;

class Person {
	private String name;
	private int age;
	private char sex;

	Person(String name, int age, char sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public char getSex() {
		return this.sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Sex: " + sex;
	}
}
public class FinalArraylist {
	public static void main(String[] args) {
		final private ArrayList<Person> list = new ArrayList<>(); 

		System.out.println("This is Collection Program You can add/update or delete a person!");
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		char sex, choosed;
		do {
			System.out.println();
			System.out.println("Press \'a\' -> To Add");
			System.out.println("Press \'b\' -> To Update");
			System.out.println("Press \'c\' -> To Delete");
			System.out.println("Press \'d\' -> To Display all Person");
			System.out.println("Press \'q\' -> To quit Program");
			System.out.println();
			System.out.print("Choose One: ");
			choosed = input.next().charAt(0);
			Scanner scan = new Scanner(System.in);
			switch (choosed) {
				case 'a':
					add(scan,list);
					break;
				case 'b':
					update(scan,list);
					break;
				case 'c':
					delete(scan,list);
					break;
				case 'd':
					display(scan, list);
					break;
			}
		}while(choosed != 'q');
		
	}
	public static void add(Scanner scan, ArrayList<Person> list) {
		System.out.println();
		System.out.print("Enter Name: ");
		String name = scan.next();
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		System.out.print("Enter Sex: ");
		char sex = scan.next().charAt(0);
		list.add(new Person(name, age, sex));
		System.out.println();
		System.out.println("Record Entered");
	}
	public static void display(Scanner scan, ArrayList<Person> list) {
		System.out.println();
		if (list.size() > 0) {
			for (int i=0; i<list.size(); i++) {
				System.out.println("Record " + i +": -> " + list.get(i).toString());
			}
		} else System.out.println("There's No Record.");
		System.out.println();
	}
	public static void update(Scanner scan, ArrayList<Person> list) {
		System.out.println();
		display(scan, list);
		int rec=0;
		boolean cond=false;
		do {
			System.out.print("Which record do you want to update: ");
			try {
				rec = Integer.parseInt(scan.next());
				if (rec >= list.size()) {
					throw new IndexOutOfBoundsException();
				} else {
					cond=false;
				}
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Invalid record Entered");
				System.out.println("Record " + rec + ": Not Found.");
				cond = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Entered value must be Integer");
				cond = true;
			}
		}while(cond == true);
		System.out.print("Enter name: ");
		String name = scan.next();
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		System.out.print("Enter Sex: ");
		char sex = scan.next().charAt(0);
		list.get(rec).setName(name);
		list.get(rec).setAge(age);
		list.get(rec).setSex(sex);
		System.out.println("Record Updated.");
	}
	public static void delete(Scanner scan, ArrayList<Person> list) {
		System.out.println();
		display(scan, list);
		int rec=0;
		boolean cond=false;
		do {
			System.out.print("Which record do you want to deleted: ");
			try {
				rec = Integer.parseInt(scan.next());
				if (rec >= list.size()) {
					throw new IndexOutOfBoundsException();
				} else {
					cond=false;
				}
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Invalid record Entered");
				System.out.println("Record " + rec + ": Not Found.");
				cond = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Entered value must be Integer");
				cond = true;
			}
		}while(cond == true);
		list.remove(rec);
		System.out.println("Record Deleted.");
	}
}