package basha.prakasam.parchur.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;
    String text="Writing programs (or programming) is a very creative \n" +
            "and rewarding activity.  You can write programs for \n" +
            "many reasons, ranging from making your living to solving\n" +
            "102 a difficult data analysis problem to having fun to helping 1829\n" +
            "someone else solve a problem.  This book assumes that \n" +
            "everyone needs to know how to program, and that once \n" +
            "you know how to program you will figure out what you want \n" +
            "to do with your newfound skills.  \n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void notification(View view) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("basha","sana parveen",NotificationManager.IMPORTANCE_HIGH);
            channel.enableLights(true);
            channel.enableVibration(true);
            manager.createNotificationChannel(channel);

        }
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"basha");
        builder.setContentTitle("Rabbani Basha");
        builder.setContentText("Hi!,i am  rabbani basha");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        Intent i=new Intent(this,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivity(this,45,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        builder.addAction(R.drawable.ic_baseline_delete_24,"Delete",pi);
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(text));


       Notification notification = builder.build();
       manager.notify(45,notification);
    }
}