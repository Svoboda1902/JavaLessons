 /**
 * Lesson 2. DZ2.
 *
 * @author Tselovalnikov S
 * @version 16 sep 2021
 */
 
class DZ2 {
    public static void main(String[] args) {
        System.out.println(Task1(19,2));

        Task2(-2);

        System.out.println(Task3(-2));

        repeatString("Ponyat' i prostit'", 1);
    }

    static boolean Task1(int a, int b) {
        return a + b >=10 && a + b <= 20;
    }

    static void Task2(int y) {
        System.out.println(y < 0? "Положительное" : "Отприцательное");
        //if (y >= 0) {
            //System.out.println("Положительное");
        //}
        //else {
            //System.out.println("Отприцательное");
        //}
    }

    static boolean Task3(int y) {
        return y>= -2;
    }

    static void repeatString(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}