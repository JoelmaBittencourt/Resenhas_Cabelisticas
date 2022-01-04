package br.com.resenhascabelisticas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "forum")
public class Forum {


  //  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
	@Size(min = 3, max = 30)
    private String nome;
    
    @NotBlank
	@Size(min = 3, max = 50)
    private String categoria;

    
    @NotBlank
	@Size(min = 3, max = 200)
    private String texto;
    
    private String linkCompra;
    
    
    private String fotoPR;
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Forum other = (Forum) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
        
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getLinkCompra() {
		return linkCompra;
	}

	public void setLinkCompra(String linkCompra) {
		this.linkCompra = linkCompra;
	}

	public String getFotoPR() {
		return fotoPR;
	}

	public void setFotoPR(String fotoPR) {
		this.fotoPR = fotoPR;
	}
  

}