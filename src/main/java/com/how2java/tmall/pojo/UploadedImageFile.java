package com.how2java.tmall.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author tyc
 * @date 2019/1/14
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
