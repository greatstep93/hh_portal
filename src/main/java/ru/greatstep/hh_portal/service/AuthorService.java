package ru.greatstep.hh_portal.service;

import reactor.core.publisher.Mono;
import ru.greatstep.hh_portal.model.entity.AuthorEntity;

public interface AuthorService {

    Mono<String> save(AuthorEntity authorEntity);
    Mono<String> delete(AuthorEntity authorEntity);
    Mono<String> update(AuthorEntity author);

}
