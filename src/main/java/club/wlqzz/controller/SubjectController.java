package club.wlqzz.controller;

import club.wlqzz.pojo.Subject;
import club.wlqzz.service.SubjectService;
import club.wlqzz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    private SubjectService subjectService;

    public SubjectController(SubjectService subjectService){
        this.subjectService=subjectService;
    }

    @RequestMapping(value="addSubject",method = RequestMethod.GET)
    @ResponseBody
    public void addSubject(Subject subject){
        subjectService.addSubject(subject);
        return ;
    }

}
