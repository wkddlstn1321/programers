public class gym{
	public static void main(String[] args) {
		int n = 5;
		int [] lost = {2, 4};
		int [] reserve = {1, 3, 5};
		int re = solution (n, lost, reserve);
		System.out.println(re);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int [] student = new int [n + 2];
		student[0] = 0;
		for (int i = 1; i < n + 1 ; i++){
			student[i] = 1;
		}
		for (int i = 0; i < lost.length; i++){
			student[lost[i]] = 0;
		}
		for (int i = 0; i < reserve.length; i++){
			student[reserve[i]] += 1;
		}
		for (int i = 1; i < n + 1 ; i++)
		{
			if (student[i] == 0)
			{
				if (student[i - 1] == 2)
				{
					student[i]++;
					student[i - 1]--;
				}
				else if (student[i + 1] == 2)
				{
					student[i]++;
					student[i + 1]--;
				}
			}
		}
		int answer = 0;
		for (int i = 1 ; i < n + 1 ; i++)
		{
			if (student[i] != 0)
				answer++;
		}
		return answer;
	}
}