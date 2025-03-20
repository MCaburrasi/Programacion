package _java.febrero;

import java.util.*;

public class NumberOfIslands {
    public static void search (char[][] grid, int i, int j, Set<String> visited) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        visited.add(i + " " + j);
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            i = point[0];
            j = point[1];
            int id;
            int jd;

            for (int[] direction : directions) {
                id = i + direction[0];
                jd = j + direction[1];
                if (id >= 0 &&
                    jd >= 0 &&
                    id < grid.length &&
                    jd < grid[0].length &&
                    !visited.contains((id) + " " + (jd)) &&
                    grid[id][jd] == '1') {
                        queue.offer(new int[]{id, jd});
                        visited.add(id + " " + jd);
                }
            }
        }
    }

    public static int numIslands (char[][] grid){
        int islands = 0;
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited.contains(i + " " + j) && grid[i][j] == '1'){
                    islands++;
                    search(grid, i, j, visited);
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
}
