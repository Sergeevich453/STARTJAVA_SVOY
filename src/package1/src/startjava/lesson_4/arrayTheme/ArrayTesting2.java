package package1.src.startjava.lesson_4.arrayTheme;

import java.util.StringTokenizer;

public class ArrayTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		String str = "Java — это C++, из которого убрали все пистолеты, ножи и дубинки.\r\n"
				+ "— James Gosling";
//		int s = str.length();
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) { 
			chs[i] = str.charAt(i);
			System.out.print(chs[i]);
		}
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
	}

}
