public class e.f.c.l.e.v.k.c extends e.f.c.l.e.m.a implements e.f.c.l.e.v.k.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public e.f.c.l.e.b f;
	 /* # direct methods */
	 public e.f.c.l.e.v.k.c ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 v4 = e.f.c.l.e.q.a.b;
		 e.f.c.l.e.b .a ( );
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Le/f/c/l/e/v/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;Le/f/c/l/e/b;)V */
		 return;
	 } // .end method
	 public e.f.c.l.e.v.k.c ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V */
		 /* .line 3 */
		 this.f = p5;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final e.f.c.l.e.q.b a ( Object p0, Object p1 ) {
		 /* .locals 2 */
		 /* .line 23 */
		 v0 = this.a;
		 final String v1 = "X-CRASHLYTICS-GOOGLE-APP-ID"; // const-string v1, "X-CRASHLYTICS-GOOGLE-APP-ID"
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 final String v0 = "X-CRASHLYTICS-API-CLIENT-TYPE"; // const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"
		 final String v1 = "android"; // const-string v1, "android"
		 /* .line 24 */
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 25 */
		 e.f.c.l.e.m.b1 .e ( );
		 final String v1 = "X-CRASHLYTICS-API-CLIENT-VERSION"; // const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"
		 /* .line 26 */
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 final String v0 = "Accept"; // const-string v0, "Accept"
		 final String v1 = "application/json"; // const-string v1, "application/json"
		 /* .line 27 */
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 28 */
		 v0 = this.b;
		 final String v1 = "X-CRASHLYTICS-DEVICE-MODEL"; // const-string v1, "X-CRASHLYTICS-DEVICE-MODEL"
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 29 */
		 v0 = this.c;
		 final String v1 = "X-CRASHLYTICS-OS-BUILD-VERSION"; // const-string v1, "X-CRASHLYTICS-OS-BUILD-VERSION"
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 30 */
		 v0 = this.d;
		 final String v1 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"; // const-string v1, "X-CRASHLYTICS-OS-DISPLAY-VERSION"
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 31 */
		 p2 = this.e;
		 /* .line 32 */
		 final String v0 = "X-CRASHLYTICS-INSTALLATION-ID"; // const-string v0, "X-CRASHLYTICS-INSTALLATION-ID"
		 /* .line 33 */
		 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
	 } // .end method
	 public final java.util.Map a ( Object p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/f/c/l/e/v/j/g;", */
		 /* ")", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 16 */
	 /* new-instance v0, Ljava/util/HashMap; */
	 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
	 /* .line 17 */
	 v1 = this.h;
	 final String v2 = "build_version"; // const-string v2, "build_version"
	 /* .line 18 */
	 v1 = this.g;
	 final String v2 = "display_version"; // const-string v2, "display_version"
	 /* .line 19 */
	 /* iget v1, p1, Le/f/c/l/e/v/j/g;->i:I */
	 java.lang.Integer .toString ( v1 );
	 final String v2 = "source"; // const-string v2, "source"
	 /* .line 20 */
	 p1 = this.f;
	 /* .line 21 */
	 v1 = 	 e.f.c.l.e.m.j .b ( p1 );
	 /* if-nez v1, :cond_0 */
	 final String v1 = "instance"; // const-string v1, "instance"
	 /* .line 22 */
} // :cond_0
} // .end method
public org.json.JSONObject a ( Object p0 ) {
/* .locals 4 */
/* .line 11 */
v0 = (( e.f.c.l.e.q.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I
/* .line 12 */
v1 = this.f;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Settings result was: "; // const-string v3, "Settings result was: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 13 */
v0 = (( e.f.c.l.e.v.k.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/v/k/c;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 14 */
	 (( e.f.c.l.e.q.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/l/e/q/d;->a()Ljava/lang/String;
	 (( e.f.c.l.e.v.k.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->b(Ljava/lang/String;)Lorg/json/JSONObject;
	 /* .line 15 */
} // :cond_0
p1 = this.f;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to retrieve settings from "; // const-string v1, "Failed to retrieve settings from "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public org.json.JSONObject a ( Object p0, Boolean p1 ) {
/* .locals 3 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 1 */
try { // :try_start_0
	 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/v/j/g;)Ljava/util/Map;
	 /* .line 2 */
	 (( e.f.c.l.e.m.a ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/m/a;->a(Ljava/util/Map;)Le/f/c/l/e/q/b;
	 /* .line 3 */
	 (( e.f.c.l.e.v.k.c ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/g;)Le/f/c/l/e/q/b;
	 /* .line 4 */
	 p1 = this.f;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Requesting settings from "; // const-string v2, "Requesting settings from "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 5 */
	 p1 = this.f;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Settings query params were: "; // const-string v2, "Settings query params were: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 6 */
	 (( e.f.c.l.e.q.b ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/q/b;->b()Le/f/c/l/e/q/d;
	 /* .line 7 */
	 p2 = this.f;
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Settings request ID: "; // const-string v1, "Settings request ID: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "X-REQUEST-ID"; // const-string v1, "X-REQUEST-ID"
	 (( e.f.c.l.e.q.d ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/q/d;->a(Ljava/lang/String;)Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 8 */
	 (( e.f.c.l.e.v.k.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/d;)Lorg/json/JSONObject;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 9 */
	 p2 = this.f;
	 final String v0 = "Settings request failed."; // const-string v0, "Settings request failed."
	 (( e.f.c.l.e.b ) p2 ).b ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* .line 10 */
} // :cond_0
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "An invalid data collection token was used."; // const-string p2, "An invalid data collection token was used."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( Object p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 0 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 34 */
(( e.f.c.l.e.q.b ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
} // :cond_0
return;
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 1 */
/* const/16 v0, 0xc8 */
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0xc9 */
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0xca */
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0xcb */
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public final org.json.JSONObject b ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2 */
v1 = this.f;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to parse settings JSON from "; // const-string v3, "Failed to parse settings JSON from "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 3 */
v0 = this.f;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Settings response "; // const-string v2, "Settings response "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
int p1 = 0; // const/4 p1, 0x0
} // .end method
