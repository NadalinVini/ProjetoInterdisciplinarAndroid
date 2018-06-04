package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 31/05/2018.
 */
@Entity
public class Cliente {
    //Mostrando quem é a primary key dessa tabela "Cliente"
    @PrimaryKey(autoGenerate = true)
    //Renomeando os atributos
    @ColumnInfo(name = "Idf_Cliente")
    private long ID;
    @ColumnInfo(name = "Nme_Pessoa")
    private String Nome;
    @ColumnInfo(name = "Des_Cidade")
    private String Cidade;
    @ColumnInfo(name = "Des_Estado")
    private String Estado;

    private String Endereco;
    @ColumnInfo(name = "CNPJ_Cliente")
    private long CNPJ;
    @ColumnInfo(name = "CPF_Cliente")
    private long CPF;

    public Cliente(long ID, String nome, String cidade, String estado, String endereco, long CNPJ, long CPF) {
        this.ID = ID;
        this.Nome = nome;
        this.Cidade = cidade;
        this.Estado = estado;
        this.Endereco = endereco;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
    }

    public Cliente(){

    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
}
