import java.util.ArrayList;
import java.util.Scanner;

public class List1{
    public static void main(String[] args) {
        ArrayList player_details = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter country name of player");
        String country = sc.nextLine();
        player_details.add(name);
        player_details.add(age);
        player_details.add(country);
        
        System.out.println("Name of player : "+ name);
        System.out.println("Age of Player : "+ age);
        System.out.println("Country of player : "+ country);
        System.out.println("Enter skill of Player");
        String skill = sc.nextLine();
        System.out.println("Enter position you want to add skill");
        int n =  sc.nextInt();
        sc.nextLine();
        player_details.set(n,skill);
        
        for(int i=0;i<player_details.size();i++){
            System.out.println(player_details.get(i));
        }
        System.out.println("Enter position you want to be removed");
        int a = sc.nextInt();
        sc.nextLine();
        player_details.remove(a);
        for(int i=0;i<player_details.size();i++){
            System.out.println(player_details.get(i));
        }


    
    }
}