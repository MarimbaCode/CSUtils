import net.thejrdev.ProgressBar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressBarTest {

    @Test
    public final void constructorTest0(){

        ProgressBar progressBar = new ProgressBar();

        char openChar = progressBar.getOpenChar();
        char closeChar = progressBar.getCloseChar();
        char fillChar = progressBar.getFillChar();
        char emptyChar = progressBar.getEmptyChar();

        char expectedOpenChar = '[';
        char expectedCloseChar = ']';
        char expectedFillChar = '|';
        char expectedEmptyChar = '-';

        assertEquals(expectedCloseChar, closeChar);
        assertEquals(expectedEmptyChar, emptyChar);
        assertEquals(expectedOpenChar, openChar);
        assertEquals(expectedFillChar, fillChar);

    }
    @Test
    public final void constructorTest1(){

        ProgressBar progressBar = new ProgressBar('|', '-');

        char openChar = progressBar.getOpenChar();
        char closeChar = progressBar.getCloseChar();
        char fillChar = progressBar.getFillChar();
        char emptyChar = progressBar.getEmptyChar();

        char expectedOpenChar = '[';
        char expectedCloseChar = ']';
        char expectedFillChar = '|';
        char expectedEmptyChar = '-';

        assertEquals(expectedCloseChar, closeChar);
        assertEquals(expectedEmptyChar, emptyChar);
        assertEquals(expectedOpenChar, openChar);
        assertEquals(expectedFillChar, fillChar);

    }
    @Test
    public final void constructorTest2(){

        ProgressBar progressBar = new ProgressBar('|', '-', (byte) 100);

        char openChar = progressBar.getOpenChar();
        char closeChar = progressBar.getCloseChar();
        char fillChar = progressBar.getFillChar();
        char emptyChar = progressBar.getEmptyChar();

        char expectedOpenChar = '[';
        char expectedCloseChar = ']';
        char expectedFillChar = '|';
        char expectedEmptyChar = '-';

        assertEquals(expectedCloseChar, closeChar);
        assertEquals(expectedEmptyChar, emptyChar);
        assertEquals(expectedOpenChar, openChar);
        assertEquals(expectedFillChar, fillChar);

    }
    @Test
    public final void constructorTest3(){

        ProgressBar progressBar = new ProgressBar('[', ']', '|', '-');

        char openChar = progressBar.getOpenChar();
        char closeChar = progressBar.getCloseChar();
        char fillChar = progressBar.getFillChar();
        char emptyChar = progressBar.getEmptyChar();

        char expectedOpenChar = '[';
        char expectedCloseChar = ']';
        char expectedFillChar = '|';
        char expectedEmptyChar = '-';

        assertEquals(expectedCloseChar, closeChar);
        assertEquals(expectedEmptyChar, emptyChar);
        assertEquals(expectedOpenChar, openChar);
        assertEquals(expectedFillChar, fillChar);

    }
    @Test
    public final void constructorTest4(){

        ProgressBar progressBar = new ProgressBar('[', ']', '|', '-', (byte)100);

        char openChar = progressBar.getOpenChar();
        char closeChar = progressBar.getCloseChar();
        char fillChar = progressBar.getFillChar();
        char emptyChar = progressBar.getEmptyChar();

        char expectedOpenChar = '[';
        char expectedCloseChar = ']';
        char expectedFillChar = '|';
        char expectedEmptyChar = '-';

        assertEquals(expectedCloseChar, closeChar);
        assertEquals(expectedEmptyChar, emptyChar);
        assertEquals(expectedOpenChar, openChar);
        assertEquals(expectedFillChar, fillChar);

    }

    @Test
    public final void progressBarTest1(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(50) + "-".repeat(50) + "]";

        assertEquals(expected, progressBar.createBar(1,2));

    }

    @Test
    public final void progressBarTest2(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(25) + "-".repeat(75) + "]";

        assertEquals(expected, progressBar.createBar(1.0,4.0));

    }

    @Test
    public final void progressBarTest3(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(12) + "-".repeat(88) + "]";

        assertEquals(expected, progressBar.createBar((short)1,(short)8));

    }

    @Test
    public final void progressBarTest4(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(6) + "-".repeat(94) + "]";

        assertEquals(expected, progressBar.createBar(1L,16L));

    }

    @Test
    public final void progressBarTest5(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(75) + "-".repeat(25) + "]";

        assertEquals(expected, progressBar.createBar(75,100));

    }

    @Test
    public final void progressBarTest6(){

        ProgressBar progressBar = new ProgressBar();

        String expected = "[" + "|".repeat(100) + "-".repeat(0) + "]";

        assertEquals(expected, progressBar.createBar(101,100));

    }

}
