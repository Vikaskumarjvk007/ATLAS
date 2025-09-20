import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day37_NQueensBacktracking {

    private int n;
    private List<List<String>> solutions;

    public Day37_NQueensBacktracking(int n) {
        this.n = n;
        this.solutions = new ArrayList<>();
    }

    public List<List<String>> solveNQueens() {
        solutions.clear();
        int[] board = new int[n];
        backtrack(board, 0);
        return solutions;
    }

    private void backtrack(int[] board, int row) {
        if (row == n) {
            solutions.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                backtrack(board, row + 1);
            }
        }
    }

    private boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col ||
                    board[i] - i == col - row ||
                    board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    private List<String> constructBoard(int[] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    public void printSolution(List<String> solution) {
        for (String row : solution) {
            System.out.println(row);
        }
        System.out.println();
    }

    public void printAllSolutions() {
        List<List<String>> allSolutions = solveNQueens();
        System.out.println("Total solutions for " + n + "-Queens: " + allSolutions.size());
        System.out.println();

        for (int i = 0; i < allSolutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            printSolution(allSolutions.get(i));
        }
    }

    public boolean hasUniqueSolution() {
        List<List<String>> allSolutions = solveNQueens();
        return allSolutions.size() == 1;
    }

    public int countSolutions() {
        List<List<String>> allSolutions = solveNQueens();
        return allSolutions.size();
    }

    public List<String> getFirstSolution() {
        List<List<String>> allSolutions = solveNQueens();
        return allSolutions.isEmpty() ? new ArrayList<>() : allSolutions.get(0);
    }

    public boolean canPlaceQueens() {
        return !solveNQueens().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("N-Queens Backtracking Algorithm");
            System.out.println("1. Solve N-Queens");
            System.out.println("2. Show all solutions");
            System.out.println("3. Count solutions");
            System.out.println("4. Check if solution exists");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter board size (N): ");
                    int n = scanner.nextInt();

                    Day37_NQueensBacktracking nQueens = new Day37_NQueensBacktracking(n);
                    List<String> firstSolution = nQueens.getFirstSolution();

                    if (firstSolution.isEmpty()) {
                        System.out.println("No solution exists for " + n + "-Queens");
                    } else {
                        System.out.println("First solution for " + n + "-Queens:");
                        nQueens.printSolution(firstSolution);
                    }
                    break;

                case 2:
                    System.out.print("Enter board size (N): ");
                    int size = scanner.nextInt();

                    Day37_NQueensBacktracking allQueens = new Day37_NQueensBacktracking(size);
                    allQueens.printAllSolutions();
                    break;

                case 3:
                    System.out.print("Enter board size (N): ");
                    int countSize = scanner.nextInt();

                    Day37_NQueensBacktracking countQueens = new Day37_NQueensBacktracking(countSize);
                    int count = countQueens.countSolutions();
                    System.out.println("Number of solutions for " + countSize + "-Queens: " + count);
                    break;

                case 4:
                    System.out.print("Enter board size (N): ");
                    int checkSize = scanner.nextInt();

                    Day37_NQueensBacktracking checkQueens = new Day37_NQueensBacktracking(checkSize);
                    boolean canSolve = checkQueens.canPlaceQueens();
                    System.out.println("Can place " + checkSize + " queens: " + canSolve);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
            System.out.println();
        }
    }
}