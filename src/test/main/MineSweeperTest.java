import static org.junit.Assert.*;

import org.junit.Test;

public class MineSweeperTest {
	private MineSweeper mineSweeper =  new MineSweeper();
	private final String inputEmptyField= "22....";
	private final String inputOneMineField= "22...*";

	@Test
	public void test_check_any_input(){		
		
		char[][] output = mineSweeper.decode(inputEmptyField);
		
		assertNotNull(output);
	}
	
	@Test
	public void test_obatin_input_without_mine(){
		
		char[][] decoded = mineSweeper.decode(inputEmptyField);
		
		assertArrayEquals(clear_field(), decoded);
	}
	
	
	@Test
	public void test_obatin_input_with_one_mine(){
		
		char[][] decoded = mineSweeper.decode(inputOneMineField);
		
		assertArrayEquals(one_mine_field(), decoded);
	}
	

	private Object[] one_mine_field() {
		char[][] expetedResult = new char[2][2];
		expetedResult[0][0] = '1';
		expetedResult[0][1] = '1';
		expetedResult[1][0] = '1';
		expetedResult[1][1] = '*';
		return expetedResult;
	}

	private char[][] clear_field() {
		char[][] expetedResult = new char[2][2];
		expetedResult[0][0] = '0';
		expetedResult[0][1] = '0';
		expetedResult[1][0] = '0';
		expetedResult[1][1] = '0';
		return expetedResult;
	}
}

