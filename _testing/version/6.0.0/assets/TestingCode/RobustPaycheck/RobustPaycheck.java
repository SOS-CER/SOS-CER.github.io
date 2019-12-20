import java.util.Scanner;

/**
 * Raleigh's Parks and Recreation Department hires landscapers to care for and
 * maintain the city's parks.
 * 
 * An employee has one of three skill levels; each with a hourly pay rate:
 * 
 * <pre>
 * Skill Level - Hourly Pay Rate ($) 
 * --------------------------------- 
 * Level 1 - $19.00 
 * Level 2 - $22.50 
 * Level 3 - $25.75
 * </pre>
 * 
 * All employees may opt in for insurance, which results in a deduction from
 * their pay check.
 * 
 * <pre>
 * Deduction - Weekly Cost ($) 
 * ------------------------------------- 
 * Option 1 - Medical Insurance - $24.50 
 * Option 2 - Dental Insurance - $15.30 
 * Option 3 - Vision Insurance - $5.25
 * </pre>
 * 
 * Employees at skill level 3 may also opt to place up to 6% of their gross pay
 * into a retirement account.
 * 
 * The following information is printed about the employee's pay check: 1)
 * employee's name 2) hours worked for a week 3) hourly pay rate 4) regular pay
 * for up to 40 hours worked 5) overtime pay for hours over 40 worked 6) gross
 * pay (regular + overtime) 7) total deductions 8) net pay (gross pay - total
 * deductions)
 * 
 * If the net pay is negative, meaning the deductions exceeds the gross pay,
 * then an error is printed.
 * 
 * This version of the program has extensive error checking and loops to allow
 * for processing more than one paycheck at a time.
 * 
 * @author Sarah Heckman
 * @author Jessica Young Schmidt
 */
public class RobustPaycheck {

    /** Hourly employment levels */
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;

    /** Pay rate for each hourly employment level */
    public static final int LEVEL_1_PAY_RATE = 1900;
    public static final int LEVEL_2_PAY_RATE = 2250;
    public static final int LEVEL_3_PAY_RATE = 2575;

    /** Insurance costs */
    public static final int MEDICAL_INSURANCE = 2450;
    public static final int DENTAL_INSURANCE = 1530;
    public static final int VISION_INSURANCE = 525;

    /** Number of hours in a full time work week */
    public static final int REGULAR_PAY_MAX_HOURS = 40;

    /** Upper and lower bounds of percentage of retirement contributions */
    public static final int LOWER_RET = 0;
    public static final int UPPER_RET = 6;

    /**
     * User interface for the Paycheck program.
     */
    public static void userInterface() {
        // Create shared console scanner
        Scanner console = new Scanner(System.in);

        // NOTE: By using a forever loop, we need a break in order to exit the
        // loop.
        while (true) {
            System.out.println("New paycheck (Y/N): ");

            String line = console.nextLine();
            // Only checks the first letter to see if it is 'n' or 'y'
            if (Character.toLowerCase(line.charAt(0)) == 'n') {
                break;
            } else if (Character.toLowerCase(line.charAt(0)) == 'y') {
                paycheckInput(console);
            } else {
                System.out.println("Enter a \"Y\" or \"N\"");
            }
        }

        console.close();
    }

    /**
     * Handles input/output for a single paycheck.
     * 
     * @param console console Scanner which is used to get input from user
     */
    public static void paycheckInput(Scanner console) {
        // Name
        String name = getName(console);

        // Level
        int level = getLevel(console);

        // Hours Worked
        double hoursWorked = getHoursWorked(console);

        // Deductions - Y/N for each one
        int deductions = 0;
        deductions = getTotalDeductions(console);

        // Retirement
        int retirementPercentage = 0;
        if (level == LEVEL_3) {
            retirementPercentage = getRetirementPercentage(console);
        }

        processPaycheck(name, level, hoursWorked, retirementPercentage, deductions);
    }

