package com.project.fitness.controller;

import com.project.fitness.model.Recommendation;
import com.project.fitness.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
public class RecommendationController {
    private final RecommendationService recommendationService;

    @PostMapping("/generate")
    public ResponseEntity<Recommendation> generateRecommendation(@ResponseBody RecommendationRequest request){
        return ResponseEntity.ok(recommendationService.generateRecommendation(request));
    }



    @GetMapping("/user/{userId}")


    @GetMapping("/activity/{activityId")

}
