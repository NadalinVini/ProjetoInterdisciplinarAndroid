package company.user.testc.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import company.user.testc.Model.Cliente;
import company.user.testc.R;

/**
 * Created by User on 03/06/2018.
 */

public class ClienteAdapter extends RecyclerView.Adapter<ClienteAdapter.ClienteViewHolder>{

    class ClienteViewHolder extends RecyclerView.ViewHolder{
        private final TextView clienteItemView;

        private ClienteViewHolder(View itemView){
            super(itemView);
            clienteItemView = itemView.findViewById(R.id.textViewNome);
        }
    }

    private final LayoutInflater mInflater;
    private List<Cliente> mClientes;

    public ClienteAdapter(Context context) {mInflater = LayoutInflater.from(context);}

    @Override
    public ClienteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.listar_cliente,parent,false);
        return new ClienteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ClienteViewHolder holder, int position) {
        if(mClientes != null){
            Cliente atual = mClientes.get(position);
            holder.clienteItemView.setText(atual.getNome());
        }
    }

    public void setClientes(List<Cliente> clientes){
        mClientes = clientes;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(mClientes != null){
            return mClientes.size();
        }
        return 0;
    }
}
