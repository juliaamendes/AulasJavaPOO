package com.senai.aula07_mvc.crud_usuario.controller;

import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.OperadorDAO;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.List;

public class OperadorController {
     public OperadorDAO operadorDAO = new OperadorDAO ();

    public List<Operador> listarOperadores(){
        List<Operador> lista = List.of();
        return lista;
    }

        public boolean cadastrarOperador(Operador operador){
            if(operador != null){
                operadorDAO.salvar(operador);
                return true;
            }
            return false;
        }

        public boolean atualizarOperador(Operador operador){
            if(operador != null){
                operadorDAO.atualizar(operador);
                return true;
            }
            return false;
        }
        public boolean deletarOperador(int id){
            if (id >= 0) {
                operadorDAO.deletar(id);
                return true;
            } else
                return true;

        }

    public void atualizarSupervisor(Supervisor supervisor) {
    }
}


