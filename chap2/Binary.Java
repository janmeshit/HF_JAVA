class Binary{

	public static void main (String [] arg){

		System.out.println("Hello");
		int v = 1;
		int N = 16;

		while(v < N){
			v = 2 * v;

		}
		System.out.println(v);

		while(v > 0){
			if (N >= v) {
				System.out.print(1);
				N = N - v;

			}
			else{

				System.out.print(0);

			}
			v = v / 2;
			
		}
	}

}