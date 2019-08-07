package club.wlqzz.service;

import club.wlqzz.pojo.News;

import java.util.List;

public interface NewsService {
    void addNews(News news);
    void deleteNews(News news);
    void updateNews(News news);
    News selectNews(News news);
    List<News> getAllNews();
}
