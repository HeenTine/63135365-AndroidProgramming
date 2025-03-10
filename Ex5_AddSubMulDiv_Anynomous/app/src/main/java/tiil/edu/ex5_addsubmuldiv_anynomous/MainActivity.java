package tiil.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Khai báo các đối tượng gắn với đkhiển tương ứng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    public void TimDieuKhien(){
        editTextSo1 =    (EditText)findViewById(R.id.edtSo1);
        editTextSo2 =    (EditText) findViewById(R.id.edtSo2);
        editTextKQ =    (EditText) findViewById(R.id.edtKetQua);
        nutCong =  (Button) findViewById(R.id.btnCong);
        nutTru =  (Button) findViewById(R.id.btnTru);
        nutNhan =  (Button) findViewById(R.id.btnNhan);
        nutChia =  (Button) findViewById(R.id.btnChia);
    }
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
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b1. Lấy dữ liệu 2 số
                //b1.1. Tìm EditText số 1 và 2

                //b1.2. Lấy dữ liệu từ 2 đkhiển đó
                String stringSo1 =    editTextSo1.getText().toString();
                String stringSo2 =    editTextSo2.getText().toString();
                //b1.3. Chuyển dữ liệu từ chuỗi sang số
                float so1 = Float.parseFloat(stringSo1);
                float so2 = Float.parseFloat(stringSo2);
                //b2. Tính toán
                float Tong = so1 + so2 ;
                //b3. Hiện kết quả
                //b3.1

                //b3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ =  String.valueOf(Tong);
                //b3.3 gắn kết quả lên điều khiển
                editTextKQ.setText(chuoiKQ);

            }
        });
        //Viết inline
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b1. Lấy dữ liệu 2 số
                //b1.1. Tìm EditText số 1 và 2

                //b1.2. Lấy dữ liệu từ 2 đkhiển đó
                String stringSo1 =    editTextSo1.getText().toString();
                String stringSo2 =    editTextSo2.getText().toString();
                //b1.3. Chuyển dữ liệu từ chuỗi sang số
                float so1 = Float.parseFloat(stringSo1);
                float so2 = Float.parseFloat(stringSo2);
                //b2. Tính toán
                float Hieu = so1 - so2 ;
                //b3. Hiện kết quả
                //b3.1
                //b3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ =  String.valueOf(Hieu);
                //b3.3 gắn kết quả lên điều khiển
                editTextKQ.setText(chuoiKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b1. Lấy dữ liệu 2 số
                //b1.1. Tìm EditText số 1 và 2

                //b1.2. Lấy dữ liệu từ 2 đkhiển đó
                String stringSo1 =  editTextSo1.getText().toString();
                String stringSo2 =  editTextSo2.getText().toString();
                //b1.3. Chuyển dữ liệu từ chuỗi sang số
                float so1 = Float.parseFloat(stringSo1);
                float so2 = Float.parseFloat(stringSo2);
                //b2. Tính toán
                float Tich = so1 * so2 ;
                //b3. Hiện kết quả
                //b3.1
                //b3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ =  String.valueOf(Tich);
                //b3.3 gắn kết quả lên điều khiển
                editTextKQ.setText(chuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b1. Lấy dữ liệu 2 số
                //b1.1. Tìm EditText số 1 và 2

                //b1.2. Lấy dữ liệu từ 2 đkhiển đó
                String stringSo1 =    editTextSo1.getText().toString();
                String stringSo2 =    editTextSo2.getText().toString();
                //b1.3. Chuyển dữ liệu từ chuỗi sang số
                float so1 = Float.parseFloat(stringSo1);
                float so2 = Float.parseFloat(stringSo2);
                //b2. Tính toán
                float Thuong = so1 / so2 ;
                //b3. Hiện kết quả
                //b3.1

                //b3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ =  String.valueOf(Thuong);
                //b3.3 gắn kết quả lên điều khiển
                editTextKQ.setText(chuoiKQ);
            }
        });
    }


}