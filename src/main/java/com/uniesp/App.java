package com.uniesp;
import com.uniesp.controllers.AlunoController;
import com.uniesp.controllers.TurmasController;


class App { 
    public static void main( String[] args ) {
        TurmasController turma = new TurmasController();
        turma.insert("turma 1");
    }

}