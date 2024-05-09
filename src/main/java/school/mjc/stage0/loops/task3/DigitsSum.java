package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
      t=Math.abs(t);
       String text = Integer.toString(t);
       int result= 0;
        for (int i=1; i<=text.length();i++ )
        { result=result + t%10;
            t=t/10;}
        System.out.println(result);
    }
}
