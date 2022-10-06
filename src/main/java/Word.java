import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {

    private String Word1;
    private String Word2;

    public Word() {
        this.Word1 = "";
        this.Word2 = "";
    }

    public void Word(String Word1, String Word2) {
        this.Word1 = Word1;
        this.Word2 = Word2;
    }

    public void setWord1(String Word1) {
        this.Word1 = Word1;
    }

    public void setWord2(String Word2) {
        this.Word2 = Word2;
    }

    public String getWord1() {
        return Word1;
    }

    public String getWord2() {
        return Word2;
    }

    public String findWord(String Word1, String Word2) {
        Pattern pattern = Pattern.compile(Word1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Word2);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
            return "Match Found";
        } else {
            System.out.println("Match not Found");
            return "Not Found";
        }
    }

    public Boolean findTrue(String Word1, String Word2) {
        Pattern pattern = Pattern.compile(Word1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Word2);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
            return true;
        } else {
            System.out.println("Match not Found");
            return false;
        }
    }

    public Boolean findFalse(String Word1, String Word2) {
        Pattern pattern = Pattern.compile(Word1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Word2);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
            return true;
        } else {
            System.out.println("Match not Found");
            return false;
        }
    }
}