    /**
     * Processes the paycheck information and prints the results.
     * 
     * @param name employee's name
     * @param level employee's pay level
     * @param hoursWorked hours worked by employee for a given week
     * @param retirementPercentage retirement percentage for an employee
     * @param deductions total deductions from employee's paycheck
     */
    public static void processPaycheck(String name, int level, double hoursWorked,
                    int retirementPercentage, int deductions) {
        // Print Results
        int payRate = getPayRate(level);
        int regularPay = calculateRegularPay(payRate, hoursWorked);
        int overtimePay = calculateOvertimePay(payRate, hoursWorked);
        int grossPay = calculateGrossPay(regularPay, overtimePay);
        int retirement = calculateRetirement(grossPay, retirementPercentage);
        int netPay = calculateNetPay(grossPay, deductions + retirement);
        if (netPay < 0) {
            System.out.println("Error calculating net pay.  Deductions exceed gross pay.");
        } else {
            System.out.printf("%-20s%10s%10s%10s%10s%10s%10s%10s\n", "Name", "Hours", "PayRate",
                            "Regular", "OT", "Gross", "Deduc.", "Net");
            System.out.printf("%-20s%10.2f%10.2f%10.2f%10.2f%10.2f%10.2f%10.2f\n", name,
                            hoursWorked, payRate / 100.0, regularPay / 100.0, overtimePay / 100.0,
                            grossPay / 100.0, (deductions + retirement) / 100.0, netPay / 100.0);
        }
    }

    /**
     * Returns the employee name entered by the user.
     * 
     * @param console Scanner for reading from the console
     * @return employee name
     */
    public static String getName(Scanner console) {
        // NOTE: By using a forever loop, we use a return statement to exit the
        // loop.
        while (true) {
            System.out.print("Employee Name: ");
            String line = console.nextLine();
            if (line.length() == 0) {
                System.out.println("Provide a name with at least one character.");
            } else {
                return line;
            }
        }
    }

    /**
     * Returns the employee level entered by the user.
     * 
     * @param console Scanner for reading from the console
     * @return employee level
     */
    public static int getLevel(Scanner console) {
        while (true) {
            System.out.print("Employee Level: ");
            if (console.hasNextInt()) {
                int level = console.nextInt();
                clearLine(console);
                if (isValidLevel(level)) {
                    return level;
                } else {
                    System.out.println("Enter a valid level: 1, 2, or 3.");
                }
            } else { // User entered a non-integer value
                clearLine(console);
                System.out.println("Enter a valid level: 1, 2, or 3.");
            }
        }
    }

    /**
     * Tests whether level is a valid level
     * 
     * @param level employee level
     * @return true if level is a valid level, false otherwise
     */
    public static boolean isValidLevel(int level) {
        return (level == LEVEL_1 || level == LEVEL_2 || level == LEVEL_3);
    }

    /**
     * Returns the hours worked for a given employee as entered by the user.
     * 
     * @param console Scanner for reading from the console
     * @return hours worked
     */
    public static double getHoursWorked(Scanner console) {
        while (true) {
            System.out.print("Hours Worked: ");
            if (console.hasNextDouble()) {
                double hoursWorked = console.nextDouble();
                clearLine(console);
                if (hoursWorked > 0) {
                    return hoursWorked;
                } else {
                    System.out.println("Enter the number of hours worked.");
                }
            } else { // User entered a non-double value
                clearLine(console);
                System.out.println("Enter the number of hours worked.");
            }
        }
    }

    /**
     * Returns the total amount of deductions for a given employee as entered by
     * the user.
     * 
     * @param console Scanner for reading from the console
     * @return total deductions
     */
    public static int getTotalDeductions(Scanner console) {
        int deductions = 0;

        if (selectInsurance("Medical", console)) {
            deductions += MEDICAL_INSURANCE;
        }

        if (selectInsurance("Dental", console)) {
            deductions += DENTAL_INSURANCE;
        }

        if (selectInsurance("Vision", console)) {
            deductions += VISION_INSURANCE;
        }

        return deductions;
    }

    /**
     * Returns true if the employee selects the insurance deduction.
     * 
     * @param insuranceType type of insurance
     * @param console Scanner for reading from the console
     * @return true if the employee selects the insurance deduction
     */
    public static boolean selectInsurance(String insuranceType, Scanner console) {
        while (true) {
            System.out.print(insuranceType + " Insurance (Y/N): ");
            String line = console.nextLine();
            if (Character.toLowerCase(line.charAt(0)) == 'y') {
                return true;
            } else if (Character.toLowerCase(line.charAt(0)) == 'n') {
                return false;
            } else {
                System.out.println("Enter a \"Y\" or \"N\"");
            }
        }
    }

    /**
     * Helper method to clear out the rest of a line.
     * 
     * @param console Canner for reading from the console
     */
    private static void clearLine(Scanner console) {
        console.nextLine(); // Clears the line and discards any input
    }

