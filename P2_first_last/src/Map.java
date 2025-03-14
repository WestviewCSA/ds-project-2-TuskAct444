
public class Map {

	private tile[][] map; //is 2D enough
	private int maps, cols,rows;
	public Map(tile[][] map, int maps, int cols, int rows) {
		super();
		this.map = map;
		this.maps = maps;
		this.cols = cols;
		this.rows = rows;
	}
	public tile[][] getMap() {
		return map;
	}
	public void setMap(tile[][] map) {
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
