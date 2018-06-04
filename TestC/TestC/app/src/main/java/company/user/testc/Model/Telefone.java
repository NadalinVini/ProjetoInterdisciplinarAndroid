package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 31/05/2018.
 */
@Entity
public class Telefone {
    //Mostrando quem é a primary key dessa tabela "Telefone"
    @PrimaryKey(autoGenerate = true)
    //Renomeando os atributos
    @ColumnInfo(name = "Idf_Telefone")
    private long ID;

    private long Juridico;
    private long Cliente;

    @ColumnInfo(name = "Num_Fixo")
    private long Fixo;
    @ColumnInfo(name = "Num_Celular")
    private long Celular;

    public Telefone(long ID, long juridico, long cliente, long fixo, long celular) {
        this.ID = ID;
        Juridico = juridico;
        Cliente = cliente;
        Fixo = fixo;
        Celular = celular;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getJuridico() {
        return Juridico;
    }

    public void setJuridico(long juridico) {
        Juridico = juridico;
    }

    public long getCliente() {
        return Cliente;
    }

    public void setCliente(long cliente) {
        Cliente = cliente;
    }

    public long getFixo() {
        return Fixo;
    }

    public void setFixo(long fixo) {
        Fixo = fixo;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long celular) {
        Celular = celular;
    }
}
