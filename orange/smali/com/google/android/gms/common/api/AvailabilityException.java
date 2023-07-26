public class com.google.android.gms.common.api.AvailabilityException extends java.lang.Exception {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.e.b b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/b<", */
	 /* "Le/f/a/b/c/l/k/a0<", */
	 /* "*>;", */
	 /* "Le/f/a/b/c/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # virtual methods */
public java.lang.String getMessage ( ) {
/* .locals 7 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
v1 = this.b;
(( c.e.b ) v1 ).keySet ( ); // invoke-virtual {v1}, Lc/e/b;->keySet()Ljava/util/Set;
int v2 = 1; // const/4 v2, 0x1
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v3, Le/f/a/b/c/l/k/a0; */
/* .line 3 */
v4 = this.b;
(( c.e.i ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Le/f/a/b/c/a; */
/* .line 4 */
v5 = (( e.f.a.b.c.a ) v4 ).e ( ); // invoke-virtual {v4}, Le/f/a/b/c/a;->e()Z
if ( v5 != null) { // if-eqz v5, :cond_0
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 5 */
} // :cond_0
(( e.f.a.b.c.l.k.a0 ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/a0;->a()Ljava/lang/String;
java.lang.String .valueOf ( v4 );
java.lang.String .valueOf ( v3 );
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, 0x2 */
java.lang.String .valueOf ( v4 );
v6 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* add-int/2addr v5, v6 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ": "; // const-string v3, ": "
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 6 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
if ( v2 != null) { // if-eqz v2, :cond_2
final String v2 = "None of the queried APIs are available."; // const-string v2, "None of the queried APIs are available."
/* .line 7 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_2
final String v2 = "Some of the queried APIs are unavailable."; // const-string v2, "Some of the queried APIs are unavailable."
/* .line 8 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_1
final String v2 = "; "; // const-string v2, "; "
/* .line 9 */
android.text.TextUtils .join ( v2,v0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
