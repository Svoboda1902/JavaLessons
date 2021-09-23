 /**
 * Lesson 4. DZ4.
 *
 * @author Tselovalnikov S
 * @version 22 sep 2021
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println("Game.init...");
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
            turnAI(); 
            if (checkWin(SIGN_O)) {
                System.out.println("AI WIN");
                break;
            }
            if (isTableFull()) {
               System.out.println("DRAW");
               break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
                System.out.println();
        }
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPY) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter X Y (1..3): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >=3 || y >=3) {
            return false;
        }
        return table[y][x] == SIGN_EMPY;
    }

    boolean checkWin(char ch) {
        //y
        if (table[0][0] == ch && table[1][0] == ch && table [2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table [2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table [2][2] == ch) return true;
        //x
        if (table[0][0] == ch && table[0][1] == ch && table [0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table [1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table [2][2] == ch) return true;
       //d
        if (table[0][0] == ch && table[1][1] == ch && table [2][2] == ch) return true;
        if (table[0][2] == ch && table[1][1] == ch && table [2][0] == ch) return true;
        return false;
    }

    boolean checkLanes(char ch) { 
    boolean cols, rows;
        for (int i = 0; i < 3; i++) {
            cols = true;
            rows = true;
        for (int j = 0; j < 3; j++){
             cols &= (table[i][j] == ch);
             rows &= (table[j][i] == ch);
            }
// Это условие после каждой проверки колонки и столбца
// позволяет остановить дальнейшее выполнение, без проверки 
// всех остальных столбцов и строк.
        if (cols || rows) return true; 
        }
     return false; 
    }
}