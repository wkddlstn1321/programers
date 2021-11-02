public class lottos{
	public static void main(String[] args) {
		int [] lottos= {0, 0, 0, 0, 0, 0};
		int [] win_nums = {1,2,3,4,5,6};
		int [] answer = solution(lottos, win_nums);
		for (int answers : answer){
			System.out.println(answers);
		}
	}
	public static int[] solution(int[] lottos, int[] win_nums) {
        int	i;
		int	j;
		int cnt = 0;
		int zero = 0;
        int min = 0;
        int max = 0;

		for (i = 0; i < 6; i++)
		{
			if (lottos[i] == 0)
				zero++;
			else
			{ 
				for (j = 0; j < 6; j++)
				{
					if (lottos[i] == win_nums[j])
					{
						cnt++;
            	        break;
					}
				}
			}
		}
		if (cnt == 0 && zero == 0)
		{
			int []answer = {6,6};
			return (answer);
		}
		// zero = 6, cnt = 0
		if (cnt < 1)
        {
            min = 6;
			max = min - zero + 1;
        }
        else if (cnt < 2)
        {
            min = 6;
			max = min - zero;
        }
        else if (cnt >= 2)
        {
            min = 7 - cnt;
            max = min - zero;
        }
		int[] answer = {max, min};
        return answer;
    }
}

