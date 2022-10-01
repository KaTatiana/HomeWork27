//        1. Создать класс EmployeeBook.
//        2. Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
//        3. Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
        Map<String, Employee> employees=new HashMap<>(Map.of(
        "Иванов Иван Иванович",
        new Employee(
                "Иван",
                "Иванович",
                "Иванов",
                1,
                52000),
        "Иванов Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Иванов",
                2,
                62000),
        "Петров Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Петров",
                2,
                42000),
        "Семенов Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Семенов",
                3,
                92000),
        "Смирнов Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Смирнов",
                5,
                72000),
        "Ларин Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Ларин",
                4,
                62000),
        "Ложкин Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Ложкин",
                3,
                52000),
        "Яковлев Петр Иванович",
        new Employee("Петр",
                "Иванович",
                "Яковлев",
                2,
                67000),
        "Леонов Петр Иванович",
        new Employee(
                "Петр",
                "Иванович",
                "Леонов",
                5,
                77000)
        ));
    public void employeesFullPrint(){
        for (String key: employees.keySet()){
            String value = employees.get(key).toString();
            System.out.println(value);
        }
    }
    public void employeesNamePrint(){
        for (String key: employees.keySet()){
            System.out.println(key);
        }
    }
    // Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public void employeesPrint(int numDepartment){
        System.out.println("Список сотрудников отдела "+numDepartment+" :");
        for (Employee value: employees.values()){
            if(value.getDepartment()==numDepartment) {
                System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronymic() + " " + value.getSalary());
            }
        }
    }

    public void employeesSalary(){
        double sumCost=0.0;
        for (Employee value: employees.values()) {
            sumCost += value.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц : "+sumCost);
    }
    public void employeesAverageSalary(){
        double sumCost=0.0;
        int employeesNumber=0;
        for (Employee value: employees.values()) {
            if (value == null) continue;
            sumCost += value.getSalary();
            employeesNumber++;
        }
        System.out.println("Среднее значение зарплат: "+sumCost/employeesNumber);
    }
    public void employeesMinSalary(){
        double minSalary=Integer.MAX_VALUE;
        String minSalaryEmployeeName="";
        for (Employee value: employees.values()) {
            if (minSalary > value.getSalary()) {
                minSalary = value.getSalary();
                minSalaryEmployeeName = value.getSurname() + " " + value.getName() + " " + value.getPatronymic();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+minSalaryEmployeeName);
    }
    public void employeesMaxSalary(){
        double maxSalary;
        maxSalary = Integer.MIN_VALUE;
        String maxSalaryEmployeeName="";
        for (Employee value: employees.values()) {
            if (maxSalary < value.getSalary()) {
                maxSalary = value.getSalary();
                maxSalaryEmployeeName = value.getSurname() + " " + value.getName() + " " + value.getPatronymic();
            }

        }
        System.out.println("Сотрудник с максимальной зарплатой: "+maxSalaryEmployeeName);
    }
    public void employeesSalary(int department){
        double sumCost=0.0;
        for (Employee value: employees.values()) {
            if (department == value.getDepartment()) {
                sumCost += value.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц отдела "+ department +": "+sumCost);
    }
    public void employeesAverageSalary(int department){
        double sumCost=0.0;
        int employeesNumber=0;
        for (Employee value: employees.values()) {
            if (department == value.getDepartment()) {
                sumCost += value.getSalary();
                employeesNumber++;
            }
        }
        System.out.println("Среднее значение зарплат: "+sumCost/employeesNumber);
    }
    public void employeesMinSalary(int department){
        double minSalary=Integer.MAX_VALUE;
        String minSalaryEmployeeName="";
        for (Employee value: employees.values()) {
            if (department == value.getDepartment()) {
                if (minSalary > value.getSalary()) {
                    minSalary = value.getSalary();
                    minSalaryEmployeeName = value.getSurname() + " " + value.getName() + " " + value.getPatronymic();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+minSalaryEmployeeName);
    }
    public void employeesMaxSalary(int department){
        double maxSalary;
        maxSalary = Integer.MIN_VALUE;
        String maxSalaryEmployeeName="";
        for (Employee value: employees.values()) {
            if (department == value.getDepartment()) {
                if (maxSalary < value.getSalary()) {
                    maxSalary = value.getSalary();
                    maxSalaryEmployeeName = value.getSurname() + " " + value.getName() + " " + value.getPatronymic();
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: "+maxSalaryEmployeeName);
    }
    public void indexingSalary(int department, double increasePercent){
        int indStrDepartment=0;
        int indStrFullEmployee=0;
        for (Employee value: employees.values()) {
            if(value==null) continue;
            if (department == value.getDepartment()) {
                value.setSalary(value.getSalary() + value.getSalary() * increasePercent / 100);
                //заголовок для раздела
                if(indStrDepartment==0) {System.out.println("Индексация зарплаты для сотрудников отдела " + value.getDepartment());}
                System.out.println(value.getSurname()+" "+value.getName()+" "+value.getPatronymic() +" "+ value.getSalary());
                indStrDepartment++;
            } else if (department == 0) {
                value.setSalary(value.getSalary()+value.getSalary() * increasePercent / 100);
                //заголовок для раздела
                if(indStrFullEmployee==0) System.out.println("Индексация зарплаты для всех сотрудников");
                System.out.println(value.getSurname()+" "+value.getName()+" "+value.getPatronymic() +" "+ value.getSalary());
                indStrFullEmployee++;
            }
        }
    }
    public void employeesMinSalary(double salary) {
        System.out.println("Сотрудники с зарплатой ниже " + salary + " :");
        for (Employee value: employees.values()) {
            if (value.getSalary() < salary) {
                System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronymic() + " " + value.getSalary());
            }
        }
    }
    public void employeesMaxSalary(double salary) {
        System.out.println("Сотрудники с зарплатой выше " + salary + " :");
        for (Employee value: employees.values()) {
            if(value.getSalary()>=salary){
                System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronymic()+" "+value.getSalary());
            }
        }
    }
}
