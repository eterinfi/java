package data.io.db.mongo;
// Update document
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DB5Update{
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
	  
	  // Update document
	  collection.updateMany(Filters.eq("likes", 100), new Document("$set", new Document("likes", 200)));
	  
	  // Retrieve all documents
	  FindIterable<Document> findIterable = collection.find();
	  MongoCursor<Document> mongoCursor = findIterable.iterator();
	  while(mongoCursor.hasNext()) {
		  System.out.println(mongoCursor.next());
	  }
	  
	  // Close connection
	  mongoClient.close();
	  
	}catch(Exception e){
	  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}
  }
}