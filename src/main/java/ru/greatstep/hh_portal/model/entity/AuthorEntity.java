package ru.greatstep.hh_portal.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "author",schema = "hh_db")
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {

    @Id
    private Long id;

    private String nickname;

}
