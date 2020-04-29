package leetcode.面试.快手;

import java.util.ArrayList;
import java.util.Scanner;

public class 矩阵1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        int[][] grid2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tmpNum = sc.nextInt();
                grid[i][j] = tmpNum;
                grid2[i][j] = tmpNum;
            }
        }
        ArrayList<Integer> res = printMatrix(grid2);
        int numD = 0;
        boolean lianxu = true;
        for (Integer tmpI : res) {
            if (tmpI == 1) {
                if (lianxu == true)
                    numD++;
                lianxu = false;
            } else {
                lianxu = true;
            }
        }
        System.out.println(numIslands(grid) - numD);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        //可以把一个矩形分成很多个环形，可以发现每个环形的其实位置都是（i，i）
        ArrayList<Integer> aList = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return aList;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;

        while (true) {
            int rowStart = start;
            int rowEnd = rows - start;
            int colStart = start;
            int colEnd = cols - start;
            if (rowStart >= rowEnd || colStart >= colEnd) {
                break;
            }
            //接下来分别把一个环的四个部分添加到aList中
            for (int i = colStart; i < colEnd; i++) {
                aList.add(matrix[rowStart][i]);
            }
            for (int i = rowStart + 1; i < rowEnd; i++) {
                aList.add(matrix[i][colEnd - 1]);
            }
            if ((rowEnd - rowStart) > 1) {
                for (int i = colEnd - 2; i >= colStart; i--) {
                    aList.add(matrix[rowEnd - 1][i]);
                }
            }
            if ((colEnd - colStart) > 1) {
                for (int i = rowEnd - 2; i > rowStart; i--) {
                    aList.add(matrix[i][colStart]);
                }
            }

            start++;
            break;  //只转1
        }
        return aList;
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;//行
        int cols = grid[0].length;//列
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    result++;
                    bfsInstand(i, j, rows, cols, grid);
                }
            }
        }
        return result;
    }

    private static void bfsInstand(int i, int j, int rows, int cols, int[][] grid) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return;
        }
        if (grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        bfsInstand(i + 1, j, rows, cols, grid);
        bfsInstand(i, j + 1, rows, cols, grid);
        bfsInstand(i - 1, j, rows, cols, grid);
        bfsInstand(i, j - 1, rows, cols, grid);
    }
}

