public class e.h.a.a.a.a.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static e.h.a.a.a.a.a c;
/* # instance fields */
public android.content.Context a;
/* # direct methods */
public static e.h.a.a.a.a.a ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public e.h.a.a.a.a.a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
public static e.h.a.a.a.a.a a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.a.a.a.a.a.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/h/a/a/a/a/a; */
/* invoke-direct {v0, p0}, Le/h/a/a/a/a/a;-><init>(Landroid/content/Context;)V */
/* .line 3 */
} // :cond_0
p0 = e.h.a.a.a.a.a.c;
} // .end method
/* # virtual methods */
public final Integer a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 11 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = this.a;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v2 = "string"; // const-string v2, "string"
p1 = (( android.content.res.Resources ) v0 ).getIdentifier ( p1, v2, v1 ); // invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // .end method
public java.lang.String a ( Integer p0 ) {
/* .locals 3 */
/* .line 7 */
v0 = e.h.a.a.a.a.a.b;
v0 = java.lang.Integer .valueOf ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
v0 = e.h.a.a.a.a.a.b;
java.lang.Integer .valueOf ( p1 );
/* check-cast p1, Ljava/lang/String; */
/* .line 9 */
} // :cond_0
try { // :try_start_0
v0 = this.a;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 10 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Your notification resource: "; // const-string v2, "Your notification resource: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " hasn\'t been found."; // const-string p1, " hasn\'t been found."
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NotificationCustomizer"; // const-string v0, "NotificationCustomizer"
android.util.Log .e ( v0,p1 );
final String p1 = "Notification resources not found"; // const-string p1, "Notification resources not found"
} // .end method
public void a ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 6 */
v0 = e.h.a.a.a.a.a.b;
java.lang.Integer .valueOf ( p1 );
return;
} // .end method
public void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 4 */
p1 = (( e.h.a.a.a.a.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/a/a/a/a/a;->a(Ljava/lang/String;)I
/* .line 5 */
(( e.h.a.a.a.a.a ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/a/a/a/a/a;->a(ILjava/lang/String;)V
return;
} // .end method
public void a ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 12 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 13 */
/* check-cast v1, Ljava/lang/String; */
/* check-cast v0, Ljava/lang/String; */
(( e.h.a.a.a.a.a ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/h/a/a/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
