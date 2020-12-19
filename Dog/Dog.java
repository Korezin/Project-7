package Dog;

public abstract class Dog {
	protected int growth;
	protected int weight;
	protected String color;
	protected int age;
	abstract void setGrowth(int growth);
	abstract int getGrowth();
	abstract void setWeight(int weight);
	abstract int getWeight();
	abstract void setColor(String color);
	abstract String getColor();
	abstract void setAge(int age);
	abstract int getAge();
}
