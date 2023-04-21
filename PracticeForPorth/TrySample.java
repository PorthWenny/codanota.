import java.util.LinkedList;
import java.util.Queue;

public class TrySample {
    public static int breakWall(char[][] grid, int startX, int startY, int endX, int endY) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Use a boolean grid to track visited cells and number of walls broken
        boolean[][][] visited = new boolean[rows][cols][2]; // 2nd dimension for walls broken
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0, 0}); // Include a third element for wall count and a fourth element for walls broken
        visited[startX][startY][0] = true; // Mark start cell as visited with 0 walls broken

        // Define possible moves: up, down, left, right
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int wallsToBreak = curr[2];
            int wallsBroken = curr[3];

            if (x == endX && y == endY) {
                return wallsToBreak; // Reached the end point, return walls to break count
            }

            // Explore neighboring cells
            for (int[] move : moves) {
                int newX = x + move[0];
                int newY = y + move[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    int newWallsBroken = wallsBroken + (grid[newX][newY] == 'X' ? 1 : 0);
                    int newWallsToBreak = wallsToBreak + (grid[newX][newY] == 'X' && wallsBroken == 0 ? 1 : 0);
                    if (newWallsBroken <= 1 && !visited[newX][newY][newWallsBroken]) {
                        queue.offer(new int[]{newX, newY, newWallsToBreak, newWallsBroken});
                        visited[newX][newY][newWallsBroken] = true;
                    }
                }
            }
        }

        return -1; // No valid path found
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', '.', '.', 'X', 'A', 'X'},
                {'X', 'X', 'X', '.', '.', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', '.', '.', '.', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', '.', '.', '.', '.', 'B', '.', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
        };

        int startX = 1;
        int startY = 6;
        int endX = 6;
        int endY = 5;

        int wallsToBreak = breakWall(grid, startX, startY, endX, endY);
        System.out.println("Minimum walls to break: " + wallsToBreak);
    }
}

