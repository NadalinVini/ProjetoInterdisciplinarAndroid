package company.user.testc.Activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.facebook.stetho.Stetho;

import java.util.List;

import  company.user.testc.Adapter.ClienteAdapter;
import company.user.testc.Model.Cliente;
import  company.user.testc.R;
import  company.user.testc.ViewHolder.ClienteViewHolder;
import  company.user.testc.ViewModel.ClienteViewModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ClienteViewModel model;
    ClienteViewHolder clienteViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Stetho.initializeWithDefaults(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final ClienteAdapter adapter = new ClienteAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        model = ViewModelProviders.of(this).get(ClienteViewModel.class);
        model.findAll().observe(this, new Observer<List<Cliente>>() {
            @Override
            public void onChanged(@Nullable List<Cliente> clientes) {
                adapter.setClientes(clientes);
            }
        });

        clienteViewHolder = new ClienteViewHolder(findViewById(R.id.cadastrar_cliente));
        clienteViewHolder.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnSalvarCliente){
            Cliente cliente = new Cliente();
            Cliente.setNome(clienteViewHolder.getTextfromEditNome());
            Cliente.setCidade(clienteViewHolder.getTextfromEditCidade());
            Cliente.setEstado(clienteViewHolder.getTextfromEditEstado());
            Cliente.setEndereco(clienteViewHolder.getTextfromEditEndereco());
            Cliente.setCNPJ(clienteViewHolder.getLongfromEditCNPJ());
            Cliente.setCPF(clienteViewHolder.getLongfromCEP());

            model.insert(cliente);
        }
    }
}
