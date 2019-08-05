package club.wlqzz.service;


import club.wlqzz.pojo.User;
import java.util.List;


public interface UserService {
   public void register(User user) throws Exception;
   public boolean loginCheck(int id,String password) throws Exception;
   public User getUser(int id) throws Exception;
   public List<User> getAllUsers();
}
