package ru.AndroidPolenova;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button btnClear = (Button) findViewById(R.id.buttonClear);
        Button btnOK = (Button) findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                EditText editName = findViewById(R.id.editNameUser);
                EditText editPassword = findViewById(R.id.editPasswordUser);
                EditText editMail = findViewById(R.id.editMailUser);
                String name = editName.getText().toString();
                String password = editPassword.getText().toString();
                String mail = editMail.getText().toString();
                TextView result = findViewById(R.id.textResult);
                result.setText("Подписка на рассылку оформлена для пользователя " + name + "  на электронный адрес " + mail);

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editName = findViewById(R.id.editNameUser);
                EditText editPassword = findViewById(R.id.editPasswordUser);
                EditText editMail = findViewById(R.id.editMailUser);
                TextView result = findViewById(R.id.textResult);
                editName.getText().clear();
                editPassword.getText().clear();
                editMail.getText().clear();
                result.setText("нет данных");
            }
        });
    }
}
