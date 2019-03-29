/**
 * 
 */
package amobaPractice;

/**
 * @author zkleri
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board(10, 10);
		for (int i = 0; i < 10; i++) {
			board.toString();
			board.getXYCoordinates();
		}
		
	}

}
