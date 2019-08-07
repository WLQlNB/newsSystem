package club.wlqzz.service.impl;

import club.wlqzz.dao.NewsMapper;
import club.wlqzz.pojo.News;
import club.wlqzz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public void addNews(News news) {
        newsMapper.addNews(news);
    }

    public void deleteNews(News news) {
        newsMapper.deleteNews(news);
    }

    public void updateNews(News news) {
        newsMapper.updateNews(news);
    }

    public News selectNews(News news) {
        return newsMapper.selectNews(news);
    }

    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }
}
