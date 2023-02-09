import java.util.*;
public class InningsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter team name");
        String team = sc.nextLine();
        System.out.println("Enter Session name");
        String inning = sc.nextLine();
        System.out.println("Enter runs ");
        int runs = sc.nextInt();

        Innings in = new Innings();
        in.setTeam(team);
        in.setInning(inning);
        in.setRuns(runs);

        String innings_name = in.getInning().toLowerCase();
        if(innings_name.equals("first")){
            System.out.println("Name :"+ in.getTeam());
            System.out.println("Innings :"+ innings_name);
            System.out.println("Needed to score"+ in.getRuns()+1);
        }
        else{
            System.out.println("Name :"+ in.getTeam());
            System.out.println("Scored :"+in.getRuns());
            System.out.println("Match ended");

        }
        
    }
    
}
