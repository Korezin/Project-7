package Dog;

public class Shepherd extends Dog{

	@Override
	void setGrowth(int growth) {
		this.growth = growth;
		
	}

	@Override
	int getGrowth() {
		return growth;
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
	void setColor(String color) {
		this.color = color;
		
	}

	@Override
	String getColor() {
		return color;
	}

	@Override
	void setAge(int age) {
		this.age = age;
		
	}

	@Override
	int getAge() {
		return age;
	}

}
