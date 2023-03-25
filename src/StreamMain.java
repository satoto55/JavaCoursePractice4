import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 第4回課題
 * Stream APIのサンプル
 *
 * @author sato
 * @version 1.0.0
 */
public class StreamMain {
    public static void main(String[] args) {

        // 科目のリスト
        List<TestScore> scoreList = new ArrayList<>();
        scoreList.add(new TestScore("B001", "算数", 61));
        scoreList.add(new TestScore("B001", "国語", 60));
        scoreList.add(new TestScore("B001", "英語", 59));
        scoreList.add(new TestScore("A001", "算数", 98));
        scoreList.add(new TestScore("A001", "国語", 80));
        scoreList.add(new TestScore("A001", "英語", 70));
        scoreList.add(new TestScore("A002", "算数", 99));
        scoreList.add(new TestScore("A002", "国語", 90));
        scoreList.add(new TestScore("A002", "英語", 80));

        // 点数が60点以上のデータを表示
        System.out.println("-------得点が60点以上のデータを昇順で表示-------");
        scoreList.stream().filter(testScore -> testScore.score() >= 60).sorted(Comparator.comparing(TestScore::score))
                .forEach(testScore -> System.out.println("id：" + testScore.studentId()
                        + " subject：" + testScore.subject() + " score：" + testScore.score()));

        // 学生ID順の昇順、点数の昇順に並び替えて表示
        System.out.println("-------学生ID順の昇順、点数の降順に並び替えて表示-------");
        scoreList.stream().sorted(Comparator.comparing(TestScore::studentId).reversed()
                        .thenComparing(TestScore::score).reversed())
                .toList()
                .forEach(testScore -> System.out.println("id：" + testScore.studentId()
                        + " subject：" + testScore.subject() + " score：" + testScore.score()));
    }
}
