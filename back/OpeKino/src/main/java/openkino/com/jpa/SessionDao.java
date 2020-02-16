package openkino.com.jpa;

import openkino.com.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface SessionDao extends JpaRepository<Session, Long> {
    List<Session> findAllByFilm_Id(Long id_film);

    @Query(value = "select s.start from Session as s where s.id = :id")
    LocalDateTime getBeginSession(@Param("id") Long id);

    @Query(value = "select s from Session as s join s.hall as h where h.id = :id")
    List<Session> getAllSession(@Param("id") Long id);

    Session findSessionByHall_Id(Long id_hall);
}
