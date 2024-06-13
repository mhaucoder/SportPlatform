package com.sportplatform.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
    List<T> findByIdIn(List<ID> ids);
    List<T> findByCreatedAtBetween(LocalDateTime startTime, LocalDateTime endTime);
    List<T> findByUpdatedAtBetween(LocalDateTime startTime, LocalDateTime endTime);
    List<T> findByDeletedAtBetween(LocalDateTime startTime, LocalDateTime endTime);
}
