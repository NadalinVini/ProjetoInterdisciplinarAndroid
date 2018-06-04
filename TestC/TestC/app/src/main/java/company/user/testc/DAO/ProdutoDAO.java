package company.user.testc.DAO;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import company.user.testc.Model.Produto;

/**
 * Created by User on 02/06/2018.
 */

@Dao
public interface ProdutoDAO {

    @Query("SELECT * FROM Produto")
    LiveData<List<Produto>> getAll();

    @Query("SELECT * from Produto")
    List<Produto> getAllWithoutLiveData();

    @Insert
    long insertProduto(Produto produto);
}
