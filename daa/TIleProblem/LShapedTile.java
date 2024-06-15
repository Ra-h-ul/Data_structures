package TIleProblem;

import java.util.Scanner;

public class LShapedTile {
    static int gridSize, blankRow, blankCol, count = 0;
    static int[][] grid;
    static int[][] tileArray;

    static void placeTile(int x1, int y1, int x2, int y2, int x3, int y3) {
        count++;
        grid[x1][y1] = count;
        grid[x2][y2] = count;
        grid[x3][y3] = count;
    }

    static int tileGrid(int n, int x, int y) {
        int r = 0, c = 0;
        if (n == 2) {
            count++;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[x + i][y + j] == 0) {
                        grid[x + i][y + j] = count;
                    }
                }
            }
            return 0;
        }
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != 0) {
                    r = i;
                    c = j;
                }
            }
        }
        if (r < x + n / 2 && c < y + n / 2)
            placeTile(x + n / 2, y + (n / 2) - 1, x + n / 2,
                    y + n / 2, x + n / 2 - 1, y + n / 2);
        else if (r >= x + n / 2 && c < y + n / 2)
            placeTile(x + (n / 2) - 1, y + (n / 2), x + (n / 2),
                    y + n / 2, x + (n / 2) - 1, y + (n / 2) - 1);
        else if (r < x + n / 2 && c >= y + n / 2)
            placeTile(x + n / 2, y + (n / 2) - 1, x + n / 2,
                    y + n / 2, x + n / 2 - 1, y + n / 2 - 1);
        else if (r >= x + n / 2 && c >= y + n / 2)
            placeTile(x + (n / 2) - 1, y + (n / 2), x + (n / 2),
                    y + (n / 2) - 1, x + (n / 2) - 1,
                    y + (n / 2) - 1);
        tileGrid(n / 2, x, y + n / 2);
        tileGrid(n / 2, x, y);
        tileGrid(n / 2, x + n / 2, y);
        tileGrid(n / 2, x + n / 2, y + n / 2);
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the grid: ");
        gridSize = scanner.nextInt();
        System.out.print("Enter the row position of the blank tile: ");
        blankRow = scanner.nextInt();
        System.out.print("Enter the column position of the blank tile: ");
        blankCol = scanner.nextInt();
        grid = new int[gridSize][gridSize];
        tileArray = new int[gridSize * 2][gridSize * 2];
        grid[blankRow][blankCol] = -1;
        tileGrid(gridSize, 0, 0);
        System.out.println("Tiling Result:");
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
        scanner.close();
    }
}