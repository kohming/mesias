package com.gka.gkamobile.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.gka.gkamobile.R;
import com.gka.gkamobile.service.ApiClient;
import com.gka.gkamobile.service.TokenApiService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private TokenApiService tokenApiService;
    private String appId = "ae2b1fca515949e5d54fb22b8ed95575";
    private String appKey = "11d94126147155c95b5b99096056e4d4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        loginButton = (Button) findViewById(R.id.btn_login);
        tokenApiService = ApiClient.getClient().create(TokenApiService.class);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Call<ResponseBody> result = tokenApiService.postKontak(appId,appKey);
                result.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Toast.makeText(LoginActivity.this," response version "+response.body().string(),Toast.LENGTH_SHORT).show();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
            }
        });

    }
}
