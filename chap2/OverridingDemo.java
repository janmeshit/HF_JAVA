class OverridingDemo{
	private String name;
	private String college;

	public OverridingDemo(String n,String m){
		this.name = n;
		this.college = m;
	}

	public String toString(){
		return this.name + this.college;
	}

	public static void main(String[] args) {
		OverridingDemo od1 = new OverridingDemo("Janmesh","Umass");
		System.out.println(od1);

	}
}