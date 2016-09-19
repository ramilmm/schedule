package mvc.services;

import mvc.common.Total;
import mvc.repositories.TotalRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TotalService {

    @Autowired
    private TotalRepositoryCustom totalRepositoryCustom;

    @Transactional
    public void add(Total total){
        totalRepositoryCustom.saveAndFlush(total);
    }

    @Transactional
    public void delete(Total total){
        totalRepositoryCustom.delete(total);
    }

    public Total getByMonth(String month){
        return totalRepositoryCustom.findByMonth(month);
    }

    public Total getById(Long id){
        return totalRepositoryCustom.findById(id);
    }

    public List<Total> getAll(){
        return totalRepositoryCustom.findAll();
    }


}
