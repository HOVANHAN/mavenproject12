package org.example.service;

import org.example.api.EmailValidatorClient;
import org.example.model.UserProfile;

public class UserProfileService {
    private final EmailValidatorClient validator;

    public UserProfileService(EmailValidatorClient validator) {
        this.validator = validator;
    }


    public UserProfile registerUser(String name, String email) throws IllegalAccessException {
        if(email == null || name == null)
            throw new IllegalAccessException("Name or email cannot be null");
        if(!validator.isValid(email))
            throw new IllegalAccessException("Invalid email");
        return new UserProfile(name,email);
    }
}
