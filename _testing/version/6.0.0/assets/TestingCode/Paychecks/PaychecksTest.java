/**
 * Test class for the Paychecks program.
 * 
 * @author Sarah Heckman
 * @author Jessica Young Schmidt
 */
public class PaychecksTest {

    /** Constants for passing and failing test output */
    public static final String PASS = "PASS";
    public static final String FAIL = "FAIL";

    /** Counters for test cases */
    public static int testCounter = 0;
    public static int passingTestCounter = 0;

    /**
     * Test the Paychecks.isValidLevel() method.
     */
    public static void testIsValidLevel() {
        // Test level 1
        String id = "Level 1 Pay Rate";
        String desc = "Paychecks.isValidLevel(Paychecks.LEVEL_1)";
        String exp = "true";
        String act = "" + Paychecks.isValidLevel(Paychecks.LEVEL_1);
        testResult(id, desc, exp, act);

        // Test level 2
        id = "Level 2 Pay Rate";
        desc = "Paychecks.isValidLevel(Paychecks.LEVEL_2)";
        exp = "true";
        act = "" + Paychecks.isValidLevel(Paychecks.LEVEL_2);
        testResult(id, desc, exp, act);

        // Test level 3
        id = "Level 3 Pay Rate";
        desc = "Paychecks.isValidLevel(Paychecks.LEVEL_3)";
        exp = "true";
        act = "" + Paychecks.isValidLevel(Paychecks.LEVEL_3);
        testResult(id, desc, exp, act);

        // Test level 0 - invalid lower boundary
        id = "Invalid Level 0 Pay Rate";
        desc = "Paychecks.isValidLevel(0)";
        exp = "false";
        act = "" + Paychecks.isValidLevel(0);
        testResult(id, desc, exp, act);

        // Test level 4 - invalid upper boundary
        id = "Invalid Level 4 Pay Rate";
        desc = "Paychecks.isValidLevel(4)";
        exp = "false";
        act = "" + Paychecks.isValidLevel(4);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.checkHoursWorked() method.
     */
    public static void testCheckHoursWorked() {
        // Test 0
        String id = "Hours worked 0";
        String desc = "Paychecks.checkHoursWorked(0)";
        String exp = "false";
        String act = "" + Paychecks.checkHoursWorked(0);
        testResult(id, desc, exp, act);

        // Test 1
        id = "Hours worked 1";
        desc = "Paychecks.checkHoursWorked(1)";
        exp = "true";
        act = "" + Paychecks.checkHoursWorked(1);
        testResult(id, desc, exp, act);

        // Test 41
        id = "Hours worked 41";
        desc = "Paychecks.checkHoursWorked(41)";
        exp = "true";
        act = "" + Paychecks.checkHoursWorked(41);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.checkName() method.
     */
    public static void testCheckName() {
        // Test ""
        String id = "Check name \"\"";
        String desc = "Paychecks.checkName(\"\")";
        String exp = "false";
        String act = "" + Paychecks.checkName("");
        testResult(id, desc, exp, act);

        // Test Alice Bob
        id = "Check name \"Alice Bob\"";
        desc = "Paychecks.checkName(\"Alice Bob\")";
        exp = "true";
        act = "" + Paychecks.checkName("Alice Bob");
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.processLine() method.
     */
    public static void testProcessLine() {

        String id = "Level 1";
        String desc = "Paychecks.processLine(\"Danny D David\\t1\\t20\\ttrue\\ttrue\\tfalse\")";
        String exp = "Danny D David            20.00     19.00    380.00      0.00    "
                        + "380.00     39.80    340.20\n";
        String act = Paychecks.processLine("Danny D David\t1\t20\ttrue\ttrue\tfalse");
        testResult(id, desc, exp, act);

        id = "Level 2";
        desc = "Paychecks.processLine(\"Frank Frankenstein\\t2\\t40\\ttrue\\tfalse\\tfalse\")";
        exp = "Frank Frankenstein       40.00     22.50    900.00      0.00    900.00     "
                        + "24.50    875.50\n";
        act = Paychecks.processLine("Frank Frankenstein\t2\t40\ttrue\tfalse\tfalse");
        testResult(id, desc, exp, act);

        id = "Level 3";
        desc = "Paychecks.processLine(\"Hilda Henderson\\t3\\t50\\tfalse\\tfalse\\tfalse\\t3\")";
        exp = "Hilda Henderson          50.00     25.75   1030.00    386.20   1416.20     "
                        + "42.48   1373.72\n";
        act = Paychecks.processLine("Hilda Henderson\t3\t50\tfalse\tfalse\tfalse\t3");
        testResult(id, desc, exp, act);

        id = "Level 3 - missing retirement";
        desc = "Paychecks.processLine(\"Alice Anderson\\t3\\t10\\ttrue\\ttrue\\ttrue\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("Alice Anderson\t3\t10\ttrue\ttrue\ttrue");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        id = "Level 3 - double retirement";
        desc = "Paychecks.processLine(\"Alice Anderson\\t3\\t10\\ttrue\\ttrue\\ttrue\\t3.4\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("Alice Anderson\t3\t10\ttrue\ttrue\ttrue\t3.4");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        id = "Invalid name";
        desc = "Paychecks.processLine(\"\\t3\\t50\\tfalse\\tfalse\\tfalse\\t3\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("\t3\t50\tfalse\tfalse\tfalse\t3");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        id = "Invalid level";
        desc = "Paychecks.processLine(\"Hilda Henderson\\t4\\t50\\tfalse\\tfalse\\tfalse\\t3\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("Hilda Henderson\t4\t50\tfalse\tfalse\tfalse\t3");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        id = "Invalid hours worked";
        desc = "Paychecks.processLine(\"Hilda Henderson\\t3\\t0\\tfalse\\tfalse\\tfalse\\t3\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("Hilda Henderson\t3\t0\tfalse\tfalse\tfalse\t3");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        id = "Invalid retirement";
        desc = "Paychecks.processLine(\"Hilda Henderson\\t3\\t50\\tfalse\\tfalse\\tfalse\\t7\")";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.processLine("Hilda Henderson\t3\t50\tfalse\tfalse\tfalse\t7");
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.processPaycheck() method.
     */
    public static void testProcessPaycheck() {

        String id = "Level 1";
        String desc = "Paychecks.processPaycheck(\"Danny D David\", 1, 20, 1000, 0)";
        String exp = "Danny D David            20.00     19.00    380.00      0.00    380.00"
                        + "     10.00    370.00\n";
        String act = Paychecks.processPaycheck("Danny D David", 1, 20, 1000, 0);
        testResult(id, desc, exp, act);

        id = "Negative net";
        desc = "Paychecks.processPaycheck(\"Danny D David\",1, 2,10000,0)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = Paychecks.processPaycheck("Danny D David", 1, 2, 10000, 0);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.checkRetirementPercentage() method.
     */
    public static void testCheckRetirementPercentage() {
        // Test 0%
        String id = "0% Retirement";
        String desc = "Paychecks.checkRetirementPercentage(0)";
        String exp = "true";
        String act = "" + Paychecks.checkRetirementPercentage(0);
        testResult(id, desc, exp, act);

        // Test 3%
        id = "3% Retirement";
        desc = "Paychecks.checkRetirementPercentage(3)";
        exp = "true";
        act = "" + Paychecks.checkRetirementPercentage(3);
        testResult(id, desc, exp, act);

        // Test 6%
        id = "6% Retirement";
        desc = "Paychecks.checkRetirementPercentage(6)";
        exp = "true";
        act = "" + Paychecks.checkRetirementPercentage(6);
        testResult(id, desc, exp, act);

        // Test -1% - invalid lower boundary
        id = "-1% Retirement";
        desc = "Paychecks.checkRetirementPercentage(-1)";
        exp = "false";
        act = "" + Paychecks.checkRetirementPercentage(-1);
        testResult(id, desc, exp, act);

        // Test 7% - invalid upper boundary
        id = "7% Retirement";
        desc = "Paychecks.checkRetirementPercentage(7)";
        exp = "false";
        act = "" + Paychecks.checkRetirementPercentage(7);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.getPayRate() method.
     */
    public static void testGetPayRate() {
        // Test level 1
        String id = "Level 1 Pay Rate";
        String desc = "Paychecks.getPayRate(Paychecks.LEVEL_1)";
        String exp = "" + Paychecks.LEVEL_1_PAY_RATE;
        String act = "" + Paychecks.getPayRate(Paychecks.LEVEL_1);
        testResult(id, desc, exp, act);

        // Test level 2
        id = "Level 2 Pay Rate";
        desc = "Paychecks.getPayRate(Paychecks.LEVEL_2)";
        exp = "" + Paychecks.LEVEL_2_PAY_RATE;
        act = "" + Paychecks.getPayRate(Paychecks.LEVEL_2);
        testResult(id, desc, exp, act);

        // Test level 3
        id = "Level 3 Pay Rate";
        desc = "Paychecks.getPayRate(Paychecks.LEVEL_3)";
        exp = "" + Paychecks.LEVEL_3_PAY_RATE;
        act = "" + Paychecks.getPayRate(Paychecks.LEVEL_3);
        testResult(id, desc, exp, act);

        // Test level 0 - invalid lower boundary
        id = "Invalid Level 0 Pay Rate";
        desc = "Paychecks.getPayRate(0)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.getPayRate(0);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test level 4 - invalid upper boundary
        id = "Invalid Level 4 Pay Rate";
        desc = "Paychecks.getPayRate(4)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.getPayRate(4);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.calculateRegularPay() method.
     */
    public static void testCalculateRegularPay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Regular Level 1 36 hours
        String id = "Regular Level 1 36 hours";
        String desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 36)";
        String exp = "68400";
        String act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Regular Level 2 36 hours
        id = "Regular Level 2 36 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 36)";
        exp = "81000";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Regular Level 3 36 hours
        id = "Regular Level 3 36 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 36)";
        exp = "92700";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Regular Level 1 46 hours
        id = "Regular Level 1 46 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 46)";
        exp = "76000";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Regular Level 2 46 hours
        id = "Regular Level 2 46 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 46)";
        exp = "90000";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Regular Level 3 46 hours
        id = "Regular Level 3 46 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 46)";
        exp = "103000";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Regular Level 1 36.5 hours
        id = "Regular Level 1 36.5 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 36.5)";
        exp = "69350";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_1_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Regular Level 2 36.5 hours
        id = "Regular Level 2 46 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 36.5)";
        exp = "82125";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_2_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Regular Level 3 36.5 hours
        id = "Regular Level 3 46 hours";
        desc = "Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 36.5)";
        exp = "93987";
        act = "" + Paychecks.calculateRegularPay(Paychecks.LEVEL_3_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Regular
        id = "Regular $13.76 25.4 hours";
        desc = "Paychecks.calculateRegularPay(1376, 25.4)";
        exp = "34950";
        act = "" + Paychecks.calculateRegularPay(1376, 25.4);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.calculateOvertimePay() method.
     */
    public static void testCalculateOvertimePay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Overtime Level 1 36 hours
        String id = "Overtime Level 1 36 hours";
        String desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 36)";
        String exp = "0";
        String act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36 hours
        id = "Overtime Level 2 36 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 36)";
        exp = "0";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Overtime Level 3 36 hours
        id = "Overtime Level 3 36 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 36)";
        exp = "0";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 36);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Overtime Level 1 46 hours
        id = "Overtime Level 1 46 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 46)";
        exp = "17100";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Overtime Level 2 46 hours
        id = "Overtime Level 2 46 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 46)";
        exp = "20250";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Overtime Level 3 46 hours
        id = "Overtime Level 3 46 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 46)";
        exp = "23172";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 46);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Overtime Level 1 36.5 hours
        id = "Overtime Level 1 36.5 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36.5 hours
        id = "Overtime Level 2 46 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Overtime Level 3 36.5 hours
        id = "Overtime Level 3 46 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 36.5)";
        exp = "0";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 36.5);
        testResult(id, desc, exp, act);

        // Fractional hours over 40 hours
        // Overtime Level 1 46.5 hours
        id = "Overtime Level 1 46.5 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 46.5)";
        exp = "18525";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_1_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Overtime Level 2 46.5 hours
        id = "Overtime Level 2 46.5 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 46.5)";
        exp = "21937";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_2_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Overtime Level 3 46 hours
        id = "Overtime Level 3 46.5 hours";
        desc = "Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 46.5)";
        exp = "25103";
        act = "" + Paychecks.calculateOvertimePay(Paychecks.LEVEL_3_PAY_RATE, 46.5);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Regular
        id = "Overtime $13.76 25.4 hours";
        desc = "Paychecks.calculateOvertimePay(1376, 47.25)";
        exp = "14964";
        act = "" + Paychecks.calculateOvertimePay(1376, 47.25);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.calculateGrossPay() method.
     */
    public static void testCalculateGrossPay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Gross Level 1 36 hours
        String id = "Gross Level 1 36 hours";
        String desc = "Paychecks.calculateGrossPay(68400, 0)";
        String exp = "68400";
        String act = "" + Paychecks.calculateGrossPay(68400, 0);
        testResult(id, desc, exp, act);

        // Gross Level 2 36 hours
        id = "Gross Level 2 36 hours";
        desc = "Paychecks.calculateGrossPay(81000, 0)";
        exp = "81000";
        act = "" + Paychecks.calculateGrossPay(81000, 0);
        testResult(id, desc, exp, act);

        // Gross Level 3 36 hours
        id = "Gross Level 3 36 hours";
        desc = "Paychecks.calculateGrossPay(92700, 0)";
        exp = "92700";
        act = "" + Paychecks.calculateGrossPay(92700, 0);
        testResult(id, desc, exp, act);

        // Over 40 hours
        // Gross Level 1 46 hours
        id = "Gross Level 1 46 hours";
        desc = "Paychecks.calculateGrossPay(76000, 17100)";
        exp = "93100";
        act = "" + Paychecks.calculateGrossPay(76000, 17100);
        testResult(id, desc, exp, act);

        // Gross Level 2 46 hours
        id = "Gross Level 2 46 hours";
        desc = "Paychecks.calculateGrossPay(90000, 20250)";
        exp = "110250";
        act = "" + Paychecks.calculateGrossPay(90000, 20250);
        testResult(id, desc, exp, act);

        // Gross Level 3 46 hours
        id = "Gross Level 3 46 hours";
        desc = "Paychecks.calculateGrossPay(103000, 23172)";
        exp = "126172";
        act = "" + Paychecks.calculateGrossPay(103000, 23172);
        testResult(id, desc, exp, act);

        // Fractional hours less than 40
        // Gross Level 1 36.5 hours
        id = "Gross Level 1 36.5 hours";
        desc = "Paychecks.calculateGrossPay(69350, 0)";
        exp = "69350";
        act = "" + Paychecks.calculateGrossPay(69350, 0);
        testResult(id, desc, exp, act);

        // Overtime Level 2 36.5 hours
        id = "Gross Level 2 46 hours";
        desc = "Paychecks.calculateGrossPay(82125, 0)";
        exp = "82125";
        act = "" + Paychecks.calculateGrossPay(82125, 0);
        testResult(id, desc, exp, act);

        // Gross Level 3 36.5 hours
        id = "Gross Level 3 46 hours";
        desc = "Paychecks.calculateGrossPay(93987, 0)";
        exp = "93987";
        act = "" + Paychecks.calculateGrossPay(93987, 0);
        testResult(id, desc, exp, act);

        // Fractional hours over 40 hours
        // Gross Level 1 46.5 hours
        id = "Gross Level 1 46.5 hours";
        desc = "Paychecks.calculateGrossPay(76000, 18525)";
        exp = "94525";
        act = "" + Paychecks.calculateGrossPay(76000, 18525);
        testResult(id, desc, exp, act);

        // Gross Level 2 46.5 hours
        id = "Gross Level 2 46.5 hours";
        desc = "Paychecks.calculateGrossPay(90000, 21937)";
        exp = "111937";
        act = "" + Paychecks.calculateGrossPay(90000, 21937);
        testResult(id, desc, exp, act);

        // Gross Level 3 46 hours
        id = "Gross Level 3 46.5 hours";
        desc = "Paychecks.calculateGrossPay(103000, 25103)";
        exp = "128103";
        act = "" + Paychecks.calculateGrossPay(103000, 25103);
        testResult(id, desc, exp, act);

        // Test a payrate other than a given constant Gross
        id = "Gross $13.76 25.4 hours";
        desc = "Paychecks.calculateGrossPay(34950, 14964)";
        exp = "49914";
        act = "" + Paychecks.calculateGrossPay(34950, 14964);
        testResult(id, desc, exp, act);

        // Test negative gross pay
        id = "Negative gross pay";
        desc = "Paychecks.calculateGrossPay(-92700, 1)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.calculateGrossPay(-92700, 1);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

        // Test negative overtime pay
        id = "Negative overtime pay";
        desc = "Paychecks.calculateGrossPay(34950, -10)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.calculateGrossPay(34950, -10);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.calculateTotalDeductions() method.
     */
    public static void testCalculateRetirement() {
        // Only testing valid values for the moment.

        // Zero percent retirement
        String id = "Zero percent retirement";
        String desc = "Paychecks.calculateRetirement(92700, 0)";
        String exp = "0";
        String act = "" + Paychecks.calculateRetirement(92700, 0);
        testResult(id, desc, exp, act);

        // One percent retirement
        id = "One percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 1)";
        exp = "927";
        act = "" + Paychecks.calculateRetirement(92700, 1);
        testResult(id, desc, exp, act);

        // Two percent retirement
        id = "Two percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 2)";
        exp = "1854";
        act = "" + Paychecks.calculateRetirement(92700, 2);
        testResult(id, desc, exp, act);

        // Three percent retirement
        id = "Four percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 3)";
        exp = "2781";
        act = "" + Paychecks.calculateRetirement(92700, 3);
        testResult(id, desc, exp, act);

        // Four percent retirement
        id = "Four percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 4)";
        exp = "3708";
        act = "" + Paychecks.calculateRetirement(92700, 4);
        testResult(id, desc, exp, act);

        // Five percent retirement
        id = "Five percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 5)";
        exp = "4635";
        act = "" + Paychecks.calculateRetirement(92700, 5);
        testResult(id, desc, exp, act);

        // Six percent retirement
        id = "Six percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 6)";
        exp = "5562";
        act = "" + Paychecks.calculateRetirement(92700, 6);
        testResult(id, desc, exp, act);

        // Seven percent retirement
        id = "Seven percent retirement";
        desc = "Paychecks.calculateRetirement(92700, 7)";
        exp = "6489";
        act = "" + Paychecks.calculateRetirement(92700, 7);
        testResult(id, desc, exp, act);
    }

    /**
     * Test the Paychecks.calculateNetPay() method.
     */
    public static void testCalculateNetPay() {
        // Only testing valid values for the moment.

        // Calculate net pay with deductions
        String id = "Net pay with deductions";
        String desc = "Paychecks.calculateNetPay(92700, 6489)";
        String exp = "86211";
        String act = "" + Paychecks.calculateNetPay(92700, 6489);
        testResult(id, desc, exp, act);

        // Calculate net pay without deductions
        id = "Net pay without deductions";
        desc = "Paychecks.calculateNetPay(92700, 0)";
        exp = "92700";
        act = "" + Paychecks.calculateNetPay(92700, 0);
        testResult(id, desc, exp, act);

        // Calculate net pay - negative
        id = "Negative new pay";
        desc = "Paychecks.calculateNetPay(92700, 93800)";
        exp = "class java.lang.IllegalArgumentException";
        act = "";
        try {
            act = "" + Paychecks.calculateNetPay(92700, 93800);
        } catch (IllegalArgumentException e) {
            act = "" + e.getClass();
        }
        testResult(id, desc, exp, act);

    }

    /**
     * Test the Paychecks.calculateDeductions() method.
     */
    public static void testCalculateDeductions() {
        // Only testing valid values for the moment.

        // Calculate deductions
        String id = "Deductions M D V";
        String desc = "Paychecks.calculateDeductions(true, true, true)";
        String exp = "4505";
        String act = "" + Paychecks.calculateDeductions(true, true, true);
        testResult(id, desc, exp, act);

        id = "Deductions M D";
        desc = "Paychecks.calculateDeductions(true, true, false)";
        exp = "3980";
        act = "" + Paychecks.calculateDeductions(true, true, false);
        testResult(id, desc, exp, act);

        id = "Deductions M V";
        desc = "Paychecks.calculateDeductions(true, false, true)";
        exp = "2975";
        act = "" + Paychecks.calculateDeductions(true, false, true);
        testResult(id, desc, exp, act);

        id = "Deductions D V";
        desc = "Paychecks.calculateDeductions(false, true, true)";
        exp = "2055";
        act = "" + Paychecks.calculateDeductions(false, true, true);
        testResult(id, desc, exp, act);

        id = "Deductions D";
        desc = "Paychecks.calculateDeductions(false, true, false)";
        exp = "1530";
        act = "" + Paychecks.calculateDeductions(false, true, false);
        testResult(id, desc, exp, act);

        id = "Deductions V";
        desc = "Paychecks.calculateDeductions(false, false, true)";
        exp = "525";
        act = "" + Paychecks.calculateDeductions(false, false, true);
        testResult(id, desc, exp, act);

        id = "Deductions M";
        desc = "Paychecks.calculateDeductions(true, false, false)";
        exp = "2450";
        act = "" + Paychecks.calculateDeductions(true, false, false);
        testResult(id, desc, exp, act);

        id = "Deductions None";
        desc = "Paychecks.calculateDeductions(false, false, false)";
        exp = "0";
        act = "" + Paychecks.calculateDeductions(false, false, false);
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
        System.out.printf("%-35s%-80s%7s%55s%55s\n", id, desc, result, exp, act);
    }

    /**
     * Starts the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        testIsValidLevel();
        testCheckRetirementPercentage();
        testCheckHoursWorked();
        testCheckName();
        testGetPayRate();
        testCalculateRegularPay();
        testCalculateOvertimePay();
        testCalculateGrossPay();
        testCalculateDeductions();
        testCalculateRetirement();
        testCalculateNetPay();
        testProcessLine();
        testProcessPaycheck();
        System.out.printf("%4d / %4d passing tests", passingTestCounter, testCounter);
    }

}
