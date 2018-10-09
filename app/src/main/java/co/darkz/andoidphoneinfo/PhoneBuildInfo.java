package co.darkz.andoidphoneinfo;

import android.os.Build;

import java.util.HashMap;

public class PhoneBuildInfo {
    public static HashMap getPhoneBuildInfo(){
        HashMap<String, String> PhoneBuild = new HashMap<>();
//        for (String item_name: android.os.Build){
//            Log.e("Device Info", item_name + Build.BOARD);
//        }
        PhoneBuild.put("BOARD", Build.BOARD);
        PhoneBuild.put("BOOTLOADER", Build.BOOTLOADER);
        PhoneBuild.put("BRAND", Build.BRAND);
        PhoneBuild.put("CPU_ABI", Build.CPU_ABI);
        PhoneBuild.put("CPU_ABI2", Build.CPU_ABI2);
        PhoneBuild.put("DEVICE", Build.DEVICE);
        PhoneBuild.put("DISPLAY", Build.DISPLAY);
        PhoneBuild.put("FINGERPRINT", Build.FINGERPRINT);
        PhoneBuild.put("HARDWARE", Build.HARDWARE);
        PhoneBuild.put("HOST", Build.HOST);
        PhoneBuild.put("ID", Build.ID);
        PhoneBuild.put("MANUFACTURER", Build.MANUFACTURER);
        PhoneBuild.put("MODEL", Build.MODEL);
        PhoneBuild.put("PRODUCT", Build.PRODUCT);
        PhoneBuild.put("RADIO", Build.RADIO);
        PhoneBuild.put("SERIAL", Build.SERIAL);
        PhoneBuild.put("TAGS", Build.TAGS);
//        PhoneBuild.put("Build", Build.TIME);
        PhoneBuild.put("USER", Build.USER);

        return PhoneBuild;
    }
}
