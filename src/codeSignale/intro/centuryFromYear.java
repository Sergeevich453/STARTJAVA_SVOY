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
	

	public static void main(String[] args) {
		int year = 1700;
		System.out.println(fromYear(year));

	}

}
