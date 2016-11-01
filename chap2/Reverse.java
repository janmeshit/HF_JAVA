class Reverse{

	public static void main(String[] args){

		int N = 123;
		int num = 0;

		while(N > 0){

			
			int r = N % 10;
			num = (10 * num )+ (r);
			N = N / 10;
			

		}

		System.out.println(num);
	}
}