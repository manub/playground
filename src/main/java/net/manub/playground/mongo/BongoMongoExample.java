package net.manub.playground.mongo;

import com.mongodb.*;

public class BongoMongoExample {

    public static void main(String args[]) throws Exception {
        MongoClient mongoClient = new MongoClient();

        DB manubDB = mongoClient.getDB("manub");

        DBCollection collection = manubDB.getCollection("test");

        DBObject dbObject = BasicDBObjectBuilder.start()
                .append("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("info", new BasicDBObject("x", 203).append("y", 102))
                .get();

        collection.insert(dbObject);


    }

}
