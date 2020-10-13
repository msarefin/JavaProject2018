package MongoDBJava;

import java.nio.file.DirectoryStream.Filter;
import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoUpdate {

	public static void main(String[] args) {
		String uri = "mongodb://localhost:27017";
		MongoClientURI clientURI = new MongoClientURI(uri);
		MongoClient mongoClient = null;

		try {
			mongoClient = new MongoClient(clientURI);
			MongoDatabase database = mongoClient.getDatabase("MongoDB");
			MongoCollection<Document> collection = database.getCollection("test");
			collection.updateOne(Filters.eq("Name", "Mangla"), Updates.set("Name", "Mangla Koshi"));
			collection.updateMany(Filters.eq("Name","Mangla Koshi"), Updates.set("Age", "27"));

			FindIterable<Document> iterDoc = collection.find();
			int i = 1;

			Iterator it = iterDoc.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
				i++;
			}
		} catch (Exception e) {

		} finally {
			mongoClient.close();
		}

	}
}