package co.darkz.andoidphoneinfo;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;

import java.util.Locale;

/**
 * 系统工具类
 * Created by zhuwentao on 2016-07-18.
 */
public class SystemUtil {

    /**
     * 获取当前手机系统语言。
     *
     * @return 返回当前系统语言。例如：当前设置的是“中文-中国”，则返回“zh-CN”
     */
    public static String getSystemLanguage() {
        return Locale.getDefault().getLanguage();
    }

    /**
     * 获取当前系统上的语言列表(Locale列表)
     *
     * @return  语言列表
     */
    public static Locale[] getSystemLanguageList() {
        return Locale.getAvailableLocales();
    }

    /**
     * 获取当前手机系统版本号
     *
     * @return  系统版本号
     */
    public static String getSystemVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     * 获取手机型号
     *
     * @return  手机型号
     */
    public static String getSystemModel() {
        return android.os.Build.MODEL;
    }

    /**
     * 获取手机厂商
     *
     * @return  手机厂商
     */
    public static String getDeviceBrand() {
        return android.os.Build.BRAND;
    }

    /**
     * 获取手机IMEI(需要“android.permission.READ_PHONE_STATE”权限)
     *
     * @return  手机IMEI
     */
    public static String getIMEI(Context ctx) {
        TelephonyManager tm = (TelephonyManager) ctx.getSystemService(Activity.TELEPHONY_SERVICE);
        if (tm != null) {
            return tm.getDeviceId();
        }
        return "xxx";
    }
//
//    public static String getIMEI(final  Context ctx) {
////        context = new Context() getBaseContext();
//        final String strIMEI = new String();
//        AndPermission.with(ctx)
//                .runtime()
//                .permission(Permission.READ_PHONE_STATE).
//                onGranted(new Action<List<String>>() {
//                    @Override
//                    public void onAction(List<String> data) {
//                        TelephonyManager tm = (TelephonyManager) ctx.getSystemService(Activity.TELEPHONY_SERVICE);
//                        strIMEI =  tm.getDeviceId();
//                    }
//                }).onDenied(new Action<List<String>>() {
//                    @Override
//                    public void onAction(List<String> data) {
//                        strIMEI = "UNKNOWN";
//                    }
//                }).start();
//        return strIMEI;
//    }


    public static String getDeviceBOARD() {
        return android.os.Build.BOARD;
    }

    public static String getDeviceBOOTLOADER() {
        return android.os.Build.BOOTLOADER;
    }

    public static String getDeviceCPU_ABI() {
        return android.os.Build.CPU_ABI;
    }

    public static String getDeviceCPU_ABI2() {
        return android.os.Build.CPU_ABI2;
    }

    public static String getDeviceDEVICE() {
        return android.os.Build.DEVICE;
    }

    public static String getDeviceFINGERPRINT() {
        return android.os.Build.FINGERPRINT;
    }

    public static String getDeviceHARDWARE() {
        return android.os.Build.HARDWARE;
    }

    public static String getDeviceHOST() {
        return android.os.Build.HOST;
    }
    public static String getDeviceID() {
        return android.os.Build.ID;
    }
    public static String getDeviceMANUFACTURER() {
        return android.os.Build.MANUFACTURER;
    }
    public static String getDevicePRODUCT() {
        return android.os.Build.PRODUCT;
    }
    public static String getDeviceRADIO() {
        return android.os.Build.RADIO;
    }
    public static String getDeviceSERIAL() {
        return android.os.Build.SERIAL;
    }
    public static String getDeviceTAGS() {
        return android.os.Build.TAGS;
    }
    public static String getDeviceUSER() {
        return android.os.Build.USER;
    }

}
