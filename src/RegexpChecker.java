public class RegexpChecker implements Checker {


    @Override
    public void checkLogin(String login) throws WrongLogicException {

        if (!login.matches("^\\w+$")) {
            throw new WrongLogicException("Логин содержит запрещенные символ");
        }

    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        throw new WrongPasswordException("Пароль содержит запрещенные символ");

    }
}
