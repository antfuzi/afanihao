public class Five
{

	public static void main(String[] args)
	{
		double[] src =
		{ 4, 5.5, 6, 7.7 };
		double[] test = new double[src.length];
		for (int i = src.length - 1; i >= 0; i--)
		{
			for (int j = src.length - 1 - i;;)
			{
				test[j] = src[i];
				break;
			}
		}
		src = test;
		for (int k = 0; k < src.length; k++)
		{
			System.out.print(src[k] + " ");
		}
	}

}