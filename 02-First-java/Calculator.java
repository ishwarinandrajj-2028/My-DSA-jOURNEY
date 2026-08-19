import java.util.*;
public class Calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter number 2:");
        int num2=sc.nextInt();
        System.out.println("Enter an operator:");
        String op=sc.next();
        if(op.equals("+")){
            System.out.println(num1+num2);
            }
        else if (op.equals("-")){
            System.out.println(num1-num2);
            }
        else if (op.equals("*")){
            System.out.println(num1*num2);
            }   
        else if (op.equals("/")){
            if(num2==0){
                System.out.println("Division by zero is not allowed");

            }else{
            System.out.println(num1/num2);}
            }     
        else{
            System.out.println("Invalid Operator");
        }
//Another Approach
        // switch(op){
        //     case "+":System.out.println(num1+num2);
        //     break;//I forgot break
        //     case "*":System.out.println(num1*num2);
        //     break;
        //     case "/":System.out.println(num1/num2);
        //     break;
        //     case "-":System.out.println(num1-num2);
        //     break;
        //     default:System.out.println("Invalid Operator");
        // }
    sc.close();
        
    }
}