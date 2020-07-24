package org.isi.grh.service.user;

import org.isi.grh.entity.CurrentUser;
import org.isi.grh.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
