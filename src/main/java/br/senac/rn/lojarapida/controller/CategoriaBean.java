package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.model.Categoria;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "categoriaBean") // informa p o jsf e um gerenciador de telas
public class CategoriaBean {
    
    private Categoria categoria = new Categoria();
    
    public void salvar(){
        CategoriaDAO dao = new CategoriaDAO();
        dao.insert(this.categoria);
        this.categoria = new Categoria();
    }
    
    
    
    

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
