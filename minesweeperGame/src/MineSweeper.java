import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;
    int minesNumber;
    String[][] minesCoordinate;
    String[][] userCoordinate;
    public MineSweeper(int row, int column) {
        this.rowNumber = row;
        this.columnNumber = column;
        this.minesNumber = (row * column) / 4;
        this.minesCoordinate = new String[rowNumber][columnNumber];
        this.userCoordinate = new String[rowNumber][columnNumber];
    }

    void defaultValueAssign(String[][] arr) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                arr[i][j] = "-";
            }
        }
    }
    void printArray(String[][] arr) {
        for (String[] i : arr) {
            for (String j: i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    void printUserCoordinate() {
        defaultValueAssign(userCoordinate);
        printArray(userCoordinate);
    }
    void printMinesCoordinate() {
        Random random = new Random();
        int mineRow;
        int mineColumn;
        defaultValueAssign(minesCoordinate);
        for (int i = 0; i < minesNumber; i++) {
            mineRow = random.nextInt(rowNumber);
            mineColumn = random.nextInt(columnNumber);
            if (!minesCoordinate[mineRow][mineColumn].equals("*")){
                minesCoordinate[mineRow][mineColumn] = "*";
            } else {
                i--;
            }
        }
        printArray(minesCoordinate);
    }
    void run() {
        System.out.println("Location of Mines");
        printMinesCoordinate();
        System.out.println("===========================");
        System.out.println("Welcome to Minesweeper Game");
        printUserCoordinate();
        Scanner input = new Scanner(System.in);
        int remainingRight = (rowNumber * columnNumber) - minesNumber;
        while (remainingRight > 0) {
            System.out.print("Enter row : ");
            int userRow = input.nextInt();
            System.out.print("Enter column : ");
            int userColumn = input.nextInt();

            if ((userRow < 0 || userRow >= rowNumber) || (userColumn < 0 || userColumn >= columnNumber)) {
                System.out.println("You entered incorrect index number please try again!");
                continue;
            }

            if (minesCoordinate[userRow][userColumn].equals("*") ) {
                System.out.println("Game Over!!");
                break;
            } else {
                if (!userCoordinate[userRow][userColumn].equals("-")) {
                    System.out.println("You have done this move before!");
                } else {
                    int mineCounter = 0;
                    int rowBase = (userRow - 1),  rowCeil = (userRow + 1);
                    int columnBase = (userColumn - 1), columnCeil = (userColumn + 1);

                    if (rowBase < 0) {
                        rowBase = 0;
                    }
                    if (rowCeil >= rowNumber) {
                        rowCeil = userRow;
                    }
                    if (columnBase < 0) {
                        columnBase = 0;
                    }
                    if (columnCeil >= columnNumber) {
                        columnCeil = userColumn;
                    }

                    for (int i = rowBase; i <= rowCeil ; i++) {
                        for (int j = columnBase; j <= columnCeil ; j++) {
                            if (minesCoordinate[i][j].equals("*")) {
                                mineCounter++;
                            }
                        }
                    }
                    String mineCount = Integer.toString(mineCounter);
                    userCoordinate[userRow][userColumn] = mineCount;
                    remainingRight--;

                    System.out.println("===========================");
                    printArray(userCoordinate);
                }
            }
        }
        if (remainingRight == 0) {
            System.out.println("You win !");
        }
    }
}
