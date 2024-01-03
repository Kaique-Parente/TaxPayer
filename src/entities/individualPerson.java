package entities;

public class individualPerson extends Person{
    private Double HealthExpenditures;
    
    public individualPerson () {
        super();
    }

    public individualPerson(String name, Double annualIncome, Double HealthExpenditures) {
        super(name, annualIncome);
        this.HealthExpenditures = HealthExpenditures;
    }

    public double getHealthExpenditures() {
        return HealthExpenditures;
    }

    public void setHealthExpenditures(double HealthExpenditures) {
        this.HealthExpenditures = HealthExpenditures;
    }

    @Override
    public double total() {
        if(annualIncome < 20000.00) {
            return annualIncome * 0.15 - HealthExpenditures * 0.5;
        } else {
            return annualIncome * 0.25 - HealthExpenditures * 0.5;
        }
    }

}
