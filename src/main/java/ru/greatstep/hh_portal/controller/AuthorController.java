package ru.greatstep.hh_portal.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.greatstep.hh_portal.model.entity.AuthorEntity;
import ru.greatstep.hh_portal.service.AuthorService;

@RestController
@RequestMapping("author")
@AllArgsConstructor
public class AuthorController {
    private final AuthorService service;

    @PostMapping("save")
    public ResponseEntity<Mono<String>> saveAuthor(@RequestBody AuthorEntity authorEntity) {
        return ResponseEntity.ok(service.save(authorEntity));
    }
    @PutMapping
    public ResponseEntity<Mono<String>> updateAuthor(@RequestBody AuthorEntity author) {
        return ResponseEntity.ok(service.update(author));
    }

    @DeleteMapping("delete")
    public ResponseEntity<Mono<String>> deleteAuthor(@RequestBody AuthorEntity authorEntity) {
        return ResponseEntity.ok(service.delete(authorEntity));
    }
}
