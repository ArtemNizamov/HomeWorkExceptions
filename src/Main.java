
public class Main {
    public static void main(String[] args) throws WrongLogicException, WrongPasswordException {

        Register register = new Register("UserName", "123456QWERTY", "123456QWERTY");
        System.out.println(register);
    }
}