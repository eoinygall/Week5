package ie.atu.week5;

public class Calculator {
    private int calcValue;

    public Calculator() {calcValue = 0;}

    public int add(int num1, int num2)
    {
        calcValue = num1 + num2;
        return calcValue;
    }
}
