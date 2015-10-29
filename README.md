# ormlite-sqlcipher
integrate ormlite with sqlcipher

tips:

casue sqlcipher rewrite all the related sqlite files. Such as (SQLiteDatabase, SQLiteOpenHelper, Cursor, etc.)
to integrate ormlite with sqlcipher, you should copy all the files of ormlite-android.jar
replace all the import (android.database.*) to (net.sqlcipher.database.*)

enjoy the code :)

