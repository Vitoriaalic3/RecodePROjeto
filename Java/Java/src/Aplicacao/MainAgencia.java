package Aplicacao;

import DAO.AgenciaDAO;
import modelo.Agencia;

public class MainAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agencia agencia=new Agencia();
		agencia.setNome("Alice");
		agencia.setEndereco("Rua dos Alfeneiros, numero 4. Rio de Janeiro, Brasil");
		
		AgenciaDAO agenciaDao=new AgenciaDAO();
		//agenciaDao.save(agencia);
		
		//att
		
		Agencia a1=new Agencia();
		a1.setNome("Alices Travel");
		a1.setId(1);
		a1.setEndereco("Wonderland, 666");
		
		//agenciaDao.update(a1);
		
		//delete
		agenciaDao.deleteByIdAgencia(2);
		
		
		for(Agencia a:agenciaDao.getAgencia()) {
			System.out.println("Agencia: " +a.getNome());
		}
	}

}
