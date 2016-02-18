package calculator.client.com.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Operand1;
    private EditText Operand2;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Operand1 = (EditText) findViewById(R.id.inputedit);
        Operand2 = (EditText) findViewById(R.id.inputtwoedit);

        final TextInputLayout txtinp1 = (TextInputLayout) findViewById(R.id.input_layout_1);
        final TextInputLayout txtinp2 = (TextInputLayout) findViewById(R.id.input_layout_2);

        Button btnAddition = (Button) findViewById(R.id.buttonAddition);
        Button btnSubsctraction = (Button) findViewById(R.id.btnSubtraction);
        Button btnDivision = (Button) findViewById(R.id.btnDivision);
        Button btnMultipication = (Button) findViewById(R.id.btnMultipication);

        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (TextUtils.isEmpty(txtinp1.getEditText().getText().toString())
                        || TextUtils.isEmpty(txtinp2.getEditText().getText().toString())) {

                    txtinp1.setError("Field must not be empty!");
                    txtinp2.setError("Field must not be empty!");

                } else {

                    txtinp1.setErrorEnabled(false);
                    txtinp2.setErrorEnabled(false);

                    double oper1 = Double.parseDouble(Operand1.getText().toString());
                    double oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                }
            }
        });

        btnSubsctraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(txtinp1.getEditText().getText().toString())
                        || TextUtils.isEmpty(txtinp2.getEditText().getText().toString())) {

                    txtinp1.setError("Field must not be empty!");
                    txtinp2.setError("Field must not be empty!");

                } else {

                    txtinp1.setErrorEnabled(false);
                    txtinp2.setErrorEnabled(false);

                    double oper1 = Double.parseDouble(Operand1.getText().toString());
                    double oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtinp1.getEditText().getText().toString())
                        || TextUtils.isEmpty(txtinp2.getEditText().getText().toString())) {

                    txtinp1.setError("Field must not be empty!");
                    txtinp2.setError("Field must not be empty!");
                } else {

                    txtinp1.setErrorEnabled(false);
                    txtinp2.setErrorEnabled(false);

                    double oper1 = Double.parseDouble(Operand1.getText().toString());
                    double oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
            }
        });

        btnMultipication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(txtinp1.getEditText().getText().toString())
                        || TextUtils.isEmpty(txtinp2.getEditText().getText().toString())) {

                    txtinp1.setError("Field must not be empty!");
                    txtinp2.setError("Field must not be empty!");

                } else {
                    txtinp1.setErrorEnabled(false);
                    txtinp2.setErrorEnabled(false);

                    double oper1 = Double.parseDouble(Operand1.getText().toString());
                    double oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }
            }
        });
    }
}
