
//import java.util.*;  
//import java.util.Scanner;
  
public class EvenSumFUnctions{
    static int fun(int n)  
    {  
        int i, sum = 0;  
        for (i = 2; i <= n; i+=2) {  
            sum += i;  
        }  
        return sum;   
    }  
    public static void main(String argc[])  
    {  
        int n = 100;
        //System.out.println("Enter any number: ");  
        //Scanner sc = new Scanner(System.in);  
        //int n = sc.nextInt();  
        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + fun(n));  
    }  
  
}  
