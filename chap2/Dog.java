class DogModel{
	int Size;
	String Name;
}
class Dog{
	void countdown(int n) {
        if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n-1);
		}
		}
	public static void main(String[] args) {
		
	
	Dog d = new Dog();
		d.countdown(10);
}
}