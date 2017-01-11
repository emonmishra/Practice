
public class NumberOfIsland {

	public NumberOfIsland() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		char[][] grid = { 
				{ '0', '0', '0', '0', '0', '0' },
				{ '0', '0', '0', 'X', 'X', '0' },
				{ '0', 'X', '0', '0', '0', '0' },
				{ '0', '0', '0', '0', '0', 'X' } 
				};

		//printGrid(grid);
		
		System.out.println(countNoOfIsland(grid));
	}

	private static final int countNoOfIsland(char[][] grid) {

		int numberOfIsland=0;
		for(int r =0; r<grid.length; r++){
			
			for(int c=0;c<grid[r].length; c++){
				
				if(grid[r][c] == 'X'){
					
					visitConnectedIsland(r,c,grid);
					
					numberOfIsland++;
				}
				
			}
		}
		
		return numberOfIsland;
	}
	
	private static final void visitConnectedIsland(int r, int c, char[][] grid){
		
		//check row and column for validity
		
		//System.out.printf("row:%d  col:%d %n",r,c);
		
		if((r>=0 && r<grid.length) && (c>=0 && c<grid[r].length) && grid[r][c]=='X'){
			
			grid[r][c] = 'M';
		
		
		visitConnectedIsland(r+1, c, grid); // up
		visitConnectedIsland(r-1, c, grid); // down
		visitConnectedIsland(r, c+1, grid); // left
		visitConnectedIsland(r, c-1, grid); // right
		}
		
	}

	private static final void printGrid(char[][] grid) {

		for (int i = 0; i < grid.length; i++) {

			for (char c : grid[i]) {
				System.out.printf("%-2c ", c);
			}
			System.out.println();
		}

	}
}
