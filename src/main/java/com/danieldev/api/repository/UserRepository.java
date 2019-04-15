package com.danieldev.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.danieldev.api.model.User;

@Repository
@RepositoryRestResource(collectionResourceRel = "users", path = "usuarios")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
