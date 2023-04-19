# IBM-TEST
Simple SQL client App

# Description

The project features a console application app written in Java that interacts with a SQL
database named "ibm_test", in which a table "provider" is contained

This console application takes an input arg in order to execute representing the client_id
of the provider entity and returns a file with all providers matching that argument

# Libraries used
- spring-boot-starter-data-jpa --> interacts with the Provider Repository
- mysql-connector-j            --> driver class to connect to mySQL
- lombok                       --> allows annotations and automated getters,setters,ctors

# To Seed the Db
Open a SQL console and run the script.sql file contained in the root directory of the app

# To build:
`mvn clean compile`

# To package
`mvn package`

# To run
`java -jar ./target/console_client-1.0-SNAPSHOT.jar <CLIENT_ID_NUMBER>`

# Path in which the resulting file is generated
Root directory in which the app runs, name: response.txt 