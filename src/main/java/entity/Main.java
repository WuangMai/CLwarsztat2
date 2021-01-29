package entity;

import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {
//        Creating user test <--------------------------------------
//        User user = new User();
//        user.setUserName("Wuang");
//        user.setEmail("wuangmai@gmail.com");
//        user.setPassword("coderslab");
//
//        UserDAO userDAO = new UserDAO();
//        userDAO.create(user);

//        Reading user from db test <-------------------------------
//        UserDAO userDAO = new UserDAO();
//        System.out.println(userDAO.read(1).getId());
//        System.out.println(userDAO.read(1).getUserName());
//        System.out.println(userDAO.read(1).getEmail());
//        System.out.println(userDAO.read(1).getPassword());
//        System.out.println(userDAO.read(2).getPassword());

//        Updating user test <--------------------------------------
        UserDAO userDAO = new UserDAO();
        User u1 = userDAO.read(1);
        u1.setUserName("WuangMai");
        u1.setEmail("wuangmai@gmail.com");

        userDAO.update(u1);


    }
}
