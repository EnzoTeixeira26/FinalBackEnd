import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultaDAO {
	public ArrayList<Curso> consultaCurso(Curso a) {
		ArrayList<Curso> listaC = new ArrayList<Curso>();
		try {
			String sql = "SELECT * FROM Curso";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				Curso c = new Curso();
				c.setId(rs.getInt("id"));
				c.setDescricao(rs.getString("descricao"));
				listaC.add(c);
			}
			p.close();
			ConnectionFactory.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaC;
	}

	public ArrayList<Disciplina> consultaDisciplina(Disciplina a) {
		ArrayList<Disciplina> listaD = new ArrayList<Disciplina>();
		try {
			String sql = "SELECT * FROM Disciplina";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				Disciplina d = new Disciplina();
				d.setId(rs.getInt("id"));
				d.setCodigo(rs.getString("codigo"));
				d.setNome(rs.getString("nome"));
				d.setNucleo(rs.getString("codigo"));
				d.setChats_pratica(rs.getInt("chats_pratica"));
				d.setChats_teorica(rs.getInt("chats_teorica"));
				d.setChats_distancia(rs.getInt("chats_distancia"));
				d.setChts_pratica(rs.getFloat("chts_pratica"));
				d.setChts_teorica(rs.getFloat("chts_teorica"));
				d.setChts_distancia(rs.getFloat("chts_distancia"));
				listaD.add(d);
			}
			p.close();
			ConnectionFactory.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaD;
	}

	public ArrayList<String> consultaDisciplinaSemestre() {
		ArrayList<String> listaDS = new ArrayList<String>();
		try {
			String sql = "select d.nome nm, s.descricao des " + "from disciplina d, semestre s, vinculo v "
					+ "where d.id = v.iddisciplina and s.id = v.idsemestre order by s.numero";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next())
				listaDS.add(rs.getString("numero") + " [" + rs.getString("descricao") + "]");
			p.close();
			ConnectionFactory.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDS;
	}
	public ArrayList<String> consultaTotalCporSemestreChats() {
		ArrayList<String> listaDS = new ArrayList<String>();
		try {
			String sql = "SELECT SUM(chats_pratica + chats_teorica + chats_distancia) as Total_Carga_Horaria_CHATS from disciplina";
					//+ " WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			//p.setInt(1, a.getId() );
			ResultSet rs = p.executeQuery();
			while (rs.next())
				listaDS.add(rs.getString("Total_Carga_Horaria_CHATS"));
			p.close();
			ConnectionFactory.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDS;
	}
	public ArrayList<String> consultaTotalCporSemestreChts() {
		ArrayList<String> listaDS = new ArrayList<String>();
		try {
			String sql = "SELECT SUM(chats_pratica + chats_teorica + chats_distancia) as Total_Carga_Horaria_CHATS from disciplina"
					+ "WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next())
				listaDS.add(rs.getString("Total_Carga_Horaria_CHTS"));
			p.close();
			ConnectionFactory.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDS;
	}
}
