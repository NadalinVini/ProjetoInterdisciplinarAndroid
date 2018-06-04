package company.user.testc.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

import company.user.testc.Model.Cliente;
import company.user.testc.Repository.ClienteRepository;

/**
 * Created by User on 03/06/2018.
 */

public class ClienteViewModel extends AndroidViewModel {
    private ClienteRepository clienteRepository;
    private LiveData<List<Cliente>> clientes;

    public ClienteViewModel(Application app){
        super(app);
        clienteRepository = new ClienteRepository(app);
        clientes = clienteRepository.findAll();
    }

    public LiveData<List<Cliente>> findAll(){
        return clientes;
    }

    public void insert(Cliente cliente){
        clienteRepository.insert(cliente);
    }
}
