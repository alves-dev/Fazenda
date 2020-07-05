package ClassesDados;

public class permissoes {

    /*
cod_usuario    
usuarios
fazenda
controle_lotes
controle_animais
vendas
compras
controle_pastos    
relatorios 
        
     */
    
int cod_usuario;     
boolean usuarios;
boolean fazenda;
boolean controle_lotes;
boolean controle_animais;
boolean vendas;
boolean compras;
boolean controle_pastos;
boolean relatorios;

    public permissoes(int cod_usuario, boolean usuarios, boolean fazenda, boolean controle_lotes, boolean controle_animais, boolean vendas, boolean compras, boolean controle_pastos, boolean relatorios) {
        this.cod_usuario = cod_usuario;
        this.usuarios = usuarios;
        this.fazenda = fazenda;
        this.controle_lotes = controle_lotes;
        this.controle_animais = controle_animais;
        this.vendas = vendas;
        this.compras = compras;
        this.controle_pastos = controle_pastos;
        this.relatorios = relatorios;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public boolean isUsuarios() {
        return usuarios;
    }

    public void setUsuarios(boolean usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isFazenda() {
        return fazenda;
    }

    public void setFazenda(boolean fazenda) {
        this.fazenda = fazenda;
    }

    public boolean isControle_lotes() {
        return controle_lotes;
    }

    public void setControle_lotes(boolean controle_lotes) {
        this.controle_lotes = controle_lotes;
    }

    public boolean isControle_animais() {
        return controle_animais;
    }

    public void setControle_animais(boolean controle_animais) {
        this.controle_animais = controle_animais;
    }

    public boolean isVendas() {
        return vendas;
    }

    public void setVendas(boolean vendas) {
        this.vendas = vendas;
    }

    public boolean isCompras() {
        return compras;
    }

    public void setCompras(boolean compras) {
        this.compras = compras;
    }

    public boolean isControle_pastos() {
        return controle_pastos;
    }

    public void setControle_pastos(boolean controle_pastos) {
        this.controle_pastos = controle_pastos;
    }

    public boolean isRelatorios() {
        return relatorios;
    }

    public void setRelatorios(boolean relatorios) {
        this.relatorios = relatorios;
    }


}
