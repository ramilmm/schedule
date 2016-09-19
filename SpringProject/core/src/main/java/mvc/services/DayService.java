package mvc.services;

import mvc.common.Day;
import mvc.repositories.DayRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DayService {

    @Autowired
    private DayRepositoryCustom dayRepositoryCustom;


    @Transactional
    public void add(Day day){
        dayRepositoryCustom.saveAndFlush(day);
    }

    @Transactional
    public void update(Day day){
        dayRepositoryCustom.saveAndFlush(day);
    }

    @Transactional
    public void delete(Day day){
        dayRepositoryCustom.delete(day);
    }

    public Day getById(Long id){
        return dayRepositoryCustom.findById(id);
    }

    public Day getByDate(String date){
        return dayRepositoryCustom.findByDate(date);
    }

    public List<Day> getAll(){
        return dayRepositoryCustom.findAll();
    }
}
