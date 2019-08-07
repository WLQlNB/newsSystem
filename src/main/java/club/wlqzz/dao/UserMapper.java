package club.wlqzz.dao;

import club.wlqzz.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert("insert into t_user(name,sex,password) value(#{name},#{sex},#{password})")
    void addUser(User user);
    @Select("select * from t_user where id=#{id}")
    User getUserById(int id);
    void updateUser(User user);
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(User user);
}
