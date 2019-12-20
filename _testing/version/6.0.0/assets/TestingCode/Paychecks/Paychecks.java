import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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
 * deductions).
 * 
 * This version of the program inputs employee information through a file and
 * outputs results to a file and error messages to the console. Error messages
 * that are printed to the console can include input files that do not exist,
 * improperly formatted/structured input files, invalid input values for
 * employees, and invalid net pay values. Each file can contain information for
 * multiple employees. Each line of the file will represent a single employee.
 * Each line is structured in a tab delimited manner:
 * 
 * <pre>
 * name TAB level TAB hours worked TAB medical TAB dental TAB vision TAB retirement %
 * </pre>
 * 
 * Such that medical, dental, and vision are boolean values that represent
 * whether the employee has the given type of insurance.
 * 
 * @author Sarah Heckman
 * @author Jessica Young Schmidt
 */
public class Paychecks {

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

        // Loop for prompting the user for a valid input file that
        // exists on the file system.
        Scanner fileScanner = null;
        while (true) {
            File inputFile = getFile(console, "Input File: ");
            // Attempt to open the input file
            try {
                fileScanner = new Scanner(inputFile);
                break;
                // If we reach here, we have a valid file that exists and
                // can be read, so we can exit the loop.
            } catch (IOException e) {
                System.out.println("Cannot read file.");
            }
        }

        // Loop for prompting the user for an output file that may
        // be opened and written to.
        PrintStream outputStream = null;
        while (true) {
            File outputFile = getFile(console, "Output File: ");
            // Attempt to open the stream for writing
            try {
                outputStream = new PrintStream(outputFile);
                break;
                // If we reach here, we have a file that we may write to, so
                // we can exit the loop.
            } catch (IOException e) {
                System.out.println("Cannot write to file.");
            }
        }

        outputStream.printf("%-20s%10s%10s%10s%10s%10s%10s%10s\n", "Name", "Hours", "PayRate",
                        "Regular", "OT", "Gross", "Deduc.", "Net");

        processFile(fileScanner, outputStream);

