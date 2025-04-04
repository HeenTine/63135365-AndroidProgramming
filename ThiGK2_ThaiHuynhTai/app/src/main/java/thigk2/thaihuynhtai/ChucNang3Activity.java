package thigk2.thaihuynhtai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = findViewById(R.id.listView);
        String[] mainItems ={"Tiến về Sài Gòn","Giải phóng Miền Nam","Đất nước trọn niềm vui","Bài ca thống nhất","Mùa xuân trên thành phố HCM"};

        // Adapter cho danh sách chính
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainItems);
        listView.setAdapter(adapter);

        // Xử lý sự kiện click vào một mục trong ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Hiển thị danh sách con tương ứng
//                showSubItemsDialog(mainItems[position], subItems[position]);
                Intent intentItem = new Intent(ChucNang3Activity.this, Item3Activity.class);
                startActivity(intentItem);
            }
        });
    }

}