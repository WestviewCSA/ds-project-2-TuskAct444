import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class p2 {
    boolean St = false;
    boolean Qu = false;
    boolean Opt = false;
    boolean Time = false;
    boolean In = false;
    boolean Out = false;
    boolean Help = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("p2");

        readMap("Map 5");
    }

    public static void readMap(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            int numRows = scanner.nextInt();
            int numCols = scanner.nextInt();
            int numRooms = scanner.nextInt();

            int rowIndex = 0;

            // process the map!
            while (scanner.hasNextLine()) {
                // grab a line (one row of the map)
                String row = scanner.nextLine();

                if (row.length() > 0) {
                    for (int i = 0; i < numCols && i < row.length(); i++) {
                        char el = row.charAt(i);
                        tile obj = new tile(rowIndex, i, el);
                    }
                }

                rowIndex++;
            }
        } catch (FileNotFoundException e) {
            // handle
            System.out.println(e);
        }
    }

    public static void queueData(tile[][] maze, int SRow, int SCol) {
        Queue<tile> queue = new LinkedList<>();

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        queue.add(maze[SRow][SCol]);
        visited[SRow][SCol] = true;

        int[][] dRow = {-1, 1, 0, 0};
        int[][] dCol = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            tile current = queue.poll();
            if (current.getType() == '$') {
                markPath(current);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int newRow = current.getRow() + dRow[i];
                int newCol = current.getCol() + dCol[i];

                if (isValidMove(newRow, newCol, maze)) {
                    tile neighbor = maze[newRow][newCol];
                    if (!neighbor.isVisited() && neighbor.getType() != '@') {
                        neighbor.setVisited(true);
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

    private static tile findStart(tile[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].getType() == 'W') {
                    return map[i][j];
                }
            }
        }
        return null; // return null if no start tile is found
    }

    public static void mapMarker(tile target) {
        while (target != null) {
            target.setCol('+');
            target = target.getPrevious();
        }
    }

    public static void stackB(tile[][] map) {
        Stack<tile> stack = new Stack<>();
        tile start = findStart(map);
        stack.push(start);
        start.setVisited(true);

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!stack.isEmpty()) {
            tile current = stack.pop();

            if (current.getType() == '$') {
                markPath(current);
                break;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = current.getRow() + dRow[i];
                int newCol = current.getCol() + dCol[i];

                if (isValidMove(newRow, newCol, map)) {
                    tile neighbor = map[newRow][newCol];
                    if (!neighbor.isVisited() && neighbor.getType() != '@') {
                        stack.push(neighbor);
                        neighbor.setVisited(true);
                    }
                }
            }
        }
    }

    private static boolean isValidMove(int row, int col, tile[][] map) {
        return row >= 0 && row < map.length && col >= 0 && col < map[0].length;
    }

    private static void markPath(tile target) {
    }

    
