import java.util.*;

public class player{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Matches");
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet <String> players  = new TreeSet<String>();
        for(int i=0;i<n;i++){
            System.out.println("Enter player of