import java.sql.PreparedStatement;

public class SemestreDAO {
	public boolean insertSemestre(Semestre a) {
		try {
			String sql = "INSERT INTO Semestre (numero, descricao) VALUES (?, ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(1, a.getNumero());
			p.setString(2, a.getDescricao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean updateSemestre(Semestre a) {
		try {
			String sql = "UPDATE Semestre SET numero = ?, descricao = ? WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(3, a.getId());
			p.setInt(1, a.getNumero());
			p.setString(2, a.getDescricao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean deleteSemestre(Semestre a) {
		try {
			String sql = "DELETE FROM Semestre WHERE id = ?";
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
