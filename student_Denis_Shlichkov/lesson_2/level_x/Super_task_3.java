package lesson_2.level_x;
/*
Исправьте ошибки компиляции в данной программе.

public class CorrectDataTypes {

	public static void main(String[] args) {

		int numberOne = 10;
		double numberTwo = 20.0;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		float sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}
 */
class Super_task_3 {
}
class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        float sum = numberOne + (float) numberTwo;

        System.out.println("Sum = " + sum);
    }

}