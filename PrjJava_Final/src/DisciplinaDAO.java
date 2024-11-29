import java.sql.PreparedStatement;

public class DisciplinaDAO {
	public boolean insertDisciplina(Disciplina a) {
		try {
			String sql = "INSERT INTO Disciplina (codigo, nome, nucleo, chats_pratica, "
					+ "chats_teorica, chats_distancia, chts_pratica, chts_teorica, chts_distancia)VALUES (?, ?, ?, ? , ?, ?, ?, ?, ?) ";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, a.getCodigo());
			p.setString(2, a.getNome());
			p.setString(3, a.getNucleo());
			p.setInt(4, a.getChats_pratica());
			p.setInt(5, a.getChats_teorica());
			p.setInt(6, a.getChats_distancia());
			p.setFloat(7, a.getChts_pratica());
			p.setFloat(8, a.getChts_teorica());
			p.setFloat(9, a.getChts_distancia());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean updateDisciplina(Disciplina a) {
		try {
			String sql = "UPDATE Disciplina SET codigo = ?, nome = ?, nucleo = ?, chats_pratica = ?, "
					+ "chats_teorica = ?, chats_distancia = ?, chts_pratica = ?, chts_teorica = ?, "
					+ "chts_distancia = ? WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(10, a.getId());
			p.setString(1, a.getCodigo());
			p.setString(2, a.getNome());
			p.setString(3, a.getNucleo());
			p.setInt(4, a.getChats_pratica());
			p.setInt(5, a.getChats_teorica());
			p.setInt(6, a.getChats_distancia());
			p.setFloat(7, a.getChts_pratica());
			p.setFloat(8, a.getChts_teorica());
			p.setFloat(9, a.getChts_distancia());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean deleteDisciplina(Disciplina a) {
		try {
			String sql = "DELETE FROM Disciplina WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(1, a.getId());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
