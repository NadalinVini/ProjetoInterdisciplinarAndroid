package company.user.testc.Factory;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.List;

import company.user.testc.DAO.ClienteDAO;
import company.user.testc.DAO.ProdutoDAO;
import company.user.testc.Model.Cliente;
import company.user.testc.Model.Produto;

/**
 * Created by Diego on 25/04/2018.
 */

/*@Database indica que esta classe dá acesso aos recursos de banco de dados do aplicativo*/
@Database(entities = {Cliente.class}, version = 6)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ClienteDAO clienteDAO();
    private static AppDatabase INSTANCE;


    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "cliente_db").fallbackToDestructiveMigration().allowMainThreadQueries().addCallback(sRoomDatabaseCallback)
                    .build();
        }
        return INSTANCE;
    }


    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
            new PopulateDbAsync(INSTANCE).execute();
        }
    };

    private static class PopulateDbAsync extends AsyncTask<Void,Void,Void>{
        private final ClienteDAO clienteDAO;

        PopulateDbAsync(AppDatabase db){
            clienteDAO = db.clienteDAO();
        }

        @Override
        protected Void doInBackground(final Void... params){
            List<Cliente> clientes = clienteDAO.getAllWithoutLiveData();
            if (clientes.size() == 0) {
                Cliente cliente = new Cliente(0, "Neguin", "Curitiba", "Paraná", "Rua XV", 0110101010, 1111111111);
                clienteDAO.insertCliente(cliente);
            }
            return null;
        }
    }
}
