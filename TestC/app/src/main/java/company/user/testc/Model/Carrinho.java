package company.user.testc.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.math.BigDecimal;

/**
 * Created by User on 31/05/2018.
 */
@Entity
public class Carrinho {
        //Mostrando quem é a primary key dessa tabela "Carrinho"
        @PrimaryKey(autoGenerate = true)
        //Renomeando os atributos
        @ColumnInfo(name = "Idf_Produto")
        //Chave composta da Tabela de Produtos
        private long ID;
        @ColumnInfo(name = "Idf_Nota_Fiscal")
        //Chave composta da Tabela Nota Fiscal
        private long NOTA;
        @ColumnInfo(name = "Qtd_Produtos")
        private long Quantidade;
        @ColumnInfo(name = "Vlr_Unitario")
        private BigDecimal Valor;

    public Carrinho(long ID, long NOTA, long quantidade, BigDecimal valor) {
        this.ID = ID;
        this.NOTA = NOTA;
        Quantidade = quantidade;
        Valor = valor;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getNOTA() {
        return NOTA;
    }

    public void setNOTA(long NOTA) {
        this.NOTA = NOTA;
    }

    public long getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(long quantidade) {
        Quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return Valor;
    }

    public void setValor(BigDecimal valor) {
        Valor = valor;
    }
}
