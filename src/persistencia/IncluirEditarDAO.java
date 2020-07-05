package persistencia;

import ClassesDados.racaAnimais;
import ClassesDados.animais;
import ClassesDados.lotes;
import ClassesDados.tipoAnimal;
import ClassesDados.fazendaConfinamento;
import ClassesDados.status;
import ClassesDados.statusPastos;
import ClassesDados.fazenda;
import ClassesDados.pastos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirEditarDAO {

    animais animais = new animais();
    tipoAnimal tipoAnimal = new tipoAnimal();
    pastos pastos = new pastos();
    racaAnimais racaAnimais = new racaAnimais();
    status status = new status();
    statusPastos statusPastos = new statusPastos();
    fazenda fazenda = new fazenda();
    fazendaConfinamento fazendaConfinamento = new fazendaConfinamento();
    lotes lote = new lotes();

    public int IncluirAnimais(animais animais) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO animais (identificacao2, cod_status, "
                + "status, cod_tipoAnimal, tipoAnimal, cod_raca, raca, idade, cod_pasto, pasto, loteCompra, loteVenda, sexo, obs, dtCadastro, dtUltimaAteracao, "
                + "cod_fazenda)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {

            pstmt.setString(1, animais.getIdentificacao2().trim());
            pstmt.setInt(2, animais.getCod_status());
            pstmt.setString(3, animais.getStatus().trim());
            pstmt.setInt(4, animais.getCod_tipoAnimal());
            pstmt.setString(5, animais.getTipoAnimal().trim());
            pstmt.setInt(6, animais.getCod_raca());
            pstmt.setString(7, animais.getRaca().trim());
            pstmt.setInt(8, animais.getIdade());
            pstmt.setInt(9, animais.getCod_pasto());
            pstmt.setString(10, animais.getPasto().trim());
            pstmt.setInt(11, animais.getLoteCompra());
            pstmt.setInt(12, animais.getLoteVenda());
            pstmt.setString(13, String.valueOf(animais.getSexo()));
            pstmt.setString(14, animais.getObs().trim());
            pstmt.setTimestamp(15, new java.sql.Timestamp(animais.getDtCadastro().getTime()));
            pstmt.setTimestamp(16, new java.sql.Timestamp(animais.getDtUltimaAteracao().getTime()));
            pstmt.setInt(17, animais.getCod_fazenda());

            registros = pstmt.executeUpdate();
        }

        System.out.println("ate aqui 3");
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;

        } else {
            return codigo;
        }

    }

    public int IncluirTipoAnimal(tipoAnimal tipoAnimal) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO tipoAnimal (descricao)"
                + "VALUES (?)")) {

            pstmt.setString(1, tipoAnimal.getDescricao().toUpperCase().trim());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirStatus(status status) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO status (status)"
                + "VALUES (?)")) {

            pstmt.setString(1, status.getStatus().toUpperCase().trim());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirStatusPastos(statusPastos statusPastos) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO statusPastos (status) "
                + "VALUES (?)")) {

            pstmt.setString(1, statusPastos.getStatus().toUpperCase().trim());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirRacaAnimaias(racaAnimais racaAnimais) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO racaAnimais (raca, tipoDescricao, cod_tipo) "
                + "VALUES (?,?,?)")) {

            pstmt.setString(1, racaAnimais.getRaca().toUpperCase().trim());
            pstmt.setString(2, racaAnimais.getTipoDescricao().toUpperCase().trim());
            pstmt.setInt(3, racaAnimais.getCod_tipo());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirCadastroPastos(pastos pastos) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO pastos (pasto, cod_status, status,"
                + " ladoA, ladoB, ladoC, ladoD, diagonal, perimetro, area, dtCadastro, dtUltimaAteracao, cod_fazenda) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)")) {

            pstmt.setString(1, pastos.getPasto().toUpperCase().trim());
            pstmt.setInt(2, pastos.getCod_status());
            pstmt.setString(3, pastos.getStatus().toUpperCase().trim());
            pstmt.setInt(4, pastos.getLadoA());
            pstmt.setInt(5, pastos.getLadoB());
            pstmt.setInt(6, pastos.getLadoC());
            pstmt.setInt(7, pastos.getLadoD());
            pstmt.setInt(8, pastos.getDiagonal());
            pstmt.setInt(9, pastos.getPerimetro());
            pstmt.setInt(10, pastos.getArea());
            pstmt.setTimestamp(11, new java.sql.Timestamp(pastos.getDtCadastro().getTime()));
            pstmt.setTimestamp(12, new java.sql.Timestamp(pastos.getDtUltimaAteracao().getTime()));
            pstmt.setInt(13, pastos.getCod_fazenda());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int AlterarAnimais(animais animais, int identificacao) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("UPDATE animais SET identificacao2 = ?,"
                + " cod_status = ?, status = ?, cod_tipoAnimal = ?, tipoAnimal = ?, cod_raca = ?, raca = ?, idade = ?,"
                + " cod_pasto = ?, pasto = ?, loteCompra = ?, loteVenda = ?, sexo = ?, obs = ?, dtCadastro = ?,"
                + " dtUltimaAteracao = ?, cod_fazenda = ? where identificacao = ?")) {

            pstmt.setString(1, animais.getIdentificacao2().trim());
            pstmt.setInt(2, animais.getCod_status());
            pstmt.setString(3, animais.getStatus().trim());
            pstmt.setInt(4, animais.getCod_tipoAnimal());
            pstmt.setString(5, animais.getTipoAnimal().trim());
            pstmt.setInt(6, animais.getCod_raca());
            pstmt.setString(7, animais.getRaca().trim());
            pstmt.setInt(8, animais.getIdade());
            pstmt.setInt(9, animais.getCod_pasto());
            pstmt.setString(10, animais.getPasto().trim());
            pstmt.setInt(11, animais.getLoteCompra());
            pstmt.setInt(12, animais.getLoteVenda());
            pstmt.setString(13, String.valueOf(animais.getSexo()));
            pstmt.setString(14, animais.getObs().trim());
            pstmt.setTimestamp(15, new java.sql.Timestamp(animais.getDtCadastro().getTime()));
            pstmt.setTimestamp(16, new java.sql.Timestamp(animais.getDtUltimaAteracao().getTime()));
            pstmt.setInt(17, animais.getCod_fazenda());
            pstmt.setInt(18, identificacao);

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;

        } else {
            return codigo;
        }

    }

    public void AlterarFazenda(fazenda fazenda) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("UPDATE fazenda SET "
                + "confinamento_bovinos = ?, leite = ?, criacao_aves = ?, plantacao = ? where cod_fazenda = ?")) {

            pstmt.setBoolean(1, fazenda.getConfinamento_bovino());
            pstmt.setBoolean(2, fazenda.getLeite());
            pstmt.setBoolean(3, fazenda.getCriacao_aves());
            pstmt.setBoolean(4, fazenda.getPlantacao());
            pstmt.setInt(5, fazenda.getCod_fazenda());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

    }

    public void AlterarFazendaCofinamento(fazendaConfinamento fazendaConfi) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("UPDATE fazendaConfinamento SET "
                + " bezerrosA = ?, bezerrosB = ?, garrotesA = ?, garrotesB = ?, boisA = ?, boisB = ?,"
                + " boisVelhosA = ?, boisVelhosB = ?,"
                + " kgDiaBezerros = ?, kgDiaGarrotes = ?, kgDiaBois = ?, kgDiaBoisVelhos = ?, "
                + " m2Bezerros = ?, m2Garrotes = ?, m2Bois = ?, m2BoisVelhos = ?,"
                + " periodo1A = ?, periodo1B = ?, alimentacao1 = ?,"
                + " periodo2A = ?, periodo2B = ?, alimentacao2 = ?,"
                + " periodo3A = ?, periodo3B = ?, alimentacao3 = ?,"
                + " periodo4A = ?, periodo4B = ?, alimentacao4 = ? "
                + " where cod_fazenda = ? ")) {

            pstmt.setInt(1, fazendaConfi.getBezerrosA());
            pstmt.setInt(2, fazendaConfi.getBezerrosB());
            pstmt.setInt(3, fazendaConfi.getGarrotesA());
            pstmt.setInt(4, fazendaConfi.getGarrotesB());
            pstmt.setInt(5, fazendaConfi.getBoisA());
            pstmt.setInt(6, fazendaConfi.getBoisB());
            pstmt.setInt(7, fazendaConfi.getBoisVelhosA());
            pstmt.setInt(8, fazendaConfi.getBoisVelhosB());

            pstmt.setFloat(9, (float) fazendaConfi.getKgDiaBezerros());
            pstmt.setFloat(10, (float) fazendaConfi.getKgDiaGarrotes());
            pstmt.setFloat(11, (float) fazendaConfi.getKgDiaBois());
            pstmt.setFloat(12, (float) fazendaConfi.getKgDiaBoisVelhos());

            pstmt.setInt(13, fazendaConfi.getM2Bezerros());
            pstmt.setInt(14, fazendaConfi.getM2Garrotes());
            pstmt.setInt(15, fazendaConfi.getM2Bois());
            pstmt.setInt(16, fazendaConfi.getM2BoisVelhos());

            pstmt.setInt(17, fazendaConfi.getPeriodo1A());
            pstmt.setInt(18, fazendaConfi.getPeriodo1B());
            pstmt.setInt(19, fazendaConfi.getAlimentacao1());

            pstmt.setInt(20, fazendaConfi.getPeriodo2A());
            pstmt.setInt(21, fazendaConfi.getPeriodo2B());
            pstmt.setInt(22, fazendaConfi.getAlimentacao2());

            pstmt.setInt(23, fazendaConfi.getPeriodo3A());
            pstmt.setInt(24, fazendaConfi.getPeriodo3B());
            pstmt.setInt(25, fazendaConfi.getAlimentacao3());

            pstmt.setInt(26, fazendaConfi.getPeriodo4A());
            pstmt.setInt(27, fazendaConfi.getPeriodo4B());
            pstmt.setInt(28, fazendaConfi.getAlimentacao4());

            pstmt.setInt(29, fazendaConfi.getCod_fazenda());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

    }

    public int IncluirLotes(lotes lote) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO lotes (cod_fazenda, numeroLote,"
                + " statusLote, pasto, qtdAnimais_Compra, qtdMachos_Compra, qtdFemea_Compra, rsArroba_Compra, rsManejo_Compra,"
                + " rsTotal_Compra, kgArrobaTotal_Compra, kgArrobaMedia_Compra, idade_Compra, qtdAnimais_Venda, qtdMachos_Venda,"
                + " qtdFemea_Venda, rsArroba_Venda, rsManejo_Venda, rsTotal_Venda, kgArrobaTotal_Venda, kgArrobaMedia_Venda, "
                + " idade_Venda, animaiMortos, periodoConfinamento, dt_Compra, dt_Venda) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {

            pstmt.setInt(1, lote.getCod_fazenda());
            pstmt.setInt(2, lote.getNumeroLote());
            pstmt.setString(3, lote.getStatusLote().toUpperCase().trim());
            pstmt.setString(4, lote.getPasto());
            pstmt.setInt(5, lote.getQtdAnimais_Compra());
            pstmt.setInt(6, lote.getQtdMachos_Compra());
            pstmt.setInt(7, lote.getQtdFemea_Compra());
            pstmt.setDouble(8, lote.getRsArroba_Compra());
            pstmt.setDouble(9, lote.getRsManejo_Compra());
            pstmt.setDouble(10, lote.getRsTotal_Compra());
            pstmt.setDouble(11, lote.getKgArrobaTotal_Compra());
            pstmt.setDouble(12, lote.getKgArrobaMedia_Compra());
            pstmt.setInt(13, lote.getIdade_Compra());
            pstmt.setInt(14, lote.getQtdAnimais_Venda());
            pstmt.setInt(15, lote.getQtdMachos_Venda());
            pstmt.setInt(16, lote.getQtdFemea_Venda());
            pstmt.setDouble(17, lote.getRsArroba_Venda());
            pstmt.setDouble(18, lote.getRsManejo_Venda());
            pstmt.setDouble(19, lote.getRsTotal_Venda());
            pstmt.setDouble(20, lote.getKgArrobaTotal_Venda());
            pstmt.setDouble(21, lote.getKgArrobaMedia_Venda());
            pstmt.setInt(22, lote.getIdade_Venda());
            pstmt.setInt(23, lote.getAnimaiMortos()); 
            pstmt.setInt(24, lote.getPeriodoConfinamento()); 
            pstmt.setTimestamp(25, new java.sql.Timestamp(lote.getDt_Compra().getTime()));
            pstmt.setTimestamp(26, new java.sql.Timestamp(lote.getDt_Venda().getTime()));

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

}
