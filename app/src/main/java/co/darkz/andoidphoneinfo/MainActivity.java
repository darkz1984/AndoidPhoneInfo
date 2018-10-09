package co.darkz.andoidphoneinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;

import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private ListView phone_info_lv = (ListView) findViewById(R.id.hardware_info);
//    ListView phone_info_lv = (ListView) findViewById(R.id.hardware_info);
//    String[] phone_info = showSystemParameter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<string> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, data);
//        ListView hardware_info = (ListView) findViewById(R.id.hardware_info);
//        hardware_info.setAdapter(adapter);

        try {
//            ListView phone_info_lv = (ListView) findViewById(R.id.hardware_info);
//            String[] phone_info = showSystemParameter();

//            for (String phone_info_item : phone_info) {
//                Log.e("phone_info==========", phone_info_item);
//            }
//            HashMap<String, String> Phone_Build_Info = co.darkz.andoidphoneinfo.PhoneBuildInfo.getPhoneBuildInfo();
//            int i=7;
//            for(Map.Entry<String, String> entry_item: Phone_Build_Info.entrySet()){
////                Log.e("device InFO", entry_item.getKey()+":"+entry_item.getValue());
//                phone_info[i] = entry_item.getKey()+":"+entry_item.getValue();
//                i=i+1;
//            }
            ListView phone_info_lv = findViewById(R.id.hardware_info);
            String[] phone_info = showSystemParameter();

//           注意这里的adapter的写法。。。
//            setContentView(R.layout.activity_main);
//            https://blog.csdn.net/lyz_zyx/article/details/52910739
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, phone_info);
//            phone_info_lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.activity_list_item, R.id.hardware_info, phone_info));
            phone_info_lv.setAdapter(adapter);
        }
        catch(Exception e){
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private String[] showSystemParameter() {
        final String[] phoneInfo = new String[20]; // 为了调试增加长度
        String TAG = "系统参数：";
//        Log.e(TAG, "手机厂商：" + SystemUtil.getDeviceBrand());
//        Log.e(TAG, "手机型号：" + SystemUtil.getSystemModel());
//        Log.e(TAG, "手机当前系统语言：" + SystemUtil.getSystemLanguage());
//        Log.e(TAG, "Android系统版本号：" + SystemUtil.getSystemVersion());
//        Log.e(TAG, "手机IMEI：" + SystemUtil.getIMEI(getApplicationContext()));
        phoneInfo[0]="手机厂商：" + SystemUtil.getDeviceBrand();
        phoneInfo[1]="手机型号：" + SystemUtil.getSystemModel();
        phoneInfo[2]="手机当前系统语言：" + SystemUtil.getSystemLanguage();
        phoneInfo[3]="Android系统版本号：" + SystemUtil.getSystemVersion();
        phoneInfo[4]="BOARD：" + SystemUtil.getDeviceBOARD();
        phoneInfo[5]="BOOTLOADER：" + SystemUtil.getDeviceBOOTLOADER();
        phoneInfo[6]="CPU_ABI：" + SystemUtil.getDeviceCPU_ABI();
        phoneInfo[7]="CPU_ABI2：" + SystemUtil.getDeviceCPU_ABI2();
        phoneInfo[8]="DEVICE：" + SystemUtil.getDeviceDEVICE();
        phoneInfo[9]="FINGERPRINT：" + SystemUtil.getDeviceFINGERPRINT();
        phoneInfo[10]="HARDWARE：" + SystemUtil.getDeviceHARDWARE();
        phoneInfo[11]="HOST：" + SystemUtil.getDeviceHOST();
        phoneInfo[12]="ID：" + SystemUtil.getDeviceID();
        phoneInfo[13]="MANUFACTURER：" + SystemUtil.getDeviceMANUFACTURER();
        phoneInfo[14]="PRODUCT：" + SystemUtil.getDevicePRODUCT();
        phoneInfo[15]="RADIO：" + SystemUtil.getDeviceRADIO();
        phoneInfo[16]="SERIAL：" + SystemUtil.getDeviceSERIAL();
        phoneInfo[17]="TAGS：" + SystemUtil.getDeviceTAGS();
        phoneInfo[18]="USER：" + SystemUtil.getDeviceUSER();

        AndPermission.with(this)
                .runtime()
                .permission(Permission.READ_PHONE_STATE).
                onGranted(new Action<List<String>>() {
                    @Override
                    public void onAction(List<String> data) {
                        phoneInfo[19]="IMEI：" + SystemUtil.getIMEI(getApplicationContext());
                    }
                }).onDenied(new Action<List<String>>() {
            @Override
            public void onAction(List<String> data) {
                    phoneInfo[19]="IMEI：" + "没有权限获取";
                    Toast.makeText(MainActivity.this, "Unable to get imei", Toast.LENGTH_LONG).show();
            }
        }).start();
        return phoneInfo;
    }
}


