package com.nkpdqz.bytedance;

public class islandMaxSquare {

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int len = grid[0].length;

        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == 1){
                    int sum = dfs(grid,i,j);
                    max = Math.max(max,sum);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid,int i,int j) {
        if (i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j] == 1){
            grid[i][j] = 0;
            return 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);
        }else {
            return 0;
        }
    }


}
