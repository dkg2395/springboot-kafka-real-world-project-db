package com.durgesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
