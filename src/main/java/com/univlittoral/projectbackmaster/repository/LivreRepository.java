package com.univlittoral.projectbackmaster.repository;

import com.univlittoral.projectbackmaster.entity.LivreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Long> {
    @Query(value="SELECT * FROM livre  WHERE genre = :param order by nom ASC", nativeQuery=true)
    public List<LivreEntity> findAllByGenre(@Param("param") String param);
}
