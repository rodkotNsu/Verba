package com.example.lab1;

import java.time.LocalDateTime;

public class SettingLearning {
    private int countLearningWordsDay;

    static Pair<Word.StudyingStatus,Integer> settingStudyingStatusShort=
            new Pair<>(Word.StudyingStatus.SHORT_TERM_MEMORY,1);

    static Pair<Word.StudyingStatus,Integer> settingStudyingStatusRandom=
            new Pair<>(Word.StudyingStatus.RANDOM_ACCESS_MEMORY,7);

    static Pair<Word.StudyingStatus,Integer> settingStudyingStatusLong=
            new Pair<>(Word.StudyingStatus.LONG_TERM_MEMORY,30);

    public SettingLearning(int countLearningWordsDay,int dayForShort, int dayForRandom,int dayForLong) {
        this.countLearningWordsDay = countLearningWordsDay;
        settingStudyingStatusLong.setSecond(dayForLong);
        settingStudyingStatusShort.setSecond(dayForShort);
        settingStudyingStatusRandom.setSecond(dayForRandom);
    }
    static public LocalDateTime getDayForrepetition(Word.StudyingStatus StudyingStatus, LocalDateTime time){
        switch (StudyingStatus){
            case LONG_TERM_MEMORY:
             return  time.minusDays(settingStudyingStatusLong.getSecond());
            case SHORT_TERM_MEMORY:
                return time.minusDays(settingStudyingStatusShort.getSecond());
            case RANDOM_ACCESS_MEMORY:
                return time.minusDays(settingStudyingStatusRandom.getSecond());
        }
        return time;
    }

    public int getCountLearningWordsDay() {
        return countLearningWordsDay;
    }

    public void setCountLearningWordsDay(int countLearningWordsDay) {
        this.countLearningWordsDay = countLearningWordsDay;
    }
    public void setDaysForStudyingStatus(Word.StudyingStatus StudyingStatus, Integer countDays){
        switch (StudyingStatus){
            case LONG_TERM_MEMORY:
                settingStudyingStatusLong.setSecond(countDays);
            case SHORT_TERM_MEMORY:
                settingStudyingStatusShort.setSecond(countDays);
            case RANDOM_ACCESS_MEMORY:
                settingStudyingStatusRandom.setSecond(countDays);
        }
    }
}
