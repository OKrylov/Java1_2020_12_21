package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char[][] map = new char[SIZE][SIZE];

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        initializeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)) {
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)) {
                break;
            }
        }
    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)) {
            System.out.println(isHumanTurn(symbol) ? "Человек победил!" : "Машина победила!");
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cellValue : row) {
                if (cellValue == DOT_EMPTY) {
                    return false;
                }
            }
        }

//        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
//            char[] row = map[rowIndex];
//            for (int colIndex = 0; colIndex < row.length; colIndex++) {
//                if (row[colIndex] == DOT_EMPTY) {
//                    return false;
//                }
//            }
//        }

        return true;
    }

    private static boolean checkWin(char symbol) {
        if (checkRowsAndCols(symbol)) return true;
        return checkDiagonals(symbol);
    }

    private static boolean checkDiagonals(char symbol) {
        int mainDiagCounter = 0;
        int sideDiagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            mainDiagCounter = (map[i][i] == symbol) ? mainDiagCounter + 1 : 0;
            sideDiagCounter = (map[i][map.length - 1 - i] == symbol) ? sideDiagCounter + 1 : 0;
            if (mainDiagCounter == DOTS_TO_WIN || sideDiagCounter == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowsAndCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map[j][i] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void humanTurn() {
        int rowIndex = -1;
        int colIndex = -1;

//        String data = SCANNER.nextLine();//1-3
//        String[] parts = data.split("-");
//        int rowIndex = Integer.parseInt(parts[0]) - 1;
//        int colIndex = Integer.parseInt(parts[1]) - 1;

        do {
            System.out.print("Введите номер строки: ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите номер столбца: ");
            if (!SCANNER.hasNextInt()) {
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));

        setCell(rowIndex, colIndex, DOT_X);
    }

    private static void computerTurn() {
        int[] cell = getNextCellToWin(DOT_O);
        if (cell == null) {
            cell = getNextCellToWin(DOT_X);
            if (cell == null) {
                cell = getRandomEmptyCell(DOT_O);
            }
        }
        int rowIndex = cell[0];
        int colIndex = cell[1];

        setCell(rowIndex, colIndex, DOT_O);
    }

    private static int[] getRandomEmptyCell(char symbol) {
        int rowIndex, colIndex;
        Random random = new Random();
        do {
            rowIndex = random.nextInt(SIZE);
            colIndex = random.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex, symbol));
        return new int[] {rowIndex, colIndex};
    }

    private static int[] getNextCellToWin(char symbol) {
        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
            for (int colIndex = 0; colIndex < map[rowIndex].length; colIndex++) {
                if (map[rowIndex][colIndex] == DOT_EMPTY && isGameMoveWinning(rowIndex, colIndex, symbol)) {
                    return new int[]{rowIndex, colIndex};
                }
            }
        }

        return null;
    }

    private static boolean isGameMoveWinning(int rowIndex, int colIndex, char symbol) {
        setCell(rowIndex, colIndex, symbol);
        boolean result = checkWin(symbol);
        setCell(rowIndex, colIndex, DOT_EMPTY);
        return result;
    }

    private static void setCell(int rowIndex, int colIndex, char symbol) {
        map[rowIndex][colIndex] = symbol;
    }

    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
//        return isArrayIndexValid(rowIndex) && isArrayIndexValid(colIndex) && map[rowIndex][colIndex] == DOT_EMPTY;
        if (!isArrayIndexValid(rowIndex) || !isArrayIndexValid(colIndex)) {
            System.out.println("Индексы строки и колонки должны быть в диапазоне от 0 до " + SIZE);
            return false;
        }
        if (map[rowIndex][colIndex] != DOT_EMPTY) {
            if (isHumanTurn(symbol)) {
                System.out.println("Данная ячейка уже занята!");
            }
            return false;
        }

        return true;
    }

    private static boolean isHumanTurn(char symbol) {
        return symbol == DOT_X;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex + 1) + " ");

            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializeGame() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map[rowIndex][colIndex] = DOT_EMPTY;
            }
        }
    }

}
