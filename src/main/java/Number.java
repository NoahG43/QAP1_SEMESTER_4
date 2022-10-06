import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Number {
    private int Num1;
    private int Num2;

    public Number() {
        this.Num1 = 0;
        this.Num2 = 0;

    }

    public void Number(int Num1, int Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;

    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }


    public int getNum1() {
        return Num1;
    }

    public int getNum2() {
        return Num2;
    }

    public int findSum(int Num1, int Num2) {
        int Sum = Num1 + Num2;
        return Sum;
    }

    public int findQuot(int Num1, int Num2) {
        int Quot = Num1 - Num2;
        return Quot;
    }

    public int findProd(int Num1, int Num2){
        int Prod = Num1 * Num2;
        return Prod;
    }






}
