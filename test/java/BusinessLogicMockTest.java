import classes.BottonlineEmlployee.BottomlineEmployee;
import classes.BottonlineEmlployee.BottomlineProject.LegalxEmploee;
import classes.BottonlineEmlployee.BottomlineProject.PartnerSelectEmploee;
import enums.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by aivashchenko on 2/11/2019.
 */
@RunWith(MockitoJUnitRunner.class)
public class BusinessLogicMockTest {
    private LegalxEmploee legalxEmploee = new LegalxEmploee("name",
            EmployeeEngineeringGrade.LEAD, EmployeeEngineeringRole.DEVELOOER,
            EmployeeLocation.KHARKOV,"Team 1",ProjectName.LEX);
    private PartnerSelectEmploee partnerSelectEmploee = new PartnerSelectEmploee("name",
            EmployeeEngineeringGrade.MIDDLE, EmployeeEngineeringRole.DEVELOOER,
            EmployeeLocation.KRAKOW,"Team P",ProjectName.PARTER_SELECT);

@Mock
EmployeeService employeeService;
    @Test
    public void mockTest() {

        when(employeeService.getListOfBottomlieneEmployee(new BottomlineEmployee())).thenReturn(Arrays.asList(partnerSelectEmploee,legalxEmploee));
        BusinessLogicClass businessLogicClass = new BusinessLogicClass(employeeService);
        String employeeProjectNameAndTeam = businessLogicClass.getEmployeeProjectNameAndTeam(new BottomlineEmployee());
        assertTrue("is not empty String",!employeeProjectNameAndTeam.isEmpty());
    }
}
