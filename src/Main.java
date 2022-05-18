
public class Main {

    public static void main(String[] args){

        IDandPasswords idAndPasswords = new IDandPasswords();

        Login login = new Login(idAndPasswords.getLoginInfo());
    }
}
