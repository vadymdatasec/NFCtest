public class org.apache.log4j.lf5.viewer.configure.MRUFileManager {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public java.util.LinkedList b;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.configure.MRUFileManager ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a:I */
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->b()V
		 int v0 = 3; // const/4 v0, 0x3
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(I)V
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.configure.MRUFileManager ( ) {
		 /* .locals 1 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a:I */
		 /* .line 7 */
		 (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->b()V
		 /* .line 8 */
		 (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(I)V
		 return;
	 } // .end method
	 public static void createConfigurationDirectory ( ) {
		 /* .locals 4 */
		 final String v0 = "user.home"; // const-string v0, "user.home"
		 /* .line 1 */
		 java.lang.System .getProperty ( v0 );
		 final String v1 = "file.separator"; // const-string v1, "file.separator"
		 /* .line 2 */
		 java.lang.System .getProperty ( v1 );
		 /* .line 3 */
		 /* new-instance v2, Ljava/io/File; */
		 /* new-instance v3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v0 = "lf5"; // const-string v0, "lf5"
		 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 4 */
		 v0 = 		 (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 5 */
		 try { // :try_start_0
			 (( java.io.File ) v2 ).mkdir ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdir()Z
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 6 */
			 (( java.lang.SecurityException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public java.io.InputStream a ( java.io.File p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException;, */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/io/BufferedInputStream; */
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
} // .end method
public java.io.InputStream a ( java.net.URL p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
(( java.net.URL ) p1 ).openStream ( ); // invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;
} // .end method
public java.lang.String a ( ) {
/* .locals 3 */
final String v0 = "user.home"; // const-string v0, "user.home"
/* .line 7 */
java.lang.System .getProperty ( v0 );
final String v1 = "file.separator"; // const-string v1, "file.separator"
/* .line 8 */
java.lang.System .getProperty ( v1 );
/* .line 9 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "lf5"; // const-string v0, "lf5"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "mru_file_manager"; // const-string v0, "mru_file_manager"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public void a ( Integer p0 ) {
/* .locals 2 */
/* .line 10 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
/* if-ge p1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
} // :goto_0
v1 = this.b;
v1 = (( java.util.LinkedList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->size()I
/* sub-int/2addr v1, p1 */
/* if-ge v0, v1, :cond_0 */
/* .line 12 */
v1 = this.b;
(( java.util.LinkedList ) v1 ).removeLast ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;
/* add-int/lit8 v0, v0, 0x1 */
/* .line 13 */
} // :cond_0
/* iput p1, p0, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a:I */
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 3 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).indexOf ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->indexOf(Ljava/lang/Object;)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( java.util.LinkedList ) v0 ).add ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V
/* .line 5 */
/* iget p1, p0, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a:I */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(I)V
/* .line 6 */
} // :cond_0
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).moveToTop ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->moveToTop(I)V
} // :goto_0
return;
} // .end method
public void b ( ) {
/* .locals 3 */
/* .line 1 */
org.apache.log4j.lf5.viewer.configure.MRUFileManager .createConfigurationDirectory ( );
/* .line 2 */
/* new-instance v0, Ljava/io/File; */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 3 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ObjectInputStream; */
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* invoke-direct {v1, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 5 */
(( java.io.ObjectInputStream ) v1 ).readObject ( ); // invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v0, Ljava/util/LinkedList; */
this.b = v0;
/* .line 6 */
(( java.io.ObjectInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
/* .line 7 */
v0 = this.b;
(( java.util.LinkedList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
/* .line 8 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 9 */
/* .line 10 */
/* instance-of v2, v1, Ljava/io/File; */
/* if-nez v2, :cond_0 */
/* instance-of v1, v1, Ljava/net/URL; */
/* if-nez v1, :cond_0 */
/* .line 11 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 12 */
/* :catch_0 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.b = v0;
/* .line 13 */
} // :cond_1
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.b = v0;
} // :cond_2
} // :goto_1
return;
} // .end method
public java.lang.Object getFile ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->size()I
/* if-ge p1, v0, :cond_0 */
/* .line 2 */
v0 = this.b;
(( java.util.LinkedList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.io.InputStream getInputStream ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->size()I
/* if-ge p1, v0, :cond_1 */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).getFile ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->getFile(I)Ljava/lang/Object;
/* .line 3 */
/* instance-of v0, p1, Ljava/io/File; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* check-cast p1, Ljava/io/File; */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(Ljava/io/File;)Ljava/io/InputStream;
/* .line 5 */
} // :cond_0
/* check-cast p1, Ljava/net/URL; */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(Ljava/net/URL;)Ljava/io/InputStream;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String getMRUFileList ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->size()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->size()I
/* new-array v0, v0, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = (( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->size()I
/* if-ge v1, v2, :cond_2 */
/* .line 4 */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).getFile ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->getFile(I)Ljava/lang/Object;
/* .line 5 */
/* instance-of v3, v2, Ljava/io/File; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 6 */
/* check-cast v2, Ljava/io/File; */
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 7 */
} // :cond_1
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* aput-object v2, v0, v1 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // .end method
public void moveToTop ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( java.util.LinkedList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
int v1 = 0; // const/4 v1, 0x0
(( java.util.LinkedList ) v0 ).add ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V
return;
} // .end method
public void save ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 2 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ObjectOutputStream; */
/* new-instance v2, Ljava/io/FileOutputStream; */
/* invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* invoke-direct {v1, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 3 */
v0 = this.b;
(( java.io.ObjectOutputStream ) v1 ).writeObject ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 4 */
(( java.io.ObjectOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V
/* .line 5 */
(( java.io.ObjectOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 6 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :goto_0
return;
} // .end method
public void set ( java.io.File p0 ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(Ljava/lang/Object;)V
return;
} // .end method
public void set ( java.net.URL p0 ) {
/* .locals 0 */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->a(Ljava/lang/Object;)V
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
} // .end method
