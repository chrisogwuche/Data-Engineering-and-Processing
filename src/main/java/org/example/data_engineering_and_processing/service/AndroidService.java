package org.example.data_engineering_and_processing.service;

import org.example.data_engineering_and_processing.dto.AndroidDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AndroidService {

    ResponseEntity<String> create(AndroidDto androidDto);
}
