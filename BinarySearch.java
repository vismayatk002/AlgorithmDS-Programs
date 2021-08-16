import java.util.*; 
import java.io.*;

public class BinarySearch{

    ArrayList<String> wordsList = new ArrayList<>();

    public static void main(String[] args){

        BinarySearch search = new BinarySearch();
        search.readWords(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word for search : ");
        String word = sc.nextLine(); 
        int result = search.searchWord(word);
        if(result == -1){
        System.out.print(word + " not found ");
        }
        else{
            System.out.print(word + " found at position : " + result);
        }
    }
    public void readWords(){

        try{
            BufferedReader buf = new BufferedReader(new FileReader("words.txt"));
            String str = buf.readLine();
            String[] strArr = str.split(",");
            for(String word:strArr) {
                wordsList.add(word);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public int searchWord(String word){

        Collections.sort(wordsList);
        int left = 0;
        int right = wordsList.size() - 1;
        while(left <= right){

            int mid = left + (right - left) / 2;
            if(wordsList.get(mid).compareTo(word) == 0){
                return mid;
            }
            if(wordsList.get(mid).compareTo(word) < 0){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            } 
        }
        return -1;
    }
}       