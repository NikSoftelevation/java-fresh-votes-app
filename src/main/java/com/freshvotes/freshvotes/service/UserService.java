package com.freshvotes.freshvotes.service;

import com.freshvotes.freshvotes.domain.User;

public interface UserService {
    /**
     * @param user
     * @return
     */
    public User saveUser(User user);
}
