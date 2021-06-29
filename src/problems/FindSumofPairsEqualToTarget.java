package problems;

public class FindSumofPairsEqualToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = new int[]{ 5, 2, 3, 6, 5, 6, 7, 8, 1, 7};
		int target = 8;
		findAndPrintPairs(list, target);

	}

	/*
	 *pre: list != null
	 *post: prints out the indices and values of all pairs of numbers
	 *in list such that list[a] + list[b] = target
	 */
	public static void findAndPrintPairs(int[] list, int target)
	{	assert list != null : "failed precondition";

		for(int i = 0; i < list.length; i++)
		{	for(int j = i + 1; j < list.length; j++)
			{	if(list[i] + list[j] == target)
				{	System.out.println("The two elements at indices " + i + " and " + j
						+ " are " + list[i] + " and " + list[j] + " add up to " + target);
				}
			}
		}
	}
}
