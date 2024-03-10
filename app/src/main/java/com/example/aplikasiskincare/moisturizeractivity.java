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

public class moisturizeractivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisturizeractivity);

        ImageView imgmoisturizer01 = findViewById(R.id.imgmoisturizer01);
        ImageView imgmoisturizer02 = findViewById(R.id.imgmoisturizer02);
        ImageView imgmoisturizer03 = findViewById(R.id.imgmoisturizer03);
        ImageView imgmoisturizer04 = findViewById(R.id.imgmoisturizer04);
        ImageView imgmoisturizer05 = findViewById(R.id.imgmoisturizer05);

        Button btnmoisturizer01 = findViewById(R.id.btnmoisturizer01);
        Button btnmoisturizer02 = findViewById(R.id.btnmoisturizer02);
        Button btnmoisturizer03 = findViewById(R.id.btnmoisturizer03);
        Button btnmoisturizer04 = findViewById(R.id.btnmoisturizer04);
        Button btnmoisturizer05 = findViewById(R.id.btnmoisturizer05);

        imgmoisturizer01.setOnClickListener(this);
        imgmoisturizer02.setOnClickListener(this);
        imgmoisturizer03.setOnClickListener(this);
        imgmoisturizer04.setOnClickListener(this);
        imgmoisturizer05.setOnClickListener(this);

        btnmoisturizer01.setOnClickListener(this);
        btnmoisturizer02.setOnClickListener(this);
        btnmoisturizer03.setOnClickListener(this);
        btnmoisturizer04.setOnClickListener(this);
        btnmoisturizer05.setOnClickListener(this);

    }

    Info info = new Info();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgmoisturizer01 || v.getId() == R.id.btnmoisturizer01){
            info.setNama("Nama : SOMETHINC Calm Down! Skinpair R-Cover Cream Moisturizer\n");
            info.setHarga("Harga : Rp142.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("SOMETHINC Calm Down! Skinpair R-Cover Cream Moisturizer adalah pelembab wajah yang diklaim vegan atau tidak mengandung bahan hewani.\n" +
                    " \n" +
                    "\n" +
                    "Pelembap ini bertekstur ringan dan berfungsi untuk melindungi lapisan barrier kulit dengan menghidrasi secara maksimal dan menenangkan kulit secara instan.\n" +
                    " \n" +
                    "\n" +
                    "Bahan-bahan yang terkandung di dalam pelembap ini juga disebut cocok untuk kulit sensitif dan bisa meresap hingga ke dalam pori-pori.\n");
            info.setGambar("moisturizer01");
            intent = new Intent(moisturizeractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmoisturizer02 || v.getId() == R.id.btnmoisturizer02) {
            info.setNama("Nama : THE ORIGINOTE Hyalucera Moisturizer Gel\n");
            info.setHarga("Harga : Rp46.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("THE ORIGINOTE Hyalucera Moisturizer Gel adalah pelembab wajah yang diformulasikan dengan dua jenis hyaluron, ceramide, dan chlorelina.\n" +
                    " \n" +
                    "\n" +
                    "Kandungan-kandungan diklaim dapat membantu merawat skin barrier dan menjaga keremajaan kulit.\n" +
                    " \n" +
                    "\n" +
                    "Bahan-bahan tersebut juga berfungsi untuk mengunci hidrasi dan kelembapan untuk membuat kulit terasa kencang serta mencegah tanda penuaan dini.");
            info.setGambar("moisturizer02");
            intent = new Intent(moisturizeractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmoisturizer03 || v.getId() == R.id.btnmoisturizer03) {
            info.setNama("Nama : COSRX Oil Free Ultra Moisturizing Lotion\n");
            info.setHarga("Harga : Rp300.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("COSRX Oil Free Ultra Moisturizing Lotion merupakan pelembap berbentuk lotion yang diklaim cocok untuk semua jenis kulit, termasuk kulit sensitif, kulit berminyak, hingga berjerawat.\n" +
                    " \n" +
                    "\n" +
                    "Pelembap ini bekerja dengan memberi sekaligus menjaga kelembapan dan kenyamanan dengan formula yang disebut ringan dan bebas minyak.\n" +
                    " \n" +
                    "\n" +
                    "Ada juga bahan betula platyphylla japonica juice 70% (birch sap) dan bahan pelembap khusus untuk membantu menjaga air tetap di dalam dan permukaan kulit.");
            info.setGambar("moisturizer03");
            intent = new Intent(moisturizeractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmoisturizer04|| v.getId() == R.id.btnmoisturizer04) {
            info.setNama("Nama : TRUEVE Advanced Brightening Gel\n");
            info.setHarga("Harga : Rp220.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("TRUEVE Advanced Brightening Gel adalah pelembap wajah yang diklaim mampu menghidrasi kulit hingga 48 jam dan dilengkapi dengan bahan pencerah kulit.");
            info.setGambar("moisturizer04");
            intent = new Intent(moisturizeractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmoisturizer05 || v.getId() == R.id.btnmoisturizer05) {
            info.setNama("SKINTIFIC 5x Ceramide Barrier Moisturizer Gel\n");
            info.setHarga("Harga : Rp170.000\n");
            info.setStatus("Status: tersedia\n");
            info.setDeskripsi("SKINTIFIC 5x Ceramide Barrier Moisturizer Gel merupakan pelembap yang menggabungkan tiga kandungan aktif ceramide, hyaluronic acid, dan centella asiatica.\n" +
                    " \n" +
                    "\n" +
                    "Bahan-bahan tersebut berfungsi untuk mengatasi permasalahan skin barrier yang rusak seperti kemerahan, kulit bertekstur, jerawat, dan juga kulit kering secara cepat.\n" +
                    " \n" +
                    "\n" +
                    "Pelembab ini juga diperkaya dengan teknologi gabungan lima jenis ceramide untuk melembapkan secara mendalam dan memperkuat lapisan kulit.");
            info.setGambar("moisturizer05");
            intent = new Intent(moisturizeractivity.this, infoActivity.class);
            intent.putExtra(infoActivity.KEY_DATA, info);
            startActivity(intent);
        }
    }

}