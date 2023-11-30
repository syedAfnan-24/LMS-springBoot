package com.afnan.LibraryManagementSystem.Services;

import com.afnan.LibraryManagementSystem.Repository.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    @Autowired
    private RequestRepo requestRepo;
}
