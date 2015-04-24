package neforon.sunshine.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by sunshine on 4/22/15.
 */
public class FileUpload {

    public static String saveQRCodePic(MultipartFile file, String pathPrefix) {
        String PATH = "/material/qrcode";
        StringBuilder builder = new StringBuilder(pathPrefix);
        builder.append(PATH);
        File directory = new File(builder.toString());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
        String name = UUID.randomUUID().toString() + suffix;
        String completeName = directory + File.separator + name;
        File temp = new File(completeName);
        try {
            file.transferTo(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = temp.getPath().indexOf(PATH);
        return temp.getPath().substring(index);
    }

    public static String savePremiseView(MultipartFile file, String pathPrefix) {
        String PATH = "/material/buildview";
        StringBuilder builder = new StringBuilder(pathPrefix);
        builder.append(PATH);
        File directory = new File(builder.toString());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
        String name = UUID.randomUUID().toString() + suffix;
        String completeName = directory + File.separator + name;
        File temp = new File(completeName);
        try {
            file.transferTo(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = temp.getPath().indexOf(PATH);
        return temp.getPath().substring(index);
    }

    public static String saveHouseTypeView(MultipartFile file, String pathPrefix) {
        String PATH = "/material/type";
        StringBuilder builder = new StringBuilder(pathPrefix);
        builder.append(PATH);
        File directory = new File(builder.toString());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
        String name = UUID.randomUUID().toString() + suffix;
        String completeName = directory + File.separator + name;
        File temp = new File(completeName);
        try {
            file.transferTo(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = temp.getPath().indexOf(PATH);
        return temp.getPath().substring(index);
    }
}
