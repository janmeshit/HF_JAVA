class SimpleLocation{
	double latitude;
	double longitude;

	public SimpleLocation(){
		latitude = 10.5;
		longitude = 23.5;
		System.out.println("constructor without parameter  " + latitude +" longitude is  "+longitude);
	}

	public SimpleLocation(double lat, double lon){
		this.latitude = lat;
		this.longitude = lon;

		
		System.out.println("constructor with parameter  " + latitude +" longitude is "+longitude);
	
	}

	public static void main(String[] args) {
		SimpleLocation s1 = new SimpleLocation();
		SimpleLocation s2 = new SimpleLocation(33.5,60.9);
	}
}