package thigk2.thaihuynhtai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TDK();
        btnKiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strthang = edtThang.getText().toString();
                String strnam = edtNam.getText().toString();

                int thang = Integer.parseInt(strthang);
                int nam = Integer.parseInt(strnam);

                String kq;

                if((thang==4)&&(nam==1975)) kq="Đúng";
                else kq ="SAI";
                tvKQ.setText(kq);
            }
        });
    }

    Button btnKiemtra;
    EditText edtThang,edtNam;
    TextView tvKQ;
    void TDK(){
        btnKiemtra = (Button) findViewById(R.id.btnKiemTra);
        edtThang = (EditText) findViewById(R.id.edtThang);
        edtNam = (EditText) findViewById(R.id.edtNam);
        tvKQ = (TextView) findViewById(R.id.tvKQ);
    }
}