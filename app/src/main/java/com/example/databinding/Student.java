package com.example.databinding;

import android.util.Log;
import android.widget.Toast;

public class Student {
    private String name;
    public int id;
    private boolean enable;

    public Student(String name, int id, boolean enable) {
        this.name = name;
        this.id = id;
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void print(){
        Log.d("Stundet","hello"+this.name);
    }
}
