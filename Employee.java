public class Employee {

    // 員工編號
    public int empNumber;

    // 員工姓名
    public String empName;

    // 計算薪資
    public int calculateSalary(int basicSalary) {
        // 月薪=底薪+伙食費
        int monthlySalary = basicSalary + 2400;
        return monthlySalary;
    }

}