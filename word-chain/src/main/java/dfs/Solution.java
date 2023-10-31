package dfs;
import java.util.List;

public class Solution {
    int min = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = wordList.size();
        int[] visited = new int[len];
        dfs(beginWord, endWord, wordList, visited, 1);
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

    private void dfs(String beginWord, String endWord, List<String> wordList, int[] visited, int count) {
        if (beginWord.equals(endWord)) {
            min = Math.min(min, count);
            return;
        }
        for (int i = 0; i < wordList.size(); i++) {
            if (isOneCharDiff(beginWord, wordList.get(i)) && visited[i] == 0) {
                visited[i] = 1;
                dfs(wordList.get(i), endWord, wordList, visited, count+1);
                visited[i] = 0;
            }
        }
    }

    private boolean isOneCharDiff(String beginWord, String word) {
        char[] beginWordChars = beginWord.toCharArray();
        char[] wordChars = word.toCharArray();
        int diff = 0;
        for (int i = 0; i < beginWordChars.length; i++) {
            if (beginWordChars[i] != wordChars[i]) {
                diff++;
            }
        }
        return diff == 1;
    }

}
