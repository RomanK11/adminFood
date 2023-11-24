package com.wf.admin.repositories;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.wf.admin.models.Baker;
import com.wf.admin.models.Salat;

public interface BakerRepository extends CrudRepository<Baker, Long> {
    @Query("SELECT * FROM BAKERS WHERE id = :id")
    Iterable<Baker> searchById(@Param("id") Long id);
    
}
