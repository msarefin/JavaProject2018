package MongoDBJava;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDropCollection {

	public static void main(String[] args) {
		String uri = "mongodb://localhost:27017";
		MongoClientURI clientURI = new MongoClientURI(uri);
		MongoClient mongoClient = null;
		
		try {
			mongoClient = new MongoClient(clientURI);
			MongoDatabase database = mongoClient.getDatabase("MongoDB");
			MongoCollection<Document> collection = database.getCollection("test");
			
			collection.drop();
			
			System.out.println("Collection is dropped!");
			
		}catch(Exception e) {
			
		}finally {
			mongoClient.close();
		}
	}
}
