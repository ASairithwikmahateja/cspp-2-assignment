class Swap{
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c;
		c = a+b;
		a = c-a;
		b = c-b;
		System.out.println(a);
		System.out.println(b);
	}
}