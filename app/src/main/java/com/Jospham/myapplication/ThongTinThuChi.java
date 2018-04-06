package com.Jospham.myapplication;

import java.io.Serializable;

/**
 * Created by Hau Nguyen on 02-Apr-18.
 */

public class ThongTinThuChi implements Serializable {
    private String noidung;
    private String sotien;
    private boolean hinhthuc;

    public ThongTinThuChi() {
        this.noidung = noidung;
        this.sotien = sotien;
        this.hinhthuc = hinhthuc;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }

    public boolean isHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(boolean hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return "Nội dung: " + this.noidung + "\n" + "Số tiền: " + this.sotien + "\n" + "Hình thức: " + ((this.hinhthuc == true) ? "Thu" : "Chi") + "\n"+ "Ngày: 07/04/2018";
    }
}
