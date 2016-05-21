package ittepic.prestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VerReg extends AppCompatActivity {
    ListView lista;
    ArrayAdapter adaptador;
    DBManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_reg);

        lista=(ListView)findViewById(R.id.lista);
    }



    public void SelecionanItem(){
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
                
            }
        });
    }


    private void LlenarLista() {
        lista = (ListView) findViewById(R.id.lista);
        adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, manager.getRegistrosLista());
        lista.setAdapter(adaptador);
    }

}
