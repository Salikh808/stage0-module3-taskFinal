package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum;
        for(sum=0; number!=0; number=number/10)
        {
//finds the last digit and add it to the variable sum
            sum = sum + number % 10;
        }
//prints the result
        System.out.println("Sum of digits: "+sum);
    }
}
