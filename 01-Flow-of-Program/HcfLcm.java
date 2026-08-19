import java.util.*;
public class HcfLcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int orig_a=a;
        int orig_b=b;

        if (a==0&&b==0){
            System.out.println("invalid");}

        else if (a==0){
            int hcf=b;
            System.out.println("HCF is :"+hcf);
            System.out.println("LCM is :0");

        }

        else if (b==0){
            int hcf=a;
            System.out.println("HCF is :"+hcf);
            System.out.println("LCM is :0");


        }
        else{

        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int hcf=b;
        System.out.println("The HCF of given numbers is :"+hcf);
        long lcm=(long)orig_a*orig_b/hcf;
        System.out.println("LCM is :"+lcm);



    }
}}

