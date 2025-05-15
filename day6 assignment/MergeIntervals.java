import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static List<int[]> mergeIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] lastMerged = merged.get(merged.size() - 1);
            int[] current = intervals[i];

            if (current[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        List<int[]> result = mergeIntervals(intervals);

        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}