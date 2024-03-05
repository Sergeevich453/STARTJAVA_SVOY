package package1.src.startjava.lesson_4.arrayTheme;

import java.util.StringTokenizer;

public class ArrayTesting2 {

	public static void main(String[] args) throws InterruptedException { 
		String str = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n"
				+ "- James Gosling";	
		//String[] str1 = new String[str.length()];
		printWith(str);
		
		
	}
	
	private static void printWith(String text) {
		final String[] str1 = text.split("[\\ \\-\\ \\.\\,\\\n\\\r]");
		for (String textInfo: str1) {
			System.out.println(textInfo);
		}
		String max = str1[0];
		String min = str1[0];
		for (int i = 0; i < str1.length-1; i++) {
//			if (i + 1 > str1.length) {
//				if (str1[i].length() > max.length()) {
//					max = str1[i];
//				}
//				if (str1[i].length() < max.length()) {
//					min = str1[i];
//				}
//			}
			if (str1[i].length() > str1[i + 1].length()) {
				if (str1[i].length() < str1[i + 1].length()) {
					if (str1[i].length() < min.length() && str1[i] != " ") {
					min = str1[i];					
					}
					if (str1[i + 1].length() > max.length())
					max = str1[i + 1];
					
				}
				
				if (str1[i].length() > max.length()) {
				max = str1[i];					
				}
				if (str1[i + 1].length() < min.length() && str1[i + 1] != " ")
				min = str1[i + 1];
				
			} 
			
		}
		System.out.println("\nmax = " + max + "\nmin = " + min);
//		for (String st: textInfo1) {
//			System.out.print(st);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
		
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
	


