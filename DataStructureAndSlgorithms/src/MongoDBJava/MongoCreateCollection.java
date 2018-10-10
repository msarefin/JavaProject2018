package MongoDBJava;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoCreateCollection {

	public static void main(String[] args) {
		String uri = "mongodb://localhost:27017";
		MongoClientURI clientURI = new MongoClientURI(uri);
		MongoClient mongoClient = null; 
		
		try {
			
			mongoClient = new MongoClient(clientURI);
			System.out.println("connected to MongoDB");
			MongoDatabase mongoDatabase = mongoClient.getDatabase("MongoDB");
			System.out.println("connected to Database");
			mongoDatabase.createCollection("Flower");
			System.out.println("created collection but no data added");
			
		}catch(Exception e) {
			
		}
		finally {
			mongoClient.close();
		}
	}
}
