package shipGame;
import java.text.CharacterIterator;
import java.util.*;

public class Main {

        Scanner scanner;
        char[][] gameBoard;
        int shipLength;
        String coords;
        int startRow;
        int endRow;
        int startColumn;
        int endColumn;
        String shipName;
        int count = 0;
        char hit = 'x';

        public static void main(String[] args) {
            Main g = new Main();
            g.start();
            g.shoot();

        }

        public Main() {
            this.scanner = new Scanner(System.in);
            this.gameBoard = new char[10][10];
            for (char[] row : this.gameBoard) {
                Arrays.fill(row, '~');
            }

        }

        public void start() {
            this.printBoard();
            while (count < 5) { // dodoawanie statkow
                printShip(count);
                this.coordLoop();
                System.out.println("");
                if (startRow == endRow) {
                    for (int i = startColumn; i <= endColumn; i++) {
                        gameBoard[startRow][i] = 'O';
                    }
                }
                if (startColumn == endColumn) {
                    for (int i = startRow; i <= endRow; i++) {
                        gameBoard[i][startColumn] = 'O';
                    }
                }
                this.printBoard();
                count++;
            }
        }

        public void printShip(int count) {
            switch (count) {
                case 0:
                    System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                    System.out.println("");
                    shipLength = 5;
                    shipName = "Aircraft Carrier";
                    break;
                case 1:
                    System.out.println("Enter the coordinates of the Battleship (4 cells):");
                    System.out.println("");
                    shipLength = 4;
                    shipName = "Battleship";
                    break;
                case 2:
                    System.out.println("Enter the coordinates of the Submarine (3 cells):");
                    System.out.println("");
                    shipLength = 3;
                    shipName = "Submarine";
                    break;
                case 3:
                    System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                    System.out.println("");
                    shipLength = 3;
                    shipName = "Cruiser";
                    break;
                case 4:
                    System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                    System.out.println("");
                    shipLength = 2;
                    shipName = "Destroyer";
                    break;
            }
        }

        public void printBoard() {
            System.out.println("  1 2 3 4 5 6 7 8 9 10");
            char c = 'A';
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    if (j == 0) {
                        System.out.print(c + " ");
                    }
                    System.out.print(gameBoard[i][j] + " ");
                }
                c++;
                System.out.println("");
            }
            System.out.println("");
        }

        public void coordLoop() {
            coords = scanner.nextLine().toUpperCase();
            String[] split = coords.split(" ");
            startRow = translate(split[0].substring(0, 1));
            endRow = translate(split[1].substring(0, 1));
            startColumn = Integer.valueOf(split[0].substring(1, split[0].length())) - 1;
            endColumn = Integer.valueOf(split[1].substring(1, split[1].length())) - 1;
            if (startRow > endRow) {
                int save = endRow;
                endRow = startRow;
                startRow = save;
            }
            if (startColumn > endColumn) {
                int save = endColumn;
                endColumn = startColumn;
                startColumn = save;
            }
            this.checkCoords();
        }

        public void checkCoords() {
            if (startRow < 0 || startRow > 9 || endRow < 0 || endRow > 9 || startColumn < 0 || startColumn > 9 || endColumn < 0 || endColumn > 9) {
                System.out.println("Error! Wrong ship location! Try again:");
                System.out.println("");
                this.coordLoop();
            }
            if ((startRow != endRow) && (startColumn != endColumn)) {
                System.out.println("");
                System.out.println("Error! Wrong ship location! Try again:");
                System.out.println("");
                this.coordLoop();
            }
            if (startRow == endRow) {
                if ((Math.abs(endColumn - startColumn)) != shipLength - 1) {
                    System.out.println("");
                    System.out.println(String.format("Error! Wrong length of the %s! Try again:", shipName));
                    System.out.println("");
                    this.coordLoop();
                }
            }
            if (startColumn == endColumn) {
                if ((Math.abs(endRow - startRow)) != shipLength - 1) {
                    System.out.println("");
                    System.out.println(String.format("Error! Wrong length of the %s! Try again:", shipName));
                    System.out.println("");
                    this.coordLoop();
                }
            }
            if (startRow == endRow) {
                for (int i = startColumn; i <= endColumn; i++) {
                    if (gameBoard[startRow][i] == 'O') {
                        System.out.println("");
                        System.out.println("Error! Wrong ship location! Try again:");
                        System.out.println("");
                        this.coordLoop();
                    }
                }
                this.checkAbove();
                this.checkBelow();
            }
            if (startColumn == endColumn) {
                for (int i = startRow; i <= endRow; i++) {
                    if (gameBoard[i][startColumn] == 'O') {
                        System.out.println("");
                        System.out.println("Error! Wrong ship location! Try again:");
                        System.out.println("");
                        this.coordLoop();
                    }
                }
                this.checkLeft();
                this.checkRight();
            }
        }

        public void checkAbove() {
            int aboveRow = 0;
            if (startRow - 1 >= 0) {
                aboveRow = startRow - 1;
            }
            for (int i = startColumn; i <= endColumn; i++) {
                if (gameBoard[aboveRow][i] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
            int leftColumn = 0;
            if (startColumn - 1 >= 0) {
                leftColumn = startColumn - 1;
                if (gameBoard[startRow][leftColumn] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
            int rightColumn = 0;
            if (endColumn + 1 <= 9) {
                rightColumn = endColumn + 1;
                if (gameBoard[startRow][rightColumn] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
        }

        public void checkBelow() {
            int belowRow = 0;
            if (startRow + 1 <= 9) {
                belowRow = startRow + 1;
            }
            for (int i = startColumn; i <= endColumn; i++) {
                if (gameBoard[belowRow][i] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
        }

        public void checkLeft() {
            int columnLeft = 0;
            if (startColumn - 1 >= 0) {
                columnLeft = startColumn - 1;
            }
            for (int i = startRow; i <= endRow; i++) {
                if (gameBoard[startRow][columnLeft] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
            int aboveRow = 0;
            if (startRow - 1 >= 0) {
                aboveRow = startRow - 1;
                if (gameBoard[aboveRow][startColumn] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
            int belowRow = 0;
            if (endRow + 1 <= 9) {
                belowRow = endRow + 1;
                if (gameBoard[belowRow][startColumn] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
        }

        public void checkRight() {
            int columnRight = 0;
            if (endColumn + 1 <= 9) {
                columnRight = endColumn + 1;
            }
            for (int i = startRow; i <= endRow; i++) {
                if (gameBoard[startRow][columnRight] == 'O') {
                    System.out.println("");
                    System.out.println("Error! Wrong ship location! Try again:");
                    System.out.println("");
                    this.coordLoop();
                }
            }
        }

        public int translate(String coord) {
            switch (coord) {
                case "A":
                    return 0;
                case "B":
                    return 1;
                case "C":
                    return 2;
                case "D":
                    return 3;
                case "E":
                    return 4;
                case "F":
                    return 5;
                case "G":
                    return 6;
                case "H":
                    return 7;
                case "I":
                    return 8;
                case "J":
                    return 9;
            }
            return -1;
        }
        public void shoot() {
            coords = scanner.nextLine().toUpperCase();
            String[] split = coords.split(" ");
            startRow = translate(split[0].substring(0, 1));
            startColumn = Integer.valueOf(split[0].substring(1, split[0].length())) - 1;

            gameBoard[startRow][startColumn] = 'x';
            printBoard();
        }

    }