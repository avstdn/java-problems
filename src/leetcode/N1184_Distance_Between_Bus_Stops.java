package leetcode;

/**
 * A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance
 * between all pairs of neighboring stops where distance[i] is the distance between the
 * stops number i and (i + 1) % n. The bus goes along both directions i.e. clockwise and
 * counterclockwise. Return the shortest distance between the given start and destination
 * stops.
 *
 * Example 1:
 *       1
 *   0 ----- 1
 *   |       |
 * 4 |       | 2
 *   |       |
 *   3 ----- 2
 *       3
 * Input: distance = [1,2,3,4], start = 0, destination = 1
 * Output: 1
 * Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.
 *
 * Example 2:
 *       1
 *   0 ----- 1
 *   |       |
 * 4 |       | 2
 *   |       |
 *   3 ----- 2
 *       3
 * Input: distance = [1,2,3,4], start = 0, destination = 2
 * Output: 3
 * Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
 *
 *
 * Example 3:
 *       1
 *   0 ----- 1
 *   |       |
 * 4 |       | 2
 *   |       |
 *   3 ----- 2
 *       3
 * Input: distance = [1,2,3,4], start = 0, destination = 3
 * Output: 4
 * Explanation: Distance between 0 and 3 is 6 or 4, minimum is 4.
 */
public class N1184_Distance_Between_Bus_Stops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0;
        int anticlockwise = 0;
        int n = distance.length;

        for (int i = start; i != destination; i = (i + 1) % n) {
            clockwise += distance[i];
        }

        for (int i = destination; i != start; i = (i + 1) % n) {
            anticlockwise += distance[i];
        }

        return Math.min(clockwise, anticlockwise);
    }
}