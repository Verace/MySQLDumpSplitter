MySQLDumpSplitter
=================

Splits a MySQL dump into separate .sql table files.


The code in this repository is basic but functional. It does
what it says on the tin. The user chooses a MySQL dumpfile
and the programme will output (in the same directory) a number
of SQL files corresponding to the tables in that database
dump. It has been tested on Linux and Windows (Java 1.7).
It has been tested on a single schema only and not on an
entire server with multiple schemas. 

It works for this command
mysqldump -u root -p --extended-insert=FALSE --complete-insert=TRUE myschema > dumpfile.sql
and
mysqldump -u root -p tgac_browser_demo > dumpfilex.sql
but will not work for this
mysqldump -u root -p --compatible=ansi,no_table_options,no_field_options,no_key_options 
--hex-blob --skip-opt tgac_browser_demo > importansi.sql

This is because it depends on an "UNLOCK TABLES" command being present.

It is hoped that improvements will be made in the future. I'm
using this code as the basis for a porting project and I will
endeavour to update as and when required.

For those of you who are not Github/Java gurus, a .jar file is
available here (url_to_be_announced) and the command to issue is
java -jar MySQLDumpSplitter.jar from the directory where the jar
is.

Should you have any feedback/input/ideas/suggestions, you are welcome
to send them to me, Pól Ua Laoínecháin (linehanp@tcd.ie).
