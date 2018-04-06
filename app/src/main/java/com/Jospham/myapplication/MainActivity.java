package com.Jospham.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

/**
 * Created by Jospham on 04-Apr-18.
 */

public class MainActivity extends AppCompatActivity {

    ArrayList<ThongTinThuChi> thongTinThuChis;
    ListView listView;
    MyArrayAdapter myArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thongTinThuChis = new ArrayList<>();

        listView = (ListView) findViewById(R.id.lvListView);
        myArrayAdapter = new MyArrayAdapter(
                MainActivity.this,
                R.layout.activity_customlistview,
                thongTinThuChis);
        listView.setAdapter(myArrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mnThemMoi) {
            startActivityForResult(new Intent(MainActivity.this, Activity_2.class), 1);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK && data != null){
            ArrayList<ThongTinThuChi> arr = (ArrayList<ThongTinThuChi>) data.getSerializableExtra("data");
            for (int i=0; i<arr.size(); i++) {
                thongTinThuChis.add(arr.get(i));
            }
            myArrayAdapter.notifyDataSetChanged();
        }
    }
}
