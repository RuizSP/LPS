
package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private Professor ministrante;
    private List<Aluno> lstAlunos;
   // private List<Professor> listaProfessores;

    public Disciplina(){
        this.nome = "";
        this.semestre = -1;
        this.horario = "0h";
        this.ministrante = new Professor();
        this.lstAlunos = new ArrayList();
        //listaProfessores = new ArrayList();
    }
    
    @Override
    public String toString(){
        String txt = "---- Dados da Disciplina ----\n"
        +"Nome: " + this.nome + "\n"
        +"Semestre: "+ this.semestre + "\n"
        +"Horario: " + this.horario;
        
        txt += ministrante.toString();
        if(!lstAlunos.isEmpty()){
                for(int i=0; i<lstAlunos.size(); i++){
                txt += lstAlunos.get(i).toString();
            }
        }
                
        return txt;
    }
    
    
    public void copiar(Disciplina outra){
        this.nome = outra.getNome();
        this.semestre = outra.getSemestre();
        this.horario = outra.getHorario();
        
        this.ministrante.copiar(outra.getMinistrante());
        
        for(int i=0;i<lstAlunos.size(); i++){
            this.lstAlunos.get(i).copiar(outra.getLstAlunos().get(i));
        }
        
    }
    
    /*public List<Professor> getListaProfessores() {
        //return listaProfessores;
    }*/
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Professor ministrante) {
        this.ministrante = ministrante;
    }

    public List<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    public void setLstAlunos(List<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }        
    
}
