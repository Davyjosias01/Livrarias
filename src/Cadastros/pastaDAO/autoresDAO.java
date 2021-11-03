package Cadastros.pastaDAO;

import Cadastros.Connection.BancoMysql;
import Cadastros.classes.autores;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class autoresDAO {
    
    public void cadastrar(autores a) {
        
        Connection conn = BancoMysql.conectaBanco();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO autores (nome, endereco, numero, bairro, cidade, CPF)VALUES (?,?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEndereco());
            stmt.setInt(3, a.getNumero());
            stmt.setString(4, a.getBairro());
            stmt.setString(5, a.getCidade());
            stmt.setBigDecimal(6, new BigDecimal(a.getCpf()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            // verifi = 1;
            
        } catch (SQLException ex) {
            // verifi = 0;
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR!");
        }
    }

    public List<autores> listar() {
        Connection conn = BancoMysql.conectaBanco();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<autores> autores = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM autores");
            rs = stmt.executeQuery();

            while (rs.next()) {
                autores e = new autores();
                e.setId(rs.getInt("id_autor"));
                e.setNome(rs.getString("nome"));

                autores.add(e);

            }

        } catch (SQLException ex) {
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return autores;
    }

}
