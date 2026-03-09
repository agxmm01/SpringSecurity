package com.agam.SpringSecEx.Service;

import com.agam.SpringSecEx.Entity.UserEntity;
import com.agam.SpringSecEx.Entity.UserPrincipal;
import com.agam.SpringSecEx.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailService implements UserDetailsService {
    private final UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = repository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found for username: " + username);
        }

        return new UserPrincipal(user);
    }
}
