package com.example.kuis_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Gunawan", "Bapak", R.drawable.bapak));
        keluargaArrayList.add(new Keluarga("Yulianik Sunaryati", "Ibuk",  R.drawable.ibuk));
        keluargaArrayList.add(new Keluarga("Khisan Ihza Wahyu Rifaldi", "Anak Ke-1",  R.drawable.khisan));
        keluargaArrayList.add(new Keluarga("Syahir Andhika Aryasuta", "Anak Ke-2",  R.drawable.dhika));
    }
}
