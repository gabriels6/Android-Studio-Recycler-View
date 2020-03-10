package com.example.recyclerview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private View includeAddContato;
    private View includeLista;

    private EditText edtNomeContato;
    private EditText edtCelContato;

    private String Nome;
    private String Celular;

    private FloatingActionButton fab;
    private Toolbar toolbar;
    private List<Contato> listaContato = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private com.example.recyclerview.RecyclerViewAdapter recyclerViewAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        includeLista = findViewById(R.id.includeLista);
        includeAddContato = findViewById(R.id.includeAddContato);

        edtNomeContato = findViewById(R.id.edtNomeContato);
        edtCelContato = findViewById(R.id.edtCelContato);


        fab = findViewById(R.id.fab);

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(listaContato);
        recyclerView.setAdapter(recyclerViewAdapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickFab(View view){

        if(includeAddContato.getVisibility() == View.VISIBLE) {
            includeAddContato.setVisibility(View.INVISIBLE);
            includeLista.setVisibility(View.VISIBLE);

        }
        else{
            includeAddContato.setVisibility(View.VISIBLE);
            includeLista.setVisibility(View.INVISIBLE);
        }


    }

    public void onClickAddContato(View view){

        Nome = edtNomeContato.getText().toString();
        Celular = edtCelContato.getText().toString();



        listaContato.add(new Contato(Nome,Celular));
        recyclerViewAdapter.notifyDataSetChanged();
        edtNomeContato.setText("");
        edtCelContato.setText("");
    }

    public void onClickLimpar(View view){
        edtNomeContato.setText("");
        edtCelContato.setText("");
    }
}
