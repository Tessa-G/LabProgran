package HelloWorld;

import java.util.Scanner;

public class LabProgran {
   
   public static int fibonacci(int n) {
      Scanner scnr = new Scanner(System.in);
      
      int last, preLast, fib;
      if(n < 0){
         return -1;
      }
      else if(n == 0){
         return 0;
      }
      else if(n == 1){
         return 1;
      }
      else{
         preLast = 0;
         last = 1;
         
         for(int i = 1; i < n; ++i){
            fib = preLast + last;
            preLast = last;
            last = fib;
         }
         return last;
      }
      
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}


