public class Register {
    private String login;
    private String password;
    private String confirmPassword;

    public Register(String login, String password, String confirmPassword) throws WrongLogicException, WrongPasswordException {
        this.login = login;
        if (login.length() > 20) {
            throw new WrongLogicException("Вы ввели больше 20 символов!");
        }
        this.confirmPassword = confirmPassword;
        if (confirmPassword != password) {
            throw new WrongPasswordException("Пароли не равны!");
        }
        this.password = password;
        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком большой пароль!");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String register (String login, String password, String confirmPassword) {
        String register = "Login: " + login + " Password: " + password + " Confirm Password " + confirmPassword;
        System.out.println(register);
        return register;
    }



    @Override
    public String toString() {
        return "Login: " + login +
                " Password: " + password +
                " Confirm password: " + confirmPassword;
    }

}
