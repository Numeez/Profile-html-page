
import java.util.*;
public class Exception1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("Enter runs scored");
        sb.append(sc.nextLine());
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Enter over faced by");
        sb1.append(sc.nextLine());
        
        try{
        int runs =  Integer.parseInt(sb.toString());
        int overs = Integer.parseInt(sb1.toString());
        int run_rate = runs/overs;
        System.out.println("Run rate : "+run_rate);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        sc.close();
        
        
    }
}