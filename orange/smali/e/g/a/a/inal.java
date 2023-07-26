public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/g/a/a/b; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final java.lang.String a;
public final java.lang.String b;
public final java.lang.String c;
public final java.lang.String d;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.a = p1;
/* .line 4 */
this.b = p2;
/* .line 5 */
this.c = p3;
/* .line 6 */
this.d = p4;
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .line 7 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
final String v0 = "manufacturer"; // const-string v0, "manufacturer"
/* .line 8 */
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.a = v0;
final String v0 = "market_name"; // const-string v0, "market_name"
/* .line 9 */
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.b = v0;
final String v0 = "codename"; // const-string v0, "codename"
/* .line 10 */
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.c = v0;
final String v0 = "model"; // const-string v0, "model"
/* .line 11 */
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.d = p1;
return;
} // .end method
public inal ( ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1}, Le/g/a/a/b$b;-><init>(Lorg/json/JSONObject;)V */
return;
} // .end method
