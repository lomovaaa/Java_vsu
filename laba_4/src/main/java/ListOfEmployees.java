import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.util.ArrayList;

import models.Department;
import models.Employee;

/**
 * Класс, реализующий формирование списка сотрудников.
 */
public class ListOfEmployees {
    /**
     * Возвращает подразделение для сотрудника.
     * Если подразделение с указанным id уже существует, то возвращает его, иначе - создает новое.
     *
     * @param departments список существующих подразделений
     * @param id id подразделения
     * @param name название подразделения
     * @return подразделение
     */
    private static Department getDepartment(ArrayList<Department> departments, int id, String name) {
        for (Department department : departments) {
            if (department.getId() == id) {
                return department;
            }
        }
        return new Department(name, id);
    }

    /**
     * Создает нового сотрудника по указанным данным, полученным из файла.
     * @param departments список подразделений
     * @param departmentId id подразделения
     * @param data данные, полученные из файла
     * @return сотрудник
     * @throws Exception
     */
    private static Employee createEmployee(ArrayList<Department> departments, int departmentId, String[] data)
            throws Exception {
        return new Employee(data, getDepartment(departments, departmentId, data[4]));
    }

    /**
     * Формирует из данных файла список сотрудников и возвращает его.
     * @param fileName имя файла
     * @param separator разделитель
     * @return список сотрудников
     * @throws Exception
     */
    public static ArrayList<Employee> createList(String fileName, char separator) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Department> departments = new ArrayList<Department>();
        int departmentId = 0;
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(fileName);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null) {
                throw new FileNotFoundException(fileName);
            }
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                employees.add(createEmployee(departments, departmentId++, nextLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
