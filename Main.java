import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee {
    private String name;
    private String mail;
    private int age;
    private int salary;

    // Getter methods
    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to write employee data to file
    public void employee_data() {
        try {
            if (salary <= 20000) {
                FileWriter employee_data = new FileWriter("employees.txt", true);
                employee_data.write(name + " " + mail + " " + age + " " + salary + "\n");
                employee_data.close();
            } else {
                System.out.println("The Salary is more than the limit. Please enter again.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee data_pass = new Employee();
        Scanner emp_data = new Scanner(System.in);

        int i = 0;
        while (i < 10) {
            System.out.println("Please enter your name: ");
            String name_data = emp_data.nextLine();

            System.out.println("Please enter your email: ");
            String mail_data = emp_data.nextLine();

            System.out.println("Age: ");
            int age_data = emp_data.nextInt();

            System.out.println("Salary: ");
            int salary_data = emp_data.nextInt();

            emp_data.nextLine();

            // Setting employee data using setter methods
            data_pass.setName(name_data);
            data_pass.setMail(mail_data);
            data_pass.setAge(age_data);
            data_pass.setSalary(salary_data);

            // Writing employee data to file
            data_pass.employee_data();
            i++;
        }

        emp_data.close();
    }
}
