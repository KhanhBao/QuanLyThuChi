package com.Jospham.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Activity_2 extends Activity {
    ArrayList<ThongTinThuChi> arr;

    Button btnThem;
    Button btnNhapLai;
    Button btnHienThi;
    EditText edtNoiDung;
    EditText edtSoTien;
    RadioGroup rbtnGroup;
    RadioButton rbtnThu;
    RadioButton rbtnChi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        arr=new ArrayList<>();

        btnThem = (Button) findViewById(R.id.btn_Add);
        btnNhapLai = (Button) findViewById(R.id.btn_ReEdit);
        btnHienThi = (Button) findViewById(R.id.btn_Show);
        edtNoiDung = (EditText) findViewById(R.id.edt_Infor);
        edtSoTien = (EditText) findViewById(R.id.edt_Money);
        rbtnThu = (RadioButton) findViewById(R.id.rbtn_Add);
        rbtnChi = (RadioButton) findViewById(R.id.rbtn_Mois);
        rbtnGroup = (RadioGroup) findViewById(R.id.rbtnGroup);


        btnThem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Them();
            }
        });
        btnNhapLai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                edtNoiDung.setText("");
                edtSoTien.setText("");
                edtNoiDung.requestFocus();
            }
        });

        btnHienThi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent();
                intent.putExtra("data", arr);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
        public void Them(){
            String noidung = edtNoiDung.getText()+"";
            String sotien = edtSoTien.getText()+"";
            boolean hinhthuc = false;
            if(rbtnGroup.getCheckedRadioButtonId()== R.id.rbtn_Add) {
                hinhthuc = true;
            }
            ThongTinThuChi thongTinThuChi = new ThongTinThuChi();
            thongTinThuChi.setNoidung(noidung);
            thongTinThuChi.setSotien(sotien);
            thongTinThuChi.setHinhthuc(hinhthuc);
            arr.add(thongTinThuChi);

        }

    }
