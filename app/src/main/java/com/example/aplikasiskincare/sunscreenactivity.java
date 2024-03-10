package com.example.aplikasiskincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sunscreenactivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunscreenactivity);

        ImageView imgsunscreen01 = findViewById(R.id.imgsunscreen01);
        ImageView imgsunscreen02 = findViewById(R.id.imgsunscreen02);
        ImageView imgsunscreen03 = findViewById(R.id.imgsunscreen03);
        ImageView imgsunscreen04 = findViewById(R.id.imgsunscreen04);
        ImageView imgsunscreen05 = findViewById(R.id.imgsunscreen05);

        Button btnsunscreen01 = findViewById(R.id.btnsunscreen01);
        Button btnsunscreen02 = findViewById(R.id.btnsunscreen02);
        Button btnsunscreen03 = findViewById(R.id.btnsunscreen03);
        Button btnsunscreen04 = findViewById(R.id.btnsunscreen04);
        Button btnsunscreen05 = findViewById(R.id.btnsunscreen05);

        imgsunscreen01.setOnClickListener(this);
        imgsunscreen02.setOnClickListener(this);
        imgsunscreen03.setOnClickListener(this);
        imgsunscreen04.setOnClickListener(this);
        imgsunscreen05.setOnClickListener(this);

        btnsunscreen01.setOnClickListener(this);
        btnsunscreen02.setOnClickListener(this);
        btnsunscreen03.setOnClickListener(this);
        btnsunscreen04.setOnClickListener(this);
        btnsunscreen05.setOnClickListener(this);

    }

    Info info = new Info();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgsunscreen01 || v.getId() == R.id.btnsunscreen01){
            info.setNama("Nama : Skin Aqua UV Moisture Milk 40 g\n");
            info.setHarga("Harga : Rp55.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Skin Aqua UV Moisture Milk 40g SPF 50+. PA +++ untuk perlindungan ganda terhadap UV-A dan UV-B. Improved Hyaluronic Acid (AcHA)** dan Collagen yang melembabkan, melembutkan kulit dan mempertahankan elastisitas kulit Mengandung VItamin B5 dan E yang menutrisi kulit. Dapat digunakan sebagai dasar make up. Untuk perlindungan lebih lama Terdaftar BPOM Konsistensi yang sangat berair memungkinkan untuk berbaur sangat mudah Tanpa pewangi dan oil free Dapat digunakan sebagai pelembab setelah pembersihan, produk 2 in 1 yang bisa di pakai sebagai pelembab & Sunscreen Dapat digunakan sebagai primer / base make up Ukuran botol benar-benar nyaman untuk di bawa keluar\n");
            info.setGambar("sunscreen01");
            intent = new Intent(sunscreenactivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgsunscreen02 || v.getId() == R.id.btnsunscreen02) {
            info.setNama("Nama : Vaseline Tone Up Sun Cream 40 SPF/PA++ 50 ml\n");
            info.setHarga("Harga : Rp160.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Jenis sunscreen ini mengandung SPF 40 PA+++ yang tentunya bisa melindungi kulit dari dampak negatif paparan sinar matahari.\n" +
                    "\n" +
                    "Selain itu, Vaseline Sun Cream ini juga bisa membuat kulit terasa lembap dan tampak sehat. Bukan itu saja, product recommendation yang satu ini juga memberikan efek kulit yang lebih cerah. \n");
            info.setGambar("sunscreen02");
            intent = new Intent(sunscreenactivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgsunscreen03 || v.getId() == R.id.btnsunscreen03) {
            info.setNama("Nama : Emina Sun Battle SPF 45 PA+++ 30 ml\n");
            info.setHarga("Harga : Rp53.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("unscreen yang ini mengandung SPF 45 PA+++ yang mampu melindungi kulit dari paparan sinar UV. Tak hanya itu, Emina Sun Battle memiliki tekstur yang ringan dan juga cepat meresap. \n" +
                    "\n" +
                    "Dengan grape leaf extract di dalamnya, sunscreen ini bisa melindungi kulit dari polusi. \n" +
                    "\n" +
                    "Cukup oleskan di area wajah dan leher 15 menit sebelum pergi keluar rumah dan aplikasikan ulang setelah 2 jam pemakaian. \n");
            info.setGambar("sunscreen03");
            intent = new Intent(sunscreenactivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgsunscreen04 || v.getId() == R.id.btnsunscreen04) {
            info.setNama("Nama : Biore UV Aqua Rich\n");
            info.setHarga("Harga : Rp158.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("memiliki SPF 50PA Aqua Micro Capsule. Kandungan ini dapat menyegarkan dan melindungi kulit dari sinar UV yang berbahaya. Sunscreen ini juga bisa melembapkan kulit  sepanjang hari serta memiliki wangi yang tahan lama. \n" +
                    "\n" +
                    "Kamu tak perlu khawatir akan sunscreen yang terasa berat, karena Biore UV Aqua Rich Watery Essence Spf50 Sunscreen sifatnya ringan di kulit, tidak lengket, dan mudah menyerap. \n" +
                    "\n" +
                    "Untuk pemakaiannya, Oleskan  sunscreen secara merata pada wajah dan leher sebelum kamu melakukan aktivitas di luar ruangan saat pagi atau siang hari. \n");
            info.setGambar("sunscreen04");
            intent = new Intent(sunscreenactivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgsunscreen05 || v.getId() == R.id.btnsunscreen05) {
            info.setNama("Wardah UV Shield Gel Sunscreen Serum SPF 35 PA+++\n");
            info.setHarga("Harga : Rp30.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Sunscreen ini memiliki broad spectrum protection yang 50 kali lebih optimal menjaga kulit dari sinar UV A/UV B, dan paparan blue light yang berlebihan. \n" +
                    "\n" +
                    "Walaupun 0% alkohol, Wardah UV Shield Active Protection Serum SPF 50 PA tetap ringan dan tidak lengket. Sunscreen ini juga waterproof, jadi kamu tidak perlu khawatir akan luntur meski terkena air dan keringat. \n");
            info.setGambar("sunscreen05");
            intent = new Intent(sunscreenactivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        }
    }

}