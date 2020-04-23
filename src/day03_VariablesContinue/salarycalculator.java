package day03_VariablesContinue;

public class salarycalculator {

    /*
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD

     */
    public static void main(String[] args) {
        //DataType variableName = Data ;

        double hourlyRate = 55;
        double StateTaxRate = 0.04;
        double FederalTaxRate = 0.22;
        Byte WeeklyHours = 40;
        Byte TotalNumberOfWeeks = 52;

        double Salary = hourlyRate * WeeklyHours * TotalNumberOfWeeks ;

        double Statetax = Salary * StateTaxRate;

        double Federaltax = Salary * FederalTaxRate;

        double SalaryAfterTax =  Salary - Federaltax - Statetax;

        System.out.println("Your salary is: " + Salary);

        float    a   =  100.987_6543f;

        short  b  =  (byte) a ;

        byte  c   = (byte) b;



        System.out.println(c);
    }
    }

