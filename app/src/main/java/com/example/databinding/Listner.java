package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Listner {
    private Context context;

    public Listner(Context context){
        this.context=context;
    }

    public void onclicklistner(View view){
        Toast.makeText(context, "hello from click listner", Toast.LENGTH_SHORT).show();
    }
}
