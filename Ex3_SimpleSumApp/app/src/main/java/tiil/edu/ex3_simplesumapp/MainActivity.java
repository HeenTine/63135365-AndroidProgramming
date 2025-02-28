package tiil.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Đây là bộ lắng nghe và xử lý skien click lên nút tính tổng, mapping sang java file
    public void XuLyCong(View view){
        //Tìm , tham chiếu đến điều khiẻn trên tệp XML
         EditText editTextSoA = findViewById(R.id.edtA);
         EditText editTextSoB = findViewById(R.id.edtB);
         EditText editTextKetQua = findViewById(R.id.edtKQ);

        // Lấy dữ liệu về ở điều kiện số A
         String strA =   editTextSoA.getText().toString(); //strA = "2"
        // Lấy dữ liệu về ở điều kiện số B
        String strB =   editTextSoB.getText().toString(); //strA = "4"

        //Chuyển dữ liệu sang dạng số
            int so_A = Integer.parseInt(strA);
            int so_B = Integer.parseInt(strB);
        //Tính toán theo yêu cầu
         int tong = so_A + so_B ;
        //Chuyển sang dạng chuỗi
        String strTong = String.valueOf(tong); //strTong = "6"
         //Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}