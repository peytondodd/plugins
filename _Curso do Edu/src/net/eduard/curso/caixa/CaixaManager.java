package net.eduard.curso.caixa;

import java.util.ArrayList;
import java.util.Map;

import net.eduard.api.lib.storage.Storable;

public class CaixaManager implements Storable {
	
	private ArrayList<Caixa> caixas = new ArrayList<>();
	
	

	@Override
	public Object restore(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void store(Map<String, Object> map, Object object) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Caixa> getCaixas() {
		return caixas;
	}

	public void setCaixas(ArrayList<Caixa> caixas) {
		this.caixas = caixas;
	}

}
