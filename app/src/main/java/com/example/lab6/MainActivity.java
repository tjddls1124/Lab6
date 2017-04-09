package com.example.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Matzip> matzip_list = new ArrayList<>();
    int count;
    int REQUEST_MSG_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        Matzip matzip = new Matzip("","",0,"","","","","",0);

        intent.putExtra("msg_matzip_data",matzip);

        startActivityForResult(intent,REQUEST_MSG_CODE);
    }
    public void setListView(){
        listView = (ListView)findViewById(R.id.listview);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_MSG_CODE)
        {
            if(resultCode == RESULT_OK){
                matzip_list.add();
            }

        }
    }
}
