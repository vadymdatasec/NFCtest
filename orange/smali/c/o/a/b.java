public class c.o.a.b extends c.o.a.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/o/a/b$b;, */
	 /* Lc/o/a/b$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.n.j a;
public final c.o.a.b$b b;
/* # direct methods */
public static c.o.a.b ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public c.o.a.b ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lc/o/a/a;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 /* .line 3 */
	 c.o.a.b$b .a ( p2 );
	 this.b = p1;
	 return;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 (( c.o.a.b$b ) v0 ).c ( ); // invoke-virtual {v0}, Lc/o/a/b$b;->c()V
	 return;
} // .end method
public void a ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
	 /* .locals 1 */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 2 */
v0 = this.b;
(( c.o.a.b$b ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/o/a/b$b;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "LoaderManager{"; // const-string v1, "LoaderManager{"
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " in "; // const-string v1, " in "
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = this.a;
c.h.m.b .a ( v1,v0 );
final String v1 = "}}"; // const-string v1, "}}"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
