package pl.vrajani.solution.google.campusBikes;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[][] workers = new int[][]{{0,0},{2,1}};
        int[][] bikes = new int[][]{{1,2},{3,3}};

        System.out.println(new Solution().assignBikes(workers, bikes).toString());
    }

    public int[] assignBikes(int[][] workers, int[][] bikes) {

        ArrayList<Integer> takenWorkerIndexes = new ArrayList<>();

        int[] ret = new int[workers.length];
        for(int i = 0; i < workers.length && takenWorkerIndexes.size() < workers.length; i ++){
            int min = Integer.MAX_VALUE;
            int workerIndex = -1;
            int[] worker = workers[i];
            for(int p = 0; p < bikes.length; p++){
                if(!takenWorkerIndexes.contains(p)) {
                    int[] bike = bikes[p];
                    int dist = Math.abs(bike[0] - worker[0]) + Math.abs(bike[1] - worker[1]);
                    if (dist < min) {
                        min = dist;
                        workerIndex = p;
                    }
                }
            }
            ret[i] = workerIndex;
            takenWorkerIndexes.add(workerIndex);
        }

        return ret;
    }

}
