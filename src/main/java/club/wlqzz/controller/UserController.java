package club.wlqzz.controller;

import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView Login(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }

    @RequestMapping("/doLogin")
    public ModelAndView DoLogin(HttpServletRequest request) throws Exception {
        int id= Integer.parseInt(request.getParameter("id"));
        String pwd=request.getParameter("pwd");
        ModelAndView mv=new ModelAndView();
        if(userService.loginCheck(id,pwd)){
            System.out.println("登录成功！");
            mv.setViewName("/list");
        }
        return mv;
    }

    @RequestMapping("/reg")
    public ModelAndView addUser(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/reg");
        return mv;
    }

    @RequestMapping("/doReg")
    public ModelAndView doReg(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv=new ModelAndView();
        String name=request.getParameter("userName");
        String sex=request.getParameter("userSex");
        String pwd=request.getParameter("userPwd");
        User user=new User();
        user.setName(name);
        user.setSex(sex);
        user.setPassword(pwd);
        userService.register(user);
        mv.setViewName("/reg");
        response.sendRedirect(request.getContextPath() +"/user/login");
        return mv;
    }
}
