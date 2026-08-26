/*728-A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive). */

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNo {
    public static void main(String[] args) {
        SelfDividingNo obj = new SelfDividingNo();
        List<Integer> result = obj.selfDividingNumbers(1,22);
        System.out.println(result);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for (int i=left;i<=right;i++){
            boolean isSelfDividing=true;
            int num=i;
            while(num!=0){
                int rem=num%10;
                if(rem==0){
                    isSelfDividing=false;
                }
                else if (i%rem!=0){
                    isSelfDividing=false;
                }
                num=num/10;
            }
            if(isSelfDividing){
            result.add(i);
            }
        }
        return result;
        }
    }

