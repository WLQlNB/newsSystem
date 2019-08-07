package club.wlqzz.controller;

import club.wlqzz.pojo.News;
import club.wlqzz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value="/addNews")
    @ResponseBody
    public ModelAndView addNews(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/addNews");
        return mv;
    }

    @RequestMapping(value="/doAddNews")
    @ResponseBody
    public ModelAndView doAddNews(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        String title=request.getParameter("newsName");
        String context=request.getParameter("nContext");
        News news=new News();
        news.setTitle(title);
        news.setContext(context);
        newsService.addNews(news);
        mv.setViewName("/list");
        return mv;
    }

    @RequestMapping(value="/updateNews")
    @ResponseBody
    public ModelAndView updateNews(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/updateNews");
        return mv;
    }

    @RequestMapping(value="/doUpdateNews")
    @ResponseBody
    public ModelAndView doUpdateNews(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        String title=request.getParameter("newsTitle");
        String context=request.getParameter("newsContext");
        int newsId= Integer.parseInt(request.getParameter("newsId"));
        News news=new News();
        news.setId(newsId);
        news.setTitle(title);
        news.setContext(context);
        newsService.updateNews(news);
        mv.setViewName("/list");
        return mv;
    }

    @RequestMapping(value="/deleteNews")
    @ResponseBody
    public ModelAndView deleteNews(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/updateNews");
        return mv;
    }

    @RequestMapping(value="/doDeleteNews")
    @ResponseBody
    public ModelAndView doDeleteNews(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        String title=request.getParameter("dTitle");
        News news=new News();
        news.setTitle(title);
        newsService.deleteNews(news);
        mv.setViewName("/list");
        return mv;
    }
}
