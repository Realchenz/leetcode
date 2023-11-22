import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (interval1, interval2) -> {
            if (interval1[0] != interval2[0]) {
                return interval1[0] - interval2[0];
            } else {
                return interval2[1] - interval1[1];
            }
        });
        int ans = 0;
        int num = intervals.length;
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int i = 0; i < num-1; i++){
            if(intervals[i+1][0] == intervals[i][0]){
                ans++;
            } else if (intervals[i][0] >= right) {
                left = Math.min(intervals[i][0], left);
                right = Math.max(intervals[i][1], right);
            } else if (intervals[i][0] < right && intervals[i][1] <= right) {
                ans++;
                left = Math.max(intervals[i][0], left);
                right = Math.min(intervals[i][1], right);
            }else if (intervals[i][0] < right && intervals[i][1] > right) {
                ans++;
            }
        }
        if(intervals[num-1][0] < right) ans++;
        return ans;
    }
}
