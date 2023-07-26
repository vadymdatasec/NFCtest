public abstract class e.f.c.u.c$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/c/u/c; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "a" */
} // .end annotation
/* # direct methods */
public static c.e.b a ( android.os.Bundle p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Bundle;", */
/* ")", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
/* .line 2 */
(( android.os.Bundle ) p0 ).keySet ( ); // invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 3 */
(( android.os.Bundle ) p0 ).get ( v2 ); // invoke-virtual {p0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* .line 4 */
/* instance-of v4, v3, Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 5 */
/* check-cast v3, Ljava/lang/String; */
final String v4 = "google."; // const-string v4, "google."
/* .line 6 */
v4 = (( java.lang.String ) v2 ).startsWith ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_0 */
final String v4 = "gcm."; // const-string v4, "gcm."
/* .line 7 */
v4 = (( java.lang.String ) v2 ).startsWith ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_0 */
final String v4 = "from"; // const-string v4, "from"
/* .line 8 */
v4 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
final String v4 = "message_type"; // const-string v4, "message_type"
/* .line 9 */
v4 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
final String v4 = "collapse_key"; // const-string v4, "collapse_key"
/* .line 10 */
v4 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
/* .line 11 */
(( c.e.i ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
} // .end method
