package MongoDBJava;

import java.util.concurrent.ExecutionException;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoChangeStreamException;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoFindUpdate {

	
	
	public static void main(String[] args) {

		String uri = "mongodb://localhost:27017";
		MongoClient mongoClient = null; 
		MongoClientURI clientURI = new MongoClientURI(uri);
		
		try {
			
			mongoClient = new MongoClient(clientURI);
			MongoDatabase mongoDatabase = mongoClient.getDatabase("MongoDB");
			MongoCollection collection = mongoDatabase.getCollection("test");
			
			System.out.println("Database Connected!");
			
			
			Document found = (Document)collection.find(new Document("Name","Dinesh")).first();
			
			if(found != null) {
				System.out.println("Found User!");
				
				Bson updateValue = new Document("Age","24");
				Bson updateOperation = new Document("$set",updateValue); 
				collection.updateOne(found, updateOperation);
				System.out.println("user updated!");
				
			}
			
		}catch(Exception e) {
			
		}
		finally {
			mongoClient.close();
		}
		
		
	}
}
