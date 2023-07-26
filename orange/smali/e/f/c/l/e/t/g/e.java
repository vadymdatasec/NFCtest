public class e.f.c.l.e.t.g.e implements e.f.c.l.e.t.g.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.File a;
	 public final java.io.File b;
	 public final java.util.Map c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.l.e.t.g.e ( ) {
/* .locals 1 */
/* .line 1 */
java.util.Collections .emptyMap ( );
/* invoke-direct {p0, p1, v0}, Le/f/c/l/e/t/g/e;-><init>(Ljava/io/File;Ljava/util/Map;)V */
return;
} // .end method
public e.f.c.l.e.t.g.e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.a = p1;
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/io/File; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
/* .line 4 */
this.b = v0;
/* .line 5 */
/* new-instance p1, Ljava/util/HashMap; */
/* invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
this.c = p1;
return;
} // .end method
/* # virtual methods */
public java.util.Map a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
java.util.Collections .unmodifiableMap ( v0 );
} // .end method
public java.io.File b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.l.e.t.g.e ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/l/e/t/g/e;->f()Ljava/io/File;
(( java.io.File ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
} // .end method
public java.lang.String d ( ) {
/* .locals 3 */
/* .line 1 */
(( e.f.c.l.e.t.g.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/t/g/e;->c()Ljava/lang/String;
/* const/16 v1, 0x2e */
/* .line 2 */
v1 = (( java.lang.String ) v0 ).lastIndexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) v0 ).substring ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public e.f.c.l.e.t.g.c e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.l.e.t.g.c.b;
} // .end method
public java.io.File f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public void remove ( ) {
/* .locals 3 */
/* .line 1 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Removing report at "; // const-string v2, "Removing report at "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.io.File ) v2 ).getPath ( ); // invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 2 */
v0 = this.a;
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
return;
} // .end method
