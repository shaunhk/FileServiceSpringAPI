package com.codeclan.homework.FileService.components;

import com.codeclan.homework.FileService.enums.FileExtension;
import com.codeclan.homework.FileService.models.File;
import com.codeclan.homework.FileService.models.Folder;
import com.codeclan.homework.FileService.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.homework.FileService.repositories.FileRepository;
import com.codeclan.homework.FileService.repositories.FolderRepository;
import com.codeclan.homework.FileService.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User dragon = new User("Dragon");
        userRepository.save(dragon);

        Folder folder1 = new Folder("Hcker tlz", dragon);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Jurnal entries", dragon);
        folderRepository.save(folder2);

        File file1 = new File("SQL deleter", FileExtension.rb, 6, folder1);
        fileRepository.save(file1);

        File file2 = new File("Nasty message", FileExtension.txt, 22, folder1);
        fileRepository.save(file2);

        File file3 = new File("Talked to a girl", FileExtension.txt, 100, folder2);
        fileRepository.save(file3);

        File file4 = new File("How I feel", FileExtension.java, 46, folder2);
        fileRepository.save(file4);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);
        folder2.addFile(file3);
        folder2.addFile(file4);
        folderRepository.save(folder2);
        dragon.addFolders(folder1);
        dragon.addFolders(folder2);
        userRepository.save(dragon);
    }
}
