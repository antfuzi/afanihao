public class HighLow
{
	public static void main(String[] args)
	{
		int n = 9527;
		while (true)
		{
			int a = n % 10;
			System.out.print(a);
			n /= 10;
			if (n == 0)
			{
				break;
			}
			System.out.print("-");

		}
	}
}