package ysu.com.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybut = (Button) super.findViewById(R.id.bt1);
        mybut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_LONG) //外部类，显示信息，显示时间
                        .show(); //显示吐司
            }
        });
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("对话框");
        dialog.setMessage("显示提示信息");
        dialog.setIcon(R.drawable.chaye);  //显示对话框图片
        dialog.create();
        dialog.show();

    }
}