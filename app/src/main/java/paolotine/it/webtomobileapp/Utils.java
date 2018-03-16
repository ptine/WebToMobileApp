package paolotine.it.webtomobileapp;

import android.net.Uri;
import android.webkit.ValueCallback;

/**
 * Created by oloap on 16/03/2018.
 */

public class Utils {

    public final static int FILECHOOSER_RESULTCODE=1;
    public static final int INPUT_FILE_REQUEST_CODE = 1;

    private static ValueCallback<Uri> uploadMessage;
    private static Uri capturedImageURI = null;
    private static ValueCallback<Uri[]> filePathCallback;
    private static String cameraPhotoPath;

    public static ValueCallback<Uri> getUploadMessage() {
        return uploadMessage;
    }

    public static void setUploadMessage(ValueCallback<Uri> uploadMessage) {
        Utils.uploadMessage = uploadMessage;
    }

    public static Uri getCapturedImageURI() {
        return capturedImageURI;
    }

    public static void setCapturedImageURI(Uri capturedImageURI) {
        Utils.capturedImageURI = capturedImageURI;
    }

    public static ValueCallback<Uri[]> getFilePathCallback() {
        return filePathCallback;
    }

    public static void setFilePathCallback(ValueCallback<Uri[]> filePathCallback) {
        Utils.filePathCallback = filePathCallback;
    }

    public static String getCameraPhotoPath() {
        return cameraPhotoPath;
    }

    public static void setCameraPhotoPath(String cameraPhotoPath) {
        Utils.cameraPhotoPath = cameraPhotoPath;
    }
}
