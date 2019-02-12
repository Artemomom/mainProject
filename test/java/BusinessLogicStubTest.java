import classes.BottonlineEmlployee.BottomlineEmployee;
import org.junit.Test;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public class BusinessLogicStubTest {


    @Test
    public void stubTest() {
        EmployeeService employeeServiceStub = new BusinessLogicStub();
        BusinessLogicClass businessLogicClass = new BusinessLogicClass(employeeServiceStub);
        Map<BottomlineEmployee, String> employees = businessLogicClass.getDevelopersOnLSM(new BottomlineEmployee());
        assertEquals(2, employees.size());
    }
}
