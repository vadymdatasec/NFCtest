public class e.h.b.a.l.a1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String e;
	 /* # instance fields */
	 public android.content.Context a;
	 public java.lang.Boolean b;
	 public java.io.File c;
	 public java.lang.Boolean d;
	 /* # direct methods */
	 public static e.h.b.a.l.a1 ( ) {
		 /* .locals 2 */
		 final String v0 = "android.permission.READ_EXTERNAL_STORAGE"; // const-string v0, "android.permission.READ_EXTERNAL_STORAGE"
		 final String v1 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"
		 /* .line 1 */
		 /* filled-new-array {v0, v1}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public e.h.b.a.l.a1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 java.lang.Boolean .valueOf ( v0 );
		 this.d = v0;
		 /* .line 4 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 9 */
		 final String v0 = "Can\'t create packid log file "; // const-string v0, "Can\'t create packid log file "
		 final String v1 = "packid.log"; // const-string v1, "packid.log"
		 /* .line 14 */
		 v2 = 		 (( e.h.b.a.l.a1 ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->g()Z
		 /* if-nez v2, :cond_0 */
		 return;
		 /* .line 15 */
	 } // :cond_0
	 (( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
	 /* .line 16 */
	 /* new-instance v3, Ljava/util/Date; */
	 /* invoke-direct {v3}, Ljava/util/Date;-><init>()V */
	 /* .line 17 */
	 (( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 /* .line 18 */
	 /* new-instance v5, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v6 = "packid"; // const-string v6, "packid"
	 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* new-instance v6, Ljava/text/SimpleDateFormat; */
	 v7 = java.util.Locale.ENGLISH;
	 final String v8 = "yyyyMMdd-HHmmss"; // const-string v8, "yyyyMMdd-HHmmss"
	 /* invoke-direct {v6, v8, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
	 (( java.text.SimpleDateFormat ) v6 ).format ( v3 ); // invoke-virtual {v6, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
	 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v6 = ".txt"; // const-string v6, ".txt"
	 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 19 */
	 /* new-instance v6, Ljava/io/File; */
	 m.a.a.b.a .a ( v5 );
	 /* invoke-direct {v6, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 this.c = v6;
	 /* .line 20 */
	 v4 = 	 (( java.io.File ) v6 ).exists ( ); // invoke-virtual {v6}, Ljava/io/File;->exists()Z
	 /* if-nez v4, :cond_2 */
	 /* .line 21 */
	 try { // :try_start_0
		 v4 = this.c;
		 v4 = 		 (( java.io.File ) v4 ).createNewFile ( ); // invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* .line 22 */
			 /* new-instance v4, Lcom/orange/business/packid/android/lib/PackId; */
			 v5 = this.a;
			 /* invoke-direct {v4, v5}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
			 /* .line 23 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v5 = "=== New log session started on "; // const-string v5, "=== New log session started on "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* new-instance v5, Ljava/text/SimpleDateFormat; */
			 final String v6 = "HH:mm:ss yyyy/MM/dd"; // const-string v6, "HH:mm:ss yyyy/MM/dd"
			 v7 = java.util.Locale.ENGLISH;
			 /* invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
			 (( java.text.SimpleDateFormat ) v5 ).format ( v3 ); // invoke-virtual {v5, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
			 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = " ==="; // const-string v3, " ==="
			 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.h.b.a.l.a1 ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
			 /* .line 24 */
		 } // :cond_1
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v1,v3 );
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v3 */
		 /* .line 25 */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v1,v0,v3 );
	 } // :cond_2
} // :goto_0
return;
} // .end method
public void a ( Integer p0, Integer[] p1 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_1 */
/* .line 12 */
/* array-length p1, p2 */
int v1 = 0; // const/4 v1, 0x0
/* if-lez p1, :cond_0 */
/* aget p1, p2, v1 */
/* if-nez p1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
java.lang.Boolean .valueOf ( v0 );
this.b = p1;
/* .line 13 */
(( e.h.b.a.l.a1 ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->e()V
} // :cond_1
return;
} // .end method
public void a ( android.app.Activity p0 ) {
/* .locals 2 */
final String v0 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"
/* .line 1 */
v0 = c.h.f.f .a ( p1,v0 );
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = e.h.b.a.l.a1.e;
c.h.e.f .a ( p1,v0,v1 );
/* .line 3 */
} // :cond_0
java.lang.Boolean .valueOf ( v1 );
this.b = p1;
} // :goto_0
return;
} // .end method
public final void a ( android.content.Intent p0 ) {
/* .locals 8 */
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 5 */
(( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
(( java.io.File ) v1 ).listFiles ( ); // invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* aget-object v4, v1, v3 */
/* .line 6 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
v6 = this.a;
(( android.content.Context ) v6 ).getApplicationContext ( ); // invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( android.content.Context ) v6 ).getPackageName ( ); // invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ".provider"; // const-string v6, ".provider"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 7 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "authority:"; // const-string v7, "authority:"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v7 = "packid.log"; // const-string v7, "packid.log"
android.util.Log .i ( v7,v6 );
/* .line 8 */
v6 = this.a;
androidx.core.content.FileProvider .a ( v6,v5,v4 );
/* .line 9 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "uriForFile:"; // const-string v6, "uriForFile:"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v7,v5 );
/* .line 10 */
(( java.util.ArrayList ) v0 ).add ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_0
final String v1 = "android.intent.extra.STREAM"; // const-string v1, "android.intent.extra.STREAM"
/* .line 11 */
(( android.content.Intent ) p1 ).putParcelableArrayListExtra ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
return;
} // .end method
public final void a ( java.io.File p0 ) {
/* .locals 9 */
/* .line 36 */
(( java.io.File ) p1 ).listFiles ( ); // invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 37 */
/* array-length v0, p1 */
/* const/16 v1, 0xa */
/* if-lt v0, v1, :cond_2 */
/* .line 38 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 39 */
/* array-length v3, p1 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_1 */
/* aget-object v5, p1, v4 */
/* .line 40 */
(( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
/* move-result-wide v6 */
/* cmp-long v8, v6, v0 */
/* if-gez v8, :cond_0 */
/* .line 41 */
(( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
/* move-result-wide v0 */
/* move-object v2, v5 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 42 */
p1 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = (( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 43 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " deleted"; // const-string v0, " deleted"
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.log"; // const-string v0, "packid.log"
android.util.Log .d ( v0,p1 );
} // :cond_2
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 26 */
v0 = (( e.h.b.a.l.a1 ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->g()Z
/* if-nez v0, :cond_0 */
return;
/* .line 27 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 28 */
try { // :try_start_0
/* new-instance v0, Ljava/io/FileWriter; */
v1 = this.c;
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 29 */
try { // :try_start_1
/* new-instance v1, Ljava/io/BufferedWriter; */
/* invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 30 */
try { // :try_start_2
(( java.io.BufferedWriter ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
/* .line 31 */
(( java.io.BufferedWriter ) v1 ).newLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->newLine()V
/* .line 32 */
(( java.io.BufferedWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 33 */
try { // :try_start_3
(( java.io.BufferedWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
(( java.io.FileWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 34 */
try { // :try_start_5
(( java.io.BufferedWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v1 */
try { // :try_start_6
	 (( java.lang.Throwable ) p1 ).addSuppressed ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :goto_0
/* throw p1 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* :catchall_2 */
/* move-exception p1 */
try { // :try_start_7
	 (( java.io.FileWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
	 /* :try_end_7 */
	 /* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
	 /* :catchall_3 */
	 /* move-exception v0 */
	 try { // :try_start_8
		 (( java.lang.Throwable ) p1 ).addSuppressed ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
	 } // :goto_1
	 /* throw p1 */
	 /* :try_end_8 */
	 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 35 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Can\'t write to packid log file "; // const-string v1, "Can\'t write to packid log file "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.c;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "packid.log"; // const-string v1, "packid.log"
	 android.util.Log .e ( v1,v0,p1 );
} // :cond_1
} // :goto_2
return;
} // .end method
public final android.content.Intent b ( android.content.Intent p0 ) {
/* .locals 6 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* const v2, 0x7f0e0094 */
(( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
(( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
(( java.io.File ) v1 ).listFiles ( ); // invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
(( java.io.File ) v1 ).listFiles ( ); // invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* aget-object v4, v1, v3 */
final String v5 = "* "; // const-string v5, "* "
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 5 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "android.intent.extra.TEXT"; // const-string v1, "android.intent.extra.TEXT"
(( android.content.Intent ) p1 ).putExtra ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // .end method
public java.io.File b ( ) {
/* .locals 10 */
/* .line 6 */
(( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
/* .line 7 */
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
/* array-length v1, v0 */
/* if-lez v1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
/* aget-object v2, v0, v1 */
(( java.io.File ) v2 ).lastModified ( ); // invoke-virtual {v2}, Ljava/io/File;->lastModified()J
/* move-result-wide v2 */
/* .line 10 */
/* aget-object v4, v0, v1 */
/* .line 11 */
/* array-length v5, v0 */
} // :goto_0
/* if-ge v1, v5, :cond_2 */
/* aget-object v6, v0, v1 */
/* .line 12 */
(( java.io.File ) v6 ).lastModified ( ); // invoke-virtual {v6}, Ljava/io/File;->lastModified()J
/* move-result-wide v7 */
/* cmp-long v9, v7, v2 */
/* if-ltz v9, :cond_0 */
/* .line 13 */
(( java.io.File ) v6 ).lastModified ( ); // invoke-virtual {v6}, Ljava/io/File;->lastModified()J
/* move-result-wide v2 */
/* move-object v4, v6 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :cond_2
} // .end method
public final java.io.File c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
final String v1 = "logs"; // const-string v1, "logs"
(( android.content.Context ) v0 ).getExternalFilesDir ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
/* .line 2 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
/* .line 3 */
(( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
} // :cond_0
} // .end method
public final java.lang.String d ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
v1 = this.a;
/* invoke-direct {v0, v1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
v1 = /* .line 2 */
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
v3 = } // :goto_0
/* if-ge v2, v3, :cond_1 */
/* .line 4 */
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 5 */
(( com.orange.oab.contactless.packid.hce.user.User ) v3 ).getEmail ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) v3 ).getEmail ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
/* if-nez v4, :cond_0 */
v4 = (( com.orange.oab.contactless.packid.hce.user.User ) v3 ).isDefault ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
/* if-nez v4, :cond_0 */
/* .line 6 */
(( com.orange.oab.contactless.packid.hce.user.User ) v3 ).getEmail ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;
/* aput-object v3, v1, v2 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.h.b.a.l.a1 ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.b.a.l.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->c()Ljava/io/File;
/* .line 3 */
(( e.h.b.a.l.a1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/a1;->a(Ljava/io/File;)V
/* .line 4 */
(( e.h.b.a.l.a1 ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->a()V
} // :cond_0
return;
} // .end method
public java.lang.Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.String h ( ) {
/* .locals 1 */
/* .line 1 */
(( e.h.b.a.l.a1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->b()Ljava/io/File;
this.c = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
java.lang.Boolean .valueOf ( v0 );
this.d = v0;
/* .line 3 */
v0 = this.c;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
java.lang.Boolean .valueOf ( v0 );
this.d = v0;
/* .line 5 */
(( e.h.b.a.l.a1 ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->e()V
/* .line 6 */
} // :cond_0
(( e.h.b.a.l.a1 ) p0 ).j ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->j()Ljava/lang/String;
} // .end method
public void i ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
java.lang.Boolean .valueOf ( v0 );
this.d = v0;
return;
} // .end method
public final java.lang.String j ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
try { // :try_start_0
/* new-instance v0, Ljava/io/FileReader; */
v1 = this.c;
/* invoke-direct {v0, v1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
try { // :try_start_1
/* new-instance v1, Ljava/io/BufferedReader; */
/* invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 4 */
try { // :try_start_2
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .line 5 */
} // :goto_0
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 7 */
} // :cond_0
try { // :try_start_3
(( java.io.BufferedReader ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
(( java.io.FileReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileReader;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catchall_0 */
/* move-exception v2 */
/* .line 8 */
try { // :try_start_5
(( java.io.BufferedReader ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v1 */
try { // :try_start_6
(( java.lang.Throwable ) v2 ).addSuppressed ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :goto_1
/* throw v2 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* :catchall_2 */
/* move-exception v1 */
try { // :try_start_7
(( java.io.FileReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileReader;->close()V
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
/* :catchall_3 */
/* move-exception v0 */
try { // :try_start_8
(( java.lang.Throwable ) v1 ).addSuppressed ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :goto_2
/* throw v1 */
/* :try_end_8 */
/* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 9 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t read to packid log file "; // const-string v2, "Can\'t read to packid log file "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.log"; // const-string v2, "packid.log"
android.util.Log .e ( v2,v1,v0 );
} // :cond_1
final String v0 = ""; // const-string v0, ""
} // .end method
public void k ( ) {
/* .locals 8 */
/* .line 1 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.SEND_MULTIPLE"; // const-string v1, "android.intent.action.SEND_MULTIPLE"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "message/rfc822"; // const-string v1, "message/rfc822"
/* .line 2 */
(( android.content.Intent ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Pack ID Log "; // const-string v2, "Pack ID Log "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v2, Ljava/text/SimpleDateFormat; */
/* invoke-direct {v2}, Ljava/text/SimpleDateFormat;-><init>()V */
/* new-instance v3, Ljava/util/Date; */
/* invoke-direct {v3}, Ljava/util/Date;-><init>()V */
(( java.text.SimpleDateFormat ) v2 ).format ( v3 ); // invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "android.intent.extra.SUBJECT"; // const-string v2, "android.intent.extra.SUBJECT"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 4 */
(( e.h.b.a.l.a1 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/a1;->b(Landroid/content/Intent;)Landroid/content/Intent;
/* .line 5 */
(( e.h.b.a.l.a1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/a1;->a(Landroid/content/Intent;)V
final String v1 = "android.intent.extra.STREAM"; // const-string v1, "android.intent.extra.STREAM"
/* .line 6 */
(( android.content.Intent ) v0 ).getParcelableArrayListExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
/* .line 7 */
(( e.h.b.a.l.a1 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/b/a/l/a1;->d()[Ljava/lang/String;
final String v3 = "android.intent.extra.EMAIL"; // const-string v3, "android.intent.extra.EMAIL"
(( android.content.Intent ) v0 ).putExtra ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
/* .line 8 */
try { // :try_start_0
v2 = this.a;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* const v3, 0x7f0e013a */
(( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
android.content.Intent .createChooser ( v0,v2 );
/* .line 9 */
v2 = this.a;
(( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/high16 v3, 0x10000 */
(( android.content.pm.PackageManager ) v2 ).queryIntentActivities ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 10 */
v3 = } // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v3, Landroid/content/pm/ResolveInfo; */
/* .line 11 */
v3 = this.activityInfo;
v3 = this.packageName;
/* .line 12 */
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_0
/* check-cast v5, Landroid/net/Uri; */
/* .line 13 */
v6 = this.a;
int v7 = 3; // const/4 v7, 0x3
(( android.content.Context ) v6 ).grantUriPermission ( v3, v5, v7 ); // invoke-virtual {v6, v3, v5, v7}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V
/* .line 14 */
} // :cond_1
v1 = this.a;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "There are no email clients installed."; // const-string v1, "There are no email clients installed."
final String v2 = "packid.log"; // const-string v2, "packid.log"
/* .line 15 */
android.util.Log .e ( v2,v1,v0 );
/* .line 16 */
v0 = this.a;
int v2 = 0; // const/4 v2, 0x0
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :goto_1
return;
} // .end method
