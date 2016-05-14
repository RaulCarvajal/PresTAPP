package ittepic.prestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Principal extends AppCompatActivity {

    ImageButton NuevoPres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        NuevoPres=(ImageButton)findViewById(R.id.NuevoPres);

        NuevoPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NP = new Intent(Principal.this, NuevoPrestamo.class);
                startActivity(NP);
            }
        });
    }
}
