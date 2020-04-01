package com.pis.vstup.persistance.springdata;

import com.pis.vstup.persistance.entities.Marks;
import com.pis.vstup.persistance.interfaces.IMarks;
import com.pis.vstup.persistance.repositories.MarksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("MarksService")
@Transactional
@AllArgsConstructor
public class MarksImpl implements IMarks {

    private final MarksRepository marksRepository;

    @Override
    public List<Marks> findAll() {
        return (List<Marks>) marksRepository.findAll();
    }

    @Override
    public List<Marks> findByMath(Integer math) {
        return marksRepository.findByMath(math);
    }

    @Override
    public List<Marks> findByEnglish(Integer english) {
        return marksRepository.findByEnglish(english);
    }

    @Override
    public List<Marks> findByPhysics(Integer physics) {
        return marksRepository.findByPhysics(physics);
    }

    @Override
    public Optional<Marks> findById(Integer marksID) {
        return marksRepository.findById(marksID);
    }

    @Override
    public Marks save(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public void deleteById(Integer marksID) {
        marksRepository.deleteById(marksID);
    }

}
