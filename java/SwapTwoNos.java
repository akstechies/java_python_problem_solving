class SwapTwoNos
{
	public static void main(String[] args) 
	{
		int a=10, b=20, temp;
		System.out.println(a + " " + b );

		// SWAP by using temp variables
		// A memory cell will be created in the memory of the same type occupying same memory in stack area of memory.
		temp = a;
		a = b;
		b = temp;

		System.out.println(a + " " + b );

		// using maths
		System.out.println("----- MATHS -----");
		a=29;
		b=54;
		a = a+b; // 10+20 = 30
		b = a-b; // 30 - 20 = 10
		a = a-b; // 30 - 10 = 20 

		System.out.println(a + " MATHS " + b );

		System.out.println("----- BITWISE XOR -----");
		int m=346, n=225;
		m = m ^ n;
        n = m ^ n;
        m = m ^ n;
 		
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
	}
}