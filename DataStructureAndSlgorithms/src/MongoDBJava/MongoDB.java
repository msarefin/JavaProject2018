package MongoDBJava;

import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoDB {

	public static void main(String[] args) {

		String uri = "mongodb://localhost:27017";
		MongoClientURI clientURI = new MongoClientURI(uri);
		MongoClient mongoClient = null;

		try {
			// Connecto to MongoDB clent
			mongoClient = new MongoClient(clientURI); 
			// Connect o Database
			MongoDatabase mongoDatabase = mongoClient.getDatabase("MySpecialDB"); 
			// Create collection
//			mongoDatabase.createCollection("StudentCollection"); 
			// create or select collection
			MongoCollection<Document> collection = mongoDatabase.getCollection("StudentCollection"); 
			//inserting data
			Document document = new Document("Name","Dinesh Kohli").append("Age", "20").append("Gender", "Male").append("DOB", "10/21/1998").append("Address", new Document("Street Address","23 Johns Pl").append("City", "Queens Village").append("state", "New York").append("ZipCode", 11321));
			collection.insertOne(document);
			
			document = new Document("Name","Raju singh").append("Age", "23").append("Gender", "Male").append("DOB", "10/21/1998").append("Address", new Document("Street Address","23 Johns Pl").append("City", "Queens Village").append("state", "New York").append("ZipCode", 11321));
			collection.insertOne(document);
			document = new Document("Name","David Desouza").append("Age", "32").append("Gender", "Male").append("DOB", "10/21/1998").append("Address", new Document("Street Address","23 Johns Pl").append("City", "Queens Village").append("state", "New York").append("ZipCode", 11321));
			collection.insertOne(document);
			document = new Document("Name","Karen Sejit").append("Age", "30").append("Gender", "Female").append("DOB", "10/21/1998").append("Address", new Document("Street Address","23 Johns Pl").append("City", "Queens Village").append("state", "New York").append("ZipCode", 11321));
			collection.insertOne(document);
			document = new Document("Name","Nancy Morgan").append("Age", "26").append("Gender", "Female").append("DOB", "10/21/1998").append("Address", new Document("Street Address","23 Johns Pl").append("City", "Queens Village").append("state", "New York").append("ZipCode", 11321));
			collection.insertOne(document);
			//updating data 
			collection.updateOne(Filters.eq("Name", "Dinesh Kohli"), Updates.set("Age", "34"));
			
			//Querying Data 
			
			FindIterable<Document> iterDoc =  collection.find(); 
			int i = 1; 
			
			Iterator it = iterDoc.iterator(); 
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println();
			//Delete document from collection
			collection.deleteMany(Filters.eq("Name","Dinesh Kohli"));

			
			// Drop Collection 
			
			collection.drop();
			
			
		} catch (Exception e) {

		} finally {
			mongoClient.close();
		}
	}
	
	
}
