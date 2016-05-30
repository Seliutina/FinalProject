package com.goit.lessons.homeWork.module03.FileSystem;

import java.util.List;

/**
 * Created by Оксана on 30.05.2016.
 */
public class Directory {
    private List<AudioFile> audioFileFiles;
    private List<ImageFile> imageFiles;
    private List<TextFile> textFiles;

    public List<AudioFile> getAudioFileFiles() {
        return audioFileFiles;
    }

    public void setAudioFileFiles(List<AudioFile> audioFileFiles) {
        this.audioFileFiles = audioFileFiles;
    }

    public List<ImageFile> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<ImageFile> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setTextFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }
}
