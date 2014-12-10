package com.mmb;

import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

import java.util.List;


public class Main {


    public static void main(String[] args) {

        try{

            Database db = new Database("local:bbs");

            db.registerClass(Account.class);

            for (Account account : (List<Account>)db.getAll(  new OSQLSynchQuery<Account>("SELECT FROM Account")  ) ) {
                System.out.println(account.getSurname());
            }

            Transaction transaction = new Transaction();

            //OObjectDatabaseTx db = new OObjectDatabaseTx("local:bbs").open("admin", "admin");
            //db.getEntityManager().registerEntityClass(Account.class);

            //db.setAutomaticSchemaGeneration(true);

            //Account account = db.newInstance(Account.class);
            //account.setSurname( "m'n vader" );

            //db.save(account);

            //System.out.println(account.getSurname());

            //for (Account account : (List<Account>)db.query() {
            //    System.out.println(account.getSurname());
            //}
            //long accounts = db.countClass("Account");
            //System.out.println(accounts);
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("Hello ");
    }
}
