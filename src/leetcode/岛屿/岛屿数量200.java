package leetcode.岛屿;


import java.util.Scanner;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/29 16:52
 * @Version V1.0
 **/
public class 岛屿数量200 {
    public static void main(String[] args) {

        /**
         Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
         int c = sc.nextInt();
         int[][] grid = new int[r][c];
         int[][] grid2 = new int[r][c];
         for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
         int tmpNum = sc.nextInt();
         grid[i][j] = tmpNum;
         grid2[i][j] = tmpNum;
         }
         }
         System.out.println(numIslands(grid));
         }
         **/

        System.out.println("您输入的二维数组行大小为 ：");
        Scanner row = new Scanner(System.in);
        System.out.println("您输入的二维数组列大小为 ：");
        Scanner col = new Scanner(System.in);


        int r = row.nextInt();
        int c = col.nextInt();

        char[][] grid = new char[r][c];

        for (int i = 0; i < r; i++) {
            System.out.print("输入第" + i + "行数据:");
            Scanner in = new Scanner(System.in);
            String str = in.next();
            char[] m = str.toCharArray();
            for (int j = 0; j < c; j++) {
                grid[i][j] = m[j];
            }

        }
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        int count = numIslands(grid);

        System.out.print(count);


    }


    /**
     * 感染函数感染函数：其实就是一个递归标注的过程，它会将所有相连的1都标注成2。
     * 为什么要标注？这样就避免了遍历过程中的重复计数的情况，一个岛所有的1都变成了2后，
     * 遍历的时候就不会重复遍历le
     */

    public static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }


}





