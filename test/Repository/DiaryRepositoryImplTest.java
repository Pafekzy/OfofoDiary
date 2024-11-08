package Repository;

import Ofofo.model.DiaryEntry;
import Ofofo.repository.DiaryRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {
    private DiaryRepositoryImpl diaryRepository;

    @BeforeEach
    public void setup() {
        diaryRepository = new DiaryRepositoryImpl();
    }

    @Test
    public void testAddAndGetAllEntries() {
        // Arrange
        DiaryEntry entry1 = new DiaryEntry("Entry 1", "Content for entry 1");
        DiaryEntry entry2 = new DiaryEntry("Entry 2", "Content for entry 2");

        // Act
        diaryRepository.addEntry(entry1);
        diaryRepository.addEntry(entry2);

        // Assert
        List<DiaryEntry> entries = diaryRepository.getAllEntries();
        assertEquals(2, entries.size());
        assertEquals("Entry 1", entries.get(0).getTitle());
        assertEquals("Entry 2", entries.get(1).getTitle());
    }
}