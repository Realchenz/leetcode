package dfs;

import org.junit.Test;

import java.util.List;

public class TestSolution {
    @Test
    public void testLadderLength() {
        Solution solution = new Solution();
        String beginWord = "qa";
        String endWord = "sq";
        List<String> wordList = List.of("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye");
        int result = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println(result);
    }
}
