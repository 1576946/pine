package com.pine.upload.service.Impl;

import com.pine.common.constant.ExceptionEnums;
import com.pine.common.exception.ZtlException;
import com.pine.upload.controller.UploadController;
import com.pine.upload.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UploadServiceImpl implements UploadService {
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");
    @Override
    public String upload(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                logger.info("上传失败，文件类型不匹配：{}", type);
                throw new ZtlException(ExceptionEnums.UPLOAD_FILE_TYPE_ERROR);
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                throw new ZtlException(ExceptionEnums.UPLOAD_FILE_ERROR);
            }
            // 2、保存图片
            // 2.1、生成保存目录
            File dir = new File("D:\\pine\\upload");//window 路径
            if (!dir.exists()) {
                dir.mkdirs();
            }
            // 2.2、保存图片
            file.transferTo(new File(dir, file.getOriginalFilename()));

            // 2.3、拼接图片地址
            String url = "http://image.pine.com/upload/" + file.getOriginalFilename();

            return url;
        } catch (Exception e) {
            throw new ZtlException(ExceptionEnums.UPLOAD_FILE_ERROR);
        }
    }
}
