package leetcode;

/**
 * You are given a map in form of a two-dimensional integer grid
 * where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly
 * one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected
 * to the water around the island). One cell is a square with side length 1.
 * The grid is rectangular, width and height don't exceed 100. Determine
 * the perimeter of the island.
 *
 * Example:
 *
 * Input:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * Output: 16
 *
 * Explanation: The perimeter is the 16 yellow stripes
 */
public class N463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int[] directions = {
                -1, 0,
                0, 1,
                1, 0,
                0, -1
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int sides = 4;
                    for (int d = 0; d < directions.length; d++) {
                        int newI = directions[d] + i;
                        int newJ = directions[++d] + j;

                        if (newI >= 0 && newJ >= 0
                                && newI < grid.length && newJ < grid[i].length) {
                            if (grid[newI][newJ] == 1) sides--;
                        }
                    }
                    perimeter += sides;
                }
            }
        }

        return perimeter;
    }

    // public int islandPerimeter(int[][] grid) {
    //     int result = 0;
    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid[i].length; j++) {
    //             if (grid[i][j] == 1) {
    //                 result += 4;
    //                 if (i > 0 && grid[i-1][j] == 1) result -= 2;
    //                 if (j > 0 && grid[i][j-1] == 1) result -= 2;
    //             }
    //         }
    //     }
    //     return result;
    // }
}
// https://leetcode.com/problems/island-perimeter/