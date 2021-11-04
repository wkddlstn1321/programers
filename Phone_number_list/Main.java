import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		String []phone_book = {"123", "1297674223", "1395524421"};
		for (String string : phone_book) {
			System.out.println(string);
		}
		boolean a;
		a = solution(phone_book);
		if (a)
			System.out.println("true");
		else
			System.out.println("false");
	}

	private static boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 0 ; i < phone_book.length - 1 ; i++){
			if (phone_book[i].startsWith(phone_book[i + 1]))
				return false;
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;
		}
		return true;
	}
}
//1 2 3 4 5