package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest{
    LoginService loginService;
    @Before
    public void init(){
        loginService = new LoginService(new String[]{"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});

    }


    @Test
    public void testGenerateLoginForNomAndPrenom() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        String toTest1 = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        String result = "PDUR";

        //assert
        assertEquals(result,toTest1);


    }
}