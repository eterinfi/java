package mongo;
// Connect to MongoDB with authentication
import java.util.ArrayList;
import java.util.List;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class Mongo1ConnectAuth{
  public static void main( String[] args ){
    try{
	  // Connect to mongodb server
	  ServerAddress serverAddress = new ServerAddress("localhost", 27017);
	  List<ServerAddress> addrs = new ArrayList<ServerAddress>();
	  addrs.add(serverAddress);
	  
	  // Create credentials for authentication
	  MongoCredential credential = MongoCredential.createScramSha1Credential("username", "databaseName", "password".toCharArray());
	  List<MongoCredential> credentials = new ArrayList<MongoCredential>();
	  credentials.add(credential);
	  
	  // Secure MongoDB connection using credentials
	  MongoClient mongoClient = new MongoClient(addrs, credentials);
	  
	  // Connect to database
	  MongoDatabase mongoDatabase = mongoClient.getDatabase("databaseName");
	  System.out.println("Connect to database successfully");
	  
	}catch(Exception e){
	  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}
  }
}