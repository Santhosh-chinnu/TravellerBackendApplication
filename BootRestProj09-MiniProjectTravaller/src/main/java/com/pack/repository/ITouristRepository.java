package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Tourist;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

}
