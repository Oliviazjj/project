package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.User;

public interface UserRepository {
    User findById(int id) throws DataAccessException;
    User login(String username, String password) throws DataAccessException;
    void save(User user) throws DataAccessException;
}
