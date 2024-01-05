public class CommisionEmployee extends Employee{
    private double grossSales; //فروش ناخالص
    private double commisionRate; //نرخ حقالعمل کاری

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commisionRate < 0.0 || commisionRate > 1.0){
            throw new IllegalArgumentException("commision rate must be > 0.0 and  < 1.0");
        }
        if (grossSales < 0.0  ){
            throw new IllegalArgumentException("gross sales  must be >= 0.0 ");
        }
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if (commisionRate <= 0.0 || commisionRate >= 1.0) {
            throw new IllegalArgumentException("commision rate must be > 0.0 and  < 1.0");
        }
    }


    @Override
    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" +
                super.toString() +
                "grossSales=" + grossSales +
                ", commisionRate=" + commisionRate +
                '}';
    }
}
