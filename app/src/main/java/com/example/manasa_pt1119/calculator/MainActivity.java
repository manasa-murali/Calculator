package com.example.manasa_pt1119.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements ITalkToView,View.OnClickListener{

    CalcPresenter calcPresenter;
    Button bop,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq;
    Double[] d;
    EditText editText;
    String ch;
    View v;

    double x,y;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        calcPresenter = new CalcPresenter(this);
        setContentView(R.layout.activity_main);
        i=0;
        d=new Double[3];
        editText=(EditText)findViewById(R.id.edittext);
        b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(this);

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(this);

        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(this);

        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(this);

        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(this);

        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(this);

        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(this);

        badd=(Button)findViewById(R.id.badd);
        badd.setOnClickListener(this);

        bsub=(Button)findViewById(R.id.bsub);
        bsub.setOnClickListener(this);

        bmul=(Button)findViewById(R.id.bmul);
        bmul.setOnClickListener(this);

        bdiv=(Button)findViewById(R.id.bdiv);
        bdiv.setOnClickListener(this);

        beq=(Button)findViewById(R.id.beq);
        beq.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        v=view;
        switch(view.getId())
        {
            case R.id.b0:


                            calcPresenter.show();
                             d[i++]=Double.parseDouble(b0.getText().toString());

                            break;
            case R.id.b1:

                calcPresenter.show();
                d[i++]=Double.parseDouble(b1.getText().toString());


                break;

            case R.id.b2:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b2.getText().toString());


                break;
            case R.id.b3:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b3.getText().toString());


                break;
            case R.id.b4:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b4.getText().toString());


                break;

            case R.id.b5:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b5.getText().toString());


                break;
            case R.id.b6:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b6.getText().toString());


                break;
            case R.id.b7:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b7.getText().toString());


                break;

            case R.id.b8:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b8.getText().toString());


                break;
            case R.id.b9:
                calcPresenter.show();
                d[i++]=Double.parseDouble(b9.getText().toString());


                break;

            case R.id.badd:
                calcPresenter.show();
                                ch=badd.getText().toString();

                break;

            case R.id.bsub:
                calcPresenter.show();
                                ch=bsub.getText().toString();


                break;
            case R.id.bmul:
                calcPresenter.show();
                                ch=bmul.getText().toString();
                                break;
            case R.id.bdiv:
                calcPresenter.show();
                                    ch=bdiv.getText().toString();
                break;

            case R.id.beq:
                            x=d[0];
                                y=d[1];


                            if(ch.equals("+"))
                            {
                                calcPresenter.add(x,y);


                            }
                            else if(ch.equals("-"))
                            {
                                calcPresenter.sub(x,y);
                            }
                            else if(ch.equals("*"))
                            {
                                calcPresenter.mul(x,y);
                            }
                            else if(ch.equals("/"))
                            {
                                calcPresenter.div(x,y);

                            }


        }




    }


    @Override
    public void updateDisplay() {


        editText.setText(editText.getText().toString()+ ((Button)v).getText().toString() );

    }

    @Override
    public void publishResult(double k) {

            editText.setText(String.valueOf(k));




    }
}
