package club.wlqzz.controller;

import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;
import club.wlqzz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


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
        userService=new UserServiceImpl();
        if(userService.loginCheck(id,pwd)){
            System.out.println("登录成功！");
            mv.setViewName("/list");
        }
        return mv;
    }


    @RequestMapping(value="/getAllUser",method = RequestMethod.GET)
    public List<User> getUser() {
        return userService.getAllUsers();
    }
}
