package entity;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Wuang");
        user.setEmail("wuangmai@gmail.com");
        user.setPassword("coderslab");

        UserDAO userDAO = new UserDAO();
        userDAO.create(user);
    }
}
