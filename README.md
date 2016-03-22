MySQLDumpSplitter
=================

Splits a MySQL dump into separate .sql table files.


The code in this repository is basic but functional. It does
what it says on the tin. The user chooses a MySQL dumpfile
and the programme will output (in the same directory) a number
of SQL files corresponding to the tables in that database
dump. It has been tested on Linux (Ubuntu 12.04 LTS),  Windows 7 and Darwin 12.4.0 (all 64 bit).

Note, the version of Java must be 1.7. The "raw" code (i.e. mine) does work with 1.6, but something about
the underlying Java GUI libraries fails on 1.6 and I am not in a position to support multiple JDKs/JREs.

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

or

mysqldump -d -u root -p myschema > nodatadump.sql (no data at all).

This is because it depends on an "UNLOCK TABLES;" command being present in
the dumpfile. I have examined this and a two-pass solution (inelegant?) may be necessary. Watch this space.

It is hoped that improvements will be made in the future. I'm
using this code as the basis for a porting project and I will
endeavour to update as and when required.

For those of you who are not Github/Java gurus, a .jar file is
available from here: http://dl.bintray.com/verace/MySQLDumpSplitter/jar/. The release will only work on 64 bit systems.

The command to issue is
java -jar MySQLDumpSplitter.jar 
from the directory where the file is.
  



