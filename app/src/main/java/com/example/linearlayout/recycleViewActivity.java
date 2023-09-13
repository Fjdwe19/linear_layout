package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.linearlayout.adapter.MahasiswaAdapter;
import com.example.linearlayout.models.Mahasiswa;

import java.util.ArrayList;

public class recycleViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        getSupportActionBar().setTitle("Recycle View");

        addData();

        recyclerView = findViewById(R.id.recycle_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(recycleViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Fajar Dwi Firmansyah", "E41220021", "09865327868"));
        mahasiswaArrayList.add(new Mahasiswa("Mutiara", "E41220021", "0883267863876"));
        mahasiswaArrayList.add(new Mahasiswa("Setia nanda", "E41220021", "08673187913"));
        mahasiswaArrayList.add(new Mahasiswa("Anggi nur", "E41220021", "086256762512"));
        mahasiswaArrayList.add(new Mahasiswa("Fajar Dwi Firmansyah", "E41220021", "09865327868"));
        mahasiswaArrayList.add(new Mahasiswa("Mutiara", "E41220021", "0883267863876"));
        mahasiswaArrayList.add(new Mahasiswa("Setia nanda", "E41220021", "08673187913"));
        mahasiswaArrayList.add(new Mahasiswa("Anggi nur", "E41220021", "086256762512"));
        mahasiswaArrayList.add(new Mahasiswa("Fajar Dwi Firmansyah", "E41220021", "09865327868"));
        mahasiswaArrayList.add(new Mahasiswa("Mutiara", "E41220021", "0883267863876"));
        mahasiswaArrayList.add(new Mahasiswa("Setia nanda", "E41220021", "08673187913"));
        mahasiswaArrayList.add(new Mahasiswa("Anggi nur", "E41220021", "086256762512"));
    }
}