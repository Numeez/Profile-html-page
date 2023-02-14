import java.util.ArrayList;
import java.util.Scanner;

public class list2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList teams = new ArrayList<String>();
        teams.add("Gujarat Titans");
        teams.add("Rajasthan Royals");
        teams.add("Royal Challengers Banglore");
        teams.add("Lucknow Super Giants");
        teams.add("Delhi Captials");
        for (Object object : teams) {
            System.out.println(object);
            
        }
        System.out.println("Enter the position you want to swap with ");

        int n = sc.nextInt();
        if(n>teams.size()-1){
            System.out.println("Invalid Input");
        }
        else{
        String t1 = teams.get(0).toString();
        String t2 = teams.get(n).toString();
        teams.set(0, t2);
        teams.set(n,t1);
         for (Object object : teams) {
            System.out.println(object);
            
         }
        }



        
    }
    
}
