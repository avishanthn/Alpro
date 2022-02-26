class TestClass5026211096{

	public static void main(String args[]){
		ComputeMethods5026211096 c = new ComputeMethods5026211096();
		
		double celsius = c.fToC(100);
		System.out.println("100 F = "+celsius);
		
		double hypot = c.hypotenuse(6,8);
		System.out.println("The hypotenuse is "+hypot);
		
		int dice = c.roll();
		System.out.println("The sum of the two rolled dice is "+dice);
	}
}