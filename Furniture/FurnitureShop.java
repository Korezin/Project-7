package Furniture;

import java.util.Scanner;

public class FurnitureShop {
	private Sofa[] TypesOfSofa;
	private Armchair[] TypesOfArmchair;
	private Cupboard[] TypesOfCupboard;
	private Scanner scan = new Scanner(System.in);
	
	void newsofa(int i){
		TypesOfSofa = new Sofa[i];
		for(int j = 0; j < i; j++) {
			TypesOfSofa[j] = new Sofa();
			System.out.print("Площадь, занимаемая " + (j+1) + " диваном: ");
			TypesOfSofa[j].setSquare(scan.nextInt());
			System.out.print("Вес " + (j+1) + " дивана: ");
			TypesOfSofa[j].setWeight(scan.nextInt());
			System.out.print("Стоимость " + (j+1) + " дивана: ");
			TypesOfSofa[j].setCost(scan.nextInt());
		}
	}
	
	void newarmchair(int i){
		TypesOfArmchair = new Armchair[i];
		for(int j = 0; j < i; j++) {
			TypesOfArmchair[j] = new Armchair();
			System.out.print("Площадь, занимаемая " + (j+1) + " креслом: ");
			TypesOfArmchair[j].setSquare(scan.nextInt());
			System.out.print("Вес " + (j+1) + " кресла: ");
			TypesOfArmchair[j].setWeight(scan.nextInt());
			System.out.print("Стоимость " + (j+1) + " кресла: ");
			TypesOfArmchair[j].setCost(scan.nextInt());
		}
	}
	
	void newcupboard(int i){
		TypesOfCupboard = new Cupboard[i];
		for(int j = 0; j < i; j++) {
			TypesOfCupboard[j] = new Cupboard();
			System.out.print("Площадь, занимаемая " + (j+1) + " шкафом: ");
			TypesOfCupboard[j].setSquare(scan.nextInt());
			System.out.print("Вес " + (j+1) + " шкафа: ");
			TypesOfCupboard[j].setWeight(scan.nextInt());
			System.out.print("Стоимость " + (j+1) + " шкафа: ");
			TypesOfCupboard[j].setCost(scan.nextInt());
		}
	}
	
	public static void main(String[] args) {
		FurnitureShop shop = new FurnitureShop();
		
		System.out.print("Вариантов диванов в магазине: ");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		shop.newsofa(s);
		System.out.println();
		System.out.print("Вариантов кресел в магазине: ");
		s = scan.nextInt();
		shop.newarmchair(s);
		System.out.println();
		System.out.print("Вариантов шкафов в магазине: ");
		s = scan.nextInt();
		shop.newcupboard(s);
		
		System.out.println("\n");
		for(int j = 0; j <shop.TypesOfSofa.length ; j++) {
			System.out.println();
			System.out.println("Диван № " + (j+1) + ":");
			System.out.print("Занимаемая площадь: ");
			System.out.println(shop.TypesOfSofa[j].getSquare());
			System.out.print("Вес: ");
			System.out.println(shop.TypesOfSofa[j].getWeight());
			System.out.print("Стоимость: ");
			System.out.println(shop.TypesOfSofa[j].getCost());
		}
		
		System.out.println("\n");
		for(int j = 0; j < shop.TypesOfArmchair.length; j++) {
			System.out.println();
			System.out.println("Кресло № " + (j+1) + ":");
			System.out.print("Занимаемая площадь: ");
			System.out.println(shop.TypesOfArmchair[j].getSquare());
			System.out.print("Вес: ");
			System.out.println(shop.TypesOfArmchair[j].getWeight());
			System.out.print("Стоимость: ");
			System.out.println(shop.TypesOfArmchair[j].getCost());
		}
		
		System.out.println("\n");
		for(int j = 0; j < shop.TypesOfCupboard.length; j++) {
			System.out.println();
			System.out.println("Шкаф № " + (j+1) + ":");
			System.out.print("Занимаемая площадь: ");
			System.out.println(shop.TypesOfCupboard[j].getSquare());
			System.out.print("Вес: ");
			System.out.println(shop.TypesOfCupboard[j].getWeight());
			System.out.print("Стоимость: ");
			System.out.println(shop.TypesOfCupboard[j].getCost());
		}
	}
}
