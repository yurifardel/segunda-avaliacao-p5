package com.uniesp.controllers;

import com.uniesp.db.collections.Alunos;
import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class AlunoController extends Alunos{
  public void insert(String name, String email){
    Document doc = new Document("name", name).append("email", email);
    collection.insertOne(doc);
  }
  
  public void delete(String id){
    Bson query = eq("_id", new ObjectId(id));
    collection.deleteOne(query);
  }

 public void update(String id, String name, String email){
  Bson query = eq("_id", new ObjectId(id)); 

  Bson updates = Updates.combine(
    Updates.set("name", name), 
    Updates.set("email", email), 
    Updates.currentTimestamp("lastUpdated")
  );

  UpdateOptions options = new UpdateOptions().upsert(true);

  collection.updateOne(query, updates, options);
 }

}
