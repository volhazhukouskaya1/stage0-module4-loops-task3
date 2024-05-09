package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int i = Math.max(first,second);

       while  (first%i!=0 || second%i!=0)
        {
            i--;     }
        System.out.println(i);
    }
}
