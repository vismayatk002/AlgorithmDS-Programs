public class PrimeNumbers{

    int min = 0;
    int max = 1000;
    public void isPrime(){

        int flag = 1;
        System.out.println("Prime numbers ");
        for(int i=min; i<=max; i++){
            flag = 1;
            for(int j=2; j<=(i/2); j++){
                
                if(i % j == 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }

    public void isPalindrome(){
        
    }
    public static void main(String[] args){

        PrimeNumbers prime = new PrimeNumbers();
        prime.isPrime();
    }
}