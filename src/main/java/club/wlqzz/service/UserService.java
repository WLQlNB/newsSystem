package club.wlqzz.service;


import club.wlqzz.pojo.User;

public interface UserService {
   public void register(User user) throws Exception;
   public boolean loginCheck(int id,String password) throws Exception;
   public User getUser(int id) ;
}
