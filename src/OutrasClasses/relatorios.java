package OutrasClasses;

import InterfaceControle.Principal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import persistencia.conexao;

public class relatorios {

    private final String relatorioTodosAnimais = "Relatórios\\todosAnimais.jasper";
    private final String relatorioAnimaisDetalhes = "Relatórios\\animaisDetalhes.jasper";
    private final String relatorioTeste = "Relatórios\\teste.jasper";

    public void geraConsultaParamentro(String relatorioNome, HashMap parametros) {
        String relatorio = verificaRelatorio(relatorioNome);

        conexao conexao = new conexao();

        JasperPrint print = null;

        try {
            print = JasperFillManager.fillReport(relatorio, parametros, conexao.getConexao());
        } catch (JRException e) {
            System.out.println(e);
        }

        JasperViewer viewer = new JasperViewer(print, false);

        viewer.setVisible(true);

    }

    public void geraDataSource(String relatorioNome, HashMap parametros, JRResultSetDataSource dataSource) {
        String relatorio = verificaRelatorio(relatorioNome);

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A where a.cod_status <> 1 and a.cod_status <> 3";

        Statement pstmtCon = null;
        ResultSet rs = null;
        try {
            pstmtCon = conexao.getConexao().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = pstmtCon.executeQuery(selectSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

         JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        
        
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(relatorio, new HashMap(), jrRS);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperViewer.viewReport(jasperPrint, false);

    }

    private String verificaRelatorio(String nome) {

        nome = "Relatórios\\" + nome + ".jasper";

        if (nome.equalsIgnoreCase(relatorioTodosAnimais)) {
            nome = relatorioTodosAnimais;
        }
        if (nome.equalsIgnoreCase(relatorioAnimaisDetalhes)) {
            nome = relatorioAnimaisDetalhes;
        }
        if (nome.equalsIgnoreCase(relatorioTeste)) {
            nome = relatorioTeste;
        }

        return nome;
    }

}
