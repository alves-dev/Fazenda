package ClassesDados;

public class fazenda {

    private int cod_fazenda;
    private Boolean confinamento_bovino;
    private Boolean leite;
    private Boolean criacao_aves;
    private Boolean plantacao;

    public fazenda(int cod_fazenda, Boolean confinamento_bovino, Boolean leite, Boolean criacao_aves, Boolean plantacao) {
        this.cod_fazenda = cod_fazenda;
        this.confinamento_bovino = confinamento_bovino;
        this.leite = leite;
        this.criacao_aves = criacao_aves;
        this.plantacao = plantacao;
    }
    
    public fazenda(){
        
    }

    public int getCod_fazenda() {
        return cod_fazenda;
    }

    public void setCod_fazenda(int cod_fazenda) {
        this.cod_fazenda = cod_fazenda;
    }

    public Boolean getConfinamento_bovino() {
        return confinamento_bovino;
    }

    public void setConfinamento_bovino(Boolean confinamento_bovino) {
        this.confinamento_bovino = confinamento_bovino;
    }

    public Boolean getLeite() {
        return leite;
    }

    public void setLeite(Boolean leite) {
        this.leite = leite;
    }

    public Boolean getCriacao_aves() {
        return criacao_aves;
    }

    public void setCriacao_aves(Boolean criacao_aves) {
        this.criacao_aves = criacao_aves;
    }

    public Boolean getPlantacao() {
        return plantacao;
    }

    public void setPlantacao(Boolean plantacao) {
        this.plantacao = plantacao;
    }
    
    
}
