package basha.prakasam.parchur.sharedpeferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.name);
        et2=findViewById(R.id.mailid);
        et3=findViewById(R.id.password);
        preferences=getPreferences(MODE_PRIVATE);
        if (preferences!=null){
            String name = preferences.getString("n","No Data Found");
            String mail= preferences.getString("m","No Data Found");
            String pass=preferences.getString("p","No Data Found");
            et1.setText(name);
            et2.setText(mail);
            et3.setText(pass);

        }
       


    }

    public void save(View view) {
        String name=et1.getText().toString();
        String mail=et2.getText().toString();
        String pass=et3.getText().toString();
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("n",name);
        editor.putString("m",mail);
        editor.putString("p",pass);
        editor.apply();
        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();


    }
}