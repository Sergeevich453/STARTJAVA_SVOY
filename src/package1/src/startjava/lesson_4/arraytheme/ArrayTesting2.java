package package1.src.startjava.lesson_4.arraytheme;



public class ArrayTesting2 {

	public static void main(String[] args) throws InterruptedException { 
		String str = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n"
				+ "- James Gosling";
		String anotherText = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим "
				+ "его.\n— Robert Martin";
		//String[] str1 = new String[str.length()];
		printingTypewriter(str);
		
		
	}
	
	private static void printingTypewriter(String text) {
		String[] strArr = text.split("[\\-\\ \\—\\ \\.\\,\\\n\\\r]");
		String[] strArr1 = text.split("");
		String longest = findLongest(strArr);
		String shortest = findShortest(strArr);
		for (String str: strArr) {
			System.out.println(str);
		}
		for (int i = 0; i < strArr1.length; i++) {
			if (longest.equals(strArr1[i])) {
				System.out.print(strArr1[i].toUpperCase());
			} else {
				System.out.print(strArr1[i]);
			}
			if (shortest.equals(strArr1[i])) {
				System.out.print(strArr1[i].toUpperCase());
			}
		}
		
	}
	
	private static String findLongest(String[] text) {
//		final String[] str1 = text.split("[\\-\\ \\—\\ \\.\\,\\\n\\\r]");
		String max = text[0];
		for (int i = 0; i < text.length-1; i++) {
				if (text[i].length() > max.length()) {
					max = text[i];
				}					
		}		
// 		System.out.println("\nmax = " + max);
		return max;
	}
	
	private static String findShortest(String[] text) {
//		final String[] str1 = text.split("[\\-\\ \\—\\ \\.\\,\\\n\\\r]");
		String min = text[0];
		for (int i = 0; i < text.length-1; i++) {
			if (text[i].length() < text[i + 1].length()) {
				if (text[i + 1].length() < min.length()) {
					min = text[i + 1];
				}	
			}				
		}
//		System.out.println("\nmin = " + min);
		return min;
	}
}

//for (String st: textInfo1) {
//System.out.print(st);
//try {
//	Thread.sleep(100);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}		
//		StringTokenizer st = new StringTokenizer(str);
//		int i = 0;
//		while (st.hasMoreTokens()) { 
//			String token = st.nextToken();
//		    // Используйте token как требуется
//		    str1[i] = token;		    
//		    System.out.print(str1[i] + " - " + str1[i].length() + " ");
//		    Thread.sleep(10);
//		    i++;
//		}
//		String max = str1[0];
//		String min = str1[0];
//		for (int k = 0; k < str1.length; k++) {
//			for ( int j = 0; j < i; j++) {
//				if (str1[j].length() > max.length() && str1[j] != " " && str1[j] != "," && str1[j] != "." && str1[j] != "-") {
//					max = str1[j];					
//				}
//				if (str1[j].length() < min.length() && str1[j] != "-" && str1[j] != "," && str1[j] != "." && str1[j] != " ") {
//					min = str1[j];					
//				}
//				
//			}
//		}
//		System.out.println("\n" + min + " ; " + max);
//		char z = '-';
//		char z1 = '_';
//		System.out.println("\n\n = " + z + " ; " + z1);

//		int s = str.length();
//		char[] chs = new char[str.length()];
//		for (int i = 0; i < str.length(); i++) { 
//			chs[i] = str.charAt(i);
//			System.out.print(chs[i]);
		
//		StringTokenizer st = new StringTokenizer(str);
//		while (st.hasMoreTokens()) {
//		    String token = st.nextToken();
//		    // Используйте token как требуется
//		    System.out.print(token);
//		    Thread.sleep(1000);
//		}
//		
//		System.out.println();
// ___________________		
//		int len = str.length();
//		int lenStr = 0;
//		int max = 0;
//		int min = 0;
//		int count1 = 0;
//		int count = 0;
//		for (int i = 0; i < len; i++) {
//		    char ch = str.charAt(i);
//		    if (ch != ' ' || ch != '-' || ch != ',' || ch != '.') {
//		    	lenStr = 1 + lenStr;
//		    } else {
//		    	if (lenStr > max) {
//			    	max = lenStr;
//			    	count++;
//	 		    } else {
//	 		    	min = lenStr;
//	 		    	count1++;
//	 		    }
//		    }
//		    	 
//		    
//		    System.out.print(ch);
//		    Thread.sleep(10);
//		}
//		System.out.println("\nMax = " + max + " Min =" + min + " lenStr = " + lenStr);
//		System.out.println("\n" + count + " " + count1);
//
	


