package Ofofo.service;

import Ofofo.model.DiaryEntry;
import Ofofo.repository.DiaryRepository;

import java.util.List;

public class DiaryServiceImpl implements DiaryService {
    private DiaryRepository diaryRepository;

    public DiaryServiceImpl(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    @Override
    public void addEntry(String title, String content) {
        DiaryEntry newEntry = new DiaryEntry(title, content);
        diaryRepository.addEntry(newEntry);
    }

    @Override
    public List<DiaryEntry> getAllEntries() {
        return diaryRepository.getAllEntries();
    }
}