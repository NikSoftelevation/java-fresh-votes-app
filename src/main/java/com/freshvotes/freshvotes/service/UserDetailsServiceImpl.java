package com.freshvotes.freshvotes.service;

//import com.freshvotes.freshvotes.config.CustomSecurityUser;

import com.freshvotes.freshvotes.config.CustomSecurityUser;
import com.freshvotes.freshvotes.domain.User;
import com.freshvotes.freshvotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null)
            throw new UsernameNotFoundException("Invalid Username and password");
        return new CustomSecurityUser(user);
    }
}
