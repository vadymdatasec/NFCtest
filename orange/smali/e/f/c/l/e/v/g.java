public class e.f.c.l.e.v.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.c.l.e.m.h1 a;
	 /* # direct methods */
	 public e.f.c.l.e.v.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static e.f.c.l.e.v.h a ( Integer p0 ) {
		 /* .locals 1 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* if-eq p0, v0, :cond_0 */
		 /* .line 4 */
		 /* new-instance p0, Le/f/c/l/e/v/b; */
		 /* invoke-direct {p0}, Le/f/c/l/e/v/b;-><init>()V */
		 /* .line 5 */
	 } // :cond_0
	 /* new-instance p0, Le/f/c/l/e/v/i; */
	 /* invoke-direct {p0}, Le/f/c/l/e/v/i;-><init>()V */
} // .end method
/* # virtual methods */
public e.f.c.l.e.v.j.f a ( org.json.JSONObject p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/json/JSONException; */
	 /* } */
} // .end annotation
final String v0 = "settings_version"; // const-string v0, "settings_version"
/* .line 1 */
v0 = (( org.json.JSONObject ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 2 */
e.f.c.l.e.v.g .a ( v0 );
/* .line 3 */
v1 = this.a;
} // .end method
