import java.util.*;
public class input {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give imput");
    int sum=0;
    while(true){
        String input=sc.next();
        if(input.equals("x")){
            System.out.println("You pressed x");
            break;
        }
        int num=Integer.parseInt(input);
        sum=sum+num;


    }
    System.out.println("Sum of your input numbers is "+sum);

    sc.close();
}}
