import java.util.*;
public class power{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int verify = 1;
        System.out.println("Enter number");
        int num = sc.nextInt();
        int check = num;
        if(num==1){
            System.out.println("Yes");
        }
        if(num%2==0){
            while(num!=1){
                num = num/2;
                count++;

            }


        
        for(int i=0;i<count;i++){
            verify*=2;

        }

        if(check-verify==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
        else{
            System.out.println("No");
        }

    
    }


}