package club.wlqzz.dao;

import club.wlqzz.pojo.Subject;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SubjectMapper {
    @Insert("insert into t_theme(title) value(#{title})")
    void addSubject(Subject subject);
    @Delete("delete from t_theme where title=#{title}")
    void deleteSubject(Subject subject);
    @Update("update t_theme set title=#{title} where id=#{id}")
    void updateSubject(Subject subject);
    @Select("select * from t_theme where title=#{title}")
    Subject selectSubject(Subject subject);
    @Select("select * from t_theme")
    List<Subject> getAllSubjects();
}
