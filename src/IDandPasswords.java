import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    // Constructor
    IDandPasswords(){
        loginInfo.put("Gaston", "Gn1989");
        loginInfo.put("Graciela", "Tiara2012");
        loginInfo.put("Toto", "Zanahoria20");
    }

    // declaramos un getter para que otras Clases puedan acceder al HashMap
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
