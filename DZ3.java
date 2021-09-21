 /**
 * Lesson 3. DZ3.
 *
 * @author Tselovalnikov S
 * @version 19 sep 2021
 */
import java.util.Arrays;

public class DZ3 {
    //Task 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
// [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static int[] task1(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    //Task 2 Задать пустой целочисленный массив размером 100. Написать метод, который помощью цикла заполнит
// его значениями 1 2 3 4 5 7 8 9;
    public static void task2createArr(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i * step;
        }
    }

    //Task 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив
// и умножающий числа меньше 6 на 2;
    public static void task3modifierForArrayes(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    //Task 4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void task4createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    //Task 5 Написать метод, принимающий на вход два аргумента: len и initialValue, 
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void Task5(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }

    public static void main(String[] args){
        //Task 1
        int[] array01 = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        System.out.println(Arrays.toString(task1(array01)));

        //Task 2
        int[] arr2 = new int[100];
        System.out.println("before:" + Arrays.toString(arr2));
        task2createArr(arr2, 1, 1);
        System.out.println("after: " + Arrays.toString(arr2));

        //Task 3
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        //Task 4
        task4createSquareArray(5);

        //Task 5
        Task5(6, 1);
	}
}