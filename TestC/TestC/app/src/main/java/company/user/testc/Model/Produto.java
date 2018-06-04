package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 31/05/2018.
 */
@Entity
public class Produto {
    //Mostrando quem é a primary key dessa tabela "Produto"
    @PrimaryKey(autoGenerate = true)
    //Renomeando os atributos
    @ColumnInfo(name = "Idf_Produto")
    private long ID;

    @ColumnInfo(name = "Des_Produto")
    private String Descricao;

    @ColumnInfo(name = "Des_Marca")
    private String Marca;

    //Constructor
    public Produto(long ID, String descricao, String marca) {
        this.ID = ID;
        Descricao = descricao;
        Marca = marca;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }




}
