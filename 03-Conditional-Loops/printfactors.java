
public class printfactors {

    public static void main(String[] args) {
        printfactors obj = new printfactors();
        obj.printallFactors(50);
    }


    public void printallFactors(int n){

        for(int i =1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
    
}
