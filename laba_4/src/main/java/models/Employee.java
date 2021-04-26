package models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс, описывающий сущность сотрудник.
 */
public class Employee {
    /**
     * ID
     */
    private int id;
    /**
     * Имя
     */
    private String name;
    /**
     * Пол
     */
    private String gender;
    /**
     * Подразделение
     */
    private Department department;
    /**
     * Заработная плата
     */
    private double salary;
    /**
     * Дата рождения
     */
    private Date birthDate;

    public Employee(String[] data, Department departmentEmp) throws Exception {
        id = Integer.parseInt(data[0]);
        name = data[1];
        gender = data[2];
        birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(data[3]);
        department = departmentEmp;
        salary = Double.parseDouble(data[5]);
    }

    public int getId() {
        return id;
    }

    public void setId(int value) {
        id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String value) {
        gender = value;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department value) {
        department = value;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double value) {
        salary = value;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date value) {
        birthDate = value;
    }

}
