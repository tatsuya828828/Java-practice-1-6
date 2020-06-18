package sort.main;
public class sort {
	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 155};
		java.util.Arrays.sort(heights);
		for(int h:heights) {
			System.out.println(h);
		}
	}
}