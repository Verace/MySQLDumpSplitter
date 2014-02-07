MySQLDumpSplitter
=================

Splits a MySQL dump into separate .sql table files.


The code in this repository is basic but functional. It does
what it says on the tin. The user chooses a MySQL dumpfile
and the programme will output (in the same directory) a number
of SQL files corresponding to the tables in that database
dump. It has been tested on Linux and Windows (Java 1.7).
It has been tested on a single schema only and not on an
entire server with multiple schemas. At this point, for example,
tables with the same name would be overwritten (assuming it worked).

It works for this command

mysqldump -u root -p --extended-insert=FALSE --complete-insert=TRUE myschema > dumpfile.sql

and

mysqldump -u root -p myschema > dumpfile.sql

but will not work for this

mysqldump -u root -p --compatible=ansi,no_table_options,no_field_options,no_key_options 
--hex-blob --skip-opt myschema > importansi.sql

This is because it depends on an "UNLOCK TABLES;" command being present in
the dumpfile.

It is hoped that improvements will be made in the future. I'm
using this code as the basis for a porting project and I will
endeavour to update as and when required.

For those of you who are not Github/Java gurus, a .jar file is
available from the release link at the top of the project home
page.

The command to issue is
java -jar MySQLDumpSplitter.jar 
from the directory where the file is.

Should you have any feedback/input/ideas/suggestions, you are welcome 
to send them to me, Pól Ua Laoínecháin (linehanp@tcd.ie).
  
  

