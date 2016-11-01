import java.util.ArrayList;
class Alist{
	int height;
	int weight;

	public Alist(int a, int b){
		height = a;
		weight = b;
	}

	public static void main(String[] arg){
		Alist a1 = new Alist(10,20);
		Alist a2 = new Alist(100,820);
		Alist a3 = new Alist(103,620);
		Alist a4 = new Alist(105,520);

		ArrayList<Alist>  myList = new ArrayList<Alist>();
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
        
        boolean empt = myList.isEmpty();
		System.out.println(empt);
	}
}