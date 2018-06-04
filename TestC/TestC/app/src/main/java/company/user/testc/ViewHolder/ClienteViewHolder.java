package company.user.testc.ViewHolder;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import company.user.testc.Model.Cliente;
import company.user.testc.R;

/**
 * Created by User on 03/06/2018.
 */

public class ClienteViewHolder {

    private EditText editNome;
    private EditText editCidade;
    private EditText editEstado;
    private EditText editEndereco;
    private EditText editCNJP;
    private EditText editCEP;
    private Button btnSalvarCliente;

    public ClienteViewHolder(View view) {
        editNome = view.findViewById(R.id.edit_nome);
        editCidade = view.findViewById(R.id.edit_cidade);
        editEstado = view.findViewById(R.id.edit_estado);
        editEndereco = view.findViewById(R.id.edit_endereco);
        editCNJP = view.findViewById(R.id.edit_CNPJ);
        editCEP = view.findViewById(R.id.edit_CEP);

    }

    public void setOnClickListener(View.OnClickListener listener){
        btnSalvarCliente.setOnClickListener(listener);
    }

    public String getTextfromEditNome() { return editNome.getText().toString();}
    public String getTextfromEditCidade(){return editCidade.getText().toString();}
    public String getTextfromEditEstado() {return  editEstado.getText().toString();}
    public String getTextfromEditEndereco() {return editEndereco.getText().toString();}
    public Long getLongfromEditCNPJ(){return Long.parseLong(editCNJP.getText().toString());}
    public Long getLongfromCEP(){return Long.parseLong(editCEP.getText().toString());}

    }

