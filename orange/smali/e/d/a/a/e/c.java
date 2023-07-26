public class e.d.a.a.e.c implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String b;
	 public final java.lang.String c;
	 public final java.lang.String d;
	 public final e.d.a.a.d.e e;
	 public final java.lang.String f;
	 public final Integer g;
	 public final java.lang.String h;
	 public final Boolean i;
	 public final Boolean j;
	 public final java.util.List k;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.List l;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Date m;
public final java.util.Set n;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/e;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.d.a.a.e.c ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "I", */
/* "Ljava/lang/String;", */
/* "ZZ", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/Date;", */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/e;", */
/* ">;", */
/* "Le/d/a/a/d/e;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.d = p3;
/* .line 5 */
this.f = p4;
/* .line 6 */
/* iput p5, p0, Le/d/a/a/e/c;->g:I */
/* .line 7 */
this.h = p6;
/* .line 8 */
/* iput-boolean p7, p0, Le/d/a/a/e/c;->i:Z */
/* .line 9 */
/* iput-boolean p8, p0, Le/d/a/a/e/c;->j:Z */
/* .line 10 */
this.k = p9;
/* .line 11 */
this.l = p10;
/* .line 12 */
this.m = p11;
/* .line 13 */
this.n = p12;
/* .line 14 */
this.e = p13;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/d/a/a/e/c;->g:I */
} // .end method
public java.util.List d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.l;
} // .end method
public e.d.a.a.d.e e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public org.json.JSONObject f ( ) {
/* .locals 6 */
/* .line 1 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
try { // :try_start_0
final String v1 = "app-bundle-id"; // const-string v1, "app-bundle-id"
/* .line 2 */
v2 = this.b;
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "app-version"; // const-string v1, "app-version"
/* .line 3 */
v2 = this.c;
java.lang.String .valueOf ( v2 );
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "app-vendor-id"; // const-string v1, "app-vendor-id"
/* .line 4 */
v2 = this.d;
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "app-platform"; // const-string v1, "app-platform"
final String v2 = "ANDROID"; // const-string v2, "ANDROID"
/* .line 5 */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "trustkit-version"; // const-string v1, "trustkit-version"
final String v2 = "1.1.5"; // const-string v2, "1.1.5"
/* .line 6 */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "hostname"; // const-string v1, "hostname"
/* .line 7 */
v2 = this.f;
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "port"; // const-string v1, "port"
/* .line 8 */
/* iget v2, p0, Le/d/a/a/e/c;->g:I */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
final String v1 = "noted-hostname"; // const-string v1, "noted-hostname"
/* .line 9 */
v2 = this.h;
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
final String v1 = "include-subdomains"; // const-string v1, "include-subdomains"
/* .line 10 */
/* iget-boolean v2, p0, Le/d/a/a/e/c;->i:Z */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
final String v1 = "enforce-pinning"; // const-string v1, "enforce-pinning"
/* .line 11 */
/* iget-boolean v2, p0, Le/d/a/a/e/c;->j:Z */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
final String v1 = "validation-result"; // const-string v1, "validation-result"
/* .line 12 */
v2 = this.e;
v2 = (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
final String v1 = "date-time"; // const-string v1, "date-time"
final String v2 = "yyyy-MM-dd\'T\'HH:mm:ssZ"; // const-string v2, "yyyy-MM-dd\'T\'HH:mm:ssZ"
/* .line 13 */
v3 = this.m;
android.text.format.DateFormat .format ( v2,v3 );
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 14 */
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 15 */
v2 = this.l;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/lang/String; */
/* .line 16 */
(( org.json.JSONArray ) v1 ).put ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // :cond_0
final String v2 = "validated-certificate-chain"; // const-string v2, "validated-certificate-chain"
/* .line 17 */
(( org.json.JSONObject ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 18 */
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 19 */
v2 = this.k;
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v3, Ljava/lang/String; */
/* .line 20 */
(( org.json.JSONArray ) v1 ).put ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // :cond_1
final String v2 = "served-certificate-chain"; // const-string v2, "served-certificate-chain"
/* .line 21 */
(( org.json.JSONObject ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 22 */
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 23 */
v2 = this.n;
v3 = } // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Le/d/a/a/c/e; */
/* .line 24 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "pin-sha256=\""; // const-string v5, "pin-sha256=\""
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.d.a.a.c.e ) v3 ).toString ( ); // invoke-virtual {v3}, Le/d/a/a/c/e;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\""; // const-string v3, "\""
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.json.JSONArray ) v1 ).put ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // :cond_2
final String v2 = "known-pins"; // const-string v2, "known-pins"
/* .line 25 */
(( org.json.JSONObject ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 26 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "JSON error for report: "; // const-string v2, "JSON error for report: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.d.a.a.e.c ) p0 ).toString ( ); // invoke-virtual {p0}, Le/d/a/a/e/c;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
(( e.d.a.a.e.c ) p0 ).f ( ); // invoke-virtual {p0}, Le/d/a/a/e/c;->f()Lorg/json/JSONObject;
int v1 = 2; // const/4 v1, 0x2
(( org.json.JSONObject ) v0 ).toString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
/* :catch_0 */
(( e.d.a.a.e.c ) p0 ).f ( ); // invoke-virtual {p0}, Le/d/a/a/e/c;->f()Lorg/json/JSONObject;
(( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
} // .end method
