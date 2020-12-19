package Dish;
public class Knife extends Dish{
	@Override
	void setMaterial(String material) {
		this.material = material;
	}
	@Override
	String getMaterial() {
		return material;
	}
}
