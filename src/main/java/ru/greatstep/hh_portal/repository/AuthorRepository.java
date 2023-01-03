package ru.greatstep.hh_portal.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ru.greatstep.hh_portal.model.entity.AuthorEntity;

@Repository
public interface AuthorRepository extends R2dbcRepository<AuthorEntity, Long> {

    @Query("UPDATE hh_db.hh_db.author SET nickname = :nickname WHERE author.id = :id")
    Mono<Void> updateById(String newNickname, Long id);

    @Query("""
            with del as (select * from hh_db.hh_db.author
            left join hh_db.hh_db.track on author.id = track.author)
            delete from del where nickname = :nickName
            """)
    Mono<Void> deleteAuthorAndTracks(String nickName);
}
