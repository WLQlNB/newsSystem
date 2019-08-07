package club.wlqzz.service.impl;

import club.wlqzz.dao.SubjectMapper;
import club.wlqzz.pojo.Subject;
import club.wlqzz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;

    public void addSubject(Subject subject) {
        subjectMapper.addSubject(subject);
    }

    public void deleteSubject(Subject subject) {
        subjectMapper.deleteSubject(subject);
    }

    public void updateSubject(Subject subject) {
        subjectMapper.updateSubject(subject);
    }

    public Subject selectSubject(Subject subject) {
        return subjectMapper.selectSubject(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectMapper.getAllSubjects();
    }
}
