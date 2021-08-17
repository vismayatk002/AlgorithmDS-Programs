import java.util.*; 
public class InsertionSortGeneric<T extends Comparable<T>>{

    ArrayList<T> wordsList = new ArrayList<>();
    int size;
    InsertionSortGeneric(int size){
        this.size = size;
    }
    public void readWords(){
        System.out.println("Enter the words for sort");
        for(int i=0; i<size; i++){
            Scanner sc = new Scanner(System.in);
            T word = (T)(sc.nextLine());
            wordsList.add(word);
        } 
    }

    public void InsertionSort(){

        T temp;
        for(int i=0; i<wordsList.size(); i++){
            for(int j=i+1; j<wordsList.size(); j++){
                if(wordsList.get(i).compareTo(wordsList.get(j))>0){
                    temp = wordsList.get(i);
                   wordsList.set(i, wordsList.get(j));
                    wordsList.set(j, temp);
                }
            }
        }
    }    

    public ArrayList<T> PrintList(){
        
        for(int i=0; i<wordsList.size(); i++){
            wordsList.get(i);
        }
        return wordsList;
    }

    public static void main(String[] args){

        InsertionSortGeneric<String> sort = new InsertionSortGeneric(5);
        sort.readWords();
        System.out.print("\nWords list : " + sort.PrintList());
        sort.InsertionSort();
        System.out.print("\n\nSorted Words list : " + sort.PrintList());
        
    }
}