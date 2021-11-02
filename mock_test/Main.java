public class Main{
	public static void main(String[] args) {
		int []answers = {3,3,1,1,5,3,4,4,5,5};
		int []a = solution(answers);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static int[] solution(int[] answers) {
		int []one = {1,2,3,4,5};
		int []two = {2,1,2,3,2,4,2,5};
		int []thr = {3,3,1,1,2,2,4,4,5,5};
		int on = 0;
		int tw = 0;
		int th = 0;
		for (int i = 0 ; i < answers.length ; i++){
			if (answers[i] == one[i % 5])
				on++;
			if (answers[i] == two[i % 8])
				tw++;
			if (answers[i] == thr[i % 10])
				th++;
		}
		int cnt = 0;
		int []co = {on, tw, th};
		int max = (on > tw) ? on : tw;
		if (max < th)
			max = th;
		for (int i = 0 ; i < 3 ; i++){
			if (co[i] == max)
				cnt++;
		}
		int[] answer = new int[cnt];
		for (int i = 2 ; i >= 0 ; i--){
			if (co[i] == max)
			{
				answer[cnt - 1] = i + 1;
				cnt--;
			}
		}
		return answer;
	}
}