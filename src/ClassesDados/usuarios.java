package ClassesDados;

public class usuarios {

    /*
cod_Usuario
nome
Usuario  
senha    
     */
    
    
    int cod_usuario;
    String nome;
    String usuario;
    String senha;

    public usuarios(int cod_usuario, String nome, String usuario, String senha) {
        this.cod_usuario = cod_usuario;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
    
}
