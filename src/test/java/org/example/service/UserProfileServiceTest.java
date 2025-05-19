package org.example.service;

import org.example.api.EmailValidatorClient;
import org.example.model.UserProfile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserProfileServiceTest {

    @Mock
    EmailValidatorClient validator; //Mocking external API

    @InjectMocks
    UserProfileService service; //Injecting mock into service 1

    @Test
    void registerUser_validEmail_success() throws IllegalAccessException {
        when(validator.isValid("test@example.com")).thenReturn(true);

        UserProfile result = service.registerUser("John", "test@example.com");

        assertEquals("John", result.getName());
        assertEquals("test@example.com", result.getEmail());
    }
}
