package ar.com.elua.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder noImplementadoBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnSaludo);
        noImplementadoBuilder = new AlertDialog.Builder(this);
        noImplementadoBuilder.setMessage(R.string.no_implementado_mensaje)
                .setTitle(R.string.no_implementado_dialogo);
        btn.setOnClickListener(this::onBtnLoginClick);
    }
    public void onBtnLoginClick(View view) {
        noImplementadoBuilder.create().show();
    }
}