package com.afnan.LibraryManagementSystem.Services;

import com.afnan.LibraryManagementSystem.Repository.ReturnsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnService {
    @Autowired
    private ReturnsRepo returnsRepo;
}
