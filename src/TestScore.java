/**
 * テストの点数を管理するクラス
 *
 * @param studentId 学生ID
 * @param subject   科目
 * @param score     点数
 * @author sato
 * @version 1.0.0
 */
public record TestScore(String studentId, String subject, int score) {

    /**
     * 最大得点
     */
    public static final int MAX_TEST_SCORE = 100;

    /**
     * コンストラクタ
     *
     * @param studentId 学生ID
     * @param subject   科目
     * @param score     得点
     */
    public TestScore(String studentId, String subject, int score) {

        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
        if (score > 100) {

            // 100を超える点数は入力を許可しない
            throw new IllegalArgumentException("点数は100点以内で入力してください");
        }
    }

    /**
     * 点数が100点以内かチェックする
     *
     * @return 100点以内の場合、true
     */
    private boolean isValidScore() {
        return score <= MAX_TEST_SCORE;
    }
}
