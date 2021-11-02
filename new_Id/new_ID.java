public class new_ID{
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String answer = solution(new_id);
		System.out.println(answer);
	}
	public static String solution(String new_id) {
		String answer = new_id;
		answer = answer.toLowerCase();
		answer = answer.replaceAll("[^-_.a-z0-9]","");
		answer = answer.replaceAll("\\.+",".");
		if (answer.length() > 1)
		{
			if (answer.charAt(0) == '.')
				answer = answer.replaceFirst(".","");
			if (answer.charAt((answer.length() - 1)) == '.')
				answer = answer.replaceFirst(".$","");
		}
		if (answer == "")
			answer = "a";
		if (answer.length() > 15)
		{
			
			if (answer.charAt((answer.length() - 1)) == '.')
				answer = answer.replaceFirst(".$","");
		}
		return answer;
	}
}