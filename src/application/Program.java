package application;

import entities.Person;
import entities.individualPerson;
import entities.juridicPerson;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        List<Person> list = new ArrayList();
        
        System.out.print("Enter the number of tax payers: ");
        int n = e.nextInt();
        System.out.println("");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = e.next().charAt(0);
            e.nextLine();
            System.out.print("Name: ");
            String name = e.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = e.nextDouble();
            
            if(ch == 'i') {
            System.out.print("Health expenditures: ");
            double healthExpenditures = e.nextDouble();
            list.add(new individualPerson(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int nEmployee = e.nextInt();
                list.add(new juridicPerson(nEmployee, name, annualIncome));
            }
            System.out.println("");
        }
        
        double sum = 0.0;
        
        System.out.println("TAXES PAID:");
        for(Person p : list) {
            double tax = p.total();
              System.out.println(String.format("%s: $ %.2f", p.getName(), tax));
              sum += tax;
        }
        System.out.println("");
        System.out.printf("TOTAL TAXES: $ %.2f\n", sum);
        
        e.close();
    }
}
