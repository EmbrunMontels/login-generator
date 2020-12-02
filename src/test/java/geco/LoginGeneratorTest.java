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
        String toTest2 = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        String toTest3 = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        String toTest4 = loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        String toTest5 = loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        String result1 = "PDUR";
        String result2 = "JRAL2";
        String result3 = "JROL1";
        String result4 = "PDUR1";
        String result5 = "PDU";


        //assert
        assertEquals(result1,toTest1);
        assertEquals(result2,toTest2);
        assertEquals(result3,toTest3);
        assertEquals(result4,toTest4);
        assertEquals(result5,toTest5);


    }
}