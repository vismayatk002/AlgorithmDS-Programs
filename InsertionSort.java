import java.util.*; 
public class InsertionSort{

    ArrayList<String> wordsList = new ArrayList<>();
    int size;
    InsertionSort(int size){
        this.size = size;
    }
    public void readWords(){
        System.out.println("Enter the words for sort");
        for(int i=0; i<size; i++){
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            wordsList.add(word);
        } 
    }

    public void InsertionSort(){

        String temp = " ";
        for(int i=0; i<wordsList.size(); i++){
            for(int j=i+1; j<wordsList.size(); j++){
                if(wordsList.get(i).compareToIgnoreCase(wordsList.get(j))>0){
                    temp = wordsList.get(i);
                   wordsList.set(i, wordsList.get(j));
                    wordsList.set(j, temp);
                }
            }
        }
    }    

    public ArrayList<String> PrintList(){
        
        for(int i=0; i<wordsList.size(); i++){
            wordsList.get(i);
        }
        return wordsList;
    }

    public static void main(String[] args){

        InsertionSort sort = new InsertionSort(10);
        sort.readWords();
        System.out.print("\nWords list : " + sort.PrintList());
        sort.InsertionSort();
        System.out.print("\n\nSorted Words list : " + sort.PrintList());
        
    }
}