package L10;

public class L10Q1 {
    public abstract class EmployeeSalary {

        public String NAME;

        public EmployeeSalary(String name) {
            this.NAME = name;
        }

        public abstract void displayDetails();
    }

    public class ContractStaff extends EmployeeSalary {

        protected final double SALARY = 500;
        protected double sales, commission;

        // Constructor
        public ContractStaff(String name, double sales) {
            super(name);
            this.sales = sales;
            this.commission = this.sales * 0.5;
        }

        public void displayDetails() {
            System.out.printf("\nContract Staff\n===\nName: %s\nSalary Per Month: %.2f\nSales: %.2f\nCommission: %.2f\n", this.NAME, this.SALARY, this.sales, this.commission);
        }
    }

    public class PermanentEmployee extends EmployeeSalary {

        protected final String CATEGORY;
        protected final double SALARY_MONTH;

        public PermanentEmployee(String name, String category) {
            super(name);
            this.CATEGORY = category;
            this.SALARY_MONTH = (category.equalsIgnoreCase("A")) ? 4000 : (category.equalsIgnoreCase("B")) ? 3000 : (category.equalsIgnoreCase("C")) ? 2000 : 0;
        }

        // Methods
        public void displayDetails() {
            System.out.printf("\nPermanent Employee\n===\nName: %s\nCategory: %s\nSalary Per Month: %.2f\n", this.NAME, this.CATEGORY, this.SALARY_MONTH);
        }
    }

    public class TemporaryStaff extends EmployeeSalary {

        protected double salary;

        public TemporaryStaff(String name, double workHours) {
            super(name);
            this.salary = 15 * workHours;
        }

        public void displayDetails() {
            System.out.printf("\nTemporary Employee\n===\nName: %s\nSalary Per Month: %.2f\n", this.NAME, this.salary);
        }
    }
}
