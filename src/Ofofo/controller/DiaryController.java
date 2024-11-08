package Ofofo.controller;

import Ofofo.service.DiaryService;
import Ofofo.model.DiaryEntry;

import java.util.List;

public class DiaryController {
    private DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    public void addEntry(String title, String content) {
        diaryService.addEntry(title, content);
    }

    public List<DiaryEntry> getAllEntries() {
        return diaryService.getAllEntries();
    }
}