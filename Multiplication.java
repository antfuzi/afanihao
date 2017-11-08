public class Multiplication
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++)
		{
			for (int n = 1; n <= i; n++)
			{
				System.out.print(n + "x" + i + "=" + (i * n) + "  ");

			}
			System.out.print("\n");
		}
	}
}