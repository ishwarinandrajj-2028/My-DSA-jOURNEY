public class factorial{
    public static void main(String[]args){
        factorial obj=new factorial();
        int fact = obj.fact(3);
        System.out.println(fact);

    }

    public int fact (int n){
        if(n<=1){
            return 1;//base case is very important for recursion
        }
        int fact=fact(n-1)*n;
        return fact;
        
    }
}