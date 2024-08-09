package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    double inputNum1 = 0, inputNum2 = 0;
    TextView editTextView;      // this is textView where code display
    boolean Add, Sub, Mul, Div, Remainder, decimal; // These are Operators
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_Add, btn_Sub,
            btn_Mul, btn_Div, btn_Equ, btn_Del, btn_Dot, btn_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        btn_0 = (Button) findViewById(R.id.b0);
        btn_1 = (Button) findViewById(R.id.b1);
        btn_2 = (Button) findViewById(R.id.b2);
        btn_3 = (Button) findViewById(R.id.b3);
        btn_4 = (Button) findViewById(R.id.b4);
        btn_5 = (Button) findViewById(R.id.b5);
        btn_6 = (Button) findViewById(R.id.b6);
        btn_7 = (Button) findViewById(R.id.b7);
        btn_8 = (Button) findViewById(R.id.b8);
        btn_9 = (Button) findViewById(R.id.b9);
        btn_Dot = (Button) findViewById(R.id.bDot);
        btn_Add = (Button) findViewById(R.id.bAdd);
        btn_Sub = (Button) findViewById(R.id.bSub);
        btn_Mul = (Button) findViewById(R.id.bMul);
        btn_Div = (Button) findViewById(R.id.bDiv);
        btn_Remainder = (Button) findViewById(R.id.bRem);
        btn_Del = (Button) findViewById(R.id.bDel);
        btn_Equ = (Button) findViewById(R.id.bEql);

        editTextView = (TextView) findViewById(R.id.solutionDisplay);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText(editTextView.getText() + "0");
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextView.getText().length() != 0) {
                    inputNum1 = Float.parseFloat(editTextView.getText() + "");
                    Add = true;
                    decimal = false;
                    editTextView.setText(null);
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextView.getText().length() != 0) {
                    inputNum1 = Float.parseFloat(editTextView.getText() + "");
                    Sub = true;
                    decimal = false;
                    editTextView.setText(null);
                }
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextView.getText().length() != 0) {
                    inputNum1 = Float.parseFloat(editTextView.getText() + "");
                    Mul = true;
                    decimal = false;
                    editTextView.setText(null);
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextView.getText().length() != 0) {
                    inputNum1 = Float.parseFloat(editTextView.getText() + "");
                    Div = true;
                    decimal = false;
                    editTextView.setText(null);
                }
            }
        });

        btn_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextView.getText().length() != 0) {
                    inputNum1 = Float.parseFloat(editTextView.getText() + "");
                    Remainder = true;
                    decimal = false;
                    editTextView.setText(null);
                }
            }
        });

        btn_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Mul || Div || Remainder) {
                    inputNum2 = Float.parseFloat(editTextView.getText() + "");
                }

                if (Add) {

                    editTextView.setText(inputNum1 + inputNum2 + "");
                    Add = false;
                }

                if (Sub) {

                    editTextView.setText(inputNum1 - inputNum2 + "");
                    Sub = false;
                }

                if (Mul) {
                    editTextView.setText(inputNum1 * inputNum2 + "");
                    Mul = false;
                }

                if (Div) {
                    editTextView.setText(inputNum1 / inputNum2 + "");
                    Div = false;
                }
                if (Remainder) {
                    editTextView.setText(inputNum1 % inputNum2 + "");
                    Remainder = false;
                }
            }
        });

        btn_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextView.setText("");
                inputNum1 = 0.0;
                inputNum2 = 0.0;
            }
        });

        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    editTextView.setText(editTextView.getText() + ".");
                    decimal = true;
                }

            }
        });
    }
}
