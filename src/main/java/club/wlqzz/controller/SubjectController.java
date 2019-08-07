package club.wlqzz.controller;

import club.wlqzz.pojo.Subject;
import club.wlqzz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    private Subject subject;

    @RequestMapping(value="/addSubject",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView addSubject(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/addSubject");
        return mv;
    }

    @RequestMapping("/doAddS")
    public void doAddSubject(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title=request.getParameter("subName");
        Subject subject=new Subject();
        subject.setTitle(title);
        subjectService.addSubject(subject);
        response.sendRedirect(request.getContextPath()+"/list");
    }

    @RequestMapping("/updateSub")
    public ModelAndView updateSubject(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/updateSubject");
        return mv;
    }

    @RequestMapping("/doUpdateSub")
    public ModelAndView doUpdateSubject(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        int id=Integer.parseInt(request.getParameter("subId"));
        String newTitle=request.getParameter("subTitle");
        subject=new Subject();
        subject.setId(id);
        subject.setTitle(newTitle);
        subjectService.updateSubject(subject);
        mv.setViewName("/list");
        return mv;
    }

    @RequestMapping("/deleteSub")
    public ModelAndView deleteSubject(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/updateSubject");
        return mv;
    }

    @RequestMapping("/doDeleteSub")
    public ModelAndView doDeleteSubject(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ModelAndView mv=new ModelAndView();
        String title=request.getParameter("dTitle");
        subject=new Subject();
        subject.setTitle(title);
        subjectService.deleteSubject(subject);
        mv.setViewName("list");
        return mv;
    }
}
