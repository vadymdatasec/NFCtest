public class e.f.c.l.e.v.i implements e.f.c.l.e.v.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.v.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Long a ( e.f.c.l.e.m.h1 p0, Long p1, org.json.JSONObject p2 ) {
		 /* .locals 4 */
		 final String v0 = "expires_at"; // const-string v0, "expires_at"
		 /* .line 24 */
		 v1 = 		 (( org.json.JSONObject ) p3 ).has ( v0 ); // invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 25 */
			 (( org.json.JSONObject ) p3 ).optLong ( v0 ); // invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
			 /* move-result-wide p0 */
			 /* .line 26 */
		 } // :cond_0
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x3e8 */
		 /* mul-long p1, p1, v2 */
		 /* add-long p0, v0, p1 */
	 } // :goto_0
	 /* return-wide p0 */
} // .end method
public static e.f.c.l.e.v.j.b a ( org.json.JSONObject p0, org.json.JSONObject p1 ) {
	 /* .locals 11 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/json/JSONException; */
	 /* } */
} // .end annotation
final String v0 = "status"; // const-string v0, "status"
/* .line 10 */
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "new"; // const-string v0, "new"
/* .line 11 */
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
final String v1 = "bundle_id"; // const-string v1, "bundle_id"
/* .line 12 */
(( org.json.JSONObject ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "org_id"; // const-string v1, "org_id"
/* .line 13 */
(( org.json.JSONObject ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
int p0 = 1; // const/4 p0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "https://update.crashlytics.com/spi/v1/platforms/android/apps"; // const-string v0, "https://update.crashlytics.com/spi/v1/platforms/android/apps"
	 /* .line 14 */
} // :cond_0
v0 = java.util.Locale.US;
/* new-array v3, p0, [Ljava/lang/Object; */
/* aput-object v6, v3, v1 */
final String v4 = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s"; // const-string v4, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s"
java.lang.String .format ( v0,v4,v3 );
} // :goto_0
/* move-object v3, v0 */
/* .line 15 */
v0 = java.util.Locale.US;
/* new-array v4, p0, [Ljava/lang/Object; */
/* aput-object v6, v4, v1 */
final String v5 = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports"; // const-string v5, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports"
java.lang.String .format ( v0,v5,v4 );
/* .line 16 */
v0 = java.util.Locale.US;
/* new-array p0, p0, [Ljava/lang/Object; */
/* aput-object v6, p0, v1 */
final String v5 = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps"; // const-string v5, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps"
java.lang.String .format ( v0,v5,p0 );
final String p0 = "update_required"; // const-string p0, "update_required"
/* .line 17 */
v8 = (( org.json.JSONObject ) p1 ).optBoolean ( p0, v1 ); // invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
final String p0 = "report_upload_variant"; // const-string p0, "report_upload_variant"
/* .line 18 */
v9 = (( org.json.JSONObject ) p1 ).optInt ( p0, v1 ); // invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
final String p0 = "native_report_upload_variant"; // const-string p0, "native_report_upload_variant"
/* .line 19 */
v10 = (( org.json.JSONObject ) p1 ).optInt ( p0, v1 ); // invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* .line 20 */
/* new-instance p0, Le/f/c/l/e/v/j/b; */
/* move-object v1, p0 */
/* invoke-direct/range {v1 ..v10}, Le/f/c/l/e/v/j/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZII)V */
} // .end method
public static e.f.c.l.e.v.j.c a ( org.json.JSONObject p0 ) {
/* .locals 2 */
final String v0 = "collect_reports"; // const-string v0, "collect_reports"
int v1 = 1; // const/4 v1, 0x1
/* .line 21 */
p0 = (( org.json.JSONObject ) p0 ).optBoolean ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
/* .line 22 */
/* new-instance v0, Le/f/c/l/e/v/j/c; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/v/j/c;-><init>(Z)V */
} // .end method
public static e.f.c.l.e.v.j.d a ( ) {
/* .locals 3 */
/* .line 23 */
/* new-instance v0, Le/f/c/l/e/v/j/d; */
/* const/16 v1, 0x8 */
int v2 = 4; // const/4 v2, 0x4
/* invoke-direct {v0, v1, v2}, Le/f/c/l/e/v/j/d;-><init>(II)V */
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
final String v0 = "fabric"; // const-string v0, "fabric"
/* .line 3 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
final String v1 = "app"; // const-string v1, "app"
/* .line 4 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v1 ); // invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 5 */
e.f.c.l.e.v.i .a ( v0,v1 );
/* .line 6 */
e.f.c.l.e.v.i .a ( );
final String v0 = "features"; // const-string v0, "features"
/* .line 7 */
(( org.json.JSONObject ) p2 ).getJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
e.f.c.l.e.v.i .a ( v0 );
/* int-to-long v0, v9 */
/* .line 8 */
e.f.c.l.e.v.i .a ( p1,v0,v1,p2 );
/* move-result-wide v3 */
/* .line 9 */
/* new-instance p1, Le/f/c/l/e/v/j/f; */
/* move-object v2, p1 */
/* invoke-direct/range {v2 ..v9}, Le/f/c/l/e/v/j/f;-><init>(JLe/f/c/l/e/v/j/b;Le/f/c/l/e/v/j/d;Le/f/c/l/e/v/j/c;II)V */
} // .end method
