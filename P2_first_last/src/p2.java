import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
			
		readMap("Map 5");
	}

		boolean St    = false;	
		boolean Qu    = false;
		boolean Opt   = false;		
		boolean Time  = false;
		boolean In    = false;
		boolean Out   = false;
		boolean Help  = false;

		
		
		public static void queueData(tile[][] maze, int SRow, int SCol) {
		
		
		Queue<E> <tile> queue = newLinkedList();
		boolean[][] visited =
		boolean[maze.length][maze[0].length];
		queue.add(maze[SRow][SCol]);
		visited[SRow][SCol] = true;
		
		
		int [][] dRow = {-1, 1, 0, 0};
		int [][] dCol = {0, 0, -1, 1};
			while(queueB) {
				
			}
		}
		
	public static void readMap(String filename) {
		
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			
			int numRows 		= scanner.nextInt();
			int numCols 		= scanner.nextInt();
			int numRooms	    = scanner.nextInt();
			
			int rowIndex = 0;
			
			//process the map!
			while(scanner.hasNextLine()) {
				//grab a line (one row of the map)
				String row= scanner.nextLine();
				
				if(row.length()>0) {
					for(int i = 0; i < numCols &&  i < row.length(); i++) {
						char el = row.charAt(i);
						tile obj = new tile(rowIndex , i , el);
						
						
					}
				}
				
			
				
				
			}
	public static test1()
			
	
	public static void stackB(){
			
		}
		
	public static void QueueB(){

		}
				
				
			
		}catch (FileNotFoundException e){
			//handle
			System.out.println(e);
		}
		
/*		
		public static void inputRead(Scanner scanner); {
			M = scanner.next();
			N = scanner.next();
			mazeNum = scanner.next();
			
			
			while(scanner.hasNext());
			
		}
*/		
		
		
		
		
		
		
		
	}

	private Queue<tile> newLinkedList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
