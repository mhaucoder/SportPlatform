package com.sportplatform.repository;

import com.sportplatform.common.BaseRepository;
import com.sportplatform.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
}
