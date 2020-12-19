package Furniture;

public class Armchair extends Furniture{

	@Override
	void setSquare(int Square) {
		this.square = Square;
	}

	@Override
	int getSquare() {
		return square;
	}

	@Override
	void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	int getWeight() {
		return weight;
	}

	@Override
	void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	int getCost() {
		return cost;
	}

}
