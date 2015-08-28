package homework18.task1;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * Created by Ivan on 28.08.2015.
 */
public class Main {
    public static ArrayList<Department> listOfDepartments = new ArrayList<>();

    public static void InitClass(){
        //Accounting
        Department currentDepartment = new Department("Accounting");
        Employee currentDirector = new Employee("Иванов","Иван");

        HashSet<Employee> list = new HashSet();
        list.add(currentDirector);
        list.add(new Employee("Сидоров","Петр"));
        list.add(new Employee("Лисичкина","Наташа"));
        list.add(new Employee("Петрова","Катя"));

        currentDepartment.setDirector(currentDirector);
        currentDepartment.setListOfEmploees(list);
        listOfDepartments.add(currentDepartment);

        //Sales department
        currentDepartment = new Department("Sales");
        currentDirector = new Employee("Кузьменко","Сергей");

        list = new HashSet();
        list.add(currentDirector);
        list.add(new Employee("Егоров","Павел"));
        list.add(new Employee("Юдашкина","Таня"));
        list.add(new Employee("Чернова","Катя"));
        list.add(new Employee("Юдченко","Света"));

        currentDepartment.setDirector(currentDirector);
        currentDepartment.setListOfEmploees(list);
        listOfDepartments.add(currentDepartment);

        //IT department
        currentDepartment = new Department("IT");
        currentDirector = new Employee("Андреев","Дмитрий");

        list = new HashSet();
        list.add(currentDirector);
        list.add(new Employee("Аксенов","Андрей"));
        list.add(new Employee("Жижкин","Андрей"));
        list.add(new Employee("Садыгов","Руслан"));
        list.add(new Employee("Курилович","Владислав"));

        currentDepartment.setDirector(currentDirector);
        currentDepartment.setListOfEmploees(list);
        listOfDepartments.add(currentDepartment);
    }

    public static void print(){
        for (Department currentDepartment : listOfDepartments){
            System.out.println(currentDepartment);
        }
    }

    public static void main(String[] args) {
        InitClass();
        print();
    }
}
