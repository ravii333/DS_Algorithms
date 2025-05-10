package com.ravi.Competitive_Programming;
import java.util.*;

public class SudokuChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Parse the 9x9 grid
        int[][] grid = new int[9][9];
        Set<Integer> hintList = new HashSet<>();
        List<int[]> errors = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Step 2: Parse the hint list
        String[] hints = scanner.nextLine().split(" ");
        for (String hint : hints) {
            hintList.add(Integer.parseInt(hint));
        }

        // Step 3: Parse the value of K
        int K = scanner.nextInt();

        // Step 4: Validate rows, columns, and subgrids
        for (int i = 0; i < 9; i++) {
            validateRow(grid, i, hintList, errors);
            validateColumn(grid, i, hintList, errors);
        }
        validateSubgrids(grid, hintList, errors);

        // Step 5: Determine and print results based on error count
        if (errors.isEmpty()) {
            System.out.println("Won");
        } else if (errors.size() > K) {
            System.out.println("Impossible");
        } else {
            for (int[] error : errors) {
                System.out.println(error[0] + " " + error[1]);
            }
        }

        scanner.close();
    }

    private static void validateRow(int[][] grid, int row, Set<Integer> hintList, List<int[]> errors) {
        boolean[] seen = new boolean[10];
        for (int col = 0; col < 9; col++) {
            int value = grid[row][col] % 10;  // Strip leading or trailing zero
            int type = grid[row][col] / 10;   // Check for leading or trailing zero

            if (value == 0 || seen[value]) continue; // Skip empty cells and duplicates
            if (type == 5 && !hintList.contains(value)) { // Hinted cell but not in hint list
                errors.add(new int[]{row, col});
            }
            seen[value] = true;
        }
    }

    private static void validateColumn(int[][] grid, int col, Set<Integer> hintList, List<int[]> errors) {
        boolean[] seen = new boolean[10];
        for (int row = 0; row < 9; row++) {
            int value = grid[row][col] % 10;
            int type = grid[row][col] / 10;

            if (value == 0 || seen[value]) continue;
            if (type == 5 && !hintList.contains(value)) {
                errors.add(new int[]{row, col});
            }
            seen[value] = true;
        }
    }

    private static void validateSubgrids(int[][] grid, Set<Integer> hintList, List<int[]> errors) {
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] seen = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        int value = grid[row][col] % 10;
                        int type = grid[row][col] / 10;

                        if (value == 0 || seen[value]) continue;
                        if (type == 5 && !hintList.contains(value)) {
                            errors.add(new int[]{row, col});
                        }
                        seen[value] = true;
                    }
                }
            }
        }
    }
}