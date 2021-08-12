package ir.psoft.psoftlayoutlib.helper;

/**
 * Created by pouyadark on 2/27/19.
 */

public class FileHelper {
    public static String convertByteToSize(long bytes){
        String[] types = {"kb", "Mb", "GB", "TB", "PB", "EB"};
        int unit = 1024;
        if (bytes < unit) return bytes + "bytes";
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        return String.format("%.1f ", bytes / Math.pow(unit, exp)) + types[exp - 1];
    }
}
