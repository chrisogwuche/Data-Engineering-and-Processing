package org.example.data_engineering_and_processing.controller;

import lombok.RequiredArgsConstructor;
import org.example.data_engineering_and_processing.dto.AndroidDto;
import org.example.data_engineering_and_processing.service.AndroidService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AndroidController {

    private final AndroidService androidService;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody AndroidDto androidDto){
        return androidService.create(androidDto);
    }

}
