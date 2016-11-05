package mongo;
// Connect to MongoDB
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Mongo1Connect{
  public static void main( String args[] ){
    try{
	  // Connect to mongodb server
	  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	  
	  // Connect to database
	  MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");
	  System.out.println("Connect to database successfully");
	  
	}catch(Exception e){
	  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}
  }
}