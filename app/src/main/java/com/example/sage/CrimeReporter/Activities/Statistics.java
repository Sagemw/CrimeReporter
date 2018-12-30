package com.example.sage.CrimeReporter.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sage.CrimeReporter.Model.ReportingModel;
import com.example.sage.CrimeReporter.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Statistics extends AppCompatActivity {

    private TextView totalCrimeReported;

    private DatabaseReference crimeRef;

    private int totalCrimeReport;

   Button displayStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        totalCrimeReported = findViewById(R.id.tvNoCrime);
        displayStats = findViewById(R.id.btn_display);


        crimeRef = FirebaseDatabase.getInstance().getReference().child("Crime Report");

        crimeRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                totalCrimeReport =0;

                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    ReportingModel model = ds.getValue(ReportingModel.class);


                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        displayStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SceneNo",""+ totalCrimeReport);
                totalCrimeReported.setText(""+ totalCrimeReport);


            }
        });
    }

}
