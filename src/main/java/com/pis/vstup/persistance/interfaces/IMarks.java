package com.pis.vstup.persistance.interfaces;

import com.pis.vstup.persistance.entities.Marks;

import java.util.List;
import java.util.Optional;

public interface IMarks {

    List<Marks> findAll();

    List<Marks> findByMath(Integer math);

    List<Marks> findByEnglish(Integer english);

    List<Marks> findByPhysics(Integer physics);

    Optional<Marks> findById(Integer marksID);

    Marks save(Marks marks);

    void deleteById(Integer marksID);

}
