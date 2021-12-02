package com.uniesp.db.collections;

import com.mongodb.client.MongoCollection;
import com.uniesp.db.Connection;

import org.bson.Document;

public class Turmas extends Connection {
  protected static MongoCollection<Document> TurmasCollection = db.getCollection("turmas");
  
}
