package ru.safin.homework15.task01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class OperationsOnFile {

    private final static Logger logger = LogManager.getLogger(OperationsOnFile.class);

    public static void main(String[] args) throws IOException {

        logger.info("Приложение запущено");

        File dir = new File("files/");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Директория " + dir.getAbsolutePath() + " создана");
            logger.info("Директория: " + dir.getCanonicalPath() + " создана");
        }
        else {
            System.out.println("Директория была создана ранее");
            logger.info("Директория: " + dir.getCanonicalPath() + " была создана ранее");
        }

        File original = new File("files/newTest.txt");
        try {
            boolean create = original.createNewFile();
            if (create) {
                System.out.println("Файл " + original.getName() + " создан по пути " + original.getAbsolutePath());
                logger.info("Файл создан: " + original.getName());
            } else {
                System.out.println("Не удалось создать файл");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        File rename = new File("files/renameTest.txt");
        if (original.renameTo(rename)) {
            System.out.println("Файл " + original.getName() + " переименован на " + rename.getName());
            logger.info("Файл: " + original.getName() + " перименован: " + rename.getName());
        }

        File copy = new File("files/copyTest.txt");
        Files.copy(rename.toPath(), copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Файл " + rename.getName() + " скопирован в " + copy.getName());
        logger.info("Файл: " + rename.getName() + " скопирован: " + copy.getName());

        boolean deleted = rename.delete();
        if (deleted) {
            System.out.println("Файл " + rename.getName() + " удален");
            logger.info("Файл: " + rename.getName() + " удален: " + deleted);
        }
    }
}
