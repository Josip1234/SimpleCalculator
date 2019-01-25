package android.unipu.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mNum1;
    private EditText mNum2;
    private Button mAddButton;
    private Button mSubstractButton;
    private Button mDivButton;
    private Button mMultButton;
    private Numbers numbers;
    private Operation operation;
    private double res;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1=(EditText) findViewById(R.id.firstNum);
        mNum2=(EditText) findViewById(R.id.num2);
        mAddButton=(Button) findViewById(R.id.addition);
        mSubstractButton=(Button) findViewById(R.id.sub);
        mDivButton=(Button) findViewById(R.id.div);
        mMultButton=(Button) findViewById(R.id.mult);
        result=(TextView) findViewById(R.id.res);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers=new Numbers(Double.parseDouble(mNum1.getText().toString()),Double.parseDouble(mNum2.getText().toString()));
                operation=new Operation(numbers,0);
                operation.setResult(operation.addition(numbers));
                result.setText(String.valueOf(operation.getResult()));

            }
        });
        mSubstractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers=new Numbers(Double.parseDouble(mNum1.getText().toString()),Double.parseDouble(mNum2.getText().toString()));
                operation=new Operation(numbers,0);
                operation.setResult(operation.substraction(numbers));
                result.setText(String.valueOf(operation.getResult()));
            }
        });
        mDivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers=new Numbers(Double.parseDouble(mNum1.getText().toString()),Double.parseDouble(mNum2.getText().toString()));
                if(numbers.getmNumberTwo()==0){
                    numbers.setmNumberTwo(1);
                }
                operation=new Operation(numbers,0);
                operation.setResult(operation.division(numbers));
                result.setText(String.valueOf(operation.getResult()));
            }
        });
        mMultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers=new Numbers(Double.parseDouble(mNum1.getText().toString()),Double.parseDouble(mNum2.getText().toString()));
                operation=new Operation(numbers,0);
                operation.setResult(operation.multiplication(numbers));
                result.setText(String.valueOf(operation.getResult()));
            }
        });
    }
}
