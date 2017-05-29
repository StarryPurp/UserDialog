package bstar128.example.hansung.userdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button but=(Button)findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        View dlgV=View.inflate(this,R.layout.dialog,null);
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);//getApplicationContext도 가능
        dialog.setTitle("Input User Information.");
        dialog.setIcon(R.drawable.reaper1);
        dialog.setView(dlgV);
        dialog.setPositiveButton("OK",null);
        dialog.setNegativeButton("CANCEL",null);
        dialog.show();

    }
}
