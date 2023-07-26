public class e.f.c.q.x$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/c/q/x; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # static fields */
public static final Long d;
/* # instance fields */
public final java.lang.String a;
public final java.lang.String b;
public final Long c;
/* # direct methods */
public static e.f.c.q.x$a ( ) {
/* .locals 3 */
/* .line 1 */
v0 = java.util.concurrent.TimeUnit.DAYS;
/* const-wide/16 v1, 0x7 */
(( java.util.concurrent.TimeUnit ) v0 ).toMillis ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v0 */
/* sput-wide v0, Le/f/c/q/x$a;->d:J */
return;
} // .end method
public e.f.c.q.x$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
/* iput-wide p3, p0, Le/f/c/q/x$a;->c:J */
return;
} // .end method
public static java.lang.String a ( e.f.c.q.x$a p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 7 */
} // :cond_0
p0 = this.a;
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.String p1, Long p2 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
final String v1 = "token"; // const-string v1, "token"
/* .line 2 */
(( org.json.JSONObject ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String p0 = "appVersion"; // const-string p0, "appVersion"
/* .line 3 */
(( org.json.JSONObject ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String p0 = "timestamp"; // const-string p0, "timestamp"
/* .line 4 */
(( org.json.JSONObject ) v0 ).put ( p0, p2, p3 ); // invoke-virtual {v0, p0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 5 */
(( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 6 */
java.lang.String .valueOf ( p0 );
java.lang.String .valueOf ( p0 );
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 p1, p1, 0x18 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Failed to encode token: "; // const-string p1, "Failed to encode token: "
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
android.util.Log .w ( p1,p0 );
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static e.f.c.q.x$a b ( java.lang.String p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = android.text.TextUtils .isEmpty ( p0 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
final String v0 = "{"; // const-string v0, "{"
/* .line 2 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 try { // :try_start_0
		 /* new-instance v0, Lorg/json/JSONObject; */
		 /* invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
		 /* .line 4 */
		 /* new-instance p0, Le/f/c/q/x$a; */
		 final String v2 = "token"; // const-string v2, "token"
		 /* .line 5 */
		 (( org.json.JSONObject ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
		 final String v3 = "appVersion"; // const-string v3, "appVersion"
		 /* .line 6 */
		 (( org.json.JSONObject ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
		 final String v4 = "timestamp"; // const-string v4, "timestamp"
		 /* .line 7 */
		 (( org.json.JSONObject ) v0 ).getLong ( v4 ); // invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v4 */
		 /* invoke-direct {p0, v2, v3, v4, v5}, Le/f/c/q/x$a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V */
		 /* :try_end_0 */
		 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 8 */
		 java.lang.String .valueOf ( p0 );
		 java.lang.String .valueOf ( p0 );
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v0, v0, 0x17 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v0 = "Failed to parse token: "; // const-string v0, "Failed to parse token: "
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
		 android.util.Log .w ( v0,p0 );
		 /* .line 9 */
	 } // :cond_1
	 /* new-instance v0, Le/f/c/q/x$a; */
	 /* const-wide/16 v2, 0x0 */
	 /* invoke-direct {v0, p0, v1, v2, v3}, Le/f/c/q/x$a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V */
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.String p0 ) {
	 /* .locals 6 */
	 /* .line 8 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* iget-wide v2, p0, Le/f/c/q/x$a;->c:J */
	 /* sget-wide v4, Le/f/c/q/x$a;->d:J */
	 /* add-long/2addr v2, v4 */
	 /* cmp-long v4, v0, v2 */
	 /* if-gtz v4, :cond_1 */
	 v0 = this.b;
	 /* .line 9 */
	 p1 = 	 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
