import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordTest {

    @Test
    public void wordExampleTest(){
        Word wordExample = new Word();
        Assertions.assertEquals(wordExample.findWord("Four", "This_the_word_in_this_sequence"), "Not Found");
    }
    @Test
    public void trueExampleTest(){
        Word trueExample = new Word();
        Assertions.assertTrue(trueExample.findTrue("Nine", "Is_The_Word_Nine_Here"));
    }
    @Test
    public void falseExampleTest(){
        Word falseExample = new Word();
        Assertions.assertFalse(falseExample.findTrue("Seven", "Is_The_Word_Here"));
    }


}
