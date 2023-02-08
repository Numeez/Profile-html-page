import java.util.*;

public class salary{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        int sal = sc.nextInt();
        System.out.println("Enter shifts done");
        int shift = sc.nextInt();

        int increment = (shift*sal*2)/100;

        int new_sal = sal+increment;
        int expenses = ((20*sal)/100)+((30*sal)/100);
        int saved = (sal - expenses)+increment;
        if(sal>8000){
            System.out.println("Salary too large");
        }
        else if (shift<0){
            System.out.println("Shift is too small");
        }
        else if (saved<0){
            
        }
        else{
            System.out.println("Salary is too small");
        }



    }
}