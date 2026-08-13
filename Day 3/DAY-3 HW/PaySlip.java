package abstraction;

import java.util.Scanner;

abstract class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double getsalary();

    void show() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + salary);
        System.out.println("Net Salary : " + getsalary());
    }
}

interface Tax {

    double tax();
}

interface Bonus {

    double bonus();
}

class Permanent extends Employee implements Tax, Bonus {

    Permanent(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double tax() {
        return salary * 0.1;
    }

    public double bonus() {
        return salary * 0.15;
    }

    double getsalary() {
        return salary + bonus() - tax();
    }
}

class Contract extends Employee implements Tax, Bonus {

    Contract(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double tax() {
        return salary * 0.05;
    }

    public double bonus() {
        return salary * 0.05;
    }

    double getsalary() {
        return salary + bonus() - tax();
    }
}

public class PaySlip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Payslip");
        System.out.println("1. Permanent");
        System.out.println("2. Contract");
        System.out.print("Enter choice : ");

        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter salary : ");
        double sal = sc.nextDouble();

        Employee e;

        switch(ch) {
        case 1:
            e = new Permanent(id, name, sal);
            break;

        case 2:
            e = new Contract(id, name, sal);
            break;

        default:
            System.out.println("Wrong choice");
            return;
        }

        System.out.println("\nPayslip");
        e.show();

        if(e instanceof Tax) {
            Tax t = (Tax)e;
            System.out.println("Tax : " + t.tax());
        }

        if(e instanceof Bonus) {
            Bonus b = (Bonus)e;
            System.out.println("Bonus : " + b.bonus());
        }

        sc.close();
    }
}