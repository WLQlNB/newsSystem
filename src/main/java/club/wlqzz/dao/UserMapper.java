package club.wlqzz.dao;

import club.wlqzz.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    void addUser(User user);
    @Select("select * from t_user where id=#{id}")
    User getUserById(int id);
    void updateUser(User user);
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(User user);
    @Select("select * from t_user")
    List<User> getAllUsers();
}
