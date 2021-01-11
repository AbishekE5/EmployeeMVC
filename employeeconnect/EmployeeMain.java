package employeeconnect;

import employeeconnect.employee.view.AddressView;
import employeeconnect.employee.view.EmployeeView;

public class EmployeeMain {
    public static void main(String[] args){
     EmployeeView view = new EmployeeView();
     view.performCrud();
     AddressView view1 = new AddressView();
     view1.performCrud();


    }
}