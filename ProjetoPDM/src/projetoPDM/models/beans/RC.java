package projetoPDM.models.beans;

public class RC {
    private int idrc, idusu, idalu, idbol;
    private String obs;
    private Aluno alu;
    private Boletim bol;
    private Usuario usu;

    public RC(int idrc, int idusu, int idalu, int idbol, String obs, Aluno alu, Boletim bol, Usuario usu) {
        this.idrc = idrc;
        this.idusu = idusu;
        this.idalu = idalu;
        this.idbol = idbol;
        this.obs = obs;
        this.alu = alu;
        this.bol = bol;
        this.usu = usu;
    }

    public RC(Usuario usu) {
        this.usu = usu;
    }

    public RC(Boletim bol) {
        this.bol = bol;
    }

    public RC(Aluno alu) {
        this.alu = alu;
    }

    
    
    
    public Aluno getAlu() {
        return alu;
    }

    public void setAlu(Aluno alu) {
        this.alu = alu;
    }

    public Boletim getBol() {
        return bol;
    }

    public void setBol(Boletim bol) {
        this.bol = bol;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    public RC(int idrc, int idusu, int idalu, int idbol, String obs) {
        this.idrc = idrc;
        this.idusu = idusu;
        this.idalu = idalu;
        this.idbol = idbol;
        this.obs = obs;
    }

    public RC(int idusu, int idalu, int idbol, String obs) {
        this.idusu = idusu;
        this.idalu = idalu;
        this.idbol = idbol;
        this.obs = obs;
    }

    

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public RC(String obs) {
        this.obs = obs;
    }

    public RC(int idusu, int idalu, int idbol) {
        this.idusu = idusu;
        this.idalu = idalu;
        this.idbol = idbol;
    }

    public RC(int idrc) {
        this.idrc = idrc;
    }

    public RC(int idrc, int idusu, int idalu, int idbol) {
        this.idrc = idrc;
        this.idusu = idusu;
        this.idalu = idalu;
        this.idbol = idbol;
    }

    public int getIdrc() {
        return idrc;
    }

    public void setIdrc(int idrc) {
        this.idrc = idrc;
    }

    public int getIdusu() {
        return idusu;
    }

    public void setIdusu(int idusu) {
        this.idusu = idusu;
    }

    public int getIdalu() {
        return idalu;
    }

    public void setIdalu(int idalu) {
        this.idalu = idalu;
    }

    public int getIdbol() {
        return idbol;
    }

    public void setIdbol(int idbol) {
        this.idbol = idbol;
    }
        public String toString() {
        return "Registro completo{" + "idrc=" + idrc + ", idusu=" + idusu + ", idalu=" + idalu + ", idbol=" + idbol + ", obs=" + obs +  '}';
    } 
}
