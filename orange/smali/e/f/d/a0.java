public abstract class e.f.d.a0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.f.d.a0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public final e.f.d.t a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(TT;)", */
	 /* "Le/f/d/t;" */
	 /* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
	 /* new-instance v0, Le/f/d/d0/g0/h; */
	 /* invoke-direct {v0}, Le/f/d/d0/g0/h;-><init>()V */
	 /* .line 2 */
	 (( e.f.d.a0 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V
	 /* .line 3 */
	 (( e.f.d.d0.g0.h ) v0 ).v ( ); // invoke-virtual {v0}, Le/f/d/d0/g0/h;->v()Le/f/d/t;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 4 */
	 /* new-instance v0, Lcom/google/gson/JsonIOException; */
	 /* invoke-direct {v0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v0 */
} // .end method
public abstract java.lang.Object a ( Object p0 ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/f/d/f0/c;", */
	 /* ")TT;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public abstract void a ( Object p0, java.lang.Object p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/d/f0/g;", */
/* "TT;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
