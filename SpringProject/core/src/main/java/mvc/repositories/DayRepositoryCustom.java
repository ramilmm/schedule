package mvc.repositories;


import mvc.common.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepositoryCustom extends JpaRepository<Day,Long> {

    Day findByDate(String date);

    Day findById(Long id);

}
