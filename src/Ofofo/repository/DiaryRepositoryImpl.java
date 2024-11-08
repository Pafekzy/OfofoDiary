package Ofofo.repository;

import Ofofo.model.DiaryEntry;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<DiaryEntry> diaryEntries;

    public DiaryRepositoryImpl() {
        diaryEntries = new ArrayList<>();
    }

    @Override
    public void addEntry(DiaryEntry diaryEntry) {
        diaryEntries.add(diaryEntry);
    }

    @Override
    public List<DiaryEntry> getAllEntries() {
        return diaryEntries;
    }
}