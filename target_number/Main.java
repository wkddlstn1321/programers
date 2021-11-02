import java.util.LinkedList;
import java.util.Queue;

public class Main{
	public static void main(String[] args) {
		int []num = {1,1,1,1,1};
		int target = 3;
		int res = solution(num, target);
		System.out.println(res);
	}
	private static int solution(int[] numbers, int target) {	
		int s = numbers.length;
		Queue<Integer> q = new LinkedList<>();
		q.offer(numbers[0]);
		q.offer(-numbers[0]);
		int answer = 0;
		int i = 1;
		int v = 0;
		int c = 1;
		while (i < s)
		{
			int a = q.peek();
			q.poll();
			q.offer(a + numbers[i]);
			q.offer(a - numbers[i]);
			v++;
			if (c * 2 == v)
			{
				i++;
				v = 0;
				c *= 2;
			}
		}
		while (!q.isEmpty())
		{
			int a = q.peek();
			if (a == target)
				answer += 1;
			q.poll();
		}
		return answer;
	}
}
//1 -1
//2 0 -1				1
//2 0 0 -2				2
//1 3 0 0 -2 			1
//1 3 -1 1 0 -2			2
//1 3 -1 1 1 -1 -2		3
//1 3 -1 1 1 -1 -1 -3	4