        console.close();
    }

    /**
     * Returns a File object as named by the user for a given prompt.
     * 
     * @param console Scanner for reading input file name.
     * @param prompt prompt to the user for a file name
     * @return a File object as named by the user.
     */
    public static File getFile(Scanner console, String prompt) {
        System.out.print(prompt);
        String input = console.nextLine();
        return new File(input);
    }

    /**
     * Processes input file of paychecks.
     * 
     * @param fileScanner Scanner to read file with paycheck information
     * @param outputStream PrintStream to write paycheck information to
     */
    public static void processFile(Scanner fileScanner, PrintStream printStream) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            try {
                printStream.println(processLine(line));
            } catch (IllegalArgumentException e) {
                System.out.println("Error reading line: " + line);
            }
        }
    }

    /**
     * Processes a line for a single paycheck.
     * 
     * @param line a single paycheck's information
     * @param outputStream PrintStream to write paycheck information to
     * @return paycheck results
     */
    public static String processLine(String line) {
        Scanner stringScanner = new Scanner(line);
        stringScanner.useDelimiter("\t");
        try {
            String name = stringScanner.next();
            int level = stringScanner.nextInt();
            double hoursWorked = stringScanner.nextDouble();
            boolean medDeduction = stringScanner.nextBoolean();
            boolean denDeduction = stringScanner.nextBoolean();
            boolean visDeduction = stringScanner.nextBoolean();
            int deductions = calculateDeductions(medDeduction, denDeduction, visDeduction);
            int retirementPercentage = 0;
            if (level == LEVEL_3) {
                retirementPercentage = stringScanner.nextInt();
            }

            stringScanner.close();

            if (!checkName(name) || !checkLevel(level) || !checkHoursWorked(hoursWorked)
                            || !checkRetirementPercentage(retirementPercentage)) {
                throw new IllegalArgumentException();
            }

            return processPaycheck(name, level, hoursWorked, deductions, retirementPercentage);
        } catch (InputMismatchException e) {
            stringScanner.close();
            throw new IllegalArgumentException();
        } catch (NoSuchElementException e) { // Exception thrown if wrong format
            stringScanner.close();
            throw new IllegalArgumentException();
        }
    }

    /**
     * Processes the paycheck information and returns the results as a formatted string.
     * 
     * @param name employee's name
     * @param level employee's pay level
     * @param hoursWorked hours worked by employee for a given week
     * @param deductions total deductions from employee's paycheck
     * @param retirementPercentage retirement percentage for an employee
     * @return paycheck results
     */
    public static String processPaycheck(String name, int level, double hoursWorked,
                    int deductions, int retirementPercentage) {
        int payRate = getPayRate(level);
        int regularPay = calculateRegularPay(payRate, hoursWorked);
        int overtimePay = calculateOvertimePay(payRate, hoursWorked);
        int grossPay = calculateGrossPay(regularPay, overtimePay);
        int retirement = calculateRetirement(grossPay, retirementPercentage);
        int netPay = calculateNetPay(grossPay, deductions + retirement);
        if (netPay < 0) {
            throw new IllegalArgumentException("Net pay for " + name + " is less than 0.");
        } else {
            return String.format("%-20s%10.2f%10.2f%10.2f%10.2f%10.2f%10.2f%10.2f\n", name,
                            hoursWorked, payRate / 100.0, regularPay / 100.0, overtimePay / 100.0,
                            grossPay / 100.0, (deductions + retirement) / 100.0, netPay / 100.0);
        }
    }

    /**
     * Returns true if the name is valid (contains at least one character).
     * 
     * @param name possible name string
     * @boolean true if the name is valid
     */
    public static boolean checkName(String name) {
        return name.length() != 0;
    }

    /**
     * Returns true if the level is valid (e.g., 1, 2 or 3).
     * 
     * @param level possible level
     * @return true if the level is valid
     */
    public static boolean checkLevel(int level) {
        return level == LEVEL_1 || level == LEVEL_2 || level == LEVEL_3;
    }

    /**
     * Returns true if the hours worked are valid (e.g., greater than 0).
     * 
     * @param hoursWorked possible hours worked
     * @return true if hours worked is valid
     */
    public static boolean checkHoursWorked(double hoursWorked) {
        return hoursWorked > 0;
    }

    /**
     * Returns the total amount of deductions for a given employee.
     * 
     * @param medDeduction does the employee have a medical deduction
     * @param denDeduction does the employee have a dental deduction
     * @param visDeduction does the employee have a vision deduction
     * @return total deductions
     */
    public static int calculateDeductions(boolean medDeduction, boolean denDeduction,
                    boolean visDeduction) {
        int deductions = 0;
        if (medDeduction) {
            deductions += MEDICAL_INSURANCE;
        }
        if (denDeduction) {
            deductions += DENTAL_INSURANCE;
        }
        if (visDeduction) {
            deductions += VISION_INSURANCE;
        }
        return deductions;
    }

    /**
     * Returns true if the retirement percentage is between LOWER_RET and
     * UPPER_RET.
     * 
     * @param retPercentage possible retirement percentage
     * @return true if the retPercentage is in the valid range
     */
    public static boolean checkRetirementPercentage(int retPercentage) {
        return retPercentage >= LOWER_RET && retPercentage <= UPPER_RET;
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
     * Tests whether level is a valid level
     * 
     * @param level employee level
     * @return true if level is a valid level, false otherwise
     */
    public static boolean isValidLevel(int level) {
        return (level == LEVEL_1 || level == LEVEL_2 || level == LEVEL_3);
    }

    /**
     * Returns the employee's regular pay for the hours worked up to the first
     * REGULAR_PAY_MAX_HOURS hours worked.
     * 
     * @param payRate employee's pay rate
     * @param hoursWorked number of hours worked by the employee
     * @return employee's regular pay
     */
    public static int calculateRegularPay(int payRate, double hoursWorked) {
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
     */
    public static int calculateOvertimePay(int payRate, double hoursWorked) {
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
     */
    public static int calculateRetirement(int grossPay, int retirementPercentage) {
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
     * @throws IllegalArgumentException if deductions > grossPay
     */
    public static int calculateNetPay(int grossPay, int deductions) {
        if (deductions > grossPay) {
            throw new IllegalArgumentException("Net pay is less than 0.");
        }
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
