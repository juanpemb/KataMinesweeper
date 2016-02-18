import static org.junit.Assert.*;

import org.junit.Test;

public class MineSweeperTest {
	private static final int _I = 1;
	private static final int _J = 1;

	@Test
	public void test(){		
		char input[][] = new char[_I][_J];		
		MineSweeper s =  new MineSweeper();
		
		char[][] output = s.decode(input);
		
		assertNotNull(output);
	}
}
