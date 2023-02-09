import java.util.*;
public class odd {
     public static void  main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num>0){
        String num_str = Integer.toString(num);
        int arr[] = new int [num_str.length()];
         for(int i=0;i<num_str.length();i++){
            arr[i] = Character.getNumericValue(num_str.charAt(i));
        }
        for (int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    else{
        System.out.println("Invalid input");
    }

sc.close();        

        
    }
    
}
