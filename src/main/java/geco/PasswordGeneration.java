package geco;

import java.nio.charset.Charset;
import java.util.Random;

public class PasswordGeneration {

    public PasswordGeneration() {

    }

    public String getRandomPassword(){
        String mdp ="";
        Random rdn = new Random();
        for(int i=0;i<8;i++){
            char c = (char) ('a'+rdn.nextInt(26));
            mdp += Character.toString(c);
        }


        return mdp;
    }

}
