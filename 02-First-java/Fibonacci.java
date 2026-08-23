import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Invalid");
        }
        else if(n==1){
            System.out.println("0");
        }
        else{
        int num1=0;
        System.out.println(num1);
        int num2=1;
        System.out.println(num2);
        int count=1;
        while(count<=n-2){
            int sum =num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
            count++;
        }
    }
    sc.close();
    }
}
