package Com.sarthak;

public class ThirdClass {
    private int multiplicationResult;

    public  ThirdClass(SecondClass secondClass) {
        this.multiplicationResult = secondClass.getLastDigit1() * secondClass.getLastDigit2();
    }

    public int getMultiplicationResult() {
        return multiplicationResult;
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(123, 456);
        SecondClass secondClass = new SecondClass();
        ThirdClass thirdClass = new ThirdClass(secondClass);

        System.out.println("Last digit of number 1: " + secondClass.getLastDigit1());
        System.out.println("Last digit of number 2: " + secondClass.getLastDigit2());
        System.out.println("Multiplication of last digits: " + thirdClass.getMultiplicationResult());
    }
}
