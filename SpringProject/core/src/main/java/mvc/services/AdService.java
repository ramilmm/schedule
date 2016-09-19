package mvc.services;

import mvc.common.Ad;
import mvc.repositories.AdRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdService {

    @Autowired
    AdRepositoryCustom adRepositoryCustom;

    @Transactional
    public void add(Ad ad){
        adRepositoryCustom.saveAndFlush(ad);
    }

    @Transactional
    public void update(Ad ad){
        adRepositoryCustom.saveAndFlush(ad);
    }

    @Transactional
    public void delete(Ad ad){
        adRepositoryCustom.delete(ad);
    }

    @Transactional
    public void deleteById(Long id){
        adRepositoryCustom.delete(adRepositoryCustom.findById(id));
    }

    public Ad getById(Long id){
        return adRepositoryCustom.findById(id);
    }

    public List<Ad> getByDate(String Date){
        return adRepositoryCustom.findByDate(Date);
    }

    public Ad getByType(String type){
        return adRepositoryCustom.findByType(type);
    }

    public List<Ad> getAll(){
        return adRepositoryCustom.findAll();
    }

}
