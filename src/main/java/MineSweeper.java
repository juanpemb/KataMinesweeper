
public class MineSweeper {

	private static final char MINE = '*';
	private static final char ZERO = '0';
	private static final char ONE = '1';

	public char[][] decode(String input) {
		int x = Integer.valueOf(input.substring(0,1));
		int y = Integer.valueOf(input.substring(1,2));
		char[][] result = new char[x][y];
		int pos = 2;
		for(int i = 0; i<x;i++)
		{
			for(int j = 0; j<x;j++)
			{
				if(input.contains("*")){
					if(input.substring(pos,pos+1).equals("*")){
						result[i][j] = MINE;
					}else{
					result[i][j] = ONE;
					}
				}				
				else{
					result[i][j] = ZERO;
				}
				pos++;
			}
		}
		return result;		
	}

}
