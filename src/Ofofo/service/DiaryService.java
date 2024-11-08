package Ofofo.service;

import Ofofo.model.DiaryEntry;

import java.util.List;

public interface DiaryService {
    void addEntry(String title, String content);
    List<DiaryEntry> getAllEntries();
}