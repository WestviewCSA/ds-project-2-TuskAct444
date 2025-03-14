
public class Map {

	private Tile[][] map; //is 2D enough
	private int maps, cols,rows;
	public Map(Tile[][] map, int maps, int cols, int rows) {
		super();
		this.map = map;
		this.maps = maps;
		this.cols = cols;
		this.rows = rows;
	}
	public Tile[][] getMap() {
		return map;
	}
	public void setMap(Tile[][] map) {
		this.map = map;
	}
	public int getMaps() {
		return maps;
	}
	public void setMaps(int maps) {
		this.maps = maps;
	}
	public int getCols() {
		return cols;
	}
	public void setCols(int cols) {
		this.cols = cols;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
