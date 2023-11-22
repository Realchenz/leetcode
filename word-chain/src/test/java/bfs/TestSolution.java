package bfs;

import org.junit.Test;

import java.util.List;

public class TestSolution {
    @Test
    public void testLadderLength1() {
        Solution solution = new Solution();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
        int result = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println(result);
    }
}
