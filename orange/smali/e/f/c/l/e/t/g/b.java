public class e.f.c.l.e.t.g.b implements e.f.c.l.e.t.g.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.File a;
	 /* # direct methods */
	 public e.f.c.l.e.t.g.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
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
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.io.File b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
	 (( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
} // .end method
public java.lang.String c ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
	 (( java.io.File ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
} // .end method
public e.f.c.l.e.t.g.c e ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.f.c.l.e.t.g.c.c;
} // .end method
public java.io.File f ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public void remove ( ) {
	 /* .locals 7 */
	 /* .line 1 */
	 (( e.f.c.l.e.t.g.b ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/t/g/b;->b()[Ljava/io/File;
	 /* array-length v1, v0 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
/* .line 2 */
e.f.c.l.e.b .a ( );
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Removing native report file at "; // const-string v6, "Removing native report file at "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 3 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
} // :cond_0
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Removing native report directory at "; // const-string v2, "Removing native report directory at "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 5 */
v0 = this.a;
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
return;
} // .end method
