package DAO;


	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	
	public class AgenciaDAO {
		public void save(Agencia agencia) {
			String sql="INSERT INTO Agenda(nome, endereco)" + 
		"VALUES (?,?)";
			
			Connection conn=null;
			PreparedStatement pstm=null;
			
			try {
				conn=ConnectionFactory.creatConnectiontoMySQL();
				
				pstm=(PreparedStatement) conn.prepareStatement(sql);
				pstm.setString(1, agencia.getNome());
				pstm.setString(2, agencia.getEndereco());
				
				pstm.execute();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try{
					if(pstm!=null) {
						pstm.close();
				}
					if(conn!=null) {
						conn.close();
					}
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
