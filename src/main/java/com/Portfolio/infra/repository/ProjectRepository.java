package com.Portfolio.infra.repository;

import com.Portfolio.domain.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
