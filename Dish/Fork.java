package Dish;
public class Fork extends Dish{
	private int numTeeth;
	void setnumTeeth(int numTeeth){
		this.numTeeth = numTeeth;
	}
	int getnumTeeth(){
		return numTeeth;
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
