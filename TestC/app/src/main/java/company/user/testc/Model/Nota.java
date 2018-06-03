package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by User on 31/05/2018.
 */
@Entity
    public class Nota {
        //Mostrando quem é a primary key dessa tabela "Nota"
        @PrimaryKey(autoGenerate = true)
        //Renomeando os atributos
        @ColumnInfo(name = "Idf_Nota")
        private long ID;

        //Chama estrangeira da tabela Juridico
        private long Juridico;

        //Chave Estrangeira da Tabela Cliente
        private long Cliente;

        @ColumnInfo(name = "Dta_Cadastro")
        private Date Data;
        @ColumnInfo(name = "Tipo_Pagamento")
        private String Pagamento;

    public Nota(long ID, long juridico, long cliente, Date data, String pagamento) {
        this.ID = ID;
        Juridico = juridico;
        Cliente = cliente;
        Data = data;
        Pagamento = pagamento;
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

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getPagamento() {
        return Pagamento;
    }

    public void setPagamento(String pagamento) {
        Pagamento = pagamento;
    }
}