    /**
     * Returns the retirement contribution percentage for a given employee as
     * entered by the user.
     * 
     * @param console Scanner for reading from the console
     * @return retirement percentage
     */
    public static int getRetirementPercentage(Scanner console) {
        while (true) {
            System.out.print("Retirement Percentage (0-6): ");
            if (console.hasNextInt()) {
                int retPercentage = console.nextInt();
                clearLine(console);
                if (isValidRetirementPercentage(retPercentage)) {
                    return retPercentage;
                } else {
                    System.out.println("Enter a retirement percentage (0-6).");
                }
            } else {
                clearLine(console);
                System.out.println("Enter a retirement percentage (0-6).");
            }
        }
    }

    /**
     * Tests whether retirement percentage is valid
     * 
     * @param retPercentage retirement percentage
     * @return true if retirement percentage is valid (LOWER_RET - UPPER_RET),
     *         false otherwise
     */
    public static boolean isValidRetirementPercentage(int retPercentage) {
        return (retPercentage >= LOWER_RET && retPercentage <= UPPER_RET);
    }

    /**
     * Returns the employee's pay rate given their employment level.
     * 
     * @param level employment level
     * @return employee's pay rate
     * @throws IllegalArgumentException if level other than 1-3
     */
    public static int getPayRate(int level) {
        if (!isValidLevel(level)) {
            throw new IllegalArgumentException("Invalid Level");
        }
        if (level == LEVEL_1) {
            return LEVEL_1_PAY_RATE;
        }
        if (level == LEVEL_2) {
            return LEVEL_2_PAY_RATE;
        }
        // ASSERT: We know that the level is valid and it is not 1 or 2.
        // Therefore, it must be 3.
        return LEVEL_3_PAY_RATE;
    }

    /**
     * Returns the employee's regular pay for the hours worked up to the first
     * REGULAR_PAY_MAX_HOURS hours worked.
     * 
     * @param payRate employee's pay rate
     * @param hoursWorked number of hours worked by the employee
     * @return employee's regular pay
     * @throws IllegalArgumentException if negative pay rate and/or hours worked
     */
    public static int calculateRegularPay(int payRate, double hoursWorked) {
        if (payRate < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("Negative pay rate and/or hours worked");
        }
        if (hoursWorked > REGULAR_PAY_MAX_HOURS) {
            return payRate * REGULAR_PAY_MAX_HOURS;
        }
        return (int) (payRate * hoursWorked);
    }

    /**
     * Returns the employee's overtime pay for the hours worked over the
     * REGULAR_PAY_MAX_HOURS.
     * 
     * @param payRate employee's pay rate
     * @param hoursWorked number of hours worked by the employee
     * @return employee's overtime pay
     * @throws IllegalArgumentException if negative pay rate and/or hours worked
     */
    public static int calculateOvertimePay(int payRate, double hoursWorked) {
        if (payRate < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("Negative pay rate and/or hours worked");
        }
        if (hoursWorked > REGULAR_PAY_MAX_HOURS) {
            return (int) ((payRate + (payRate / 2)) * (hoursWorked - REGULAR_PAY_MAX_HOURS));
        }
        return 0;
    }

    /**
     * Returns the employee's gross pay, which is the sum of regular pay and
     * overtime pay.
     * 
     * @param regularPay employee's regular pay
     * @param overtimePay employee's overtime pay
     * @return employee's gross pay
     * @throws IllegalArgumentException if negative regular and/or overtime pay
     */
    public static int calculateGrossPay(int regularPay, int overtimePay) {
        if (regularPay < 0 || overtimePay < 0) {
            throw new IllegalArgumentException("Invalid regular and/or overtime pay.");
        }
        return regularPay + overtimePay;
    }

    /**
     * Returns the employee's retirement deduction.
     * 
     * @param grossPay employee's gross pay
     * @param retirementPercentage percentage employee contributes to retirement
     * @return employee's retirement deduction
     * @throws IllegalArgumentException if invalid gross pay and/or retirement percentage
     */
    public static int calculateRetirement(int grossPay, int retirementPercentage) {
        if (grossPay < 0 || !isValidRetirementPercentage(retirementPercentage)) {
            throw new IllegalArgumentException("Invalid gross pay and/or retirement percentage.");
        }
        if (retirementPercentage == 0) {
            return 0;
        }
        return (grossPay * retirementPercentage) / 100;
    }

    /**
     * Returns the employee's net pay, which is the difference between gross pay
     * and deductions.
     * 
     * @param grossPay employee's gross pay
     * @param deductions employee's deductions
     * @return employee's net pay
     */
    public static int calculateNetPay(int grossPay, int deductions) {
        return grossPay - deductions;
    }

    /**
     * Starts the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        userInterface();
    }

}
