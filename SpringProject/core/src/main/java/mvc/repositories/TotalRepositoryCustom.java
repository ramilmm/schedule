package mvc.repositories;

import mvc.common.Total;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TotalRepositoryCustom extends JpaRepository<Total,Long> {

    Total findById(Long id);

    Total findByMonth(String month);

}
