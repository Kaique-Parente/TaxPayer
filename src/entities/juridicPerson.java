package entities;

public class juridicPerson extends Person{
    private Integer nEmployee;
    
    public juridicPerson() {
        super();
    }

    public juridicPerson(Integer nEmployee, String name, Double annualIncome) {
        super(name, annualIncome);
        this.nEmployee = nEmployee;
    }

    public Integer getnEmployee() {
        return nEmployee;
    }

    public void setnEmployee(Integer nEmployee) {
        this.nEmployee = nEmployee;
    }

    @Override
    public double total() {
        if (nEmployee > 10) {
            return annualIncome * 0.14;
        } else {
            return annualIncome * 0.16;
        }
    }
 
}
