package tiil.edu.ex7_intentlogin.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import tiil.edu.ex7_intentlogin.HomeActivity;
import tiil.edu.ex7_intentlogin.R;
import tiil.edu.ex7_intentlogin.ui.login.LoginViewModel;
import tiil.edu.ex7_intentlogin.ui.login.LoginViewModelFactory;
import tiil.edu.ex7_intentlogin.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private ActivityLoginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_login);
        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý đăng nhập
                // Lấy dữ liệu
                //B1. Tìm tham chiếu đến đk
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                //B2. Lấy dữ liệu
                String stringTenDN = edTenDN.getText().toString();
                String stringPass = edPass.getText().toString();
                //Kiểm tra mật khẩu
                if(stringTenDN.equals("thaihuynhtai") && stringPass.equals("123")) //Pass dung
                { //Chuyển sang màn hình Home
                        Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                        //Gói dữ liệu vào iQuiz, dạng key - value; key được dùng để bên kia lọc ra dữ liệu
                        iQuiz.putExtra("ten_dang_nhap",stringTenDN);
                        iQuiz.putExtra("mk_dang_nhap",stringPass);
                        //Gửi đi
                        startActivity(iQuiz);
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Bạn Nhập Sai Thông Tin",Toast.LENGTH_LONG);
                }

            }
        });
    }


}