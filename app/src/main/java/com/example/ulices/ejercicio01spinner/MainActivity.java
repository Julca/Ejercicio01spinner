package com.example.ulices.ejercicio01spinner;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements ActionBar.OnNavigationListener{
private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(TextView) findViewById(R.id.texto);
        ActionBar actionBar=getSupportActionBar();
        SpinnerAdapter adapter= ArrayAdapter.createFromResource(this,R.array.listamenu,android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(adapter,this);

        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_LIST);
    }


    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition){
            case 0:
                break;
            case 1:texto.setText("Gracias por navegar en esta aplicacion");
                break;
            case 2:texto.setText("Gracias por navegar en esta aplicacion");
                break;
            case 3:texto.setText("Gracias por navegar en esta aplicacion");
                break;
            case 4:texto.setText("Gracias por navegar en esta aplicacion");
                break;
            case 5:texto.setText("Gracias por navegar en esta aplicacion");
                break;
            default:
                Toast.makeText(getApplicationContext(),"Gracias",Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
