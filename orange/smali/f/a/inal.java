public class inal implements h.a.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Lh/a/a<", */
	 /* "TT;>;", */
	 /* "Ljava/lang/Object<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object c;
/* # instance fields */
public volatile h.a.a a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lh/a/a<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public volatile java.lang.Object b;
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lh/a/a<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = f.a.a.c;
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
public static h.a.a a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<P::", */
/* "Lh/a/a<", */
/* "TT;>;T:", */
/* "Ljava/lang/Object;", */
/* ">(TP;)", */
/* "Lh/a/a<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 3 */
f.a.d .a ( p0 );
/* .line 4 */
/* instance-of v0, p0, Lf/a/a; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
} // :cond_0
/* new-instance v0, Lf/a/a; */
/* invoke-direct {v0, p0}, Lf/a/a;-><init>(Lh/a/a;)V */
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = f.a.a.c;
/* if-eq p0, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-ne p0, p1, :cond_1 */
/* .line 2 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Scoped provider was invoked recursively returning different results: "; // const-string v2, "Scoped provider was invoked recursively returning different results: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = " & "; // const-string p0, " & "
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = ".This is likely due to a circular dependency."; // const-string p0, ".This is likely due to a circular dependency."
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
} // :goto_1
} // .end method
/* # virtual methods */
public java.lang.Object get ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* .line 2 */
v1 = f.a.a.c;
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
v0 = this.b;
/* .line 5 */
v1 = f.a.a.c;
/* if-ne v0, v1, :cond_0 */
/* .line 6 */
v0 = this.a;
/* .line 7 */
v1 = this.b;
f.a.a .a ( v1,v0 );
this.b = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
this.a = v1;
/* .line 9 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
} // :goto_0
} // .end method
