public class Narcissus
{
	public static void main(String[] args)
	{
		for (int n = 100; n <= 999; n++)
		{
			int t = n;
			int a1 = t % 10;
			t = t / 10;
			int a2 = t % 10;
			int a3 = n / 100;
			if (a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3 == n)
			{
				System.out.println(n + " is narcissus");
			}
		}
	}
}