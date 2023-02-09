import java.util.*;
public class arr {
    public static void main(String args[]){
        int odd = 0;
        int even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid input");
        }
        else{
        int arr[] = new int [n];
       
        
        System.out.println("Enter numbers");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.println("Invalid input");
                break;
            }
            
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.println("*********************************");

        if(odd>even){
            System.out.println(odd);
        }
        else{
            System.out.println(even);
        }
    }
        

    }
}
