
public class tile {

	private int row, col;
	private char type;
	
	public tile(int row, int col, char type) {
		super();
		this.row = row;
		this.col = col;
		this.type = type;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	
	
	
	
}
