import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestScoreTest {

    @Test
    public void scoreに99の値を入力した場合正常に動作する() {
        assertEquals(99, new TestScore("A001", "英語", 99).score());
    }

    @Test
    public void scoreに100を入力した場合正常に動作する() {
        assertEquals(100, new TestScore("A001", "英語", 100).score());
    }

    @Test
    public void scoreに100以上の値を入力した場合エラー() {
        assertThrows(IllegalArgumentException.class, () -> new TestScore("A001", "英語", 101));
    }

}