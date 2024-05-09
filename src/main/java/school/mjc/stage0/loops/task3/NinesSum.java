package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int i = 1;
        int m = lengthOfLastNumber;
        int result=0;
        while (i<=lengthOfLastNumber)
        {  result= result + (9*m*(int)Math.pow(10,i-1));
        i++;
        m--;}
System.out.println(result);

    }
}
