package basha.prakasam.parchur.roomdatabasewithlivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {
    EditText sname,sroll,smobile,smail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        sname=findViewById(R.id.stu_name);
        smobile=findViewById(R.id.stu_mobilenum);
        sroll=findViewById(R.id.rollnum);
        smail=findViewById(R.id.stu_mailid);

    }

    public void save(View view) {
        String name=sname.getText().toString();
        String mobile=smobile.getText().toString();
        String roll=sroll.getText().toString();
        String mail=smail.getText().toString();
        Student student=new Student();
        student.setName(name);
        student.setMailid(mail);
        student.setRollnumber(roll);
        student.setMobilenumber(mobile);
        MainActivity.database.mydao().insert(student);
        finish();





    }
}