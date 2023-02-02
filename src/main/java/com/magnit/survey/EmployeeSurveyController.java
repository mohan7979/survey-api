package com.magnit.survey;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/surveys")
@RequiredArgsConstructor
@Slf4j
public class EmployeeSurveyController {

    private final EmployeeSurveyRepository employeeSurveyRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<EmployeeSurvey> createSurvey(@RequestBody EmployeeSurvey employeeSurvey) {
        log.info("creating new survey {}", employeeSurvey);
        EmployeeSurvey survey = employeeSurveyRepository.save(employeeSurvey);
        return new ResponseEntity<>(survey, HttpStatus.CREATED);
    }
}
