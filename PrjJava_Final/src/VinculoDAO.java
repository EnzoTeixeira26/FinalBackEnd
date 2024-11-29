import java.sql.PreparedStatement;

public class VinculoDAO {
	public boolean insertVinculo(Vinculo a) {
		try {
			String sql = "INSERT INTO Vinculo (idCurso, idSemestre, idDisciplina) VALUES (?, ? , ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(1, a.getIdCurso());
			p.setInt(2, a.getIdSemestre());
			p.setInt(3, a.getIdDisciplina());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean updateVinculo(Vinculo a) {
		try {
			String sql = "UPDATE Vinculo SET idCurso = ?, idSemestre = ?, idDisciplina = ? WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(4, a.getId());
			p.setInt(1, a.getIdCurso());
			p.setInt(2, a.getIdSemestre());
			p.setInt(3, a.getIdDisciplina());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean deleteVinculo(Vinculo a) {
		try {
			String sql = "DELETE FROM Vinculo WHERE id = ?";
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
