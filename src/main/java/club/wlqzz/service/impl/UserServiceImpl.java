package club.wlqzz.service.impl;

import club.wlqzz.dao.UserMapper;
import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Override
    public void register(User user) throws Exception {

    }

    @Override
    public boolean login(User user) throws Exception {
        boolean flag=false;
        if (user.getName() == null || user.getName().trim().length() == 0) {
               // throw new RuleException("用户账号不能为空");
        }
        if (user.getPassword() == null || user.getPassword().trim().length() < 6) {
           // throw new RuleException("登录密码不能为空或者密码长度不足6位");
        }
        User user1=getUser(user.getId());
        if(user1!=null&&user.getPassword()==user1.getPassword()){
            flag=true;
            System.out.println("登录成功");

        }
        return flag;
    }

    @Override
    public User getUser(String id) throws Exception {
        return userMapper.getUserById(id);
    }
}
