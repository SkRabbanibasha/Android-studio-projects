package basha.prakasam.parchur.roomdatabasewithlivedata;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyDataAdapter extends RecyclerView.Adapter<MyDataAdapter.DataViewHolder> {
    Context ct;
    List<Student> students;

    public MyDataAdapter(MainActivity mainActivity, List<Student> studentList) {
        ct=mainActivity;
        students = studentList;


    }

    @NonNull
    @Override
    public MyDataAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ct).inflate(R.layout.row_design,parent,false);
        return new DataViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDataAdapter.DataViewHolder holder, int position) {

       final Student list = students.get(position);
       holder.rrollnum.setText(list.getRollnumber());
       holder.rname.setText(list.getName());
       holder.rmobile.setText(list.getMobilenumber());
       holder.rmail.setText(list.getMailid());
       holder.delete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               MainActivity.database.mydao().delete(list);
           }
       });

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView rname,rmail,rmobile,rrollnum;
        ImageView delete;
        public DataViewHolder(@NonNull View itemView) {

            super(itemView);
            rname=itemView.findViewById(R.id.readname);
            rmail=itemView.findViewById(R.id.readmailid);
            rmobile=itemView.findViewById(R.id.readmobile);
            rrollnum=itemView.findViewById(R.id.readroll);
            delete=itemView.findViewById(R.id.delete);
        }
    }
}
