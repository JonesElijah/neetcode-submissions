class Solution {
    int rows;
    int cols;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    islands++;
                }
            }
        }
        

    return islands;
    }

     void dfs(char[][] grid, int r, int c){
        if( r >= 0 && c >= 0 && r < rows && c < cols && grid[r][c] == '1'){
             grid[r][c] = '0';
             dfs(grid, r + 1, c);
             dfs(grid, r - 1, c);
             dfs(grid, r, c + 1);
             dfs(grid, r, c - 1);
        }
    }
}
