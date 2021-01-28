package entity;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        user.setUserName("Wuang");
//        user.setEmail("wuangmai@gmail.com");
//        user.setPassword("coderslab");
//
//        UserDAO userDAO = new UserDAO();
//        userDAO.create(user);
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.read(1).getId());
        System.out.println(userDAO.read(1).getUserName());
        System.out.println(userDAO.read(1).getEmail());
        System.out.println(userDAO.read(1).getPassword());
        System.out.println(userDAO.read(2).getPassword());


    }
}
