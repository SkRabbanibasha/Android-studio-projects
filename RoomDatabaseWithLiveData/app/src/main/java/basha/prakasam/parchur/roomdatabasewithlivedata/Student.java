package basha.prakasam.parchur.roomdatabasewithlivedata;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "AndroidStudents_1")
public class Student {
    String Name;

    String Mailid;

    String Mobilenumber;
    @PrimaryKey @NonNull
    String Rollnumber;

    public String getMailid() {
        return Mailid;
    }

    public String getMobilenumber() {
        return Mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        Mobilenumber = mobilenumber;
    }

    @NonNull
    public String getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(@NonNull String rollnumber) {
        Rollnumber = rollnumber;
    }

    public void setMailid(String mailid) {
        Mailid = mailid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
