
import java.util.*;

public class list3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> ipl14 = new ArrayList<String>();
        ArrayList <String> ipl15 = new ArrayList<String>();
        ArrayList <String> consistentPLayer = new ArrayList<String>();

        System.out.println("Enter Top 5 Player of IPL season 14");
        for(int i=0;i<5;i++){
            System.out.println("Enter player name");
            ipl14.add(sc.nextLine());


        }
        System.out.println("Enter Top 5 Player of IPL season 15");
        for(int i=0;i<5;i++){
            System.out.println("Enter player name");
            ipl15.add(sc.nextLine());


        }
        for(int i=0;i<5;i++){
            if(ipl14.get(i).toString().equalsIgnoreCase(ipl15.get(i).toString())){
                consistentPLayer.add(ipl14.get(i).toString());
            }

        }
        System.out.println("Name of consistent players are as follows : ");
        for (String string : consistentPLayer) {
            System.out.println(string);
            
        }


    }
    
}
