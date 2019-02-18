import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by aivashchenko on 2/11/2019.
 */
public class CamelCaseTest {
    private  String pattern;
    private  List<Object> data;
    private  List<Object> listWithNullElement;
    private String emptyList;
    private CamelCaseBusinessLogicClass camelCaseTest;
    //camel case tests changes

    @Before
    public  void setUp(){
        pattern = "FirstSecondThirdFourth";
        data= Arrays.asList("first", "second","third","fourth");
        listWithNullElement= Arrays.asList("first", "second","third",null);
        emptyList="Message for logger: you have provided empty list";
        camelCaseTest = new CamelCaseBusinessLogicClass();

    }

    @Test
    public void canInstantiateCamelCase(){
        assertNotNull(camelCaseTest);
    }



    @Test
    public void methodCanReturnString(){
        assertNotNull(camelCaseTest.getCamelCaseString(data));

    }
    @Test
    public void methodCanReturnProperString(){
        assertNotNull(camelCaseTest.getCamelCaseString(data));
        assertEquals(pattern,camelCaseTest.getCamelCaseString(data));
    }

    @Test(expected = IllegalArgumentException.class)
    public void methodReturnCorrectExceptionWithNullElementInList(){
        assertEquals(pattern,camelCaseTest.getCamelCaseString(listWithNullElement));
    }

    @Test(expected = IllegalArgumentException.class)
    public void methodReturnCorrectExceptionWithNullElementAsArgument(){
        assertEquals(pattern,camelCaseTest.getCamelCaseString(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void methodReturnCorrectExceptionWithIncorrectElementInList(){
        camelCaseTest.getCamelCaseString(Arrays.asList(1,3,5));
    }

    @Test()
    public void methodReturnCorrectMessageIfListIsEmpty(){
        assertEquals(emptyList,camelCaseTest.getCamelCaseString(new ArrayList<>()));
    }


}
