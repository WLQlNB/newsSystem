package club.wlqzz.service;

import club.wlqzz.pojo.Subject;

import java.util.List;

public interface SubjectService {
    void addSubject(Subject subject);
    void deleteSubject(Subject subject);
    public void updateSubject(Subject subject);
    Subject selectSubject(Subject subject);
    List<Subject>getAllSubjects();
}
