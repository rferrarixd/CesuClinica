package modelDatabase;
// Generated 11/04/2013 09:30:34 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Agendamento generated by hbm2java
 */
public class Agendamento  implements java.io.Serializable {


     private Integer id;
     private Integer idPaciente;
     private Date dataAgendamento;
     private Integer idAcademico;
     private Integer idSala;
     private Integer idUsuario;
     private String tipoAtendimento;
     private Integer idCurso;

    public Agendamento() {
    }

    public Agendamento(Integer idPaciente, Date dataAgendamento, Integer idAcademico, Integer idSala, Integer idUsuario, String tipoAtendimento, Integer idCurso) {
       this.idPaciente = idPaciente;
       this.dataAgendamento = dataAgendamento;
       this.idAcademico = idAcademico;
       this.idSala = idSala;
       this.idUsuario = idUsuario;
       this.tipoAtendimento = tipoAtendimento;
       this.idCurso = idCurso;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
    public Date getDataAgendamento() {
        return this.dataAgendamento;
    }
    
    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    public Integer getIdAcademico() {
        return this.idAcademico;
    }
    
    public void setIdAcademico(Integer idAcademico) {
        this.idAcademico = idAcademico;
    }
    public Integer getIdSala() {
        return this.idSala;
    }
    
    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getTipoAtendimento() {
        return this.tipoAtendimento;
    }
    
    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
    public Integer getIdCurso() {
        return this.idCurso;
    }
    
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }




}


