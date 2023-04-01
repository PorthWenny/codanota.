import java.util.*;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class TrySample {
    static int[][][] dist;
    static char[][][] floor;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n, f;
    static Point start, end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();
        floor = new char[f][n][n];
        dist = new int[f][n][n];
        for (int i = 0; i < f * n; i++) {
            int floorNum = i / n;
            int row = i % n;
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                floor[floorNum][row][j] = line.charAt(j);
                if (line.charAt(j) == 'A') {
                    start = new Point(row, j);
                } else if (line.charAt(j) == 'B') {
                    end = new Point(row, j);
                }
                dist[floorNum][row][j] = -1;
            }
        }
        int ans = bfs();
        System.out.println(ans);
    }

    public static int bfs() {
        Queue<Point> q = new LinkedList<>();
        for (int i = 0; i < f; i++) {
            if (dist[i][start.x][start.y] == -1) {
                dist[i][start.x][start.y] = 0;
                q.add(start);
            }
        }
        while (!q.isEmpty()) {
            Point curr = q.remove();
            int floorNum = getFloorNum(curr);
            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];
                if (isValid(nx, ny) && floor[floorNum][nx][ny] != 'X' && dist[floorNum][nx][ny] == -1) {
                    dist[floorNum][nx][ny] = dist[floorNum][curr.x][curr.y] + 1;
                    q.add(new Point(nx, ny));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < f; i++) {
            if (dist[i][end.x][end.y] != -1) {
                res = Math.min(res, dist[i][end.x][end.y]);
            }
        }
        return res;
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    public static int getFloorNum(Point p) {
        for (int i = 0; i < f; i++) {
            if (p.x >= i * n && p.x < (i + 1) * n) {
                return i;
            }
        }
        return -1;
    }
}
