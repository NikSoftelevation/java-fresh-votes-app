package com.freshvotes.freshvotes.service.impl;

import com.freshvotes.freshvotes.domain.Authority;
import com.freshvotes.freshvotes.domain.User;
import com.freshvotes.freshvotes.repository.UserRepository;
import com.freshvotes.freshvotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User user) {
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        Authority authority = new Authority();
        authority.setAuthority("ROLE_USER");
        authority.setUser(user);
        user.getAuthorities().add(authority);
        return userRepository.save(user);
    }
}
