package edu.system.serve.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUpload {
    private MultipartFile file;

    @Autowired
    Environment environment;

    public FileUpload(MultipartFile file) {
        this.file = file;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String upload() {
        // 文件名
        String fileName = file.getOriginalFilename();
        // 后缀
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 文件保存路径
        String filePath = "D:\\壁纸\\";
        fileName = UUID.randomUUID() + suffixName;
        File finalFile = new File(filePath + fileName);
        if (!finalFile.getParentFile().exists()) {
            // 创建文件夹
            finalFile.getParentFile().mkdirs();
        }
        try {
            file.transferTo(finalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回虚拟路径
        return "http://localhost:8080/api/v1/avatar/images/" + fileName;
    }
}
