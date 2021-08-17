import java.util.*; 

public class PrimePalindrome{

    int min = 0;
    int max = 1000;
    ArrayList<Integer> list = new ArrayList<>();
    public void isPrime(){

        int flag = 1;
        
        for(int i=min; i<=max; i++){
            flag = 1;
            for(int j=2; j<=(i/2); j++){
                
                if(i % j == 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                list.add(i);
            }
        }
    }

    public static int reverse(Integer i){

        int rev = 0;
        while(i != 0){
            int remainder = i % 10;  
            rev = rev * 10 + remainder;  
            i = i/10;
        }
        return rev;  
    }
    public void isPalindrome(){

        System.out.println("Prime numbers that are palindrome ");
        for(Integer i : list){
        
            if(i > 10 && reverse(i) == i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){

        PrimePalindrome prime = new PrimePalindrome();
        prime.isPrime();
        prime.isPalindrome();
    }
}