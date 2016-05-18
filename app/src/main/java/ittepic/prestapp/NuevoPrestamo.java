package ittepic.prestapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NuevoPrestamo extends AppCompatActivity {
    Spinner cmb;
    DatePicker fecDev;
    EditText art,per;
    TextView hoy;
    ImageButton agregar,limpiar;
    GregorianCalendar fechaHoy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_prestamo);

        cmb=(Spinner)findViewById(R.id.spinner);
        cmb.setBackgroundColor(Color.LTGRAY);
        fecDev=(DatePicker)findViewById(R.id.datePicker);
        fecDev.setBackgroundColor(Color.LTGRAY);
        art=(EditText)findViewById(R.id.editText);
        per=(EditText)findViewById(R.id.editText2);
        agregar=(ImageButton)findViewById(R.id.imageButton2);
        limpiar=(ImageButton)findViewById(R.id.imageButton);
        hoy=(TextView)findViewById(R.id.fec);
        fechaHoy= new GregorianCalendar();
        fechaHoy.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);

        hoy.setText("Hoy estamos a: "+Calendar.YEAR+"-"+Calendar.MONTH+"-"+Calendar.DAY_OF_MONTH);

        Limpiar();
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NuevoPrestamo.this,"-Dia-"+fecDev.getDayOfMonth()+"-Mes-"+fecDev.getMonth(),Toast.LENGTH_LONG).show();
            }
        });

    }

    public void Limpiar(){
        limpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cmb.setSelection(0);
                art.setText("");
                per.setText("");
            }
        });
    }

}
