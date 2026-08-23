class Armstrong {

    public static void main(String[] args){

        Armstrong obj = new Armstrong();

        boolean result = obj.isArmstrong(1634);

        System.out.println(result);
    }

    public boolean isArmstrong(int n) {

        int count = 0;
        double sum = 0;
        int temp = n;
        int final_n=n;

        while(n!=0){
        //int rem=n%10 ; i wrote this unneccessarily
        n=n/10;
        count ++;}

        while(temp !=0){ 
        int rem= temp%10 ; 
        temp=temp/10  ; 
        sum=sum+Math.pow(rem,count);
        }
        
        if(sum==final_n){
            return true;
        }else
             return false;

       //the if else was redundant i could simply return sum=final_n      
    }
}