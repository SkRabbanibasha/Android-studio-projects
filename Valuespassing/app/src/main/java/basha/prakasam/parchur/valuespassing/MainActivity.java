package basha.prakasam.parchur.valuespassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        Toast.makeText(this, "on create", LENGTH_SHORT).show();
        Log.i("lifecycle","oncreate");
    }

    public void submit(View view) {

        String fname=e1.getText().toString();
        String lname=e2.getText().toString();
        if(fname.equals("")||lname.equals("")){
            Toast.makeText(this,"fill all the fills", LENGTH_SHORT).show();
        }
        else{
            Intent intent= new Intent(this,MainActivity2.class);
            intent.putExtra("FNAME",fname);
            intent.putExtra("LNAME",lname);
            startActivity(intent);

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start", LENGTH_SHORT).show();
        Log.i("lifecycle","onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume", LENGTH_SHORT).show();
        Log.i("lifecycle","onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause", LENGTH_SHORT).show();
        Log.i("lifecycle","onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop", LENGTH_SHORT).show();
        Log.i("lifecycle","onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on restart", LENGTH_SHORT).show();
        Log.i("lifecycle","onrestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy", LENGTH_SHORT).show();
        Log.i("lifecycle","ondestroy");
    }
}
