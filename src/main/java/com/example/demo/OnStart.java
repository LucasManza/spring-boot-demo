package com.example.demo;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class OnStart {

    private final UserRepository userRepository;

    @Autowired
    public OnStart(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        try {
            // users
            UserModel user1 = userRepository.save(new UserModel("Lucas", "Manzanelli"));

        } catch (Exception ignored) {
        }
    }

}
