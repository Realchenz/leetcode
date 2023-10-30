import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        path.add(0);
        dfs(graph, 0);
        return ans;
    }

    private void dfs(int[][] graph, int i) {
        if (i == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < graph[i].length; j++) {
            path.add(graph[i][j]);
            dfs(graph, graph[i][j]);
            path.remove(path.size() - 1);
        }
    }

}
