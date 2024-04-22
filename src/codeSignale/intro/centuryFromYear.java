package codeSignale.intro;

public class centuryFromYear {
	 
	private static int fromYear(int year) {
		if ((year%100) != 0) {
			year = (year / 100) + 1;
		} else {
			year = year / 100;
		}
		return year;
	}
	
	private static boolean solution(String inputString) {
		int i = 0;
		int j = inputString.length() - 1;
		while (i < j) {
			if (inputString.charAt(i) != inputString.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	

	public static void main(String[] args) {
		int year = 1700;
		System.out.println(fromYear(year));
		System.out.println(solution("abca"));

	}

}
