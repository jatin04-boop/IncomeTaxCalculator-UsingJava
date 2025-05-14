import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Salary, Excemptions, BasicSavings;
        double StandardDeduction = 50000;
        double GrossSalary = 0;
        double IncomeAfterSD = 0;
        double taxableIncome = 0;

        System.out.println("\n\t INCOME DETAILS");
        System.out.println("\n\t ==============");
        System.out.print("\n 1.Enter Income from salary==>");
        Salary = scanner.nextDouble();
        System.out.print("\n 2.Enter total exempt allowances ==>");
        Excemptions = scanner.nextDouble();
        System.out.print("\n 3.Enter Basic Saving(80C) ==>");
        BasicSavings = scanner.nextDouble();

        System.out.println("\n Your entered details");
        System.out.println("\n ====================");
        System.out.printf("\n Salary              				==> %10.2f", Salary);
        System.out.printf("\n Exempt allowances  				==> %10.2f", Excemptions);
        System.out.printf("\n Basic Savings       				==> %10.2f", BasicSavings);

        GrossSalary = GetGrossSalary(Salary, Excemptions);
        System.out.printf("\n Total Income        				==> %10.2f", GrossSalary);

        IncomeAfterSD = GetSalaryAfterSD(GrossSalary, StandardDeduction);
        System.out.printf("\n Taxable Income after Standard Deduction 	==> %10.2f", IncomeAfterSD);

        taxableIncome = GetTaxableIncome(GrossSalary, StandardDeduction, BasicSavings);
        System.out.printf("\n Final TaxableIncome 				==> %10.2f", taxableIncome);

        double oldRegimeTax = DisplayOldRegime(taxableIncome);
        double newRegimeTax = DisplayNewRegime(taxableIncome);

        System.out.printf("\n \n Tax Old Regime ==> %10.2f", oldRegimeTax);
        System.out.printf("\n Tax New Regime ==> %10.2f", newRegimeTax);
    }

    public static double DisplayOldRegime(double taxableIncome) {
        double tmpTaxableIncome = taxableIncome;
        double slab1 = 5;
        double slab2 = 10;
        double slab3 = 20;
        double slab4 = 30;
        double tmpDisplay;
        double TotalTax = 0;

        if (tmpTaxableIncome >= 1500000) {
            System.out.println("\n Slab1 (0L to 2.5L)  				==>       0");
            tmpDisplay = (250000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (2.5L to 5L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (250000 * slab2) / 100.0;
            System.out.printf("\n Slab3 (5L to 10L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (500000 * slab3) / 100.0;
            System.out.printf("\n Slab4 (10L to 15L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 1500000) * slab4) / 100.0;
            System.out.printf("\n Slab5 (>=15L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total Old Regime Tax  				==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 1000000 && tmpTaxableIncome < 1500000) {
            System.out.println("\n Slab1 (0L to 2.5L) 				 ==>       0");
            tmpDisplay = (250000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (2.5L to 5L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (500000 * slab2) / 100.0;
            System.out.printf("\n Slab3 (5L to 10L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 1000000) * slab3) / 100.0;
            System.out.printf("\n Slab4 (10L to 15L)				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total Old Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 750000 && tmpTaxableIncome < 1000000) {
            System.out.println("\n Slab1 (0L to 2.5L)  				 ==>       0");
            tmpDisplay = (250000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (2.5L to 5L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 750000) * slab2) / 100.0;
            System.out.printf("\n Slab3 (5L to 10L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (10L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total Old Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 500000 && tmpTaxableIncome < 750000) {
            System.out.println("\n Slab1 (0L to 2.5L) 				 ==>        0");
            tmpDisplay = ((tmpTaxableIncome - 500000) * slab1) / 100.0;
            System.out.printf("\n Slab2 (2.5L to 5L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab3 (5L to 10L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (10L to 15L)		       		 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (>=15L)		      	         ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total Old Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else {
            System.out.println("\n Your total tax is 0");
        }

        return TotalTax;
    }

    public static double DisplayNewRegime(double taxableIncome) {
        double tmpTaxableIncome = taxableIncome;
        double slab1 = 5;
        double slab2 = 10;
        double slab3 = 15;
        double slab4 = 20;
        double slab5 = 30;
        double tmpDisplay;
        double TotalTax = 0;

        if (tmpTaxableIncome >= 1500000) {
            System.out.println("\n Slab1 (0L to 3L)  				==>       0");
            tmpDisplay = (300000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab2) / 100.0;
            System.out.printf("\n Slab3 (6L to 9L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab3) / 100.0;
            System.out.printf("\n Slab4 (9L to 12L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab4) / 100.0;
            System.out.printf("\n Slab5 (12L to 15L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 1500000) * slab5) / 100.0;
            System.out.printf("\n Slab6 (>=15L)  				==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax  				==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 1200000 && tmpTaxableIncome < 1500000) {
            System.out.println("\n Slab1 (0L to 3L) 				 ==>       0");
            tmpDisplay = (300000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab2) / 100.0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab3) / 100.0;
            System.out.printf("\n Slab4 (9L to 12L)				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 1200000) * slab4) / 100.0;
            System.out.printf("\n Slab5 (12L to 15L)				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 900000 && tmpTaxableIncome < 1200000) {
            System.out.println("\n Slab1 (0L to 3L)  				 ==>       0");
            tmpDisplay = (300000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = (300000 * slab2) / 100.0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 900000) * slab3) / 100.0;
            System.out.printf("\n Slab4 (9L to 12L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (12L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 600000 && tmpTaxableIncome < 900000) {
            System.out.println("\n Slab1 (0L to 3L) 				 ==>       0");
            tmpDisplay = (300000 * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = ((tmpTaxableIncome - 600000) * slab2) / 100.0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (9L to 12L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (12L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 			==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 300000 && tmpTaxableIncome < 600000) {
            System.out.println("\n Slab1 (0L to 3L) 				 ==>       0");
            tmpDisplay = ((tmpTaxableIncome - 300000) * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (9L to 12L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (12L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 250000 && tmpTaxableIncome < 300000) {
            System.out.println("\n Slab1 (0L to 3L) 				 ==>       0");
            tmpDisplay = ((tmpTaxableIncome - 250000) * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (9L to 12L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (12L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else if (tmpTaxableIncome >= 200000 && tmpTaxableIncome < 250000) {
            System.out.println("\n Slab1 (0L to 3L) 				 ==>       0");
            tmpDisplay = ((tmpTaxableIncome - 200000) * slab1) / 100.0;
            System.out.printf("\n Slab2 (3L to 6L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab3 (6L to 9L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab4 (9L to 12L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab5 (12L to 15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            tmpDisplay = 0;
            System.out.printf("\n Slab6 (>=15L) 				 ==> %10.2f", tmpDisplay);
            TotalTax = TotalTax + tmpDisplay;
            System.out.printf("\n Total New Regime Tax 					 ==> %10.2f", TotalTax);
        } 
        
        else {
            System.out.println("\nYour total tax is 0");
        }

        return TotalTax;
    }

    public static double GetGrossSalary(double Salary, double Exemptions) {
        return Salary + Exemptions;
    }

    public static double GetSalaryAfterSD(double GrossSalary, double StandardDeduction) {
        return GrossSalary - StandardDeduction;
    }

    public static double GetTaxableIncome(double GrossSalary, double StandardDeduction, double BasicSavings) {
        return GrossSalary - (StandardDeduction + BasicSavings);
    }
}
		
