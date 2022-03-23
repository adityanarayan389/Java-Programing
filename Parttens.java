import java.util.Arrays;

import javax.lang.model.element.Element;

public class Parttens {
    public static void main(String[] args){

        // String[] patterns = new String();
        // patterns = ["a","abc","bc","d"], word = "abc"
        
       
        // numOfStrings()
      

    }
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int i =0 ; i< patterns.length;i++){
            for(int j = 0 ;  j < word.length();j++){
                if( patterns[i] == String.valueOf(word.charAt(j))){
                    count++;

                }
            }
           
        }
        return count;
        
    }


    static void pattern9(int n){
        for(int row =1 ; row<=n;row++){
            int noOfSpaces = n-row ;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }


            for(int col =1;col<=2*n-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

    static void pattern6(int n) {
        for (int row = 1; row <=n; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= 2*n -1; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
                if(col == n){

                }
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public int majorityElement(int[] nums) {

        int count = 1;
        int element=0;
        int maxcount =-1;
        int temp = nums[0];
        Arrays.sort(nums);
        for(int i =1 ; i<nums.length; i++){
            if(temp == nums[i] ){
                count++;
            }else{
                temp = nums[i];
                count =1;
            }

            if(maxcount < count){
                maxcount = count;
                element = nums[i];
                } 


        }
        if(maxcount > (nums.length/2)){
            return element;
        }else{
            return -1;
        }
        
    }

    
}
