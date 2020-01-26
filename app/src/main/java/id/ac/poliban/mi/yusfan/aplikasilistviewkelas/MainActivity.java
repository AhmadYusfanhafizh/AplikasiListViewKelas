package id.ac.poliban.mi.yusfan.aplikasilistviewkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Eko Dewes");
        countries.add("Fenia Dwi Maulida");
        countries.add("Firda Kharisma");
        countries.add("Hendra Gunawan");
        countries.add("Hini Amaliah");
        countries.add("Insan Nor Encahyo");
        countries.add("Maulida Rahmi");
        countries.add("Mayadiah Atikasari");
        countries.add("Maisarah");
        countries.add("Molida Junida");
        countries.add("Muhammad Auzan");
        countries.add("Muhammad Hafiz Anshari");
        countries.add("Muhammad Rizki Fahmi");
        countries.add("Nia Karlida Yanti");
        countries.add("Nur Rizki Aulia");
        countries.add("Octa Pasaribu");
        countries.add("Sari Rahma Maulida");
        countries.add("Wardatul Hisaniah");
        countries.add("Wenny Lisandra");
        countries.add("Ahmad Yusfanhafizh");
        countries.add("Sri Wahyuni");
        countries.add("Haifa Mai Suci");
        countries.add("Risma Sari");
        countries.add("M. Sultansyarudin");
        countries.add("M. Tomo Utomo");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            setTitle("Aplikasi List Newbie Kelas");
        }

        ListView listView = findViewById(R.id.list_view);

        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_kelas, R.id.tv_item_kelas, countries);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Namaku "+ countries.get(position), Toast.LENGTH_LONG).show();
        });
    }
}
