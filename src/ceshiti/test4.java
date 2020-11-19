package ceshiti;

public class test4 {
	public static void main(String[] args) {
		int[][] chess = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,-1,1,0,0,0,0},
				{0,0,0,-1,0,0,1,0,0,0},
				{0,0,-1,0,0,0,0,1,0,0},
				{0,-1,0,0,0,0,0,0,1,0},
				{-1,0,0,0,0,0,0,0,0,1}
		};
		int black = 0, white = 0;
		
		//右上到左下斜方向
		for (int y = 0; y < chess.length - 4; y++) {
			for (int x = 4; x < chess[y].length; x++) {
				if(chess[y][x] == 1 
						&& chess[y+1][x-1] == 1
						&& chess[y+2][x-2] == 1
						&& chess[y+3][x-3] == 1
						&& chess[y+4][x-4] == 1)
					black = 1;
				else if(chess[y][x] == -1 
						&& chess[y+1][x-1] == -1
						&& chess[y+2][x-2] == -1
						&& chess[y+3][x-3] == -1
						&& chess[y+4][x-4] == -1)
					white = 1;
			}
		}
		
		//左上到右下斜方向
		for (int y = 0; y < chess.length - 4; y++) {
			for (int x = 0; x < chess[y].length - 4; x++) {
				if(chess[y][x] == 1 
						&& chess[y+1][x+1] == 1
						&& chess[y+2][x+2] == 1
						&& chess[y+3][x+3] == 1
						&& chess[y+4][x+4] == 1)
					black = 1;
				else if(chess[y][x] == -1 
						&& chess[y+1][x+1] == -1
						&& chess[y+2][x+2] == -1
						&& chess[y+3][x+3] == -1
						&& chess[y+4][x+4] == -1)
					white = 1;
			}
		}
		
		
		
		//判断横纵方向
		for (int y = 0; y < chess.length - 4; y++) {
			for (int x = 0; x < chess[y].length - 4; x++) {
				if((chess[y][x] == 1 
						&& chess[y+1][x] == 1
						&& chess[y+2][x] == 1
						&& chess[y+3][x] == 1
						&& chess[y+4][x] == 1) 
						|| (chess[y][x] == 1
							&& chess[y][x+1] == 1
							&& chess[y][x+2] == 1
							&& chess[y][x+3] == 1
							&& chess[y][x+4] == 1)
								)
					black = 1;//黑棋胜
				else if ((chess[y][x] == -1 
						&& chess[y+1][x] == -1
						&& chess[y+2][x] == -1
						&& chess[y+3][x] == -1
						&& chess[y+4][x] == -1) 
						|| (chess[y][x] == -1
							&& chess[y][x+1] == -1
							&& chess[y][x+2] == -1
							&& chess[y][x+3] == -1
							&& chess[y][x+4] == -1)) {
					white = 1;//白棋胜
				}
						
			}
		}
		
		if(black == 1 && white == 0)
			System.out.println("黑棋获胜");
		else if(black == 0 && white == 1)
			System.out.println("白棋获胜");
		else if(black == 1 && white == 1)
			System.out.println("不分胜负");
		else
			System.out.println("游戏未结束，继续游戏");
		
		
		
		
	}
}
