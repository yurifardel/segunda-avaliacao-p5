package com.uniesp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.FindIterable;
import com.uniesp.db.collections.Turmas;

import org.bson.Document;

public class TurmasController extends Turmas{
  public void insert(String descricao){
    try {
      List<Document> alunos = new ArrayList<>(); 
      FindIterable<Document> interable = db.getCollection("alunos").find();
      
      for(Document document: interable){
        alunos.add(document);
        
      }

      Document doc = new Document("descricao", descricao).append("alunos", alunos);
      TurmasCollection.insertOne(doc);
    } catch (Exception e) {
      System.out.println(e);
    }
    
  }
}
