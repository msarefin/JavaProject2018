package MongoDBJava;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.mongodb.MongoClient;

public class MongoAggregation {

	public static void main(String[] args) {
		String uri = "mongobd://localhost:27017";
		MongoClientURI clientURI = new MongoClientURI(uri);
		
		MongoClient mongoClient = null; 
		
		try {
			mongoClient = new MongoClient(clientURI);
			
			MongoDatabase mongoDatabase = mongoClient.getDatabase("MongoDB");
			MongoCollection<Document> collection = mongoDatabase.getCollection("test");
			
			System.out.println("MongoDB Connected");
			
			
			
			
		}catch(Exception e) {
			
		}finally {
			mongoClient.close();
		}
	}
}
