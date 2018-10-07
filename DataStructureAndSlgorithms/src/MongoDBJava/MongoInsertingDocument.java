package MongoDBJava;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoInsertingDocument {

	public static void main(String[] args) {
		String uri = "mongodb://localhost:27017";

		MongoClient mongoClient = null;
		MongoClientURI clentURI = new MongoClientURI(uri);

		try {

//			Connect to MongoDB
			
//			mongoClient = new MongoClient();
//			mongoClient = new MongoClient("localhost",27017);
			mongoClient = new MongoClient(clentURI);

//			Connect to Database
			
			MongoDatabase mongoDatabase = mongoClient.getDatabase("MongoDB");
			
			MongoCollection collection = mongoDatabase.getCollection("test");

			Document document = new Document("Name", "Dinesh");
			document.append("Gender", "male");
			document.append("Address", new Document("Street Address", "123 Jackson ave").append("County", "Brooklyn").append("State", "New York").append("ZipCode", 11432));

			collection.insertOne(document);

		} finally {
			mongoClient.close();
		}

	}

}
