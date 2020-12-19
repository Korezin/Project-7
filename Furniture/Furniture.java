package Furniture;
public abstract class Furniture {
	protected int square;
	protected int weight;
	protected int cost;
	abstract void setSquare(int Square);
	abstract int getSquare();
	abstract void setWeight(int weight);
	abstract int getWeight();
	abstract void setCost(int cost);
	abstract int getCost();
}
