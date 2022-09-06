public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Иванов И.И.", 3 , 55000);
        employees[1] = new Employee("Петров К.С.", 4 , 45000);
        employees[2] = new Employee("Кузнецова И.В.", 2 , 57000);
        employees[3] = new Employee("Николаева Р.Е.", 5 , 35000);
        employees[4] = new Employee("Павлов Д.Н.", 1 , 79000);
        employees[5] = new Employee("Зайцев Д.К.", 2 , 66000);
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
}