package com.aranya.mall.tiny.service;

import com.qiniu.common.QiniuException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface IQiniuService {
    /**
     * 以MultipartFile的形式上传
     * @param uploadFile
     * @return
     * @throws QiniuException
     * @throws IOException
     */
    String uploadFile(MultipartFile uploadFile) throws QiniuException, IOException;
    /**
     * 以文件的形式上传
     * @param file
     * @param fileName
     * @return
     * @throws QiniuException
     */
    String uploadFile(File file,String fileName) throws QiniuException;

    /**
     * 以流的形式上传
     * @param inputStream
     * @param fileName
     * @return
     * @throws QiniuException
     */
    String uploadFile(InputStream inputStream, String fileName) throws QiniuException;

    /**
     * 删除文件
     * @param key
     * @return
     * @throws QiniuException
     */
    String delete(String key) throws QiniuException;

}
