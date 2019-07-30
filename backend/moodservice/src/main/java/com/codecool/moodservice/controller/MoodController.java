package com.codecool.moodservice.controller;

import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/randomizer")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @GetMapping("/random-choice")
    public ScreenFun getRandomItem() {
        return this.moodService.getRandomItem();
    }

    @PostMapping("/questionnaire")
    public void evaluateQuestionnaire() {

    }


}
