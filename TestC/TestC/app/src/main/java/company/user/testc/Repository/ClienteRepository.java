package company.user.testc.Repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

import company.user.testc.DAO.ClienteDAO;
import company.user.testc.Factory.AppDatabase;
import company.user.testc.Model.Cliente;

/**
 * Created by User on 03/06/2018.
 */

public class ClienteRepository {

    private ClienteDAO clienteDAO;
    private LiveData<List<Cliente>> clientes;

    public ClienteRepository(Application app){
        AppDatabase db = AppDatabase.getDatabase(app);
        clienteDAO = db.clienteDAO();
        clientes = clienteDAO.getAll();
    }
    public LiveData<List<Cliente>> findAll(){return clientes;}

    public void insert(Cliente cliente){ new insertAsynkTask(clienteDAO).execute(cliente);}

    private static class insertAsynkTask extends AsyncTask<Cliente,Void,Void> {
        private ClienteDAO clienteDAO;

        insertAsynkTask(ClienteDAO clienteDAO) {this.clienteDAO = clienteDAO;}

        @Override
        protected Void doInBackground(Cliente... cliente) {
            clienteDAO.insertCliente(cliente[0]);
            return null;
        }
    }
}
