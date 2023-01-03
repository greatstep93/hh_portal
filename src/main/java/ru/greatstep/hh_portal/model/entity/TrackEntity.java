package ru.greatstep.hh_portal.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "track", schema = "hh_db")
@NoArgsConstructor
@AllArgsConstructor
public class TrackEntity {
    @Id
    private Long id;
    private String title;
    private String album;
    private Long authorId;
}
