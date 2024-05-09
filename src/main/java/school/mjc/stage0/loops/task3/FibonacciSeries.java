package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
       int result=0;
       int result1= 1;
       int result2;
        for (int i=1; i<=lastFibonacci; i++)
        {System.out.println(result);
            result2=result1;
            result1=result;
            result=result1+result2;
            }

    }
}
