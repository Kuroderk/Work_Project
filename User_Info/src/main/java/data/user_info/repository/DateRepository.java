package data.user_info.repository;

import data.user_info.model.Datee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<Datee, Long> {
}
