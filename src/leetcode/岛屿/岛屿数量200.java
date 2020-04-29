package leetcode.岛屿;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/4/29 16:52
 * @Version V1.0
 **/
public class 岛屿数量200 {
    public static void main(String[] args) {

    }


    /**
     * 感染函数感染函数：其实就是一个递归标注的过程，它会将所有相连的1都标注成2。
     * 为什么要标注？这样就避免了遍历过程中的重复计数的情况，一个岛所有的1都变成了2后，
     * 遍历的时候就不会重复遍历le
     */
    public void infect(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '2';
        infect(grid, r + 1, c);
        infect(grid, r - 1, c);
        infect(grid, r, c + 1);
        infect(grid, r, c - 1);
    }

    public int numIslands(char[][] grid) {
        int isLandNum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; i < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    infect(grid, i, j);
                    isLandNum++;
                }
            }
        }
        return isLandNum;
    }


}
