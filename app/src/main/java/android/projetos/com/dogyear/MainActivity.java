package android.projetos.com.dogyear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText textBox;
    private Button buttonAge;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAge = (Button) findViewById(R.id.howOldButtonId);
        textBox = (EditText) findViewById(R.id.humanAgeId);
        result = (TextView) findViewById(R.id.resultOfYearsOldId);

        buttonAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = textBox.getText().toString();

                if (textInput.isEmpty()){
                    result.setText("Nenhum número digitado!");
                }else{

                    int inputValue = Integer.parseInt(textInput);
                    int finalResult = inputValue * 7;

                    result.setText("A idade do cachorro é : "+ finalResult + "anos");
                }
            }
        });


    }
}
