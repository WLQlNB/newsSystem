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

    @Override
    public void addSubject(Subject subject) {
        subjectMapper.addSubject(subject);
    }

    @Override
    public void deleSubject(Subject subject) {
        subjectMapper.deleSubject(subject);
    }

    @Override
    public void updateSubject(Subject subject) {
        subjectMapper.updateSubject(subject);
    }

    @Override
    public Subject selectSubject(Subject subject) {
        return subjectMapper.selectSubject(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectMapper.getAllSubjects();
    }
}
