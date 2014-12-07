# BBS
This is (will) be a P2P transaction system. It is comparable to Bitcoin in the sense that all the transactions will be stored locally at the client. However where Bitcoin just does coin transactions can this be used for a bigger back-end

##### Code overview
1. The main core is written in Java.
2. The Database uses OrientDB. This is intergrated within the app and this is a NoSQL database.
3. The P2P connections will be done over TCP

### Current targets
##### 1. Database
1. The database will be embedded into the program. (done)
2. Transactions will be stored in "blocks" (Like Bitcoin).
3. All information has to be hashed so access to a client will not be enough.
4. The for every block will be a hash made that will be stored into another object (aka table) so they can quickly be synced and validated with other clients.
5. Blocks will be closed by a random client. That client is in charge of validating transactions. However other clients do sill need to validate theirs (someway, needs more thought)

##### 2. Connection
1. The connection will be made trough TCP.
2. There will be a default list of basic clients to (try) to connect.
3. Each client holds his own list of availible clients that can be synced
4. When a new clients joins the network it talks to one of the basic servers. They will add the new client to their list and they will syinc it to the rest (and viceversa)
5. There needs to be a backup way to connect servers. IRC can be an option for this.

##### 3. Muuuuuch later
1. Rewrite to C++. Currently i use Windows and programming C++ proved to give many issues.
2. Other database engine if this one prooves not functinal enough. BerkeleyDB can be valid option (with C++)

### Notes
Please note that this is just a personal project. And in no way can or should be used (for now atleast) for live programs. I won't give support on this and if it breaks (something) it is not me you should blame.