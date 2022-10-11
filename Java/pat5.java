package File1_Basics.Patterns;

import java.util.Scanner;

public class pat0 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


      for(int i = 1 ;i<=5;i++)
      {
          for(int j =i ;j>0;j--)
          {
          System.out.print(" ");
          }
          for(int k = i ;k<=5;k++)
          {
              System.out.print(k+" ");
          }
          System.out.println();
      }
    }
}