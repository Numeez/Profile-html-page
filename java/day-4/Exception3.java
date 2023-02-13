import java.util.*;
public class Exception3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter player name");
        String name = sc.nextLine();
        System.out.println("Enter player age");
        int age = sc.nextInt();
        sc.nextLine();
        try{
           if(age<19){
            throw new CustomException("Age is less than 19");

           }
           System.out.println("Player name : "+ name);
           System.out.println("Player age :"+ age); 

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
