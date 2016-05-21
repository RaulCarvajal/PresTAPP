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
    //Instancias de los objetos que utilizaremos en esta clase


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
        setFecha();

    }

    private void setFecha() {   //En este metodo acomodamos una cadena con la fecha que ira en el textView llamado hoy
        if (fechaHoy.get(Calendar.DAY_OF_MONTH) < 10 && fechaHoy.get(Calendar.MONTH) < 10) {
            hoy.setText("Hoy estamos a: "+fechaHoy.get(Calendar.YEAR)+"-0"+(1+fechaHoy.get(Calendar.MONTH))+"-0"+fechaHoy.get(Calendar.DAY_OF_MONTH));
        } else if (fechaHoy.get(Calendar.DAY_OF_MONTH) < 10) {
            hoy.setText("Hoy estamos a: "+fechaHoy.get(Calendar.YEAR)+"-"+(1+fechaHoy.get(Calendar.MONTH))+"-0"+ fechaHoy.get(Calendar.DAY_OF_MONTH));
        } else if (fechaHoy.get(Calendar.MONTH) < 10) {
            hoy.setText("Hoy estamos a: "+fechaHoy.get(Calendar.YEAR)+"-0"+(1+fechaHoy.get(Calendar.MONTH))+"-"+fechaHoy.get(Calendar.DAY_OF_MONTH));
        } else {
            hoy.setText("Hoy estamos a: "+fechaHoy.get(Calendar.YEAR)+"-"+(1+fechaHoy.get(Calendar.MONTH))+"-"+ fechaHoy.get(Calendar.DAY_OF_MONTH));
        }
    }


    public void Limpiar(View view){
                cmb.setSelection(0);
                art.setText("");
                per.setText("");
    }

}
