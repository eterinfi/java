package mongo;
// Insert document
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo4Insert{
  public static void main( String args[] ){
    try{
	  // Connect to mongodb server
	  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	  
	  // Connect to database
	  MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");
	  System.out.println("Connect to database successfully");
	  
	  // Select collection
	  MongoCollection<Document> collection = mongoDatabase.getCollection("test");
	  System.out.println("Select collection `test` successfully");
	  
	  // Insert document
	  Document document = new Document("title", "MongoDB").
	                          append("description", "database").
							  append("likes", 100).
							  append("by", "Fly");
	  List<Document> documents = new ArrayList<Document>();
	  documents.add(document);
	  collection.insertMany(documents); //collection.insertOne(document);
	  System.out.println("Insert document successfully");
	}catch(Exception e){
	  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}
  }
}