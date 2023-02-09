
import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter mobile number");
        String mobile = sc.nextLine();

        Employee emp = new Employee();
        emp.setName(name);
        emp.setAddress(address);
        emp.setMobile(mobile);

        System.out.println("Name : " + emp.getName());
        System.out.println("Address : "+ emp.getAddress());
        System.out.println("Mobile :"+ emp.getMobile());



        
    }
    
}
