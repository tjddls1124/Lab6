package com.example.lab6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/**
 * Created by 최웅순 on 2017-04-06.
 */

public class Matzip implements Parcelable {
    private String name;
    private String call_num;
    private String menu_kind;
    private String menu1;
    private String menu2;
    private String menu3;
    private String homepage;
    private String enroll_date;
    private int category_num;


    public Matzip(String name, String call_num, int menu_kind, String menu1, String menu2, String menu3, String homepage, String enroll_date, int category_num) {
        this.name = name;
        this.call_num = call_num;
        if (menu_kind == 1) this.menu_kind = "치킨";
        else if (menu_kind == 2) this.menu_kind = "피자";
        else if (menu_kind == 3) this.menu_kind = "햄버거";
        else this.menu_kind = "입력된 메뉴 종류가 없습니다";
        this.homepage = homepage;
        this.enroll_date = enroll_date;
        this.category_num = category_num;

    }

    protected Matzip(Parcel in) {
        name = in.readString();
        call_num = in.readString();
        menu_kind = in.readString();
        menu1 = in.readString();
        menu2 = in.readString();
        menu3 = in.readString();
        homepage = in.readString();
        enroll_date = in.readString();
        category_num = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(call_num);
        dest.writeString(menu_kind);
        dest.writeString(menu1);
        dest.writeString(menu2);
        dest.writeString(menu3);
        dest.writeString(homepage);
        dest.writeString(enroll_date);
        dest.writeInt(category_num);

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Matzip> CREATOR = new Creator<Matzip>() {
        @Override
        public Matzip createFromParcel(Parcel source) {
            return new Matzip(source);
        }

        @Override
        public Matzip[] newArray(int size) {
            return new Matzip[size];
        }


    };
}