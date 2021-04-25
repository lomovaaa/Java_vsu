import models.Department;
import models.Employee;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.*;

/**
 * Класс, реализующий формирование списка сотрудников.
 */
public class ListOfEmployees {
    private int departmentId = 0;

    public void createList(String path, char separator) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Department> departments = new ArrayList<Department>();

        try {
            FileReader reader = new FileReader(path);
            CSVParser parser = new CSVParserBuilder().withSeparator(separator).build();
            CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).build();
            if (csvReader == null) {
                throw new FileNotFoundException(path);
            }
            String[] nextLine;
            nextLine = csvReader.readNext();
            while ((nextLine = csvReader.readNext()) != null){
                if (nextLine != null){
                    System.out.println(nextLine);
                }
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
