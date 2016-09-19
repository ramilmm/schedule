package mvc.repositories;

import mvc.common.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AdRepositoryCustom extends JpaRepository<Ad,Long> {

    List<Ad> findByDate(String Date);

    Ad findById(Long id);

    Ad findByType(String type);
}
