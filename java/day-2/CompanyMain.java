import java.util.*;
public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name");
        String company = sc.nextLine();
        System.out.println("Enter name of employees separated by commas");
        String employees = sc.nextLine();
        
        String arr_emp[] = employees.split(",");
        System.out.println("Enter Team lead name");
        String team_lead = sc.nextLine();
        Company c = new Company();
        c.setCompany(company);
        c.setEmployees(employees);
        c.setTeamLead(team_lead);
        boolean result = new CompanyMain().check(arr_emp,c.getTeamLead());
        if(!(result)){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Company : "+ c.getCompany());
            System.out.println("Employees : "+c.getEmployees());
            System.out.println("Team Lead : "+ c.getTeamLead());
        }


        
    }
    public  boolean check (String arr[], String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(name)){
                return true;
                
            }
            
        }
        return false;


    }
}
