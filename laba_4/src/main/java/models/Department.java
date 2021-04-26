package models;

/**
 * Класс, описывающий сущность подразделение.
 */
public class Department {
    /**
     * ID
     */
    private int id;
    /**
     * Название
     */
    private String name;

    public Department(String name, int id) {
        this.name = name;
        this.id = id;
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
}
