public class e.b.a.y.x.s0 implements e.b.a.y.x.y0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Z:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "TZ;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final Boolean b;
public final Boolean c;
public final e.b.a.y.x.y0 d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/x/y0<", */
/* "TZ;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.r0 e;
public final e.b.a.y.n f;
public Integer g;
public Boolean h;
/* # direct methods */
public e.b.a.y.x.s0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/y0<", */
/* "TZ;>;ZZ", */
/* "Le/b/a/y/n;", */
/* "Le/b/a/y/x/r0;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.b.a.e0.r .a ( p1 );
/* check-cast p1, Le/b/a/y/x/y0; */
this.d = p1;
/* .line 3 */
/* iput-boolean p2, p0, Le/b/a/y/x/s0;->b:Z */
/* .line 4 */
/* iput-boolean p3, p0, Le/b/a/y/x/s0;->c:Z */
/* .line 5 */
this.f = p4;
/* .line 6 */
e.b.a.e0.r .a ( p5 );
/* check-cast p5, Le/b/a/y/x/r0; */
this.e = p5;
return;
} // .end method
/* # virtual methods */
public synchronized void a ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/b/a/y/x/s0;->h:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* iget v0, p0, Le/b/a/y/x/s0;->g:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Le/b/a/y/x/s0;->g:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* .line 4 */
} // :cond_0
try { // :try_start_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Cannot acquire a recycled resource"; // const-string v1, "Cannot acquire a recycled resource"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.d;
} // .end method
public java.lang.Class c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "TZ;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
} // .end method
public synchronized void d ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget v0, p0, Le/b/a/y/x/s0;->g:I */
/* if-gtz v0, :cond_2 */
/* .line 2 */
/* iget-boolean v0, p0, Le/b/a/y/x/s0;->h:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Le/b/a/y/x/s0;->h:Z */
/* .line 4 */
/* iget-boolean v0, p0, Le/b/a/y/x/s0;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
v0 = this.d;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 7 */
} // :cond_1
try { // :try_start_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Cannot recycle a resource that has already been recycled"; // const-string v1, "Cannot recycle a resource that has already been recycled"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Cannot recycle a resource while it is still acquired"; // const-string v1, "Cannot recycle a resource while it is still acquired"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public e.b.a.y.x.y0 e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/b/a/y/x/y0<", */
/* "TZ;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/x/s0;->b:Z */
} // .end method
public void g ( ) {
/* .locals 2 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
/* iget v0, p0, Le/b/a/y/x/s0;->g:I */
/* if-lez v0, :cond_2 */
/* .line 3 */
/* iget v0, p0, Le/b/a/y/x/s0;->g:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Le/b/a/y/x/s0;->g:I */
/* if-nez v0, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
v0 = this.e;
v1 = this.f;
} // :cond_1
return;
/* .line 6 */
} // :cond_2
try { // :try_start_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Cannot release a recycled or not yet acquired resource"; // const-string v1, "Cannot release a recycled or not yet acquired resource"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 7 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public java.lang.Object get ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TZ;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
} // .end method
public synchronized java.lang.String toString ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "EngineResource{isMemoryCacheable="; // const-string v1, "EngineResource{isMemoryCacheable="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Le/b/a/y/x/s0;->b:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", listener="; // const-string v1, ", listener="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", key="; // const-string v1, ", key="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", acquired="; // const-string v1, ", acquired="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/s0;->g:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", isRecycled="; // const-string v1, ", isRecycled="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Le/b/a/y/x/s0;->h:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", resource="; // const-string v1, ", resource="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
