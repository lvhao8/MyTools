package test.lvhao.com.mytools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vondear.rxtools.RxTool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxTool.init(this);
    }
}
