import org.junit.*;
import junit.framework.TestCase;

/**
 * Test class for the Paycheck program.
 * 
 * @author Sarah Heckman
 * @author Jessica Young Schmidt
 */
public class PaycheckTest extends TestCase {

    /**
     * Test the Paycheck.getPayRate() method.
     */
    @Test
    public void testGetPayRate() {
        // Test level 1
        assertEquals("Paycheck.getPayRate(Paycheck.LEVEL_1)", Paycheck.LEVEL_1_PAY_RATE,
                        Paycheck.getPayRate(Paycheck.LEVEL_1));

        // Test level 2
        assertEquals("Paycheck.getPayRate(Paycheck.LEVEL_2)", Paycheck.LEVEL_2_PAY_RATE,
                        Paycheck.getPayRate(Paycheck.LEVEL_2));

        // Test level 3
        assertEquals("Paycheck.getPayRate(Paycheck.LEVEL_3)", Paycheck.LEVEL_3_PAY_RATE,
                        Paycheck.getPayRate(Paycheck.LEVEL_3));

        // Test level 0 - invalid lower boundary
        assertEquals("Paycheck.getPayRate(0)", Paycheck.INVALID, Paycheck.getPayRate(0));

        // Test level 4 - invalid upper boundary
        assertEquals("Paycheck.getPayRate(4)", Paycheck.INVALID, Paycheck.getPayRate(4));
    }

