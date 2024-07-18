package org.example.data_engineering_and_processing.service;

import lombok.RequiredArgsConstructor;
import org.example.data_engineering_and_processing.dto.AndroidDto;
import org.example.data_engineering_and_processing.entity.Android;
import org.example.data_engineering_and_processing.repository.AndroidRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AndroidServiceimpl implements AndroidService{

    private final AndroidRepository androidRepository;

    @Override
    public ResponseEntity<String> create(AndroidDto androidDto) {

        androidRepository.save(mapToAndroid(androidDto));
        return new ResponseEntity<>("android created", HttpStatus.CREATED);
    }

    private Android mapToAndroid(AndroidDto androidDto){
        Android android = new Android();
        android.setName(androidDto.getName());
        android.setModel(androidDto.getModel());
        return android;
    }
}
