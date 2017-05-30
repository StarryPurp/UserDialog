package bstar128.example.hansung.userdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView textname,textemail;
    EditText editname,editemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button but=(Button)findViewById(R.id.but);
        but.setOnClickListener(this);
        textname=(TextView)findViewById(R.id.text_name);
        textemail=(TextView)findViewById(R.id.text_email);
    }

    @Override
    public void onClick(View v) {
        final View dlgV=View.inflate(this,R.layout.dialog,null);
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);//getApplicationContext도 가능
        dialog.setTitle("Input User Information.");
        dialog.setIcon(R.drawable.reaper1);
        dialog.setView(dlgV);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                editname=(EditText)dlgV.findViewById(R.id.edit_name);
                editemail=(EditText)dlgV.findViewById(R.id.edit_email);
                textname.setText(editname.getText());
                textemail.setText(editemail.getText());
            }
        });
        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast=new Toast(Main2Activity.this);
                View toastV=View.inflate(Main2Activity.this,R.layout.toast,null);
                TextView textToast=(TextView)toastV.findViewById(R.id.text_toast);
                textToast.setText("취소 되었습니다.");
                toast.setView(toastV);
                toast.show();
                //toast.setDuration(얼마동안 나타날지 수 적기);
            }
        });
        dialog.show();

    }
}
