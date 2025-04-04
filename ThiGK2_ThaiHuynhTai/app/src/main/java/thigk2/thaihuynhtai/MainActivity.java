package thigk2.thaihuynhtai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        TDK();
        btnCN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau1 = new Intent(MainActivity.this,ChucNang2Activity.class);
                startActivity(intentCau1);
            }
        });
        btnCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau2 = new Intent(MainActivity.this,ChucNang3Activity.class);
                startActivity(intentCau2);
            }
        });
        btnCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau3 = new Intent(MainActivity.this,ChucNang4Activity.class);
                startActivity(intentCau3);
            }
        });
        btnAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau4 = new Intent(MainActivity.this,AboutMeActivity.class);
                startActivity(intentCau4);
            }
        });
    }
    Button btnCN1, btnCN2, btnCN3, btnAB;

    void TDK(){
        btnCN1 = (Button) findViewById(R.id.btnCN1);
        btnCN2 = (Button) findViewById(R.id.btnCN2);
        btnCN3 = (Button) findViewById(R.id.btnCN3);
        btnAB = (Button) findViewById(R.id.btnAB);

    }
}