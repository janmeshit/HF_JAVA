class SimpleDotComTestDrive{
	public static void main(String[] args) {
		int N = 125;
		for(int i=2; i<=10;i++){

			if(N % i == 0){
				System.out.println(i);
				N =N / i;
				i=i-1;
			
			}
				

		}
	}
}