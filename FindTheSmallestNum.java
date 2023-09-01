 class ABC 
{
	public static void main(String[] args) 
    {
		int a = 4;
		int b = 5;
		int c = 2;
		
		if(a/b == 0 && a/c == 0)
			System.out.println("a is the smallest");
		else if(b/a == 0 && b/c == 0)
			System.out.println("b is the smallest");
		else
			System.out.println("c is the smallest");
	}
}