
package DTO;


public class UsuarioDTO {
    
    
    private int id_usuario;
    private String nome_usuario,senha_usuario,perfil,cadastronome_usuario,cadastrosenha_usuario,cadastroperfil ;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getCadastronome_usuario() {
        return cadastronome_usuario;
    }

    public void setCadastronome_usuario(String cadastronome_usuario) {
        this.cadastronome_usuario = cadastronome_usuario;
    }

    public String getCadastrosenha_usuario() {
        return cadastrosenha_usuario;
    }

    public void setCadastrosenha_usuario(String cadastrosenha_usuario) {
        this.cadastrosenha_usuario = cadastrosenha_usuario;
    }

    public String getCadastroperfil() {
        return cadastroperfil;
    }

    public void setCadastroperfil(String cadastroperfil) {
        this.cadastroperfil = cadastroperfil;
    }
    
    
    
    
}
