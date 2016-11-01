class TypeOfLoop{
	public  static void main(String[] args){
		int[] num = {1,3,4,5,5,777,78,45,67,78,98,23,45,56,67,78};

		for (int i=0; i<9;i++){
			System.out.print("Type 1 ");
			System.out.println(num[i]);
		}

		for (int item : num){
			System.out.print("Type 2 ");
			System.out.println(item);

		}


	}
}