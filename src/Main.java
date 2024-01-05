public class Main {
    public static void main(String[] args) {

        SalariedEmployee s = new SalariedEmployee("pouria", "karimi","80010",700.0000);
        HourlyEmployee h = new HourlyEmployee("amir","amiri","2000",16.75,40);
        CommisionEmployee c = new CommisionEmployee("nader","naderi","3000",19.75,.06);
        BaseCommisionEmployee b = new BaseCommisionEmployee("kia","ahatami","4000",5000,.04,300);

        System.out.printf("%n%s%n%s: $%,.2f%n%n" ,s, "earned ",  s.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n" ,h, "earned ",  h.earnings());
    }
}
