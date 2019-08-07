package club.wlqzz.dao;

import club.wlqzz.pojo.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface NewsMapper {
    @Insert("insert into t_news(title,context) value(#{title},#{context})")
    void addNews(News news);
    @Delete("delete from t_news where title=#{title}")
    void deleteNews(News news);
    @Update("update t_news set title=#{title},context=#{context} where id=#{id}")
    void updateNews(News news);
    @Select("select * from t_news where title=#{title}")
    News selectNews(News news);
    @Select("select * from t_news")
    List<News> getAllNews();
}
