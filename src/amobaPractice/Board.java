package amobaPractice;

import java.util.Scanner;

public class Board {
	
	public static Scanner scanner = new Scanner(System.in);

	private int sizeX;
	private int sizeY;
	private String[][] valueOfFields;	
	private String lastInsertedValueOfBoard;
	private String valueToInsert;
	
	public Board(int sizeX, int sizeY) {
		super();
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		valueOfFields = new String[sizeX][sizeY];
		uploadFieldsWithEmptyValues();
		lastInsertedValueOfBoard="0";
		valueToInsert="";
	}

	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public void getXYCoordinates() {
		int x = getCoordinate();
		int y = getCoordinate(); 
		insertCoordinates(x,y);
	}
	
	public int getCoordinate() {
		return scanner.nextInt();
	}
	
	public void insertCoordinates(int x, int y) {
		if(lastInsertedValueOfBoard=="0") {
			valueToInsert="1";
		} else {
			valueToInsert="0";
		}
		valueOfFields[x-1][y-1]=valueToInsert;
		lastInsertedValueOfBoard=valueToInsert;
		
	}
	
	public void uploadFieldsWithEmptyValues() {
		for (int i = 0; i < getSizeX(); i++) {
			for (int j = 0; j < getSizeY(); j++) {
				valueOfFields[i][j]=".";
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < getSizeX()-1; i++) {
			for (int j = 0; j < getSizeY()-1; j++) {
				System.out.print(valueOfFields[i][j]);
			}
			System.out.println();
		}
	
		return "";
	}
	
}
