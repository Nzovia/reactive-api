package com.devnic.reactive_api.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author Nicholas Nzovia
 * @On 17/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

@Table(name = "tb_tutorials")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    @Id
    private Long id;
    private String title;
    private String description;
    private boolean isPublished;
}
