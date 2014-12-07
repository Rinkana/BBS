package com.mmb;

import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

import javax.management.Query;
import java.util.List;

/**
 * Created by Max on 6-12-2014.
 * This is a wrapper for the database so it is simpler to use.
 */
public class Database {

    private String path = "local:bbs";

    private OObjectDatabaseTx connection;

    public Database(String path) throws Exception{
        if(path.length() > 5){ //Needs to be bigger then "local:"
            this.path = path; //Set the given path
            this.connect(); //Try to connect to the database
        }else{
            throw new Exception("Given path not long enoug");
        }
    }

    private boolean connect() throws Exception{
        try{
            this.connection = new OObjectDatabaseTx(this.path).open("admin", "admin"); //TODO: option to give name and password so it is safer;
            return true;
        }catch (Exception e){
            //Connection failed. For now this just catches it. The constructor holds returns the excepion.
            //TODO: Do i really need this? The connection already throws an exception.
            //TODO: Don't just print this but use actual logging;
            throw new Exception("Failed database connection failed.");
        }

        /*

        db.getEntityManager().registerEntityClass(Account.class);

        Account account = db.newInstance(Account.class);
        account.setName( "Luke" );
        account.setSurname( "Skywalker" );

        db.save(account);

        long accounts = db.countClass("Account");
        System.out.println(accounts);
        return true;*/
    }

    //public List<Object> getAll(Object object, String query){
    //    return this.connection.query( new OSQLSynchQuery<object>(query));
    //}

}
