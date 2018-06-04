package company.user.testc;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import company.user.testc.DAO.ClienteDAO;
import company.user.testc.Factory.AppDatabase;
import company.user.testc.Model.Cliente;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("company.user.testc", appContext.getPackageName());
    }

    @Test
    public void testeInsertBanco() throws Exception{
        Context appContext = InstrumentationRegistry.getTargetContext();
        AppDatabase app = AppDatabase.getDatabase(appContext);
        ClienteDAO clienteDAO = app.clienteDAO();
        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius Nadalin");
        cliente.setCidade("Curitiba");
        cliente.setEstado("Paraná");
        cliente.setEndereco("Rua XV");
        cliente.setCPF(0L);
        cliente.setCNPJ(1111111111L);

        assertTrue(ClienteController.insertCliente(cliente) > 0);
        Cliente resultado = clienteDAO.findByCliente(1);
        assertTrue(clienteDAO.update(resultado) > 0);
        assertTrue(clienteDAO.delete(resultado) > 0);
    }
}
