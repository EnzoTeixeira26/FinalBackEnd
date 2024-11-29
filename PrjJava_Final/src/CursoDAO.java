import java.sql.PreparedStatement;

public class CursoDAO {
	public boolean insertCurso(Curso a) {
		try {
			String sql = "INSERT INTO Curso (descricao) VALUES (?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, a.getDescricao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean updateCurso(Curso a) {
		try {
			String sql = "UPDATE Curso SET descricao = ? WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(2, a.getId());
			p.setString(1, a.getDescricao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean deleteCurso(Curso a) {
		try {
			String sql = "DELETE FROM Curso WHERE id = ?";
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
