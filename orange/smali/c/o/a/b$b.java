public class c.o.a.b$b extends c.n.v {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/o/a/b; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # static fields */
public static final c.n.w$a c;
/* # instance fields */
public c.e.j b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/j<", */
/* "Lc/o/a/b$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.o.a.b$b ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/o/a/b$b$a; */
/* invoke-direct {v0}, Lc/o/a/b$b$a;-><init>()V */
return;
} // .end method
public c.o.a.b$b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/n/v;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/j; */
/* invoke-direct {v0}, Lc/e/j;-><init>()V */
this.b = v0;
return;
} // .end method
public static c.o.a.b$b a ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/n/w; */
v1 = c.o.a.b$b.c;
/* invoke-direct {v0, p0, v1}, Lc/n/w;-><init>(Lc/n/x;Lc/n/w$a;)V */
/* const-class p0, Lc/o/a/b$b; */
(( c.n.w ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/n/w;->a(Ljava/lang/Class;)Lc/n/v;
/* check-cast p0, Lc/o/a/b$b; */
} // .end method
/* # virtual methods */
public void a ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
/* .locals 4 */
/* .line 2 */
v0 = this.b;
v0 = (( c.e.j ) v0 ).d ( ); // invoke-virtual {v0}, Lc/e/j;->d()I
/* if-lez v0, :cond_0 */
/* .line 3 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "Loaders:"; // const-string v0, "Loaders:"
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
} // :goto_0
v2 = this.b;
v2 = (( c.e.j ) v2 ).d ( ); // invoke-virtual {v2}, Lc/e/j;->d()I
/* if-ge v1, v2, :cond_0 */
/* .line 6 */
v2 = this.b;
(( c.e.j ) v2 ).c ( v1 ); // invoke-virtual {v2, v1}, Lc/e/j;->c(I)Ljava/lang/Object;
/* check-cast v2, Lc/o/a/b$a; */
/* .line 7 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v3 = " #"; // const-string v3, " #"
(( java.io.PrintWriter ) p3 ).print ( v3 ); // invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v3 = this.b;
v3 = (( c.e.j ) v3 ).b ( v1 ); // invoke-virtual {v3, v1}, Lc/e/j;->b(I)I
(( java.io.PrintWriter ) p3 ).print ( v3 ); // invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
final String v3 = ": "; // const-string v3, ": "
/* .line 8 */
(( java.io.PrintWriter ) p3 ).print ( v3 ); // invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
(( c.o.a.b$a ) v2 ).toString ( ); // invoke-virtual {v2}, Lc/o/a/b$a;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p3 ).println ( v3 ); // invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 9 */
(( c.o.a.b$a ) v2 ).a ( v0, p2, p3, p4 ); // invoke-virtual {v2, v0, p2, p3, p4}, Lc/o/a/b$a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Lc/n/v;->b()V */
/* .line 2 */
v0 = this.b;
v0 = (( c.e.j ) v0 ).d ( ); // invoke-virtual {v0}, Lc/e/j;->d()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.b;
(( c.e.j ) v2 ).c ( v1 ); // invoke-virtual {v2, v1}, Lc/e/j;->c(I)Ljava/lang/Object;
/* check-cast v2, Lc/o/a/b$a; */
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
(( c.o.a.b$a ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lc/o/a/b$a;->a(Z)Lc/o/b/a;
/* add-int/lit8 v1, v1, 0x1 */
/* .line 5 */
} // :cond_0
v0 = this.b;
(( c.e.j ) v0 ).a ( ); // invoke-virtual {v0}, Lc/e/j;->a()V
return;
} // .end method
public void c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
v0 = (( c.e.j ) v0 ).d ( ); // invoke-virtual {v0}, Lc/e/j;->d()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 2 */
v2 = this.b;
(( c.e.j ) v2 ).c ( v1 ); // invoke-virtual {v2, v1}, Lc/e/j;->c(I)Ljava/lang/Object;
/* check-cast v2, Lc/o/a/b$a; */
/* .line 3 */
(( c.o.a.b$a ) v2 ).c ( ); // invoke-virtual {v2}, Lc/o/a/b$a;->c()V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
