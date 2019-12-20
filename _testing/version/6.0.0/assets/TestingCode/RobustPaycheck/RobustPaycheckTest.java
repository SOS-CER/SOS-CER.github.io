/**
 * Test class for the RobustPaycheck program.
 * 
 * @author Sarah Heckman
 */
public class RobustPaycheckTest {

    /** Constants for passing and failing test output */
    public static final String PASS = "PASS";
    public static final String FAIL = "FAIL";

    /** Counters for test cases */
    public static int testCounter = 0;
    public static int passingTestCounter = 0;

    /**
     * Test the RobustPaycheck.isValidLevel() method.
     */
    public static void testIsValidLevel() {
        // Test level 1
        String id = "Level 1 Pay Rate";
        String desc = "RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_1)";
        String exp = "true";
        String act = "" + RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_1);
        testResult(id, desc, exp, act);

        // Test level 2
        id = "Level 2 Pay Rate";
        desc = "RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_2)";
        exp = "true";
        act = "" + RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_2);
        testResult(id, desc, exp, act);

        // Test level 3
        id = "Level 3 Pay Rate";
        desc = "RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_3)";
        exp = "true";
        act = "" + RobustPaycheck.isValidLevel(RobustPaycheck.LEVEL_3);
        testResult(id, desc, exp, act);

        // Test level 0 - invalid lower boundary
        id = "Invalid Level 0 Pay Rate";
        desc = "RobustPaycheck.isValidLevel(0)";
        exp = "false";
        act = "" + RobustPaycheck.isValidLevel(0);
        testResult(id, desc, exp, act);

        // Test level 4 - invalid upper boundary
        id = "Invalid Level 4 Pay Rate";
        desc = "RobustPaycheck.isValidLevel(4)";
        exp = "false";
        act = "" + RobustPaycheck.isValidLevel(4);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.isValidRetirementPercentage() method.
     */
    public static void testIsValidRetirementPercentage() {
        // Test 0%
        String id = "0% Retirement";
        String desc = "RobustPaycheck.isValidRetirementPercentage(0)";
        String exp = "true";
        String act = "" + RobustPaycheck.isValidRetirementPercentage(0);
        testResult(id, desc, exp, act);

        // Test 3%
        id = "3% Retirement";
        desc = "RobustPaycheck.isValidRetirementPercentage(3)";
        exp = "true";
        act = "" + RobustPaycheck.isValidRetirementPercentage(3);
        testResult(id, desc, exp, act);

        // Test 6%
        id = "6% Retirement";
        desc = "RobustPaycheck.isValidRetirementPercentage(6)";
        exp = "true";
        act = "" + RobustPaycheck.isValidRetirementPercentage(6);
        testResult(id, desc, exp, act);

        // Test -1% - invalid lower boundary
        id = "-1% Retirement";
        desc = "RobustPaycheck.isValidRetirementPercentage(-1)";
        exp = "false";
        act = "" + RobustPaycheck.isValidRetirementPercentage(-1);
        testResult(id, desc, exp, act);

        // Test 7% - invalid upper boundary
        id = "7% Retirement";
        desc = "RobustPaycheck.isValidRetirementPercentage(7)";
        exp = "false";
        act = "" + RobustPaycheck.isValidRetirementPercentage(7);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.getPayRate() method.
     */
    public static void testGetPayRate() {
        // Test level 1
        String id = "Level 1 Pay Rate";
        String desc = "RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_1)";
        String exp = "" + RobustPaycheck.LEVEL_1_PAY_RATE;
        String act = "" + RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_1);
        testResult(id, desc, exp, act);

        // Test level 2
        id = "Level 2 Pay Rate";
        desc = "RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_2)";
        exp = "" + RobustPaycheck.LEVEL_2_PAY_RATE;
        act = "" + RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_2);
        testResult(id, desc, exp, act);

        // Test level 3
        id = "Level 3 Pay Rate";
        desc = "RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_3)";
        exp = "" + RobustPaycheck.LEVEL_3_PAY_RATE;
        act = "" + RobustPaycheck.getPayRate(RobustPaycheck.LEVEL_3);
        testResult(id, desc, exp, act);

        // Test level 0 - invalid lower boundary
        id = "Invalid Level 0 Pay Rate";
        desc = "RobustPaycheck.getPayRate(0)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.getPayRate(0);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test level 4 - invalid upper boundary
        id = "Invalid Level 4 Pay Rate";
        desc = "RobustPaycheck.getPayRate(4)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.getPayRate(4);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.calculateRegularPay() method.
     */
    public static void testCalculateRegularPay() {
        // Less than 40 hours
        // Regular Level 1 36 hours
        String id = "Regular Level 1 36 hours";
        String desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 36)";
        String exp = "68400";
        String act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Regular Level 2 36 hours
        id = "Regular Level 2 36 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 36)";
        exp = "81000";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Regular Level 3 36 hours
        id = "Regular Level 3 36 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 36)";
        exp = "92700";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Regular Level 1 46 hours
        id = "Regular Level 1 46 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 46)";
        exp = "76000";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Regular Level 2 46 hours
        id = "Regular Level 2 46 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 46)";
        exp = "90000";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Regular Level 3 46 hours
        id = "Regular Level 3 46 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 46)";
        exp = "103000";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Regular Level 1 36.5 hours
        id = "Regular Level 1 36.5 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 36.5)";
        exp = "69350";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_1_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Regular Level 2 36.5 hours
        id = "Regular Level 2 46 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 36.5)";
        exp = "82125";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_2_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Regular Level 3 36.5 hours
        id = "Regular Level 3 46 hours";
        desc = "RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 36.5)";
        exp = "93987";
        act = "" + RobustPaycheck.calculateRegularPay(RobustPaycheck.LEVEL_3_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Regular
        id = "Regular $13.76 25.4 hours";
        desc = "RobustPaycheck.calculateRegularPay(1376, 25.4)";
        exp = "34950";
        act = "" + RobustPaycheck.calculateRegularPay(1376, 25.4);
        testResult(id, desc, exp, act);

        // Test negative pay rate
        id = "Invalid pay rate: -2468";
        desc = "RobustPaycheck.calculateRegularPay(-2468, 10)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateRegularPay(-2468, 10);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test negative hours worked
        id = "Invalid hours worked: -53";
        desc = "RobustPaycheck.calculateRegularPay(1900, -53)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateRegularPay(1900, -53);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.calculateOvertimePay() method.
     */
    public static void testCalculateOvertimePay() {
        // Less than 40 hours
        // Overtime Level 1 36 hours
        String id = "Overtime Level 1 36 hours";
        String desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 36)";
        String exp = "0";
        String act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36 hours
        id = "Overtime Level 2 36 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 36)";
        exp = "0";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Overtime Level 3 36 hours
        id = "Overtime Level 3 36 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 36)";
        exp = "0";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Overtime Level 1 46 hours
        id = "Overtime Level 1 46 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 46)";
        exp = "17100";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Overtime Level 2 46 hours
        id = "Overtime Level 2 46 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 46)";
        exp = "20250";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Overtime Level 3 46 hours
        id = "Overtime Level 3 46 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 46)";
        exp = "23172";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Overtime Level 1 36.5 hours
        id = "Overtime Level 1 36.5 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36.5 hours
        id = "Overtime Level 2 46 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Overtime Level 3 36.5 hours
        id = "Overtime Level 3 46 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Fractional hours over 40 hours
        // Overtime Level 1 46.5 hours
        id = "Overtime Level 1 46.5 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 46.5)";
        exp = "18525";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_1_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Overtime Level 2 46.5 hours
        id = "Overtime Level 2 46.5 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 46.5)";
        exp = "21937";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_2_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Overtime Level 3 46 hours
        id = "Overtime Level 3 46.5 hours";
        desc = "RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 46.5)";
        exp = "25103";
        act = "" + RobustPaycheck.calculateOvertimePay(RobustPaycheck.LEVEL_3_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Regular
        id = "Overtime $13.76 25.4 hours";
        desc = "RobustPaycheck.calculateOvertimePay(1376, 47.25)";
        exp = "14964";
        act = "" + RobustPaycheck.calculateOvertimePay(1376, 47.25);
        testResult(id, desc, exp, act);

        // Test negative pay rate
        id = "Invalid pay rate: -2468";
        desc = "RobustPaycheck.calculateOvertimePay(-2468, 10)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateOvertimePay(-2468, 10);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test negative hours worked
        id = "Invalid hours worked: -53";
        desc = "RobustPaycheck.calculateOvertimePay(1900, -53)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateOvertimePay(1900, -53);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.calculateGrossPay() method.
     */
    public static void testCalculateGrossPay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Gross Level 1 36 hours
        String id = "Gross Level 1 36 hours";
        String desc = "RobustPaycheck.calculateGrossPay(68400, 0)";
        String exp = "68400";
        String act = "" + RobustPaycheck.calculateGrossPay(68400, 0);
        testResult(id, desc, exp, act);

        // Gross Level 2 36 hours
        id = "Gross Level 2 36 hours";
        desc = "RobustPaycheck.calculateGrossPay(81000, 0)";
        exp = "81000";
        act = "" + RobustPaycheck.calculateGrossPay(81000, 0);
        testResult(id, desc, exp, act);

        // Gross Level 3 36 hours
        id = "Gross Level 3 36 hours";
        desc = "RobustPaycheck.calculateGrossPay(92700, 0)";
        exp = "92700";
        act = "" + RobustPaycheck.calculateGrossPay(92700, 0);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Gross Level 1 46 hours
        id = "Gross Level 1 46 hours";
        desc = "RobustPaycheck.calculateGrossPay(76000, 17100)";
        exp = "93100";
        act = "" + RobustPaycheck.calculateGrossPay(76000, 17100);
        testResult(id, desc, exp, act);

        // Gross Level 2 46 hours
        id = "Gross Level 2 46 hours";
        desc = "RobustPaycheck.calculateGrossPay(90000, 20250)";
        exp = "110250";
        act = "" + RobustPaycheck.calculateGrossPay(90000, 20250);
        testResult(id, desc, exp, act);

        // Gross Level 3 46 hours
        id = "Gross Level 3 46 hours";
        desc = "RobustPaycheck.calculateGrossPay(103000, 23172)";
        exp = "126172";
        act = "" + RobustPaycheck.calculateGrossPay(103000, 23172);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Gross Level 1 36.5 hours
        id = "Gross Level 1 36.5 hours";
        desc = "RobustPaycheck.calculateGrossPay(69350, 0)";
        exp = "69350";
        act = "" + RobustPaycheck.calculateGrossPay(69350, 0);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36.5 hours
        id = "Gross Level 2 46 hours";
        desc = "RobustPaycheck.calculateGrossPay(82125, 0)";
        exp = "82125";
        act = "" + RobustPaycheck.calculateGrossPay(82125, 0);
        testResult(id, desc, exp, act);

        // Gross Level 3 36.5 hours
        id = "Gross Level 3 46 hours";
        desc = "RobustPaycheck.calculateGrossPay(93987, 0)";
        exp = "93987";
        act = "" + RobustPaycheck.calculateGrossPay(93987, 0);
        testResult(id, desc, exp, act);

        // Fractional hours over 40 hours
        // Gross Level 1 46.5 hours
        id = "Gross Level 1 46.5 hours";
        desc = "RobustPaycheck.calculateGrossPay(76000, 18525)";
        exp = "94525";
        act = "" + RobustPaycheck.calculateGrossPay(76000, 18525);
        testResult(id, desc, exp, act);

        // Gross Level 2 46.5 hours
        id = "Gross Level 2 46.5 hours";
        desc = "RobustPaycheck.calculateGrossPay(90000, 21937)";
        exp = "111937";
        act = "" + RobustPaycheck.calculateGrossPay(90000, 21937);
        testResult(id, desc, exp, act);

        // Gross Level 3 46 hours
        id = "Gross Level 3 46.5 hours";
        desc = "RobustPaycheck.calculateGrossPay(103000, 25103)";
        exp = "128103";
        act = "" + RobustPaycheck.calculateGrossPay(103000, 25103);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Gross
        id = "Gross $13.76 25.4 hours";
        desc = "RobustPaycheck.calculateGrossPay(34950, 14964)";
        exp = "49914";
        act = "" + RobustPaycheck.calculateGrossPay(34950, 14964);
        testResult(id, desc, exp, act);

        // Test negative gross pay
        id = "Negative gross pay";
        desc = "RobustPaycheck.calculateGrossPay(-92700, 1)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateGrossPay(-92700, 1);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test negative overtime pay
        id = "Negative overtime pay";
        desc = "RobustPaycheck.calculateGrossPay(34950, -10)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateGrossPay(34950, -10);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.calculateTotalDeductions() method.
     */
    public static void testCalculateRetirement() {
        // Zero percent retirement
        String id = "Zero percent retirement";
        String desc = "RobustPaycheck.calculateRetirement(92700, 0)";
        String exp = "0";
        String act = "" + RobustPaycheck.calculateRetirement(92700, 0);
        testResult(id, desc, exp, act);

        // One percent retirement
        id = "One percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 1)";
        exp = "927";
        act = "" + RobustPaycheck.calculateRetirement(92700, 1);
        testResult(id, desc, exp, act);

        // Two percent retirement
        id = "Two percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 2)";
        exp = "1854";
        act = "" + RobustPaycheck.calculateRetirement(92700, 2);
        testResult(id, desc, exp, act);

        // Three percent retirement
        id = "Four percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 3)";
        exp = "2781";
        act = "" + RobustPaycheck.calculateRetirement(92700, 3);
        testResult(id, desc, exp, act);

        // Four percent retirement
        id = "Four percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 4)";
        exp = "3708";
        act = "" + RobustPaycheck.calculateRetirement(92700, 4);
        testResult(id, desc, exp, act);

        // Five percent retirement
        id = "Five percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 5)";
        exp = "4635";
        act = "" + RobustPaycheck.calculateRetirement(92700, 5);
        testResult(id, desc, exp, act);

        // Six percent retirement
        id = "Six percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 6)";
        exp = "5562";
        act = "" + RobustPaycheck.calculateRetirement(92700, 6);
        testResult(id, desc, exp, act);

        // Seven percent retirement
        id = "Seven percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, 7)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateRetirement(92700, 7);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Negative percent retirement
        id = "Negative one percent retirement";
        desc = "RobustPaycheck.calculateRetirement(92700, -1)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateRetirement(92700, -1);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Negative gross pay
        id = "Negative gross pay";
        desc = "RobustPaycheck.calculateRetirement(-92700, 1)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + RobustPaycheck.calculateRetirement(-92700, 1);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the RobustPaycheck.calculateNetPay() method.
     */
    public static void testCalculateNetPay() {
        // Only testing valid values for the moment.

        // Calculate net pay with deductions
        String id = "Net pay with deductions";
        String desc = "RobustPaycheck.calculateNetPay(92700, 6489)";
        String exp = "86211";
        String act = "" + RobustPaycheck.calculateNetPay(92700, 6489);
        testResult(id, desc, exp, act);

        // Calculate net pay without deductions
        id = "Net pay without deductions";
        desc = "RobustPaycheck.calculateNetPay(92700, 0)";
        exp = "92700";
        act = "" + RobustPaycheck.calculateNetPay(92700, 0);
        testResult(id, desc, exp, act);

        // Calculate net pay - negative
        id = "Negative new pay";
        desc = "RobustPaycheck.calculateNetPay(92700, 93800)";
        exp = "-1100";
        act = "" + RobustPaycheck.calculateNetPay(92700, 93800);
        testResult(id, desc, exp, act);
    }

    /**
     * Prints the test information.
     * 
     * @param id id of the test
     * @param desc description of the test (e.g., method call)
     * @param exp expected result of the test
     * @param act actual result of the test
     */
    private static void testResult(String id, String desc, String exp, String act) {
        testCounter++;
        String result = FAIL;
        if (exp.equals(act)) {
            result = PASS;
            passingTestCounter++;
        }
        System.out.printf("%-35s%-80s%7s%45s%45s\n", id, desc, result, exp, act);
    }

    /**
     * Starts the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        testIsValidLevel();
        testIsValidRetirementPercentage();
        testGetPayRate();
        testCalculateRegularPay();
        testCalculateOvertimePay();
        testCalculateGrossPay();
        testCalculateRetirement();
        testCalculateNetPay();

        System.out.println("\n---------------------------------------");
        System.out.println("-               Results               -");
        System.out.println("---------------------------------------");
        System.out.printf("%4d / %4d passing tests", passingTestCounter, testCounter);
    }

}
