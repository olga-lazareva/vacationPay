import junit.framework.TestCase;
import main.HolidayPay;

public class HolidayPayTest extends TestCase
{
    float salary;
    int numberDays;

    @Override
    protected void setUp() throws Exception {
        salary = 29400f;
        numberDays = 10;
    }

    public void testHolidayPay()
    {
        HolidayPay holidayPay = new HolidayPay(salary, numberDays);
        float actual = holidayPay.getVacationPay();
        float expected = 10000f;
        assertEquals(expected, actual);
    }
}
