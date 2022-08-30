public interface Checker {

    void checkLogin(String login) throws WrongLogicException;

    void checkPassword(String password) throws WrongPasswordException;
}
