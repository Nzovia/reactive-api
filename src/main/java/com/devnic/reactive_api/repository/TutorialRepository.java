package com.devnic.reactive_api.repository;

import com.devnic.reactive_api.models.Tutorial;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nicholas Nzovia
 * @On 17/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */
@Repository
public interface TutorialRepository extends R2dbcRepository<Tutorial,Long> {
}
