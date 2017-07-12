package com.adida.aka.remoteserviceunboundsend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdtNumA, mEdtNumB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEdtNumA = (EditText) findViewById(R.id.edt_num_a);
        mEdtNumB = (EditText) findViewById(R.id.edt_num_b);
    }

    public void sum(View view) {
        Intent intent = new Intent();
        intent.setClassName(Def.PACKAGE_CONTEXT_APP_RECEIVE, Def.SERVICE_CLASS_APP_RECEIVE);
        intent.putExtra(Def.KEY_A, mEdtNumA.getText().toString());
        intent.putExtra(Def.KEY_B, mEdtNumB.getText().toString());
        startService(intent);
    }
}
