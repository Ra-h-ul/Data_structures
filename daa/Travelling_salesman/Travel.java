package Travelling_salesman;
import java.io.*;
import java.util.*;

public class Travel {
    static int numCities = 4;

     
    static int MAX_DISTANCE = 1000000;
    static int[][] distanceMatrix = {
                  { 0, 0, 0, 0, 0 }, { 0, 0, 10, 15, 20 },
                  { 0, 10, 0, 25, 25 }, { 0, 15, 25, 0, 30 },
                  { 0, 20, 25, 30, 0 },
      };

     
    static int[][] memoization = new int[numCities + 1][1 << (numCities + 1)];

     

    static int calculateShortestTour(int currentCity, int visitedCitiesMask) {

            if (visitedCitiesMask == ((1 << currentCity) | 3))
                  return distanceMatrix[1][currentCity];

            if (memoization[currentCity][visitedCitiesMask] != 0)
                  return memoization[currentCity][visitedCitiesMask];

            int result = MAX_DISTANCE; // result of this sub-problem

            for (int nextCity = 1; nextCity <= numCities; nextCity++)
                  if ((visitedCitiesMask & (1 << nextCity)) != 0 && nextCity != currentCity && nextCity != 1)
                        result = Math.min(result, calculateShortestTour(nextCity, visitedCitiesMask & (~(1 << currentCity)))
                                    + distanceMatrix[nextCity][currentCity]);
            return memoization[currentCity][visitedCitiesMask] = result;
      }

     

    public static void main(String[] args) {
            int minTourCost = MAX_DISTANCE;
            for (int currentCity = 1; currentCity <= numCities; currentCity++)
                  minTourCost = Math.min(minTourCost, calculateShortestTour(currentCity, (1 << (numCities + 1)) - 1)
                              + distanceMatrix[currentCity][1]);

            System.out.println("The cost of the most efficient tour = " + minTourCost);
      }
}
