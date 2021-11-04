public class Main{
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int []ans = new int [2];
		ans = Solution(brown, yellow);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}

	private static int[] Solution(int brown, int yellow) {
		int sum = brown + yellow;
		int x = 1;
		int y = 1;
		while(true)
		{
			if (2 * (x + 2) + 2 * y == brown)
				if ((x + 2) * (y + 2) == sum)
					break ;
			if (x * y > yellow)
			{
				y++;
				x = y - 1;
			}
			x++;
		}
		int[] answer = {x + 2, y + 2};
        return answer;
	}
}
//1 = 8
//2 = 10
//3 = 
//4 = 10