package company.user.testc.DAO;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.support.annotation.NonNull;

import java.util.List;

import company.user.testc.Model.Cliente;


/**
 * Created by User on 02/06/2018.
 */

@Dao
public interface ClienteDAO {

    @Query("SELECT * FROM Cliente")
    LiveData<List<Cliente>> getAll();

    @Query("SELECT * from Cliente")
    List<Cliente> getAllWithoutLiveData();

    @Query("SELECT * from Cliente WHERE ID in (:clientesID)")
    List<Cliente> loadClientesByIds(int[] clientesID);

    @Query("SELECT * from Cliente WHERE ID LIKE :id")
    Cliente findByCliente(int id);

    @Insert
    void insertAll(@NonNull Cliente... clientes);

    @Insert
    long insertCliente(Cliente cliente);

    @Delete
    int delete(Cliente cliente);

    @Query("DELETE from Cliente")
    void deleteAll();

    @Update
    int update(Cliente cliente);
}
