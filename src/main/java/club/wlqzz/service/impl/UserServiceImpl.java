package club.wlqzz.service.impl;

import club.wlqzz.dao.UserMapper;
import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;
import club.wlqzz.util.format.Md5Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void register(User user) throws Exception {
        if(getUser(user.getId())!=null){
            throw new RuntimeException("该用户已存在");
        }else {
            user.setPassword(Md5Class.stringToMd5(user.getPassword()));
            userMapper.addUser(user);
        }
    }


    public boolean loginCheck(int id,String password) throws Exception {
        boolean flag=false;
        User user=getUser(id);
        String pwd=Md5Class.stringToMd5(password);
        if(user==null&&"".equals(user)){
            return false;
        }
       if (user.getId()==id&&pwd.equals(user.getPassword())){
           flag= true;
       }
       return flag;
    }


    public User getUser(int id){
        return userMapper.getUserById(id);
    }

}
