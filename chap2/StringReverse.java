class StringReverse{

	public static void reverse(String s1){
		char[] a = new char[s1.length()];
		int i=0;
		int j=s1.length()-1;
		char temp;
		while(i<=j){
           char temp = a[i];
           a[i] = a[j];
           a[j] = temp;
           i = i + 1;
           j = j - 1;

		}
		System.out.pritln(a);
	}
	public static void main(String[] args) {
		  reverse("janmesh");
	}
}