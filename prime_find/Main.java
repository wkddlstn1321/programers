import java.util.LinkedList;
import java.util.Queue;

public class Main{
	public static void main(String[] args) {
		String numbers = "17";
		int a = solution(numbers);
		System.out.println(a);
	}

	private static int solution(String numbers) {
		int max = 10000000;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 2 ; i < max ; i++){
			int n = inc(numbers,String.valueOf(i));
			if (n == 1)
				q.offer(i);
		}
		int cnt = 0;
		while(!q.isEmpty())
		{
			int n = q.peek();
			q.poll();
			n = findprime(n);
			if (n == 1)
				cnt++;
		}
		return cnt;
	}

	private static int inc(String numbers, String val) {//"1000"
		char []chan = new char[val.length()];
		for (int i = 0; i < val.length() ; i++){	//71
			chan[i] = val.charAt(i);
		}
		for (int i = 0 ; i < numbers.length(); i++){
			for (int j = 0 ; j < val.length() ; j++){
				if (numbers.charAt(i) == chan[j])		//1 7                oo
				{
					chan[j] = 'o';
					break;								
				}
			}
		}
		for (int i = 0 ; i < val.length() ; i++){
			if (chan[i] != 'o')//oo
				return 0;
		}
		return 1;
	}


	private static int findprime(int n) {
		for (int i = 2 ; i <= n / i ; i++){
			if (n % i == 0)
				return 0;
		}
		return 1;
	}
}