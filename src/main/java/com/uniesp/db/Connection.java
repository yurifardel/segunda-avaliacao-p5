package com.uniesp.db;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class Connection {
  static ConnectionString connectionString = new ConnectionString("mongodb+srv://iesp_db:password@cluster0.yvnkv.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
  static MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
  
  protected static MongoClient mongoClient = MongoClients.create(settings);

  protected static MongoDatabase db = mongoClient.getDatabase("db_lp");
  

}
