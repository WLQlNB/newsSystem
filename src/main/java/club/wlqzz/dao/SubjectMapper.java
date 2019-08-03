package club.wlqzz.dao;

import club.wlqzz.pojo.Subject;

import java.util.List;

public interface SubjectMapper {
    void addSubject(Subject subject);
    void deleSubject(Subject subject);
    void updateSubject(Subject subject);
    Subject selectSubject(Subject subject);
    List<Subject> getAllSubjects();
}
