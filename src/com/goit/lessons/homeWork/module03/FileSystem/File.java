package com.goit.lessons.homeWork.module03.FileSystem;

public class File {
    private String fileType;
    private String name;
    private String fileExtension;

    public File(String fileType, String name, String fileExtension){
        this.fileType = fileType;
        this.name = name;
        this.fileExtension = fileExtension;
    }

    public String getFileType() {
        return fileType;
    }

    public String getName() {
        return name;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
