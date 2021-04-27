import java.util.ArrayList;

import models.Employee;


public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list = ListOfEmployees.createList("foreign_names.csv", ';');
    }
}
