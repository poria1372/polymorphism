public class BaseCommisionEmployee extends CommisionEmployee{
    double baseSalary;

    public BaseCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        if (baseSalary < 0.0){
            throw  new IllegalArgumentException("base salary must be > =0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0){
            throw  new IllegalArgumentException("base salary must be > =0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return "BaseCommisionEmployee{" +
                super.toString() +
                "baseSalary=" + baseSalary +
                '}';
    }
}
