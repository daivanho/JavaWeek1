package Assignment2;

/**
 *Assignment 2 find the largest number in a multidimensional array and displaying that number
 * with the location of it
 * @author Dai
 */
public class FindHighestArray {
    static int[][] arrayInt={{1,3,4,5,6,9},{3,5,10,1,6},{2,3,9,44,1,0}};
    public static void main(String[] args){
        LocateHighest();
    }

    /**
     * Finds the highest integer in the defined array above and prints it with its location
     */
    public static void LocateHighest(){
        int highest=0;
        int rowpos=0;
        int colpos=0;

        for(int i=0;i<arrayInt.length;i++){
            for(int x=0;x<arrayInt[i].length;x++){
                if(arrayInt[i][x]>highest){
                    highest=arrayInt[i][x];
                    rowpos=i;
                    colpos=x;
                }
            }
        }
        System.out.println(highest+" is in row"+rowpos+" column: "+ colpos);
    }
}
