package ie.atu.week5;

public class Calculator {
    private int calcValue;

    public Calculator() {calcValue = 0;}

    public int add(int num1, int num2)
    {
        calcValue = num1 + num2;
        return calcValue;
    }

    public int multiply(int num3, int num4) {
        calcValue = num3 * num4;
        return calcValue;
    }

    public int subtract(int num5, int num6) {
        calcValue = num5 - num6;
        return calcValue;
    }
}
