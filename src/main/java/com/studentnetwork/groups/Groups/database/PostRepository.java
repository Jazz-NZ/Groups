package com.studentnetwork.groups.Groups.database;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<PostDB,Integer> {

    List<PostDB> findAllByGroupId(int groupId);
}
