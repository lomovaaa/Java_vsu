package models;

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
    private String birthDate;

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String value) {
        birthDate = value;
    }

}