    /**
     * Test the Paycheck.calculateRegularPay() method.
     */
    @Test
    public void testCalculateRegularPay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Regular Level 1 36 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36)", 68400,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36));

        // Regular Level 2 36 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 36)", 81000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 36));

        // Regular Level 3 36 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 36)", 92700,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 36));

        // Over 40 hours
        // Regular Level 1 46 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 46)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 46));

        // Regular Level 2 46 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 46)", 90000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 46));

        // Regular Level 3 46 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 46)", 103000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 46));

        // Fractional hours less than 40
        // Regular Level 1 36.5 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36.5)", 69350,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36.5));

        // Regular Level 2 36.5 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 36.5)", 82125,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 36.5));

        // Regular Level 3 36.5 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 36.5)", 93987,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 36.5));

        // Test a payrate other than a given constant Regular
        assertEquals("Paycheck.calculateRegularPay(1376, 25.4)", 34950,
                        Paycheck.calculateRegularPay(1376, 25.4));

        // Testing boundary
        // Less than 40 hours
        // Regular Level 1 39 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 39)", 74100,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 39));

        // Regular Level 2 39 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 39)", 87750,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 39));

        // Regular Level 3 39 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 39)", 100425,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 39));

        // Regular Level 1 40 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 40)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 40));

        // Regular Level 2 40 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 40)", 90000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 40));

        // Regular Level 3 40 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 40)", 103000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 40));

        // Over 40 hours
        // Regular Level 1 41 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 41)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 41));

        // Regular Level 2 41 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 41)", 90000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_2_PAY_RATE, 41));

        // Regular Level 3 41 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 41)", 103000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_3_PAY_RATE, 41));
    }

    /**
     * Test the Paycheck.calculateOvertimePay() method.
     */
    public void testCalculateOvertimePay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Overtime Level 1 36 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 36)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 36));

        // Overtime Level 2 36 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 36)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 36));

        // Overtime Level 3 36 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 36)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 36));

        // Over 40 hours
        // Overtime Level 1 46 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 46)", 17100,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 46));

        // Overtime Level 2 46 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 46)", 20250,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 46));

        // Overtime Level 3 46 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 46)", 23172,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 46));

        // Fractional hours less than 40
        // Overtime Level 1 36.5 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 36.5)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 36.5));

        // Overtime Level 2 36.5 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 36.5)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 36.5));

        // Overtime Level 3 36.5 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 36.5)", 0,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 36.5));

        // Fractional hours over 40 hours
        // Overtime Level 1 46.5 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 46.5)", 18525,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_1_PAY_RATE, 46.5));

        // Overtime Level 2 46.5 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 46.5)", 21937,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_2_PAY_RATE, 46.5));

        // Overtime Level 3 46 hours
        assertEquals("Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 46.5)", 25103,
                        Paycheck.calculateOvertimePay(Paycheck.LEVEL_3_PAY_RATE, 46.5));

        // Test a payrate other than a given constant Regular
        assertEquals("Paycheck.calculateOvertimePay(1376, 47.25)", 14964,
                        Paycheck.calculateOvertimePay(1376, 47.25));
    }

    /**
     * Test the Paycheck.calculateGrossPay() method.
     */
    @Test
    public void testCalculateGrossPay() {
        // Only testing valid values for the moment.

        // Less than 40 hours
        // Gross Level 1 36 hours
        assertEquals("Paycheck.calculateGrossPay(68400, 0)", 68400,
                        Paycheck.calculateGrossPay(68400, 0));

        // Gross Level 2 36 hours
        assertEquals("Paycheck.calculateGrossPay(81000, 0)", 81000,
                        Paycheck.calculateGrossPay(81000, 0));

        // Gross Level 3 36 hours
        assertEquals("Paycheck.calculateGrossPay(92700, 0)", 92700,
                        Paycheck.calculateGrossPay(92700, 0));

        // Over 40 hours
        // Gross Level 1 46 hours
        assertEquals("Paycheck.calculateGrossPay(76000, 17100)", 93100,
                        Paycheck.calculateGrossPay(76000, 17100));

        // Gross Level 2 46 hours
        assertEquals("Paycheck.calculateGrossPay(90000, 20250)", 110250,
                        Paycheck.calculateGrossPay(90000, 20250));

        // Gross Level 3 46 hours
        assertEquals("Paycheck.calculateGrossPay(103000, 23172)", 126172,
                        Paycheck.calculateGrossPay(103000, 23172));

        // Fractional hours less than 40
        // Gross Level 1 36.5 hours
        assertEquals("Paycheck.calculateGrossPay(69350, 0)", 69350,
                        Paycheck.calculateGrossPay(69350, 0));

        // Overtime Level 2 36.5 hours
        assertEquals("Paycheck.calculateGrossPay(82125, 0)", 82125,
                        Paycheck.calculateGrossPay(82125, 0));

        // Gross Level 3 36.5 hours
        assertEquals("Paycheck.calculateGrossPay(93987, 0)", 93987,
                        Paycheck.calculateGrossPay(93987, 0));

        // Fractional hours over 40 hours
        // Gross Level 1 46.5 hours
        assertEquals("Paycheck.calculateGrossPay(76000, 18525)", 94525,
                        Paycheck.calculateGrossPay(76000, 18525));

        // Gross Level 2 46.5 hours
        assertEquals("Paycheck.calculateGrossPay(90000, 21937)", 111937,
                        Paycheck.calculateGrossPay(90000, 21937));

        // Gross Level 3 46 hours
        assertEquals("Paycheck.calculateGrossPay(103000, 25103)", 128103,
                        Paycheck.calculateGrossPay(103000, 25103));

        // Test a payrate other than a given constant Gross
        assertEquals("Paycheck.calculateGrossPay(34950, 14964)", 49914,
                        Paycheck.calculateGrossPay(34950, 14964));
    }

    /**
     * Test the Paycheck.calculateTotalDeductions() method.
     */
    @Test
    public void testCalculateRetirement() {
        // Only testing valid values for the moment.

        // Zero percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 0)", 0,
                        Paycheck.calculateRetirement(92700, 0));

        // One percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 1)", 927,
                        Paycheck.calculateRetirement(92700, 1));

        // Two percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 2)", 1854,
                        Paycheck.calculateRetirement(92700, 2));

        // Three percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 3)", 2781,
                        Paycheck.calculateRetirement(92700, 3));

        // Four percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 4)", 3708,
                        Paycheck.calculateRetirement(92700, 4));

        // Five percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 5)", 4635,
                        Paycheck.calculateRetirement(92700, 5));

        // Six percent retirement
        assertEquals("Paycheck.calculateRetirement(92700, 6)", 5562,
                        Paycheck.calculateRetirement(92700, 6));
    }

    /**
     * Test the Paycheck.calculateNetPay() method.
     */
    @Test
    public void testCalculateNetPay() {
        // Only testing valid values for the moment.

        // Calculate net pay with deductions
        assertEquals("Paycheck.calculateNetPay(92700, 6489)", 86211,
                        Paycheck.calculateNetPay(92700, 6489));

        // Calculate net pay without deductions
        assertEquals("Paycheck.calculateNetPay(92700, 0)", 92700,
                        Paycheck.calculateNetPay(92700, 0));

        // Calculate net pay - negative
        assertEquals("Paycheck.calculateNetPay(92700, 93800)", -1100,
                        Paycheck.calculateNetPay(92700, 93800));
    }

}
