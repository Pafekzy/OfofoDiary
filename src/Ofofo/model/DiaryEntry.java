package Ofofo.model;

import java.time.LocalDateTime;

public class DiaryEntry {
    private String title;
    private String content;
    private LocalDateTime date;

    public DiaryEntry(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }
}