import classes.BottonlineEmlployee.BottomlineEmployee;
import classes.BottonlineEmlployee.BottomlineProject.*;
import classes.GloballogicEmployee;
import enums.*;

import java.util.Arrays;
import java.util.List;

/**
 documentation for classes is not finished yet
 */
public class BusinessLogicStub implements EmployeeService {
    private LegalxEmploee legalxEmploee = new LegalxEmploee("name",
            EmployeeEngineeringGrade.LEAD, EmployeeEngineeringRole.DEVELOOER,
            EmployeeLocation.KHARKOV,"Team 1",ProjectName.LEX);
    private PartnerSelectEmploee partnerSelectEmploee = new PartnerSelectEmploee("name",
            EmployeeEngineeringGrade.MIDDLE, EmployeeEngineeringRole.DEVELOOER,
            EmployeeLocation.KRAKOW,"Team P",ProjectName.PARTER_SELECT);

    @Override
    public List<BottomlineEmployee> getListOfBottomlieneEmployee(GloballogicEmployee... globallogicEmployee) {
        return Arrays.asList(legalxEmploee,partnerSelectEmploee);
    }
}
