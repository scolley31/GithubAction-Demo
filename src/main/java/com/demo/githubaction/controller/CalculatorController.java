package com.demo.githubaction.controller;

import com.demo.githubaction.dto.AddRequest;
import com.demo.githubaction.dto.AddResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/add")
    public ResponseEntity<AddResponse> createGame(@RequestBody AddRequest addRequest) {
        AddResponse addResponse = new AddResponse(CaculatorHelper.add(addRequest.getA(), addRequest.getB()));
        return ResponseEntity.ok(addResponse);
    }
}
