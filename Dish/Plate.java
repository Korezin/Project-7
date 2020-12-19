package Dish;
public class Plate extends Dish{
	private int radiusPlate;
	void setradiusPlate(int radiusPlate){
		this.radiusPlate = radiusPlate;
	}
	int getradiusPlate(){
		return radiusPlate;
	}
	@Override
	void setMaterial(String material) {
		this.material = material;
	}
	@Override
	String getMaterial() {
		return material;
	}
}
