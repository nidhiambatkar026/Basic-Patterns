//java program to print inverted half pyramid of 180 degree
import java.util.*;
public class inverted180pyramid {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int number = sc.nextInt();

       for(int i=1;i<=number;i++){
          //space
          for(int j=1;j<=number-i;j++){
              System.out.print(" ");
          }
          //stars
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
       }
    }
}
