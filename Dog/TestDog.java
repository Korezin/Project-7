package Dog;

import java.util.Scanner;

public class TestDog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dog dog1 = new Labrador();
		System.out.println("Лабрадор: ");
		System.out.print("Рост: ");
		dog1.setGrowth(scan.nextInt());
		System.out.print("Вес: ");
		dog1.setWeight(scan.nextInt());
		System.out.print("Окрас: ");
		dog1.setColor(scan.next());
		System.out.print("Возраст: ");
		dog1.setAge(scan.nextInt());
		System.out.println();
		
		Dog dog2 = new Pitbull();
		System.out.println("Питбуль: ");
		System.out.print("Рост: ");
		dog2.setGrowth(scan.nextInt());
		System.out.print("Вес: ");
		dog2.setWeight(scan.nextInt());
		System.out.print("Окрас: ");
		dog2.setColor(scan.next());
		System.out.print("Возраст: ");
		dog2.setAge(scan.nextInt());
		System.out.println();
		
		Dog dog3 = new Shepherd();
		System.out.println("Овчарка: ");
		System.out.print("Рост: ");
		dog3.setGrowth(scan.nextInt());
		System.out.print("Вес: ");
		dog3.setWeight(scan.nextInt());
		System.out.print("Окрас: ");
		dog3.setColor(scan.next());
		System.out.print("Возраст: ");
		dog3.setAge(scan.nextInt());
		System.out.println();
		
		
		System.out.println();
		System.out.println("Лабрадор: ");
		System.out.println("Рост: " + dog1.getGrowth());
		System.out.println("Вес: " + dog1.getWeight());
		System.out.println("Окрас: " + dog1.getColor());
		System.out.println("Возраст: " + dog1.getAge());
		System.out.println("\n");
		
		System.out.println("Питбуль: ");
		System.out.println("Рост: " + dog2.getGrowth());
		System.out.println("Вес: " + dog2.getWeight());
		System.out.println("Окрас: " + dog2.getColor());
		System.out.println("Возраст: " + dog2.getAge());
		System.out.println("\n");
		
		System.out.println("Овчарка: ");
		System.out.println("Рост: " + dog3.getGrowth());
		System.out.println("Вес: " + dog3.getWeight());
		System.out.println("Окрас: " + dog3.getColor());
		System.out.println("Возраст: " + dog3.getAge());
		System.out.println("\n");
	}
}
