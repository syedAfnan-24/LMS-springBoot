package com.afnan.LibraryManagementSystem.Services;

import com.afnan.LibraryManagementSystem.Repository.BorrowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowService {
    @Autowired
    private BorrowRepo borrowRepo;
}
