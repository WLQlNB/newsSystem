package club.wlqzz.controller;

import club.wlqzz.pojo.User;
import club.wlqzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

/* @Autowired
  public UserController(UserService userService) {
        this.userService=userService;
    }

    @RequestMapping(value="getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser() {
        return userService.getAllUsers();
    }*/
}
