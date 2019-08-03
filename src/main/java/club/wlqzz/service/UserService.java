package club.wlqzz.service;


import club.wlqzz.pojo.User;

public interface UserService {
    public void register(User user) throws Exception;
    public boolean login(User user) throws Exception;
    public User getUser(String id) throws Exception;

}
