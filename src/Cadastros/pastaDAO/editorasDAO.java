package Cadastros.pastaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Cadastros.Connection.BancoMysql;
import Cadastros.classes.editoras;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class editorasDAO {
    
    public void cadastrar(editoras e) {
        Connection conn = BancoMysql.conectaBanco();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO editoras (nome)VALUES (?)");
            stmt.setString(1, e.getNome());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR!");
        }
    }

    //**************************************************************************
    
    public List<editoras> listar() {
        Connection conn = BancoMysql.conectaBanco();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<editoras> editoras = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM editoras");
            rs = stmt.executeQuery();

            while (rs.next()) {
                editoras e = new editoras();
                e.setId(rs.getInt("id_editoras"));
                e.setNome(rs.getString("nome"));

                editoras.add(e);

            }

        } catch (SQLException ex) {
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return editoras;
    }

    //**************************************************************************
    
    public void alterar(editoras e) {
        Connection conn = BancoMysql.conectaBanco();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement("UPDATE editoras set nome = ? where id_editora = ?");
            stmt.setString(1, e.getNome());
            stmt.setInt(2, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR!");
        }
    }

    //**************************************************************************
    
    public List<editoras> pesquisar(String texto) {
        Connection conn = BancoMysql.conectaBanco();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<editoras> editoras = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM editoras WHERE nome like ?");
            stmt.setString(1, "%" + texto + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                editoras e = new editoras();
                e.setId(rs.getInt("id_editoras"));
                e.setNome(rs.getString("nome"));
                editoras.add(e);
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return editoras;
    }

}
