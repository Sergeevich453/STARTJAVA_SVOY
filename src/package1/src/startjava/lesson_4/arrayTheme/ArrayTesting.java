package package1.src.startjava.lesson_4.arrayTheme;

public class ArrayTesting {

	public static void main(String[] args) {
		System.out.println("\n\n3. Удаление элементов массива");
        double[] realNums = new double[15];
        int len = realNums.length;

        for (int i = 0; i < len; i++) {
            realNums[i] = Math.random();
        }

        System.out.println("До обнуления:");
        print(realNums);

        double middleCellValue = realNums[len / 2];
        int countZeros = 0;
        for (int i = 0; i < len; i++) {
            if (realNums[i] > middleCellValue) {
                realNums[i] = 0;
                countZeros++;
            }
        }

        System.out.println("После обнуления:");
        print(realNums);
        System.out.println("Количество обнуленных ячеек = " + countZeros);
    }

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();

	}

}
