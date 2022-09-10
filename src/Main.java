public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Иванов И.И.", 3 , 55000);
        employees[1] = new Employee("Петров К.С.", 4 , 45000);
        employees[2] = new Employee("Кузнецова И.В.", 3 , 57000);
        employees[3] = new Employee("Николаева Р.Е.", 5 , 35000);
        employees[4] = new Employee("Павлов Д.Н.", 1 , 79000);
        employees[5] = new Employee("Зайцев Д.К.", 5 , 66000);
        employees[6] = new Employee("Ермакова Д.С.", 3 , 71000);
        employees[7] = new Employee("Васильева И.Л.", 1 , 56000);
        employees[8] = new Employee("Михайлов М.И.", 5 , 63000);
        employees[9] = new Employee("Бобров Б.В.", 4 , 68000);

        printEmployee();
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой: "+ minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "+ maxSalary());
        System.out.println("Среднее значение заработной платы: "+ averageSalary());
        printFullName();

        // проверка методов из заданий повышенной сложности
        indexationSalary(10);
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getSalary());
        }

        System.out.println(minSalaryDep(2));
        System.out.println("------------------------------");
        System.out.println(maxSalaryDep(5));
        System.out.println("------------------------------");
        System.out.println("Сумма на зарплаты в отделе : " + sumSalaryDep(1));
        System.out.println("------------------------------");
        System.out.println("Средняя зарплата в отделе : " + middleSalaryDep(3));
        System.out.println("------------------------------");
        indexationSalaryDep(3,10);
        System.out.println("------------------------------");
        printEmployeesDep(3);
        System.out.println("------------------------------");
        lessThanSalary(65000);
        System.out.println("------------------------------");
        moreThanSalary(65000);

    }

    public static void printEmployee(){
        System.out.println("Данные сотрудников:");
        for(int i = 0 ; i < employees.length; i = i+1){
            System.out.println(employees[i]);
        }
    }
    public static double sumSalary(){
    double sum = 0;
        for(int i = 0 ; i < employees.length; i++){
        sum = sum + employees[i].getSalary();
        }
    return sum;
    }
    public static String minSalary(){
    double min = employees[0].getSalary();
    String minEmp = null;
        for(int i = 0; i < employees.length; i++){
             if(employees[i] != null && min > employees[i].getSalary()){
                 min = employees[i].getSalary();
                 minEmp = employees[i].getFullName();
             }
        }
        return minEmp;
    }
    public static String maxSalary(){
        double max = employees[0].getSalary();
        String maxEmp = null;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null && employees[i].getSalary() > max){
                max = employees[i].getSalary();
                maxEmp = employees[i].getFullName();
            }
        }
        return maxEmp;
    }

    public static double averageSalary(){
    return sumSalary()/ employees.length;
    }
    public static void printFullName(){
        System.out.println("Список ФИО сотрудников:");
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getFullName());
        }
    }

    public static void indexationSalary(double percent){
    for(int i = 0; i < employees.length; i++){
        employees[i].setSalary((100.0+percent)*employees[i].getSalary()/100);
    }
    }

    public static String minSalaryDep(int department) {
        double minSalDep = Double.MAX_VALUE;
        String minSalDepEmp = "В этом отделе нет сотрудников";
        if (department > 5 || department < 1) {
            minSalDepEmp = "Такого отдела не существует";
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department && minSalDep > employees[i].getSalary()) {
                    minSalDep = employees[i].getSalary();
                    minSalDepEmp = employees[i].getFullName();
                }
        }}return minSalDepEmp;
        }

    public static String maxSalaryDep(int department) {
        double maxSalDep = Double.MIN_VALUE;
        String maxSalDepEmp = "В этом отделе нет сотрудников";
        if (department > 5 || department < 1) {
            maxSalDepEmp = "Такого отдела не существует";
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department && maxSalDep < employees[i].getSalary()) {
                    maxSalDep = employees[i].getSalary();
                    maxSalDepEmp = employees[i].getFullName();
                }
            }}return maxSalDepEmp;
        }

    public static double sumSalaryDep(int department){
        double sum = 0;
        if (department > 5 || department < 1) {
            System.out.println("Такого отдела не существует");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    sum = sum + employees[i].getSalary();
                }
            }
        }return sum;
    }

    public static double middleSalaryDep(int department){
        double sum = 0;
        int count = 0;
        double middleSalary = 0;
        if (department > 5 || department < 1) {
            System.out.println("Такого отдела не существует");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    sum = sum + employees[i].getSalary();
                    count++;
                    middleSalary = sum/count;
                }
            }
        }return middleSalary;
    }

    public static void indexationSalaryDep(int department, double percent) {
        if (department > 5 || department < 1) {
            System.out.println("Такого отдела не существует");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    employees[i].setSalary((100.0 + percent) * employees[i].getSalary() / 100);
                }
            }
        }
    }

    public static void printEmployeesDep(int department) {
        int count = 0;
        if (department > 5 || department < 1) {
            System.out.println("Такого отдела не существует");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    count++;
                    System.out.println("Id: " + employees[i].getId() + " | Full Name: " + employees[i].getFullName() + " | Salary: " + employees[i].getSalary());
                }
            }
        }
        if(count == 0){System.out.println("В отделе нет сотрудников.");}

    }

    public static void lessThanSalary(double salary){
        int count = 0;
        for(int i =0; i < employees.length; i++){
            if (employees[i].getSalary() < salary){
                count++;
                System.out.println("Id: " + employees[i].getId() + " | Full Name: " + employees[i].getFullName() + " | Salary: " + employees[i].getSalary());
            }
        }
        if(count == 0){
            System.out.println("Нет сотрудников с меньшей зарплатой");
        }
    }

    public static void moreThanSalary(double salary){
        int count = 0;
        for(int i =0; i < employees.length; i++){
            if (employees[i].getSalary() > salary){
                count++;
                System.out.println("Id: " + employees[i].getId() + " | Full Name: " + employees[i].getFullName() + " | Salary: " + employees[i].getSalary());
            }
        }
        if(count == 0){
            System.out.println("Нет сотрудников с большей зарплатой");
        }
    }

}