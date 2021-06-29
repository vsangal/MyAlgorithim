package algo;

public class SortBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 5, 1, 3, 4, 2, 7, 6 };
		// findAndPrintPairs(list, 5);
		// showList(list);
		bubblesort(list);
	}

	/*
	 * pre: list != null; post: sort the elements of list so that they are in
	 * ascending order
	 */
	public static void bubblesort(int[] list) {
		assert list != null : "failed precondition";

		int temp;
		boolean changed = true;
		for (int i = 0; i < list.length && changed; i++) {
			changed = false;
			for (int j = 0; j < list.length - i - 1; j++) {
				System.out.println("Inner loop j= " + j + " value at list =" + list[j]);
				if (list[j] > list[j + 1]) {
					changed = true;
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}

				showList(list);
			}
		}

		assert isAscending(list);
	}

	public static void showList(int[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	/*
	 * pre: list != null post: return true if list is sorted in ascedning order,
	 * false otherwise
	 */
	public static boolean isAscending(int[] list) {
		boolean ascending = true;
		int index = 1;
		while (ascending && index < list.length) {
			assert index >= 0 && index < list.length;

			ascending = (list[index - 1] <= list[index]);
			index++;
		}

		return ascending;
	}
}
