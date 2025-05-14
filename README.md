# IncomeTaxCalculator-UsingJava
Java-based income tax calculator with old and new regime comparison

# Income Tax Calculator in Java 💸

A **console-based Java application** that calculates personal income tax using **both Old and New Regimes** based on user input. The program prompts the user for salary, exemptions, and basic savings, and outputs detailed tax calculations including slab-wise breakdowns.

---

## 🔧 Features

| Feature                       | Description                              |
| ----------------------------- | ---------------------------------------- |
| 📊 Total Income Calculation   | Adds salary + exemptions                 |
| 💳 Standard Deduction         | Applies fixed ₹50,000 standard deduction |
| 🤑 Taxable Income Calculation | Deducts savings under Section 80C        |
| 🌎 Old Regime Calculation     | Follows 5%, 10%, 20%, 30% tax slabs      |
| ✨ New Regime Calculation      | Applies new 5%, 10%, 15%, 20%, 30% slabs |
| 🔀 Comparative Output         | Shows tax under both regimes             |

---

## 📚 How It Works

1. User enters:

   * Salary
   * Exemptions
   * Basic Savings (Section 80C)

2. Program calculates:

   * Gross Salary = Salary + Exemptions
   * Income after Standard Deduction = Gross Salary - 50,000
   * Final Taxable Income = Gross Salary - 50,000 - Basic Savings

3. Tax is calculated:

   * Under **Old Regime** with detailed slab-wise logic
   * Under **New Regime** with updated slab structure

4. Program displays tax for both regimes to help user choose the better option.

---

## 📁 Files Included

| File         | Description                          |
| ------------ | ------------------------------------ |
| `Main2.java` | Main Java source file with all logic |

---

## ▶️ How to Compile and Run

### Requirements:

* Java JDK 8 or higher installed

### Steps:

```bash
javac Main2.java
java Main2
```

---

## 🚀 Sample Input/Output

```
	       INCOME DETAILS
	       ==============

1. Enter Income from salary ==> 5000000
2. Enter total exempt allowances ==> 20000
3. Enter Basic Saving (80C) ==> 20000

Your entered details
====================

Salary                          ==>   5000000.00
Exempt allowances               ==>     20000.00
Basic Savings                   ==>     20000.00
Total Income                    ==>   5020000.00
Taxable Income after Std. Ded. ==>   4970000.00
Final TaxableIncome            ==>   4950000.00

Old Regime Calculation:
------------------------
Slab1 (0L to 2.5L)              ==>         0.00
Slab2 (2.5L to 5L)              ==>     12500.00
Slab3 (5L to 10L)               ==>     25000.00
Slab4 (10L to 15L)              ==>    100000.00
Slab5 (>15L)                    ==>   1035000.00
Total Old Regime Tax           ==>   1172500.00

New Regime Calculation:
------------------------
Slab1 (0L to 3L)                ==>         0.00
Slab2 (3L to 6L)                ==>     15000.00
Slab3 (6L to 9L)                ==>     30000.00
Slab4 (9L to 12L)               ==>     45000.00
Slab5 (12L to 15L)              ==>     60000.00
Slab6 (>15L)                    ==>   1035000.00
Total New Regime Tax           ==>   1185000.00

Tax Old Regime  ==> 1172500.00
Tax New Regime  ==> 1185000.00
```

---

## 🚫 Limitations

* No error handling for invalid input
* Does not include cess/surcharge
* Basic CLI only (no GUI)

---

## 🌐 Author

**Your Name**
Java Developer & Student
GitHub: [@jatin04-boop](https://github.com/jatin04-boop)

---

## ✉️ License

MIT License

Feel free to use, modify, and share.
