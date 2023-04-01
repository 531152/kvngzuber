package com.ericpark.sandbox.repository;

import com.ericpark.sandbox.api.model.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuffRepository extends JpaRepository<Stuff, String> {

}
