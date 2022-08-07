import java.util.*;
/**
 * Write a description of class Paciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paciente
{
    private long cpf = 0;
    private String nome = "";
    private long telefone = 0;
    private String convenio = "";
    private String diagnostico = "";
    private int numeroConsultas = 0;
    
    public Paciente (String nome, long cpf, long telefone, String convenio, String diagnostico, int numeroConsultas){
        this.nome = nome;
        this.convenio = convenio;
        this.diagnostico = diagnostico;
        this.telefone = telefone;
        this.cpf = cpf;
        this.numeroConsultas = numeroConsultas;
    }
    public void setNome (String nome){
        nome = nome.toUpperCase();
        this.nome = nome;
    }
    public  void setConvenio (String convenio){
        convenio = convenio.toUpperCase();
        this.convenio = convenio;
    }
    public void setDiagnostico (String diagnostico){
    this.diagnostico = diagnostico;
    }
    public void setTelefone (long telefone){
        this.telefone = telefone;
    }
    public void setCpf (long cpf){
        this.cpf = cpf;
    }
    public void setNumeroConsultas (int consultas){
        numeroConsultas = consultas;
    }
    public String getNome(){return nome;}
    public String getConvenio(){return convenio;}
    public String getDiagnostico(){return diagnostico;}
    public long getCpf () {return cpf;}
    public int getNumeroConsultas () {return numeroConsultas;}
    public long getTelefone () {return telefone;}
    public String toString () 
    {
    return "\n Nome do paciente= "+ nome+"\n Cpf "+cpf+"\n Telefone= "+telefone+ "\n Convênio= "+convenio+ "\n Diagnóstico= "+diagnostico+"\n Número de consultas do mês= "+numeroConsultas;
    
   }
}
