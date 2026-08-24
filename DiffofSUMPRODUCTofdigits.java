class DiffofSUMPRODUCTofdigits {

    public static void main(String[] args){

        DiffofSUMPRODUCTofdigits obj = new DiffofSUMPRODUCTofdigits();

        int diff = obj.subtractProductAndSum(234);

        System.out.println(diff);
    }
    
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while (n!=0){
            int rem=n%10;
            product = product * rem;
            sum = sum + rem;
            n=n/10;
        }
        return product - sum ;
    }
}