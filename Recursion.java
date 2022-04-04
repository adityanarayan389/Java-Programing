public class Recursion {

   public static void main(String[] args) {
    System.out.println(printPower(2, 5));
       
    }
    public static int printPower1(int x, int n) {
        if(n == 0) {
        return 1;
        }
        if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
        return x * printPower(x, n/2) * printPower(x, n/2);
        }
        }
    static int printPower(int n, int p){
        if(n ==0 || p ==0){
            return 1;
        }

        int pw = n* printPower(n, p-1);
        return pw;

    }
    static void fibonci(int a , int b , int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        fibonci(b, a+b, n-1);

    }
    static void factorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }

        fact = fact*n;
        factorial(n-1,fact);
    }


    static void print(int n){
        if(n==0){
            System.out.println(n);
            return;
        }

      System.out.println(n);
      print(n-1);
    }
    static void sum1(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum+n;
        sum1(n-1,sum);
    }


  


// print nth term of fibonacci series
   static int Fibonaci(int n){
        if (n <= 1){
            return n;

        }
      
    return Fibonaci(n-1) + Fibonaci(n-2);
        
    }
    
}
