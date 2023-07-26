public class e.f.c.l.e.p.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.c.l.e.p.a b;
	 /* # direct methods */
	 public e.f.c.l.e.p.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static org.json.JSONObject a ( java.lang.String p0, Object p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/json/JSONException; */
		 /* } */
	 } // .end annotation
	 /* .line 16 */
	 /* new-instance v0, Lorg/json/JSONObject; */
	 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
	 /* .line 17 */
	 /* iget-wide v1, p1, Le/f/c/l/e/p/d;->a:J */
	 final String v3 = "base_address"; // const-string v3, "base_address"
	 (( org.json.JSONObject ) v0 ).put ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
	 /* .line 18 */
	 /* iget-wide v1, p1, Le/f/c/l/e/p/d;->b:J */
	 final String v3 = "size"; // const-string v3, "size"
	 (( org.json.JSONObject ) v0 ).put ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
	 /* .line 19 */
	 p1 = this.d;
	 final String v1 = "name"; // const-string v1, "name"
	 (( org.json.JSONObject ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
	 final String p1 = "uuid"; // const-string p1, "uuid"
	 /* .line 20 */
	 (( org.json.JSONObject ) v0 ).put ( p1, p0 ); // invoke-virtual {v0, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
} // .end method
public static Boolean a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 21 */
	 v0 = this.c;
	 /* const/16 v1, 0x78 */
	 v0 = 	 (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-eq v0, v1, :cond_0 */
	 p0 = this.d;
	 /* const/16 v0, 0x2f */
	 p0 = 	 (( java.lang.String ) p0 ).indexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I
	 /* if-eq p0, v1, :cond_0 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static a ( org.json.JSONArray p0 ) {
/* .locals 2 */
/* .line 12 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
try { // :try_start_0
final String v1 = "binary_images"; // const-string v1, "binary_images"
/* .line 13 */
(( org.json.JSONObject ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 14 */
(( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
java.nio.charset.Charset .forName ( v0 );
(( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* :catch_0 */
/* move-exception p0 */
/* .line 15 */
e.f.c.l.e.b .a ( );
final String v1 = "Binary images string is null"; // const-string v1, "Binary images string is null"
(( e.f.c.l.e.b ) v0 ).d ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Le/f/c/l/e/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
int p0 = 0; // const/4 p0, 0x0
/* new-array p0, p0, [B */
} // .end method
/* # virtual methods */
public final java.io.File a ( java.io.File p0 ) {
/* .locals 3 */
/* .line 6 */
/* const/16 v1, 0x9 */
/* if-ge v0, v1, :cond_0 */
/* .line 7 */
} // :cond_0
(( java.io.File ) p1 ).getAbsolutePath ( ); // invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
final String v1 = "/data"; // const-string v1, "/data"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
try { // :try_start_0
	 v0 = this.a;
	 /* .line 9 */
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 v1 = this.a;
	 (( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
	 /* .line 10 */
	 /* new-instance v1, Ljava/io/File; */
	 v0 = this.nativeLibraryDir;
	 (( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
	 /* invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* move-object p1, v1 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 11 */
	 e.f.c.l.e.b .a ( );
	 final String v2 = "Error getting ApplicationInfo"; // const-string v2, "Error getting ApplicationInfo"
	 (( e.f.c.l.e.b ) v1 ).b ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_1
} // :goto_0
} // .end method
public final java.io.File a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 4 */
p1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez p1, :cond_0 */
/* .line 5 */
(( e.f.c.l.e.p.b ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/p/b;->a(Ljava/io/File;)Ljava/io/File;
} // :cond_0
} // .end method
public a ( java.io.BufferedReader p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.p.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/p/b;->b(Ljava/io/BufferedReader;)Lorg/json/JSONArray;
/* .line 2 */
e.f.c.l.e.p.b .a ( p1 );
} // .end method
public final org.json.JSONArray b ( java.io.BufferedReader p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lorg/json/JSONArray; */
/* invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V */
/* .line 2 */
} // :cond_0
} // :goto_0
(( java.io.BufferedReader ) p1 ).readLine ( ); // invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
(( e.f.c.l.e.p.b ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/p/b;->b(Ljava/lang/String;)Lorg/json/JSONObject;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( org.json.JSONArray ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // :cond_1
} // .end method
public final org.json.JSONObject b ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 5 */
e.f.c.l.e.p.e .a ( p1 );
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
v1 = e.f.c.l.e.p.b .a ( p1 );
/* if-nez v1, :cond_0 */
/* .line 7 */
} // :cond_0
v1 = this.d;
/* .line 8 */
(( e.f.c.l.e.p.b ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/p/b;->a(Ljava/lang/String;)Ljava/io/File;
/* .line 9 */
try { // :try_start_0
v2 = this.b;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 10 */
try { // :try_start_1
e.f.c.l.e.p.b .a ( v1,p1 );
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
e.f.c.l.e.b .a ( );
final String v2 = "Could not create a binary image json string"; // const-string v2, "Could not create a binary image json string"
(( e.f.c.l.e.b ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
/* :catch_1 */
/* move-exception v1 */
/* .line 12 */
e.f.c.l.e.b .a ( );
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Could not generate ID for file "; // const-string v4, "Could not generate ID for file "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = this.d;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_1
} // :goto_0
} // .end method
