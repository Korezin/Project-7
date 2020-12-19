package Dish;
public class Spoon extends Dish{
	@Override
	void setMaterial(String material) {
		this.material = material;
	}
	@Override
	String getMaterial() {
		return material;
	}
}
