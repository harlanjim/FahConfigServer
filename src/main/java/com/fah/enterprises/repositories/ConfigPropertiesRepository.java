package com.fah.enterprises.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fah.enterprises.models.ConfigProperties;

public interface ConfigPropertiesRepository extends JpaRepository<ConfigProperties, Integer> {
}
