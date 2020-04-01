package com.pis.vstup.persistance.repositories;

import com.pis.vstup.persistance.entities.Marks;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MarksRepository extends CrudRepository<Marks, Integer> {

    List<Marks> findByEnglish(Integer english);
    List<Marks> findByMath(Integer math);
    List<Marks> findByPhysics(Integer physics);

}
