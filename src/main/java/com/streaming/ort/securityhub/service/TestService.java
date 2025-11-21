package com.streaming.ort.securityhub.service;

import com.streaming.ort.securityhub.model.User;
import com.streaming.ort.securityhub.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repo;
    private User getUserInfo(){

        return User.builder().build();
    }
}
