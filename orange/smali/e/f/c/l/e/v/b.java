public class e.f.c.l.e.v.b implements e.f.c.l.e.v.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.v.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Long a ( e.f.c.l.e.m.h1 p0, Long p1, org.json.JSONObject p2 ) {
		 /* .locals 4 */
		 final String v0 = "expires_at"; // const-string v0, "expires_at"
		 /* .line 19 */
		 v1 = 		 (( org.json.JSONObject ) p3 ).has ( v0 ); // invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 20 */
			 (( org.json.JSONObject ) p3 ).optLong ( v0 ); // invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
			 /* move-result-wide p0 */
			 /* .line 21 */
		 } // :cond_0
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x3e8 */
		 /* mul-long p1, p1, v2 */
		 /* add-long p0, v0, p1 */
	 } // :goto_0
	 /* return-wide p0 */
} // .end method
public static e.f.c.l.e.v.j.b a ( org.json.JSONObject p0 ) {
	 /* .locals 7 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/json/JSONException; */
	 /* } */
} // .end annotation
final String v0 = "status"; // const-string v0, "status"
/* .line 13 */
(( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "url"; // const-string v0, "url"
/* .line 14 */
(( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "reports_url"; // const-string v0, "reports_url"
/* .line 15 */
(( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "ndk_reports_url"; // const-string v0, "ndk_reports_url"
/* .line 16 */
(( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "update_required"; // const-string v0, "update_required"
int v1 = 0; // const/4 v1, 0x0
/* .line 17 */
v6 = (( org.json.JSONObject ) p0 ).optBoolean ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
/* .line 18 */
/* new-instance p0, Le/f/c/l/e/v/j/b; */
/* move-object v1, p0 */
/* invoke-direct/range {v1 ..v6}, Le/f/c/l/e/v/j/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V */
} // .end method
public static e.f.c.l.e.v.j.e a ( e.f.c.l.e.m.h1 p0 ) {
/* .locals 9 */
/* .line 8 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
/* .line 9 */
e.f.c.l.e.v.b .c ( v0 );
/* .line 10 */
e.f.c.l.e.v.b .b ( v0 );
/* const-wide/16 v1, 0xe10 */
/* .line 11 */
e.f.c.l.e.v.b .a ( p0,v1,v2,v0 );
/* move-result-wide v2 */
/* .line 12 */
/* new-instance p0, Le/f/c/l/e/v/j/f; */
int v4 = 0; // const/4 v4, 0x0
int v7 = 0; // const/4 v7, 0x0
/* const/16 v8, 0xe10 */
/* move-object v1, p0 */
/* invoke-direct/range {v1 ..v8}, Le/f/c/l/e/v/j/f;-><init>(JLe/f/c/l/e/v/j/b;Le/f/c/l/e/v/j/d;Le/f/c/l/e/v/j/c;II)V */
} // .end method
public static e.f.c.l.e.v.j.c b ( org.json.JSONObject p0 ) {
/* .locals 2 */
final String v0 = "collect_reports"; // const-string v0, "collect_reports"
int v1 = 1; // const/4 v1, 0x1
/* .line 1 */
p0 = (( org.json.JSONObject ) p0 ).optBoolean ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
/* .line 2 */
/* new-instance v0, Le/f/c/l/e/v/j/c; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/v/j/c;-><init>(Z)V */
} // .end method
public static e.f.c.l.e.v.j.d c ( org.json.JSONObject p0 ) {
/* .locals 2 */
final String v0 = "max_custom_exception_events"; // const-string v0, "max_custom_exception_events"
/* const/16 v1, 0x8 */
/* .line 1 */
p0 = (( org.json.JSONObject ) p0 ).optInt ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* .line 2 */
/* new-instance v0, Le/f/c/l/e/v/j/d; */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {v0, p0, v1}, Le/f/c/l/e/v/j/d;-><init>(II)V */
} // .end method
/* # virtual methods */
public e.f.c.l.e.v.j.f a ( e.f.c.l.e.m.h1 p0, org.json.JSONObject p1 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
final String v0 = "settings_version"; // const-string v0, "settings_version"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
v8 = (( org.json.JSONObject ) p2 ).optInt ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
final String v0 = "cache_duration"; // const-string v0, "cache_duration"
/* const/16 v1, 0xe10 */
/* .line 2 */
v9 = (( org.json.JSONObject ) p2 ).optInt ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
final String v0 = "app"; // const-string v0, "app"
/* .line 3 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
e.f.c.l.e.v.b .a ( v0 );
final String v0 = "session"; // const-string v0, "session"
/* .line 4 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
e.f.c.l.e.v.b .c ( v0 );
final String v0 = "features"; // const-string v0, "features"
/* .line 5 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
e.f.c.l.e.v.b .b ( v0 );
/* int-to-long v0, v9 */
/* .line 6 */
e.f.c.l.e.v.b .a ( p1,v0,v1,p2 );
/* move-result-wide v3 */
/* .line 7 */
/* new-instance p1, Le/f/c/l/e/v/j/f; */
/* move-object v2, p1 */
/* invoke-direct/range {v2 ..v9}, Le/f/c/l/e/v/j/f;-><init>(JLe/f/c/l/e/v/j/b;Le/f/c/l/e/v/j/d;Le/f/c/l/e/v/j/c;II)V */
} // .end method
