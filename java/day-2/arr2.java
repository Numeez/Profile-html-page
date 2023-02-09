import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements id and score");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        sc.nextLine();
        System.out.println("Enter the score ");
        int score = sc.nextInt();
        System.out.println("The ids of the cricketers are : ");
        for(int i=0;i<n;i++){
            if(arr[i]>score){
                System.out.println(arr[i-1]);
            }
        }
        

        
    }
    
}
