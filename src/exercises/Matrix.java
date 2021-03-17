package exercises;

public class Matrix 
{
	public static void main(String args[])
	{
//		matrixMult();
		matrixDot();
	}
	
	public static void matrixMult()
	{
		int[][] m1 = 
		{
			{1, 2, 3},
//					{4, 5, 6},
			{7, 8, 9}
		};
		int[][] m2 = 
		{
			{9, 8, 7},
			{6, 5, 4},
			{3, 2, 1}
		};
		
		//Check if matrix dimensions can conform
		if (m1[0].length == m2.length)
		{
			int[][] result = new int[m1.length][m2[0].length];		//Resulting matrix
			
			//Multiplication
			for (int i=0; i<result.length; i++)
			{
				for (int j=0; j<result[i].length; j++)
				{
					for (int k=0; k<m2.length; k++)
					{
						result[i][j] += m1[i][k] * m2[k][j];
					}
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Matrices are not in the proper dimension");
		}
	}
	
	public static void matrixDot()
	{
		int[][] m1 = 
		{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] m2 = 
		{
			{9, 8, 7},
			{6, 5, 4},
			{3, 2, 1}
		};
		
		int[] result = new int[m1.length];		//Resulting vector
		
		//Dot product
		for (int i=0; i<m1.length; i++)
		{
			for (int j=0; j<m2.length; j++)
			{
				result[i] += m1[i][j] * m2[i][j];
//				System.out.print(result[i] + " ");
			}
			System.out.println(result[i] + " ");
//			System.out.println();
		}
	}
}
