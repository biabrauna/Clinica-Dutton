/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicah.model;

/**
 *
 * @author Usuario
 */
public class Cliente {
        private String codigo;
        private String nome2;
        private String especialidade;
        private String email;
        
        public String getCodigo(){
            return codigo;
        }
        public void setCodigo(String codigo){
            this.codigo = codigo;
        }
        public String getNome(){
            return nome2;
        }
        public String setNome(String nome2){
            this.nome2 = nome2;
            return null;
        }
        public String getEspecialidade(){
            return especialidade;
        }
        public String setEspecialidade(String especialidade){
            this.especialidade = especialidade;
            return null;
        }
        public String getEmail(){
            return email;
        }
        public String setEmail(String email){
            this.especialidade = especialidade;
            return null;
        }
}
