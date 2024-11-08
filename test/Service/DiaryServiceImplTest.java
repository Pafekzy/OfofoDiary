package Service;

import Ofofo.model.DiaryEntry;
import Ofofo.repository.DiaryRepositoryImpl;
import Ofofo.service.DiaryServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class DiaryServiceImplTest {
    private DiaryServiceImpl diaryService;

    @BeforeEach
    public void setup() {
        diaryService = new DiaryServiceImpl(new DiaryRepositoryImpl());
    }

    @Test
    public void testAddAndGetAllEntries() {
        // Arrange
        String title = "My First Entry";
        String content = "This is the content of my first diary entry.";

        // Act
        diaryService.addEntry(title, content);

        // Assert
        List<DiaryEntry> entries = diaryService.getAllEntries();
        DiaryEntry retrievedEntry = entries.get(0);
        assertEquals(title, retrievedEntry.getTitle());
        assertEquals(content, retrievedEntry.getContent());
        assertNotNull(retrievedEntry.getDate());
        assertEquals(1, entries.size());
    }
}