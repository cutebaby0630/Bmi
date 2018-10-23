package com.cutebaby.bmi;
//快速鍵，區域變數變成屬性→ctrl+alt+f
//快速鍵，整行往上→shift+alt+上鍵
//快速鍵，顯示提示→ctrl+p
//快速鍵，寫出interface中的規範→alt+enter
//快速鍵，刪除一行→ctrl+x
//快速鍵，讓已寫的程式變成方法→ctrl+alt+m(Refactoralt→Methods)
//快速鍵，切換視窗→ctrl+e
//快速鍵，直接commit→ctrl+ ~
//快速鍵，抽出String→alt+enter

import android.content.DialogInterface;
import android.content.Intent;
import android.os.strictmode.CleartextNetworkViolation;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
       private EditText edWeight;
       private EditText edHeight;
       private Button help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","OnClick : help");
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(R.string.bmi_infro)
                        .setPositiveButton(R.string.ok,null)
                        .show();
            }
        });
    }

    public void bmi(View view){
        Log.d("MainActivity","bmi");
//        最耗費時間→findViewById
//        取得輸入方塊元件，取得輸入文字
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
//        持行中印出讀取值+改成浮點數
        Log.d("MainActivity",w+"/"+h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        //        印出運算中的bmi值
        Log.d("MainActivity",bmi+"");

        Intent intent = new Intent(this,ResultActivity.class);
        startActivity(intent);
//        一定要打show才會顯示
//        Toast.makeText(this,getString(R.string.your_bmi_is)+bmi,Toast.LENGTH_LONG).show();
//      設定對話框中的文字
//        new AlertDialog.Builder(this).setMessage(getString(R.string.your_bmi_is)+bmi)
//        設定對話框中的標題
//                .setTitle(R.string.bmi)
//    設定一個button關掉對話框，並且執行onClick中的指令
//                .setPositiveButton(R.string.ok,null)
//                .setNegativeButton(R.string.clear, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        edWeight.setText("");
//                        edHeight.setText("");
//                    }
//                })
//
//        .show();
    }

}
