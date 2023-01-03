package ru.greatstep.hh_portal.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.greatstep.hh_portal.model.dto.fields.AuthorDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAuthorDto {
    private AuthorDto authorDto;
}
