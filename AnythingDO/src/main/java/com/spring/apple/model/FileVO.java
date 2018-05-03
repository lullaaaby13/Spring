package com.spring.apple.model;

import org.springframework.web.multipart.MultipartFile;

public class FileVO {
	private MultipartFile imgFile;
	 
    public MultipartFile getImgFile() {
        return imgFile;
    }
 
    public void setImgFile(MultipartFile imgFile) {
        this.imgFile = imgFile;
    }


}
