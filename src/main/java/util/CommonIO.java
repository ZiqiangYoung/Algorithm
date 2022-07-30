package util;

import java.io.IOException;
import java.io.InputStream;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/23</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class CommonIO {
    public static String readResourceAsString(String resourcePath) {
        try (InputStream inputStream = CommonIO.class.getResourceAsStream(resourcePath)) {
            assert inputStream != null;
            return new String(inputStream.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
