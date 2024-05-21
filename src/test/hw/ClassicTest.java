package test.hw;

import java.util.stream.IntStream;

public class ClassicTest {
	private int last = 0;
	private int next = 1;
	
	public IntStream stream() {
		return IntStream.generate(() -> {
			int oldLast = last;
			last = next;
			next = oldLast + next;
			return oldLast;
		});
	}	

	public static void main(String[] args) {
		ClassicTest fab5 = new ClassicTest();
		fab5.stream().limit(41).forEachOrdered(System.out::println);
	}

}
