package Dish;

import java.util.Scanner;

public class TestDish {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dish dish1 = new Plate();
		System.out.print("Материал тарелки: ");
		dish1.setMaterial(scan.next());
		System.out.print("Радиус тарелки: ");
		((Plate)dish1).setradiusPlate(scan.nextInt());
		System.out.println();
		
		Dish dish2 = new Fork();
		System.out.print("Материал вилки: ");
		dish2.setMaterial(scan.next());
		System.out.print("Количество зубцов вилки: ");
		((Fork)dish2).setnumTeeth(scan.nextInt());
		System.out.println();
		
		Dish dish3 = new Knife();
		System.out.print("Материал ножа: ");
		dish3.setMaterial(scan.next());
		System.out.println();
		
		Dish dish4 = new Spoon();
		System.out.print("Материал ложки: ");
		dish4.setMaterial(scan.next());
		System.out.println();
		
		System.out.println();
		System.out.println("Тарелка из " + dish1.getMaterial() + 
		", радиусом " + ((Plate)dish1).getradiusPlate());
		System.out.println("Вилка из " + dish2.getMaterial() + 
		", с " + ((Fork)dish2).getnumTeeth() + " зубцами");
		System.out.println("Нож из " + dish3.getMaterial());
		System.out.println("Ложка из " + dish4.getMaterial());
	}
}