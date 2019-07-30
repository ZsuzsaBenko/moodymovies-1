package com.codecool.moodservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questionnaire {

    private int masochist;
    private int partOfDay;
    private int gender;
    private int watchingAlone;
    private Mood mood;
    private Genre genre;
    private Horoscope horoscope;

}