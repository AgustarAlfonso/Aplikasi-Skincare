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

public class toneractivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toneractivity);

        ImageView imgtoner01 = findViewById(R.id.imgtoner01);
        ImageView imgtoner02 = findViewById(R.id.imgtoner02);
        ImageView imgtoner03 = findViewById(R.id.imgtoner03);
        ImageView imgtoner04 = findViewById(R.id.imgtoner04);
        ImageView imgtoner05 = findViewById(R.id.imgtoner05);

        Button btntoner01 = findViewById(R.id.btntoner01);
        Button btntoner02 = findViewById(R.id.btntoner02);
        Button btntoner03 = findViewById(R.id.btntoner03);
        Button btntoner04 = findViewById(R.id.btntoner04);
        Button btntoner05 = findViewById(R.id.btntoner05);

        imgtoner01.setOnClickListener(this);
        imgtoner02.setOnClickListener(this);
        imgtoner03.setOnClickListener(this);
        imgtoner04.setOnClickListener(this);
        imgtoner05.setOnClickListener(this);

        btntoner01.setOnClickListener(this);
        btntoner02.setOnClickListener(this);
        btntoner03.setOnClickListener(this);
        btntoner04.setOnClickListener(this);
        btntoner05.setOnClickListener(this);

    }

    Info info = new Info();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgtoner01 || v.getId() == R.id.btntoner01){
            info.setNama("Nama : Cosrx Aha/Bha Clarifying Treatment Toner 150 ml\n");
            info.setHarga("Harga : Rp140.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("osrx Aha/Bha Clarifying Treatment Toner merupakan pembersih kulit wajah yang mengandung AHA/BHA, bahan-bahan natural dan air mineral. Kandungan AHA/BHA pada produk hydrating toner ini membantu menghilangkan sel-sel kulit mati sehingga membuat kulit menjadi lebih halus. \n" +
                    "\n" +
                    "Sementara itu, dan kandungan air mineral dan vitamin dalam produk perawatan wajah ini bekerja aktif untuk membantu menyegarkan kulit kering dan kusam. Kamu bisa memakai produk ini dengan menuangkan sedikit pada kapas, lalu usapkan secara merata pada wajah setelah menggunakan pembersih muka. ");
            info.setGambar("toner01");
            intent = new Intent(toneractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgtoner02 || v.getId() == R.id.btntoner02) {
            info.setNama("Nama : Emina Skin Buddy Face Toner 100 ml\n");
            info.setHarga("Harga : Rp30.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Produk ini memiliki pH balance dengan tekstur yang ringan dan tidak lengket serta sangat cepat menyerap ke dalam kulit. \n" +
                    "\n" +
                    "Selain itu, toner dari Emina ini juga mengandung ekstrak calendula dan hyaluronic Acid yang memberikan efek menenangkan dan hidrasi yang tahan lama. Rasakan sensasi lembut dan segar pada kulitmu. ");
            info.setGambar("toner02");
            intent = new Intent(toneractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgtoner03 || v.getId() == R.id.btntoner03) {
            info.setNama("Nama : Avoskin Perfect Hydrating Treatment Essence 30 ml \n");
            info.setHarga("Harga : Rp120.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Avoskin Perfect Hydrating Treatment Essence mengandung ekstrak Chamomile oil dan ETVC sebagai formula andalan.\n" +
                    "\n" +
                    "Penggunaannya efektif membantu melembapkan kulit, mencerahkan, mengatasi jerawat, antiinflamasi, dan antioksidan. \n" +
                    "\n" +
                    "Selain itu, produk ini merupakan produk dengan minimal ingredients, paraben free, dan fungal acne safe.\n" +
                    "\n" +
                    "Tak ketinggalan, kandungan fatty alcohol dalam produk hydrating toner ini membantu penyerapan kandungan lain dan efektif untuk melembutkan kulit");
            info.setGambar("toner04");
            intent = new Intent(toneractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgtoner04 || v.getId() == R.id.btntoner04) {
            info.setNama("Nama : Labore Sensitive Skin Care Gentlebiome Hydration Toner 100 ml\n");
            info.setHarga("Harga : Rp142.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("LABORE GentleBiome Hydration Toner merupakan toner bertekstur rich-liquid dengan formula pH 5.5 dan non-alkohol yang cepat meresap dan ringan saat menyentuh kulit.\n" +
                    "\n" +
                    "Produk ini memiliki formulasi khusus untuk mengurangi kekeringan pada kulit sensitif pada negara tropis hingga -12.98%*. \n" +
                    "\n" +
                    "Selain itu, kandungan Microbiome Technology TM dan Allantoin berfungsi untuk menenangkan sekaligus meredakan kemerahan pada kulit sensitif sehingga kulit siap untuk menyerap rangkaian produk skincare lainnya.\n" +
                    "\n" +
                    "*berdasarkan hasil uji klinis kepada 18 wanita dengan kulit sensitif selama 14 hari.");
            info.setGambar("toner04");
            intent = new Intent(toneractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgtoner05 || v.getId() == R.id.btntoner05) {
            info.setNama("Illuminare Acne Hydration Lotion 160 ml\n");
            info.setHarga("Harga : Rp104.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("Memiliki formulasi khusus dari bahan alami, Illuminare Acne Defyer menawarkan perawatan intensif yang secara khusus mengatasi jerawat pada wajah.\n" +
                    "\n" +
                    "Produk hydrating toner ini mengandung asam salisilat, scutellaria baicalensis, lipidure, camellia sinensis leaf extract, peach leaf extract, isodon japanicus leaf extract, dan bound water dari kaktus. \n" +
                    "\n" +
                    "Semua kandungan alami tersebut bekerja secara aktif dalam mengangkat sel kulit mati penyebab jerawat, antiinflamasi, membantu meningkatkan kelembapan kulit, hingga mencegah produksi minyak berlebih pada wajah.");
            info.setGambar("toner05");
            intent = new Intent(toneractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        }
    }

}