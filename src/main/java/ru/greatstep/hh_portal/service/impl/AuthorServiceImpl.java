package ru.greatstep.hh_portal.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.greatstep.hh_portal.model.entity.AuthorEntity;
import ru.greatstep.hh_portal.repository.AuthorRepository;
import ru.greatstep.hh_portal.service.AuthorService;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository repo;
    @Override
    public Mono<String> save(AuthorEntity authorEntity) {
        return repo.save(authorEntity)
                .flatMap(authorEntity1 -> Mono.just(authorEntity1.getNickname() + " saved"));
    }
    @Override
    public Mono<String> delete(AuthorEntity authorEntity) {
        return repo.delete(authorEntity)
                .thenReturn(authorEntity.getNickname() + " deleted");
    }
    @Override
    public Mono<String> update(AuthorEntity author) {
        return repo.updateById(author.getNickname(), author.getId())
                .thenReturn(author.getNickname() + " updated");
    }
}
