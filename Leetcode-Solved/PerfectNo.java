/*507-A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false. */

public class PerfectNo {
    public static void main(String[] args) {
        PerfectNo obj = new PerfectNo();
        boolean r = obj.checkPerfectNumber(7);
        System.out.println(r);
    }
    public boolean checkPerfectNumber(int num) {
        int sum =0;
        for(int i=1;i<num;i++){
             if(num%i==0){
                sum=sum+i;
             }

        }
        
        return sum==num;

    }
}
    