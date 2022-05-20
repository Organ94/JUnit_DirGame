
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

public class CreatingFilesTest {

    String pathDir = "D://Alexey/JavaCore/DirGames_JUnit/test";
    String pathFile = "D://Alexey/JavaCore/DirGames_JUnit/test/test.txt";
//    String pathFile = "D://Alexey/JavaCore/DirGames_JUnit/test/test";

    @Test
    @DisplayName("Тест на успешное создание каталога")
    public void successCreateDir() {
        CreatingFiles creatingFiles = new CreatingFilesImpl();

        var creatingDir = creatingFiles.createDir(pathDir);
        Assertions.assertNotNull(creatingDir);
    }

    @Test
    @DisplayName("Тест на успешное создание файла")
    public void successCreateFile() {
        CreatingFiles creatingFiles = new CreatingFilesImpl();
        var creatingDir = creatingFiles.createDir(pathDir);
        Assertions.assertNotNull(creatingDir);
        var cretingFile = creatingFiles.createFile(pathFile);
        Assertions.assertNotNull(cretingFile);
    }

    @Test
    @DisplayName("Тест на успешную запись файла")
    public void successwriteToTheFile() {
        CreatingFiles creatingFiles = new CreatingFilesImpl();
        var creatingDir = creatingFiles.createDir(pathDir);
        var cretingFile = creatingFiles.createFile(pathFile);
        var writeToTheFileTest = creatingFiles.writeToTheFile(new File(pathFile));
    }
}
