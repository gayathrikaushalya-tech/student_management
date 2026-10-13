package Controller.Login;

public class LoginController {
    public boolean checkUsernameandPassword(String name, String password) {
        if (name.equals("kasun") && password.equals("1234")) {
            return true;
        }
        return false;
    }

}
