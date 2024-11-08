package Ofofo.repository;

import Ofofo.model.DiaryEntry;

import java.util.List;

public interface DiaryRepository {
    void addEntry(DiaryEntry diaryEntry);

    List<DiaryEntry> getAllEntries();
}