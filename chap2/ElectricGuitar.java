class ElectricGuitar{
	
	String brand;
	int numOfPickup;
	boolean rockStarUseIt;

	void setBrand(String S){

		brand = S;
	}

	String getBrand(){

		return brand;

	}

	void setNumberOfPickup(int a){
    
        numOfPickup = a;
	}

	int getNumberOfPickup(){

		return numOfPickup;

	}


	public static void main(String[] args){
		ElectricGuitar e1 = new ElectricGuitar();
		e1.setBrand("hhhhh");
		System.out.println(e1.getBrand());
	}

}