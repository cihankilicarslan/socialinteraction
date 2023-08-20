package com.social.interaction.services;

import com.social.interaction.entities.User;
import com.social.interaction.entities.UserProfile;
import com.social.interaction.repository.UserProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Transactional
    public void updateUserProfileWithLogin(User user) {
        UserProfile userProfile = user.getUserProfile();
        if (userProfile != null) {
            userProfile.setFirstName(user.getUsername());
            userProfile.setEmailAdress(user.getEmail());


            userProfileRepository.save(userProfile);
        }
    }
}