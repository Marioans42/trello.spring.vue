package com.taskagile.domain.application;

import com.taskagile.domain.application.commands.RegistrationCommand;
import com.taskagile.domain.model.user.RegistrationException;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * UserService
 */
public interface UserService extends UserDetailsService{

    void register(RegistrationCommand command) throws RegistrationException;
}