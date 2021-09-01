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








}
