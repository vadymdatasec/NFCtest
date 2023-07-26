public class e.f.c.s.u.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.regex.Pattern d;
	 public static final java.nio.charset.Charset e;
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.c.v.h b;
	 public final e.f.c.p.d c;
	 /* # direct methods */
	 public static e.f.c.s.u.g ( ) {
		 /* .locals 1 */
		 final String v0 = "[0-9]+s"; // const-string v0, "[0-9]+s"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 2 */
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public e.f.c.s.u.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p1, v0, v1 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* aput-object p2, v0, p1 */
		 /* .line 111 */
		 p1 = 		 android.text.TextUtils .isEmpty ( p0 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 final String p0 = ""; // const-string p0, ""
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String p2 = ", "; // const-string p2, ", "
		 (( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :goto_0
	 int p1 = 2; // const/4 p1, 0x2
	 /* aput-object p0, v0, p1 */
	 final String p0 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"; // const-string p0, "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
	 /* .line 112 */
	 java.lang.String .format ( p0,v0 );
} // .end method
public static org.json.JSONObject a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* .line 29 */
	 try { // :try_start_0
		 /* new-instance v0, Lorg/json/JSONObject; */
		 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
		 final String v1 = "fid"; // const-string v1, "fid"
		 /* .line 30 */
		 (( org.json.JSONObject ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
		 final String p0 = "appId"; // const-string p0, "appId"
		 /* .line 31 */
		 (( org.json.JSONObject ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
		 final String p0 = "authVersion"; // const-string p0, "authVersion"
		 final String p1 = "FIS_v2"; // const-string p1, "FIS_v2"
		 /* .line 32 */
		 (( org.json.JSONObject ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
		 final String p0 = "sdkVersion"; // const-string p0, "sdkVersion"
		 final String p1 = "a:16.3.3"; // const-string p1, "a:16.3.3"
		 /* .line 33 */
		 (( org.json.JSONObject ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
		 /* :try_end_0 */
		 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 34 */
		 /* new-instance p1, Ljava/lang/IllegalStateException; */
		 /* invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw p1 */
	 } // .end method
	 public static void a ( java.net.HttpURLConnection p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 1 */
		 /* .line 107 */
		 e.f.c.s.u.g .d ( p0 );
		 /* .line 108 */
		 v0 = 		 android.text.TextUtils .isEmpty ( p0 );
		 /* if-nez v0, :cond_0 */
		 final String v0 = "Firebase-Installations"; // const-string v0, "Firebase-Installations"
		 /* .line 109 */
		 android.util.Log .w ( v0,p0 );
		 /* .line 110 */
		 e.f.c.s.u.g .a ( p1,p2,p3 );
		 android.util.Log .w ( v0,p0 );
	 } // :cond_0
	 return;
} // .end method
public static void a ( java.net.URLConnection p0, Object[] p1 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 20 */
(( java.net.URLConnection ) p0 ).getOutputStream ( ); // invoke-virtual {p0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 21 */
	 /* new-instance v0, Ljava/util/zip/GZIPOutputStream; */
	 /* invoke-direct {v0, p0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V */
	 /* .line 22 */
	 try { // :try_start_0
		 (( java.util.zip.GZIPOutputStream ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/zip/GZIPOutputStream;->write([B)V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 23 */
		 try { // :try_start_1
			 (( java.util.zip.GZIPOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
			 /* .line 24 */
			 (( java.io.OutputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
			 /* :try_end_1 */
			 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* :catch_0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* .line 25 */
			 try { // :try_start_2
				 (( java.util.zip.GZIPOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
				 /* .line 26 */
				 (( java.io.OutputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
				 /* .line 27 */
				 /* :catch_1 */
				 /* throw p1 */
				 /* .line 28 */
			 } // :cond_0
			 /* new-instance p0, Ljava/io/IOException; */
			 final String p1 = "Cannot send request to FIS servers.No OutputStream available."; // const-string p1, "Cannot send request to FIS servers.No OutputStream available."
			 /* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
		 } // .end method
		 public static a ( org.json.JSONObject p0 ) {
			 /* .locals 1 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/io/IOException; */
			 /* } */
		 } // .end annotation
		 /* .line 19 */
		 (( org.json.JSONObject ) p0 ).toString ( ); // invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 (( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 } // .end method
	 public static Long b ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 21 */
		 v0 = e.f.c.s.u.g.d;
		 /* .line 22 */
		 (( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 v0 = 		 (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
		 final String v1 = "Invalid Expiration Timestamp."; // const-string v1, "Invalid Expiration Timestamp."
		 /* .line 23 */
		 e.f.a.b.c.m.h .a ( v0,v1 );
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 24 */
			 v0 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 /* if-nez v0, :cond_0 */
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 25 */
		 v1 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v1, v1, -0x1 */
		 (( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 java.lang.Long .parseLong ( p0 );
		 /* move-result-wide v0 */
	 } // :cond_1
} // :goto_0
/* const-wide/16 v0, 0x0 */
} // :goto_1
/* return-wide v0 */
} // .end method
public static org.json.JSONObject b ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
final String v1 = "sdkVersion"; // const-string v1, "sdkVersion"
final String v2 = "a:16.3.3"; // const-string v2, "a:16.3.3"
/* .line 2 */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 3 */
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V */
final String v2 = "installation"; // const-string v2, "installation"
/* .line 4 */
(( org.json.JSONObject ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 5 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public static void c ( ) {
/* .locals 2 */
final String v0 = "Firebase-Installations"; // const-string v0, "Firebase-Installations"
final String v1 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration.Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."; // const-string v1, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration.Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
/* .line 3 */
android.util.Log .e ( v0,v1 );
return;
} // .end method
public static java.lang.String d ( java.net.HttpURLConnection p0 ) {
/* .locals 7 */
/* .line 1 */
(( java.net.HttpURLConnection ) p0 ).getErrorStream ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v2, Ljava/io/BufferedReader; */
/* new-instance v3, Ljava/io/InputStreamReader; */
v4 = e.f.c.s.u.g.e;
/* invoke-direct {v3, v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
/* invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 3 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 4 */
} // :goto_0
(( java.io.BufferedReader ) v2 ).readLine ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0xa */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
final String v3 = "Error when communicating with the Firebase Installations server API.HTTP response: [%d %s: %s]"; // const-string v3, "Error when communicating with the Firebase Installations server API.HTTP response: [%d %s: %s]"
int v4 = 3; // const/4 v4, 0x3
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* .line 6 */
v6 = (( java.net.HttpURLConnection ) p0 ).getResponseCode ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
(( java.net.HttpURLConnection ) p0 ).getResponseMessage ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
/* aput-object p0, v4, v5 */
int p0 = 2; // const/4 p0, 0x2
/* aput-object v0, v4, p0 */
/* .line 7 */
java.lang.String .format ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 8 */
try { // :try_start_1
(( java.io.BufferedReader ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* :catchall_0 */
/* move-exception p0 */
try { // :try_start_2
	 (( java.io.BufferedReader ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
	 /* :try_end_2 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
	 /* .line 9 */
	 /* :catch_1 */
	 /* throw p0 */
	 /* .line 10 */
	 /* :catch_2 */
	 try { // :try_start_3
		 (( java.io.BufferedReader ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
		 /* :try_end_3 */
		 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_3 */
		 /* :catch_3 */
	 } // .end method
	 /* # virtual methods */
	 public e.f.c.s.u.j a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/firebase/installations/FirebaseInstallationsException; */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v1, v0, [Ljava/lang/Object; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-object p3, v1, v2 */
	 final String v3 = "projects/%s/installations"; // const-string v3, "projects/%s/installations"
	 /* .line 1 */
	 java.lang.String .format ( v3,v1 );
	 /* .line 2 */
	 (( e.f.c.s.u.g ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/s/u/g;->a(Ljava/lang/String;)Ljava/net/URL;
} // :goto_0
/* if-gt v2, v0, :cond_4 */
/* .line 3 */
(( e.f.c.s.u.g ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/f/c/s/u/g;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
try { // :try_start_0
	 final String v4 = "POST"; // const-string v4, "POST"
	 /* .line 4 */
	 (( java.net.HttpURLConnection ) v3 ).setRequestMethod ( v4 ); // invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
	 /* .line 5 */
	 (( java.net.HttpURLConnection ) v3 ).setDoOutput ( v0 ); // invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
	 if ( p5 != null) { // if-eqz p5, :cond_0
		 final String v4 = "x-goog-fis-android-iid-migration-auth"; // const-string v4, "x-goog-fis-android-iid-migration-auth"
		 /* .line 6 */
		 (( java.net.HttpURLConnection ) v3 ).addRequestProperty ( v4, p5 ); // invoke-virtual {v3, v4, p5}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 7 */
	 } // :cond_0
	 (( e.f.c.s.u.g ) p0 ).a ( v3, p2, p4 ); // invoke-virtual {p0, v3, p2, p4}, Le/f/c/s/u/g;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 8 */
	 v4 = 	 (( java.net.HttpURLConnection ) v3 ).getResponseCode ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I
	 /* const/16 v5, 0xc8 */
	 /* if-ne v4, v5, :cond_1 */
	 /* .line 9 */
	 (( e.f.c.s.u.g ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/c/s/u/g;->a(Ljava/net/HttpURLConnection;)Le/f/c/s/u/j;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 10 */
	 (( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
	 /* .line 11 */
} // :cond_1
try { // :try_start_1
	 e.f.c.s.u.g .a ( v3,p4,p1,p3 );
	 /* const/16 v5, 0x1ad */
	 /* if-eq v4, v5, :cond_3 */
	 /* const/16 v5, 0x1f4 */
	 /* if-lt v4, v5, :cond_2 */
	 /* const/16 v5, 0x258 */
	 /* if-ge v4, v5, :cond_2 */
	 /* .line 12 */
} // :cond_2
e.f.c.s.u.g .c ( );
/* .line 13 */
e.f.c.s.u.j .f ( );
v5 = e.f.c.s.u.i.c;
(( e.f.c.s.u.h ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/s/u/h;->a(Le/f/c/s/u/i;)Le/f/c/s/u/h;
(( e.f.c.s.u.h ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/c/s/u/h;->a()Le/f/c/s/u/j;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 14 */
(( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catch_0 */
} // :cond_3
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
(( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catchall_0 */
/* move-exception p1 */
(( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 15 */
/* throw p1 */
/* .line 16 */
} // :cond_4
/* new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException; */
p2 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
final String p3 = "Firebase Installations Service is unavailable.Please try again later."; // const-string p3, "Firebase Installations Service is unavailable.Please try again later."
/* invoke-direct {p1, p3, p2}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw p1 */
} // .end method
public final e.f.c.s.u.j a ( java.net.HttpURLConnection p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 73 */
(( java.net.HttpURLConnection ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 74 */
/* new-instance v0, Landroid/util/JsonReader; */
/* new-instance v1, Ljava/io/InputStreamReader; */
v2 = e.f.c.s.u.g.e;
/* invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
/* invoke-direct {v0, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V */
/* .line 75 */
e.f.c.s.u.m .d ( );
/* .line 76 */
e.f.c.s.u.j .f ( );
/* .line 77 */
(( android.util.JsonReader ) v0 ).beginObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V
/* .line 78 */
} // :goto_0
v3 = (( android.util.JsonReader ) v0 ).hasNext ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 79 */
(( android.util.JsonReader ) v0 ).nextName ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
final String v4 = "name"; // const-string v4, "name"
/* .line 80 */
v4 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 81 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.s.u.h ) v2 ).c ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/s/u/h;->c(Ljava/lang/String;)Le/f/c/s/u/h;
} // :cond_0
final String v4 = "fid"; // const-string v4, "fid"
/* .line 82 */
v4 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 83 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.s.u.h ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/s/u/h;->a(Ljava/lang/String;)Le/f/c/s/u/h;
} // :cond_1
final String v4 = "refreshToken"; // const-string v4, "refreshToken"
/* .line 84 */
v4 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 85 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.s.u.h ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/s/u/h;->b(Ljava/lang/String;)Le/f/c/s/u/h;
} // :cond_2
final String v4 = "authToken"; // const-string v4, "authToken"
/* .line 86 */
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 87 */
(( android.util.JsonReader ) v0 ).beginObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V
/* .line 88 */
} // :goto_1
v3 = (( android.util.JsonReader ) v0 ).hasNext ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 89 */
(( android.util.JsonReader ) v0 ).nextName ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
final String v4 = "token"; // const-string v4, "token"
/* .line 90 */
v4 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 91 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.s.u.k ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Le/f/c/s/u/k;->a(Ljava/lang/String;)Le/f/c/s/u/k;
} // :cond_3
final String v4 = "expiresIn"; // const-string v4, "expiresIn"
/* .line 92 */
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 93 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
e.f.c.s.u.g .b ( v3 );
/* move-result-wide v3 */
/* .line 94 */
(( e.f.c.s.u.k ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Le/f/c/s/u/k;->a(J)Le/f/c/s/u/k;
/* .line 95 */
} // :cond_4
(( android.util.JsonReader ) v0 ).skipValue ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V
/* .line 96 */
} // :cond_5
(( e.f.c.s.u.k ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/u/k;->a()Le/f/c/s/u/m;
(( e.f.c.s.u.h ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/s/u/h;->a(Le/f/c/s/u/m;)Le/f/c/s/u/h;
/* .line 97 */
(( android.util.JsonReader ) v0 ).endObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V
/* goto/16 :goto_0 */
/* .line 98 */
} // :cond_6
(( android.util.JsonReader ) v0 ).skipValue ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V
/* goto/16 :goto_0 */
/* .line 99 */
} // :cond_7
(( android.util.JsonReader ) v0 ).endObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V
/* .line 100 */
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* .line 101 */
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
/* .line 102 */
p1 = e.f.c.s.u.i.b;
(( e.f.c.s.u.h ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/f/c/s/u/h;->a(Le/f/c/s/u/i;)Le/f/c/s/u/h;
(( e.f.c.s.u.h ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/s/u/h;->a()Le/f/c/s/u/j;
} // .end method
public e.f.c.s.u.m a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/firebase/installations/FirebaseInstallationsException; */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p3, v0, v1 */
int v2 = 1; // const/4 v2, 0x1
/* aput-object p2, v0, v2 */
final String p2 = "projects/%s/installations/%s/authTokens:generate"; // const-string p2, "projects/%s/installations/%s/authTokens:generate"
/* .line 38 */
java.lang.String .format ( p2,v0 );
/* .line 39 */
(( e.f.c.s.u.g ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/s/u/g;->a(Ljava/lang/String;)Ljava/net/URL;
} // :goto_0
/* if-gt v1, v2, :cond_5 */
/* .line 40 */
(( e.f.c.s.u.g ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/c/s/u/g;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
try { // :try_start_0
final String v3 = "POST"; // const-string v3, "POST"
/* .line 41 */
(( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v3 ); // invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
final String v3 = "Authorization"; // const-string v3, "Authorization"
/* .line 42 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "FIS_v2 "; // const-string v5, "FIS_v2 "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p4 ); // invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.HttpURLConnection ) v0 ).addRequestProperty ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 43 */
(( e.f.c.s.u.g ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/u/g;->c(Ljava/net/HttpURLConnection;)V
/* .line 44 */
v3 = (( java.net.HttpURLConnection ) v0 ).getResponseCode ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* const/16 v4, 0xc8 */
/* if-ne v3, v4, :cond_0 */
/* .line 45 */
(( e.f.c.s.u.g ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/u/g;->b(Ljava/net/HttpURLConnection;)Le/f/c/s/u/m;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 46 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 47 */
try { // :try_start_1
e.f.c.s.u.g .a ( v0,v4,p1,p3 );
/* const/16 v4, 0x191 */
/* if-eq v3, v4, :cond_4 */
/* const/16 v4, 0x194 */
/* if-ne v3, v4, :cond_1 */
} // :cond_1
/* const/16 v4, 0x1ad */
/* if-eq v3, v4, :cond_3 */
/* const/16 v4, 0x1f4 */
/* if-lt v3, v4, :cond_2 */
/* const/16 v4, 0x258 */
/* if-ge v3, v4, :cond_2 */
/* .line 48 */
} // :cond_2
e.f.c.s.u.g .c ( );
/* .line 49 */
e.f.c.s.u.m .d ( );
v4 = e.f.c.s.u.l.c;
(( e.f.c.s.u.k ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/s/u/k;->a(Le/f/c/s/u/l;)Le/f/c/s/u/k;
(( e.f.c.s.u.k ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/s/u/k;->a()Le/f/c/s/u/m;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 50 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catch_0 */
} // :cond_3
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 51 */
} // :cond_4
} // :goto_2
try { // :try_start_2
e.f.c.s.u.m .d ( );
v4 = e.f.c.s.u.l.d;
(( e.f.c.s.u.k ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/s/u/k;->a(Le/f/c/s/u/l;)Le/f/c/s/u/k;
(( e.f.c.s.u.k ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/s/u/k;->a()Le/f/c/s/u/m;
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 52 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catchall_0 */
/* move-exception p1 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 53 */
/* throw p1 */
/* .line 54 */
} // :cond_5
/* new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException; */
p2 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
final String p3 = "Firebase Installations Service is unavailable.Please try again later."; // const-string p3, "Firebase Installations Service is unavailable.Please try again later."
/* invoke-direct {p1, p3, p2}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw p1 */
} // .end method
public final java.lang.String a ( ) {
/* .locals 5 */
final String v0 = "ContentValues"; // const-string v0, "ContentValues"
int v1 = 0; // const/4 v1, 0x0
/* .line 103 */
try { // :try_start_0
v2 = this.a;
v3 = this.a;
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
e.f.a.b.c.p.a .a ( v2,v3 );
/* if-nez v2, :cond_0 */
/* .line 104 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not get fingerprint hash for package: "; // const-string v3, "Could not get fingerprint hash for package: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.a;
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v2 );
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 105 */
e.f.a.b.c.p.f .a ( v2,v3 );
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 106 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "No such package: "; // const-string v4, "No such package: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.a;
(( android.content.Context ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v3,v2 );
} // .end method
public final java.net.HttpURLConnection a ( java.net.URL p0, java.lang.String p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/firebase/installations/FirebaseInstallationsException; */
/* } */
} // .end annotation
/* .line 55 */
try { // :try_start_0
(( java.net.URL ) p1 ).openConnection ( ); // invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast p1, Ljava/net/HttpURLConnection; */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* const/16 v0, 0x2710 */
/* .line 56 */
(( java.net.HttpURLConnection ) p1 ).setConnectTimeout ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
int v1 = 0; // const/4 v1, 0x0
/* .line 57 */
(( java.net.HttpURLConnection ) p1 ).setUseCaches ( v1 ); // invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
/* .line 58 */
(( java.net.HttpURLConnection ) p1 ).setReadTimeout ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
final String v0 = "application/json"; // const-string v0, "application/json"
final String v1 = "Content-Type"; // const-string v1, "Content-Type"
/* .line 59 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
final String v1 = "Accept"; // const-string v1, "Accept"
/* .line 60 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
final String v0 = "Content-Encoding"; // const-string v0, "Content-Encoding"
final String v1 = "gzip"; // const-string v1, "gzip"
/* .line 61 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
final String v0 = "Cache-Control"; // const-string v0, "Cache-Control"
final String v1 = "no-cache"; // const-string v1, "no-cache"
/* .line 62 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 63 */
v0 = this.a;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v1 = "X-Android-Package"; // const-string v1, "X-Android-Package"
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 64 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "fire-installations-id"; // const-string v1, "fire-installations-id"
/* .line 65 */
/* .line 66 */
v1 = e.f.c.p.c.c;
/* if-eq v0, v1, :cond_0 */
/* .line 67 */
v1 = this.b;
final String v2 = "x-firebase-client"; // const-string v2, "x-firebase-client"
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 68 */
v0 = (( e.f.c.p.c ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/p/c;->a()I
java.lang.Integer .toString ( v0 );
final String v1 = "x-firebase-client-log-type"; // const-string v1, "x-firebase-client-log-type"
/* .line 69 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 70 */
} // :cond_0
(( e.f.c.s.u.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/s/u/g;->a()Ljava/lang/String;
final String v1 = "X-Android-Cert"; // const-string v1, "X-Android-Cert"
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
final String v0 = "x-goog-api-key"; // const-string v0, "x-goog-api-key"
/* .line 71 */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 72 */
/* :catch_0 */
/* new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException; */
p2 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
final String v0 = "Firebase Installations Service is unavailable.Please try again later."; // const-string v0, "Firebase Installations Service is unavailable.Please try again later."
/* invoke-direct {p1, v0, p2}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw p1 */
} // .end method
public final java.net.URL a ( java.lang.String p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/firebase/installations/FirebaseInstallationsException; */
/* } */
} // .end annotation
/* .line 35 */
try { // :try_start_0
/* new-instance v0, Ljava/net/URL; */
final String v1 = "https://%s/%s/%s"; // const-string v1, "https://%s/%s/%s"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "firebaseinstallations.googleapis.com"; // const-string v4, "firebaseinstallations.googleapis.com"
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
final String v4 = "v1"; // const-string v4, "v1"
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* aput-object p1, v2, v3 */
/* .line 36 */
java.lang.String .format ( v1,v2 );
/* invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 37 */
/* new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException; */
(( java.net.MalformedURLException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
v1 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
/* invoke-direct {v0, p1, v1}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw v0 */
} // .end method
public final void a ( java.net.HttpURLConnection p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 17 */
e.f.c.s.u.g .a ( p2,p3 );
e.f.c.s.u.g .a ( p2 );
/* .line 18 */
e.f.c.s.u.g .a ( p1,p2 );
return;
} // .end method
public final e.f.c.s.u.m b ( java.net.HttpURLConnection p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
(( java.net.HttpURLConnection ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 7 */
/* new-instance v0, Landroid/util/JsonReader; */
/* new-instance v1, Ljava/io/InputStreamReader; */
v2 = e.f.c.s.u.g.e;
/* invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
/* invoke-direct {v0, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V */
/* .line 8 */
e.f.c.s.u.m .d ( );
/* .line 9 */
(( android.util.JsonReader ) v0 ).beginObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V
/* .line 10 */
} // :goto_0
v2 = (( android.util.JsonReader ) v0 ).hasNext ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 11 */
(( android.util.JsonReader ) v0 ).nextName ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
final String v3 = "token"; // const-string v3, "token"
/* .line 12 */
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 13 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.s.u.k ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/s/u/k;->a(Ljava/lang/String;)Le/f/c/s/u/k;
} // :cond_0
final String v3 = "expiresIn"; // const-string v3, "expiresIn"
/* .line 14 */
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 15 */
(( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
e.f.c.s.u.g .b ( v2 );
/* move-result-wide v2 */
(( e.f.c.s.u.k ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Le/f/c/s/u/k;->a(J)Le/f/c/s/u/k;
/* .line 16 */
} // :cond_1
(( android.util.JsonReader ) v0 ).skipValue ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V
/* .line 17 */
} // :cond_2
(( android.util.JsonReader ) v0 ).endObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V
/* .line 18 */
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* .line 19 */
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
/* .line 20 */
p1 = e.f.c.s.u.l.b;
(( e.f.c.s.u.k ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/c/s/u/k;->a(Le/f/c/s/u/l;)Le/f/c/s/u/k;
(( e.f.c.s.u.k ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/u/k;->a()Le/f/c/s/u/m;
} // .end method
public final void c ( java.net.HttpURLConnection p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.s.u.g .b ( );
e.f.c.s.u.g .a ( v0 );
/* .line 2 */
e.f.c.s.u.g .a ( p1,v0 );
return;
} // .end method
