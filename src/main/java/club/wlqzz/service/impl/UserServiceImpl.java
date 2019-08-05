package club.wlqzz.service.impl;

import club.wlqzz.dao.UserMapper;
import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    private User user;


    public void register(User user) throws Exception {

    }


    public boolean loginCheck(int id,String password) throws Exception {
        boolean flag=false;
        user=getUser(id);
        if(user==null&&"".equals(user)){
            return false;
        }
       if (user.getId()==id&&password.equals(user.getPassword())){
           flag= true;
       }
       return flag;
    }


    public User getUser(int id) throws Exception {
        System.out.println(id);
        return userMapper.getUserById(id);
    }


    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
