public class Paater {

 public static void main(String[] args) {
     int n= 5;
     pattern(n);
    
 }
 private void permute(String str)
    {
        int l =0;
        int r = str.length()-1;
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str);
                str = swap(str,l,i);
            }
        }
    }

 public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


 public static void pattern(int n){
    
     int start =1;
     int end = 1;

     for(int i =0; i<=n;i++){
         for(int j = n; j<= i;j--){
             System.out.print(" ");

         }
         for(int k = 1; k<= start;k++){
             System.out.print(Math.abs(k-end));
         }
         start += 2;
         end++;
         System.out.println();

        

     }

 }
    

    
}

// Intent intent = new Intent(this,Theactivity.class);
// intent.putExtra(" name","value");
// startActivity(intent);
// oncreate;
// onstart;
// onpause;
// onresume;
// onstop;
// ondestroy
// onrestart;

// for fragment
//  oncreateview
//   onstart
//   ondetatch
//   ondetacthview
