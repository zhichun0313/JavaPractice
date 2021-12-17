public class EmployeeMain {

    public static void main(String[] args) {

        String text1 = "我是文字1";
        String text2 = "我是文字2";
        System.out.println(text1 + text2);

        int number1 = 7;
        int number2 = 3;
        String number3 = "3";
        System.out.println(number1 + number3);

        System.out.println(7 + 3 * 2);

        System.out.println((7 + 3) * 2);

        int emp1Number = 1;
        String emp1Name = "週杰輪";
        System.out.println(emp1Number);
        System.out.println(emp1Name);

        int emp2Number = 2;
        String emp2Name = "蔡依零";
        System.out.println(emp2Number);
        System.out.println(emp2Name);

        // ----------------------------------------------
        System.out.println("----------------------------------------------");

        Employee jay = new Employee();
        // "給"值
        jay.empNumber = 1;
        jay.empName = "週杰輪";
        jay.calculateSalary(7000);
        // "取值"
        System.out.println(jay.empNumber);
        System.out.println(jay.empName);
        System.out.println(jay.calculateSalary);

        Employee jolin = new Employee();
        jolin.empNumber = 2;
        jolin.empName = "蔡依林";
        System.out.println(jolin.empNumber);
        System.out.println(jolin.empName);

    }

}