package leetcode.岛屿;

/**
 * @Author fty
 * @Description 有一个二维矩阵 grid ，每个位置要么是陆地（记号为 0 ）要么是水域（记号为 1 ）。
 * <p>
 * 我们从一块陆地出发，每次可以往上下左右 4 个方向相邻区域走，能走到的所有陆地区域，我们将其称为一座「岛屿」。
 * <p>
 * 如果一座岛屿 完全 由水域包围，即陆地边缘上下左右所有相邻区域都是水域，那么我们将其称为 「封闭岛屿」。
 * <p>
 * 请返回封闭岛屿的数目
 * @Date 2020/4/26 21:14
 * @Version V1.0
 **/
/**
 * public class 统计封闭岛屿的数目1254 {
 * <p>
 * private int[][]  dirArr =new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
 * <p>
 * <p>
 * <p>
 * //岛屿的DFS
 * private int dfs(int[][]  grid,int r ,int c){
 * if (!inArea(grid, r, c)){
 * return 0;
 * }
 * int res  =1;
 * //if (grid)
 * }
 * <p>
 * <p>
 * //判断岛屿是否在矩阵的里面，如果在边缘，则不是封闭岛屿
 * private boolean inArea(int[][]  grid,int  r,int c) {
 * if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length);
 * return true;
 * }
 * <p>
 * <p>
 * }
 */