public class VarargsTest {
	public static void main(String... args) {
		System.out.println("Длина массива (количество аргументов) = " + args.length);
		for (String str : args) {
			System.out.print(str + " ");
		}
	}
}
