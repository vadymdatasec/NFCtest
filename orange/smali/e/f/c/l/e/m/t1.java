public class e.f.c.l.e.m.t1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.io.File a;
	 /* # direct methods */
	 public static e.f.c.l.e.m.t1 ( ) {
		 /* .locals 1 */
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 1 */
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public e.f.c.l.e.m.t1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static java.lang.String a ( org.json.JSONObject p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = 		 (( org.json.JSONObject ) p0 ).isNull ( p1 ); // invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 (( org.json.JSONObject ) p0 ).optString ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 } // :cond_0
} // .end method
public static e.f.c.l.e.m.b2 d ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/json/JSONException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 2 */
/* new-instance p0, Le/f/c/l/e/m/b2; */
/* invoke-direct {p0}, Le/f/c/l/e/m/b2;-><init>()V */
final String v1 = "userId"; // const-string v1, "userId"
/* .line 3 */
e.f.c.l.e.m.t1 .a ( v0,v1 );
(( e.f.c.l.e.m.b2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/b2;->a(Ljava/lang/String;)V
} // .end method
/* # virtual methods */
public java.io.File a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
v1 = this.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "keys"; // const-string p1, "keys"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".meta"; // const-string p1, ".meta"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public java.io.File b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
v1 = this.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "user"; // const-string p1, "user"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".meta"; // const-string p1, ".meta"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public e.f.c.l.e.m.b2 c ( java.lang.String p0 ) {
/* .locals 4 */
final String v0 = "Failed to close user metadata file."; // const-string v0, "Failed to close user metadata file."
/* .line 1 */
(( e.f.c.l.e.m.t1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/t1;->b(Ljava/lang/String;)Ljava/io/File;
/* .line 2 */
v1 = (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
/* .line 3 */
/* new-instance p1, Le/f/c/l/e/m/b2; */
/* invoke-direct {p1}, Le/f/c/l/e/m/b2;-><init>()V */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 5 */
try { // :try_start_1
	 e.f.c.l.e.m.j .b ( v2 );
	 e.f.c.l.e.m.t1 .d ( p1 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 6 */
	 e.f.c.l.e.m.j .a ( v2,v0 );
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* move-object v1, v2 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* move-object v1, v2 */
	 /* :catchall_1 */
	 /* move-exception p1 */
	 /* :catch_1 */
	 /* move-exception p1 */
	 /* .line 7 */
} // :goto_0
try { // :try_start_2
	 e.f.c.l.e.b .a ( );
	 final String v3 = "Error deserializing user metadata."; // const-string v3, "Error deserializing user metadata."
	 (( e.f.c.l.e.b ) v2 ).b ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
	 /* :try_end_2 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
	 /* .line 8 */
	 e.f.c.l.e.m.j .a ( v1,v0 );
	 /* .line 9 */
	 /* new-instance p1, Le/f/c/l/e/m/b2; */
	 /* invoke-direct {p1}, Le/f/c/l/e/m/b2;-><init>()V */
	 /* .line 10 */
} // :goto_1
e.f.c.l.e.m.j .a ( v1,v0 );
/* .line 11 */
/* throw p1 */
} // .end method
