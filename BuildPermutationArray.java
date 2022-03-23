import java.util.ArrayList;
import java.util.List;

public class BuildPermutationArray {
    public static void main(String[] args){
    

    }
  

    public int RichestCustomerWealth(int[][] accounts) {
       int maxi = Integer.MIN_VALUE;
       for(int i = 0; i <accounts.length;i++ ){
           int sum =0;
           for(int j = 0; j < accounts[i].length;j++){
               sum += accounts[i][j];
               
           }
           maxi = Math.max(maxi, sum);
           
       }
      return maxi;  
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i = 0; i<ans.length; i = i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;

        }

        return ans;
        
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> candy = new ArrayList<>();

        for(int i= 0; i<candies.length;i++){
            boolean var = false;
            for(int j =0; j<candies.length;j++){
                if(candies[i] + extraCandies < candies[j]){
                    var =true;
                    break;
                }
            }
            if(var){
                candy.add(false);
            }else{
                candy.add(true);
            }

        }
        return candy;
        
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int x =0;
        for(int i =0; i< nums.length; i++){
            for(int j = 1; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    x +=1;
                }

            }
            ans[i] = x;
            x=0;
           
        }

        return ans;

        
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length;i++){
            int low =0;
            int high = image[i].length - 1; 
            while(low<=high){
                if(image[i][low] == image[i][high]){
                    image[i][low] = 1- image[i][low];
                    image[i][high]=  image[i][low];

                }
                low++;
                high--;
            }
        }



        return image;
        
    }
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i =0; i<n;i++){
            sum += mat[i][i] + mat[i][n-1-i];
        }

        if(n%2 == 0){
            return sum;
        }else{
            return sum - mat[n/2][n/2];
        }

        
    }
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; i< n; j++){
                
            }
        

        }
        
    }

    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for(int i =0;i < address.length();i++){
            char current = address.charAt(i);
            if(current == '.'){
                result.append("[.]");

            }else{
                result.append(current);
            }
        }
        return result.toString();
        
    }

    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        
       for(int i =0; i< s.length();i++){
           arr[indices[i]] = s.charAt(i); 
       }
       
       return String.valueOf(arr);

        
    }

    public String interpret(String command) {

        StringBuilder result = new StringBuilder();
        for(int i =0;i < command.length();i++){
           
            if(command.charAt(i) == 'G'){
                result.append("G");

            }else if( command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    result.append("o");
                }else{
                    result.append("al");
                }
               
            }
        }
        return result.toString();
        
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

}



   
    

