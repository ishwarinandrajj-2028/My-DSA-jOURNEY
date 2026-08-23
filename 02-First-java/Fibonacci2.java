public class Fibonacci2 {
    
    public static void main(String[] args) {

        Fibonacci2 obj = new Fibonacci2();

        int result = obj.fib(9);

        System.out.println(result);
    }
    //Note in vs code we have to call our method using main by creating an object 

    public int fib(int n) {
       if(n==0){
        return 0;
       }
       else if(n==1){
        return 1;
       } 
       else{
        int result =fib(n-1)+fib(n-2);
        return result;

       }
    
}}
