package comsimon_seo.github.weightedaveragecalc;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnAdd, btnReset;
    TextView textOutput;
    EditText editNumber, editWeight;
    double number = 0, weight = 0, total = 0, totalWeight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnReset = (Button)findViewById(R.id.btnReset);
        textOutput = (TextView)findViewById(R.id.textOutput);
        editNumber = (EditText)findViewById(R.id.editNumber);
        editWeight = (EditText)findViewById(R.id.editWeight);

        btnAdd.setOnClickListener((View.OnClickListener) this);
        btnReset.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnAdd:
                number = Double.parseDouble(editNumber.getText().toString());
                weight = Double.parseDouble(editWeight.getText().toString());
                totalWeight += weight;
                total += number*weight;
                textOutput.setText(String.valueOf(total/totalWeight));
                break;
            case R.id.btnReset:
                total = 0;
                totalWeight = 0;
                textOutput.setText("");
                break;
        }
    }
}
