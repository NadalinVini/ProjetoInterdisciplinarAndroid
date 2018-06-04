package company.user.testc;

import java.sql.SQLClientInfoException;

import company.user.testc.DAO.ClienteDAO;
import company.user.testc.Model.Cliente;

/**
 * Created by opet on 04/06/2018.
 */

public class ClienteController{
    static ClienteDAO cli;

    public static Long insertCliente(Cliente cliente){
        return cli.insertCliente(cliente);
    }
}
