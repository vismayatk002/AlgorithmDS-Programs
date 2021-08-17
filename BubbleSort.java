import java.util.*; 
public class BubbleSort{

    ArrayList<Integer> intList = new ArrayList<>();

    int size;
    BubbleSort(int size){
        this.size = size;
    }

    public void readNo(){

        System.out.println("Enter the numbers for sort");
        for(int i=0; i<size; i++){
            Scanner sc = new Scanner(System.in);
            int numbers = sc.nextInt();
            intList.add(numbers);
        } 
    }

    public void bubbleSort(){
        
        int temp = 0;
        for(int i=0; i<intList.size(); i++){
            for(int j=1; j<intList.size()-i; j++){
                if(intList.get(j-1).compareTo(intList.get(j)) > 0){
                    temp = intList.get(j-1);
                    intList.set(j-1, intList.get(j));
                    intList.set(j, temp);
                }
            }
        }
    }

    public ArrayList<Integer> printList(){

        for(int i=0; i<intList.size(); i++){
            intList.get(i);
        }
        return intList;
    }
    public static void main(String[] args){

        BubbleSort sort = new BubbleSort(5);
        sort.readNo();
        System.out.print("\nNumbers list : " + sort.printList());
        sort.bubbleSort();
        System.out.println("\nSorted Numbers list : " + sort.printList());
        
    }
}