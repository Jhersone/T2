/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author Proyector
 */
public class Estudiante {
    
    private String nombre;
    private String curso;
    private String asistencia;
    
     public Estudiante() {
        
      }
   

    public Estudiante(String nombre, String curso, String asistencia) {
        this.nombre = nombre;
        this.curso = curso;
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
   


    String getTexto(){
         return this.nombre + ","+this.curso +"| Asistencia " + this.asistencia;
    }

   
    
    
    
    
    
}
