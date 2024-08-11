package com.example.kampusku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class DashboardActivity extends AppCompatActivity {

    private TextView tvNama;
    private Button btnLihatData, btnInputData, btnInformasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        View ivProfile = findViewById(R.id.iv_profile);
        tvNama = findViewById(R.id.tv_nama);
        btnLihatData = findViewById(R.id.btn_lihat_data);
        btnInputData = findViewById(R.id.btn_input_data);
        btnInformasi = findViewById(R.id.btn_informasi);

        // Contoh pengisian nama pengguna (ganti dengan data dari database)
        tvNama.setText("John Doe");

        // Event listener untuk setiap button (akan diimplementasikan sesuai kebutuhan)
        btnLihatData.setOnClickListener(view -> {
            // Implementasi ketika tombol "LIHAT DATA" ditekan
        });

        btnInputData.setOnClickListener(view -> {
            // Implementasi ketika tombol "INPUT DATA" ditekan
        });

        btnInformasi.setOnClickListener(view -> {
            // Implementasi ketika tombol "INFORMASI" ditekan
        });
    }
}
