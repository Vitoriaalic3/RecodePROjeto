package DAO;


	import java.sql.Connection;

	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConnectionFactory;
import modelo.Agencia;

	//C
	public class AgenciaDAO {
		public void save(Agencia agencia) {
			String sql="INSERT INTO Agencia(NomeAgencia, EnderecoAgencia)" + 
		"VALUES (?,?)";
			
			Connection conn=null;
			PreparedStatement pstm=null;
			
			try {
				conn=ConnectionFactory.creatConnectiontoMySQL();
				
				pstm=(PreparedStatement) conn.prepareStatement(sql);
				pstm.setString(1, agencia.getNome());
				pstm.setString(2, agencia.getEndereco());
				
				pstm.execute();
				
				System.out.println("Salvo com sucesso");
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
	
	//U
		public void update(Agencia agencia) {
			String sql="UPDATE agencia SET NomeAgencia =?, EnderecoAgencia=?"+
		"WHERE IdAgencia=?";
			
			Connection conn=null;
			PreparedStatement pstm=null;
			try {
				conn=ConnectionFactory.creatConnectiontoMySQL();
				pstm=(PreparedStatement) conn.prepareStatement(sql);
				
				pstm.setString(1, agencia.getNome());
				pstm.setString(2, agencia.getEndereco());
				
				pstm.setInt(3, agencia.getId());
				
				pstm.execute();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstm!=null) {
						pstm.close();
					}
					if(conn!=null) {
						conn.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	//D
		public void deleteByIdAgencia(int IdAgencia) {
			String sql="DELETE FROM agencia WHERE IdAgencia=?";
			Connection conn=null;
			PreparedStatement pstm=null;
			try {
				conn= ConnectionFactory.creatConnectiontoMySQL();
				pstm= (PreparedStatement) conn.prepareStatement(sql);
				
				pstm.setInt(1, IdAgencia);
				
				pstm.execute();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstm!=null) {
						pstm.close();
					}
				 if(conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
		
	//R
	public List<Agencia> getAgencia(){
		String sql="SELECT * FROM agencia";
		List<Agencia> agencias = new ArrayList<Agencia>();
		Connection conn=null;
		PreparedStatement pstm = null;
		
		ResultSet rset=null;
		
		try {
			conn=ConnectionFactory.creatConnectiontoMySQL();
			
			pstm=(PreparedStatement) conn.prepareStatement(sql);
			
			rset=pstm.executeQuery();
			
			while(rset.next()) {
				Agencia agencia=new Agencia();
				
				agencia.setId(rset.getInt("IdAgencia"));
				agencia.setNome(rset.getString("NomeAgencia"));
				agencia.setEndereco(rset.getString("EnderecoAgencia"));
			
				agencias.add(agencia);
			}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					
					try {
					if(rset!=null) {
						rset.close();
					}
				 if(pstm!=null) {
					pstm.close();
				}
			if(conn!=null) {
				conn.close();
			}
		}	catch(Exception e) {
			e.printStackTrace();
			}
		}
		
		return agencias;
		
		
		}
	}
	
