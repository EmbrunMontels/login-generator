package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginServiceTest {
    private String testExist1, testExist2,testAdd;
    private LoginService log1;


    @Before
    public void init() {
        String[] loginExistant = new String[]{"JeanCharle", "test1"};
        testExist1 = "test1";
        testExist2 = "test2";
        testAdd = "ADDMe";
        log1 = new LoginService(loginExistant);
    }
    @Test
    public void testLoginExists() {
        //code à test
        boolean resultT = log1.loginExists(testExist1);
        boolean resultF = log1.loginExists(testExist2);
        //asert
        assertFalse(resultF);
        assertTrue(resultT);
    }
    @Test
    public void testAddLogin() {
        //code à test
        log1.addLogin(testAdd);
        //asertions
        assertTrue(log1.loginExists(testAdd));

    }

    @Test
    public void testFindAllLoginsStartingWith() {
        //code à test
        List<String> startwithTEST = log1.findAllLoginsStartingWith("test");
        int i = 0;
        System.out.println(startwithTEST.size());
        boolean inside = true;
        while( inside && (i < startwithTEST.size()) ){
            if(! log1.loginExists(startwithTEST.get(i))){
                inside = false;
            }
            i+=1;
        }
        //assert
        assertTrue(inside);
    }

    @Test
    public void testFindAllLogins() {
        //code à test
        List<String> allLog = log1.findAllLogins();
        int i = 0;
        System.out.println(allLog.size());
        boolean inside = true;
        while( inside && (i < allLog.size()) ){
            if(! log1.loginExists(allLog.get(i))){
                inside = false;
            }
            i+=1;
        }
        //assert
        assertTrue(inside);

    }
}