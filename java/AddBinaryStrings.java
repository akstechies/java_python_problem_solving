class AddBinaryStrings
{
	public static void main(String[] args) 
	{
		String x = "011011", y = "1010111";

		System.out.println(addBinaryByParse(x, y));
	}

	static String addBinaryByParse(String x, String y)
	{
		//Parse to int at two decimal Places
		int a = Integer.parseInt(x, 2);
		int b = Integer.parseInt(y, 2);
		
		// Add them
		int c = a+b;

		// Convert sum to binary
		return Integer.toBinaryString(c);
	}
}