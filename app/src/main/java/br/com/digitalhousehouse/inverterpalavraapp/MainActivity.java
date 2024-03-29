package  br.com.digitalhousehouse.inverterpalavraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText palavraEditText;
    private Button okButton;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palavraEditText = findViewById(R.id.palavra_edit_text_id);
        okButton = findViewById(R.id.ok_button_id);
        resultadoTextView = findViewById(R.id.resultado_teste_id);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public String inverterPalavra(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}