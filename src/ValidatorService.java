public class ValidatorService {

    private ValidatorService() {
    }

    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            Checker checker = new RegexpChecker();
            validateParams(login, password, confirmPassword, checker);
            return true;
        } catch (WrongLogicException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateParams(String login,
                                       String password,
                                       String confirmPassword,
                                       Checker checker) throws WrongLogicException, WrongPasswordException {
        if (login == null || login.length() > 20) {
            throw new WrongLogicException("Длина логина должна быть меньше или равна 20 символов");
        }

        if (password == null || confirmPassword == null || password.length() >= 20 || confirmPassword.length() >= 20) {
            throw new WrongLogicException("Длина пароля должна быть меньше 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
        checker.checkLogin(login);
        checker.checkPassword(password);
    }

}
