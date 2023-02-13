import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many over played");
        int over = sc.nextInt();
        sc.nextLine();
        try{
        int runs[] = new int [over];
        System.out.println("Enter runs scored in each over");
        for(int i=0;i<runs.length;i++){
            runs[i] = sc.nextInt();
            sc.nextLine();

        }
        System.out.println("Enter over number");
        int o =sc.nextInt();
        sc.nextLine();
        System.out.println("Runs scored in this over is : "+ runs[o-1]);

 
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    
}
