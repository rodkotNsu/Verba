package com.example.lab1;

import android.net.Uri;

import java.util.List;

public class Word {

    enum StudyingStatus{
        RANDOM_ACCESS_MEMORY,
        SHORT_TERM_MEMORY,
        LONG_TERM_MEMORY
    }
    private final int ID_WORD;
    private final int ID_VOCABULARY;
    private String word;
    private String transcription;
    private StudyingStatus StudyingStatus;
    private List<String> translations;
    private List<String> synonyms;
    private List<String> examples;
    private int countRepetition;

    private Uri uriOfpicture;
    private Uri uriOfsound;

    public Word(int ID_WORD, int ID_VOCABULARY, String word, String transcription,Uri uriOfpicture) {
        this.ID_WORD = ID_WORD;
        this.ID_VOCABULARY = ID_VOCABULARY;
        this.word = word;
        this.transcription = transcription;
        this.uriOfpicture = uriOfpicture;
        this.countRepetition=0;
        this.StudyingStatus=StudyingStatus.RANDOM_ACCESS_MEMORY;
    }

    public Word(int ID_WORD, int ID_VOCABULARY, String word, String transcription, List<String> translations, List<String> synonyms, List<String> examples, Uri uriOfpicture, Uri uriOfsound) {
        this.ID_WORD = ID_WORD;
        this.ID_VOCABULARY = ID_VOCABULARY;

        this.word = word;
        this.transcription = transcription;
        this.translations = translations;
        this.synonyms = synonyms;
        this.examples = examples;

        this.uriOfpicture = uriOfpicture;
        this.uriOfsound = uriOfsound;

        this.countRepetition=0;
        this.StudyingStatus=StudyingStatus.RANDOM_ACCESS_MEMORY;
    }

    public Word(int ID_WORD, int ID_VOCABULARY, String word, String transcription, StudyingStatus StudyingStatus, List<String> translations, List<String> synonyms, List<String> examples, int countRepetition, Uri uriOfpicture, Uri uriOfsound) {
        this.ID_WORD = ID_WORD;
        this.ID_VOCABULARY = ID_VOCABULARY;
        this.word = word;
        this.transcription = transcription;
        this.StudyingStatus = StudyingStatus;
        this.translations = translations;
        this.synonyms = synonyms;
        this.examples = examples;
        this.countRepetition = countRepetition;
        this.uriOfpicture = uriOfpicture;
        this.uriOfsound = uriOfsound;
    }

    public int getID_WORD() {
        return ID_WORD;
    }

    public int getID_VOCABULARY() {
        return ID_VOCABULARY;
    }

    public int getCountRepetition() {
        return countRepetition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public StudyingStatus getStudyingStatus() {
        return StudyingStatus;
    }

    public void setStudyingStatus(StudyingStatus StudyingStatus) {
        this.StudyingStatus = StudyingStatus;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public void setTranslations(List<String> translations) {
        this.translations = translations;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getExamples() {
        return examples;
    }

    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    public Uri getUriOfpicture() {
        return uriOfpicture;
    }

    public void setUriOfpicture(Uri uriOfpicture) {
        this.uriOfpicture = uriOfpicture;
    }

    public Uri getUriOfsound() {
        return uriOfsound;
    }

    public void setUriOfsound(Uri uriOfsound) {
        this.uriOfsound = uriOfsound;
    }
}
