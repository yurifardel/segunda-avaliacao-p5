package com.uniesp;
import com.uniesp.controllers.AlunoController;


class App { 
    public static void main( String[] args ) {
        AlunoController aluno = new AlunoController();
        aluno.update("61a680558fb2e23325d333dc", "melissa", "melissa@email");
    }

}