package com.cutebaby.bmi;
//快速鍵，區域變數變成屬性→ctrl+alt+f
//快速鍵，整行往上→shift+alt+上鍵
//快速鍵，顯示提示→ctrl+p
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edWeight;
    private EditText edHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }
    public void bmi(View view){
        Log.d("MainActivity","bmi");
//        最耗費時 →findViewById
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Log.d("MainActivity",w+"/"+h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity",bmi+"");
//        一定要打show才會顯示
        Toast.makeText(this,"Your  Bmi  is  "+bmi,Toast.LENGTH_LONG).show();

    }

}
