package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 31/05/2018.
 */
@Entity
public class Juridico {
    //Mostrando quem é a primary key dessa tabela "Juridico"
    @PrimaryKey(autoGenerate = true)
    //Renomeando os atributos
    @ColumnInfo(name = "Idf_Juridico")
    private long ID;
    @ColumnInfo(name = "Nme_Representante")
    private String Nome;
    @ColumnInfo(name = "CPF_Juridico")
    private long CPF;
    @ColumnInfo(name = "CPNJ_Juridico")
    private long CNPJ;

    //Falta telefone do Juridico


    public Juridico(long ID, String nome, long CPF, long CNPJ) {
        this.ID = ID;
        Nome = nome;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }
}
