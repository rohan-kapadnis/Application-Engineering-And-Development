/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrg = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrg);
        
        Employee emp1 = new Employee();
        emp1.setName("Rohan Kapadnis");
        
        UserAccount account1 = new UserAccount();
        account1.setUsername("admin");
        account1.setPassword("admin");
        account1.setRole("Admin");
        account1.setEmployee(emp1);
        
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp1);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account1);
        
        
        LabOrganization labOrganization = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        
        Employee emp2 = new Employee ();
        emp2.setName("Ben");
        
        UserAccount account2 = new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("Lab Assistant");
        account2.setEmployee(emp2);
        
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp2);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account2);
        
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        
        Employee emp3 = new Employee ();
        emp3.setName("Jackie");
        
        UserAccount account3 = new UserAccount();
        account3.setUsername("doctor");
        account3.setPassword("doctor");
        account3.setRole("Doctor");
        account3.setEmployee(emp3);
        
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp3);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account3);
        
        
        
        return business;
    }
    
}
