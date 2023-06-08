
public class Matrix {
	int countIslands(int[][] grid) {
	    int count = 0;
	    for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[0].length; j++) {
	            if (grid[i][j] == 1) {
	                count++;
	                
	                floodFill(grid, i, j);   
	            }   
	        }     
	    }  
	    return count;
	}

	void floodFill(int[][] grid, int i, int j) {
	    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
	        return; 
	    }
	    grid[i][j] = 0;  
	    floodFill(grid, i+1, j);
	    floodFill(grid, i-1, j); 
	    floodFill(grid, i, j+1);
	    floodFill(grid, i, j-1); 
	}
}
