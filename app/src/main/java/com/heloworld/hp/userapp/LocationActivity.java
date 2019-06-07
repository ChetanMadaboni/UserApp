package com.heloworld.hp.userapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LocationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
    public void process(View view){
        Intent intent = null,chooser=null;
        if(view.getId()==R.id.trackbus){
            intent=new Intent(intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:17.3078127,78.5166668"));
            chooser=Intent.createChooser(intent,"Launch_Maps");
            startActivity(chooser);
        }

    }
}
