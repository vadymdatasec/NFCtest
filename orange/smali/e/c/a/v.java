public abstract class e.c.a.v extends e.c.a.f1 implements e.c.a.d1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.List h;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/h1;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.Boolean i;
public android.graphics.Matrix j;
public e.c.a.w k;
public java.lang.String l;
/* # direct methods */
public e.c.a.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Le/c/a/f1;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.h = v0;
return;
} // .end method
/* # virtual methods */
public void a ( e.c.a.h1 p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 1 */
/* instance-of v0, p1, Le/c/a/p0; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.h;
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Lorg/xml/sax/SAXException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Gradient elements cannot contain "; // const-string v2, "Gradient elements cannot contain "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " elements."; // const-string p1, " elements."
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.util.List e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/c/a/h1;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
} // .end method
