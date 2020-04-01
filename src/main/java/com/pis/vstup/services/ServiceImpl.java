package com.pis.vstup.services;

import com.pis.vstup.persistance.entities.Marks;
import com.pis.vstup.persistance.entities.Rating;
import com.pis.vstup.persistance.entities.Users;
import com.pis.vstup.persistance.interfaces.IMarks;
import com.pis.vstup.persistance.interfaces.IRating;
import com.pis.vstup.persistance.interfaces.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class ServiceImpl {

    private IUsers iUsers;
    private IMarks iMarks;
    private IRating iRating;

    public Users createUser(Users users){ return iUsers.save(users);}


    @Transactional(readOnly = true)
    public List<Rating> getRating(){return iRating.findAllSort();}

    public void addMarksAndRating(Integer userID, Marks marks){
        Users user = iUsers.findById(userID).orElseThrow();
        marks.setUser(user);
        iMarks.save(marks);
        Rating rating = new Rating();
        rating.setUser(user);
        double k;
        k = (marks.getEnglish() + marks.getMath() + marks.getPhysics());
        rating.setRating((double) k/3);
        iRating.save(rating);
    }


}
