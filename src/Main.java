//**Базовая сложность**
//        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//        2. Посчитать сумму затрат на зарплаты в месяц.
//        3. Найти сотрудника с минимальной зарплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

//        1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
//        2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//        1. Сотрудника с минимальной зарплатой.
//        2. Сотрудника с максимальной зарплатой.
//        3. Сумму затрат на зарплату по отделу.

//        4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
//        5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
//        6. Напечатать всех сотрудников отдела (все данные, кроме отдела).

//        3. Получить в качестве параметра число и найти:
//        1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
//        2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook=new EmployeeBook();
        employeeBook.employeesFullPrint();
        employeeBook.employeesSalary();
        employeeBook.employeesAverageSalary();
        employeeBook.employeesMinSalary();
        employeeBook.employeesMaxSalary();
        employeeBook.employeesNamePrint();
        employeeBook.indexingSalary(0,2.0);
        employeeBook.employeesPrint(2);
        employeeBook.employeesSalary(2);
        employeeBook.employeesAverageSalary(2);
        employeeBook.employeesMinSalary(2);
        employeeBook.employeesMaxSalary(2);
        employeeBook.indexingSalary(2,0.5d);
        employeeBook.employeesMinSalary(60000.0);
        employeeBook.employeesMaxSalary(60000.0);
        System.out.println(
            employeeBook.addEmployees("Галкин Алексей Иванович",
                        "Галкин",
                        "Алексей",
                        "Иванович",
                        2,
                        75000));
        System.out.println(
            employeeBook.addEmployees("Леонов Петр Иванович",
                        "Петр",
                        "Иванович",
                        "Леонов",
                        5,
                        77000));
        System.out.println(
                employeeBook.deleteEmployees("Галкин Алексей Иванович")
        );
        System.out.println(employeeBook.searchEmployees("Леонов Петр Иванович"));
    }
}

