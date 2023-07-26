public class e.b.a.e0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* "Y:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "TT;", */
/* "Le/b/a/e0/n<", */
/* "TY;>;>;" */
/* } */
} // .end annotation
} // .end field
public Long b;
public Long c;
/* # direct methods */
public e.b.a.e0.o ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* const/16 v1, 0x64 */
/* const/high16 v2, 0x3f400000 # 0.75f */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V */
this.a = v0;
/* .line 3 */
/* iput-wide p1, p0, Le/b/a/e0/o;->b:J */
return;
} // .end method
/* # virtual methods */
public synchronized java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)TY;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
/* check-cast p1, Le/b/a/e0/n; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 2 */
/* const-wide/16 v0, 0x0 */
/* .line 3 */
(( e.b.a.e0.o ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/e0/o;->a(J)V
return;
} // .end method
public synchronized void a ( Long p0 ) {
/* .locals 7 */
/* monitor-enter p0 */
/* .line 4 */
} // :goto_0
try { // :try_start_0
/* iget-wide v0, p0, Le/b/a/e0/o;->c:J */
/* cmp-long v2, v0, p1 */
/* if-lez v2, :cond_0 */
/* .line 5 */
v0 = this.a;
/* .line 6 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 7 */
/* check-cast v2, Le/b/a/e0/n; */
/* .line 8 */
/* iget-wide v3, p0, Le/b/a/e0/o;->c:J */
/* iget v5, v2, Le/b/a/e0/n;->b:I */
/* int-to-long v5, v5 */
/* sub-long/2addr v3, v5 */
/* iput-wide v3, p0, Le/b/a/e0/o;->c:J */
/* .line 9 */
/* .line 10 */
/* .line 11 */
v0 = this.a;
(( e.b.a.e0.o ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/b/a/e0/o;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 12 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;TY;)V" */
/* } */
} // .end annotation
return;
} // .end method
public Integer b ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TY;)I" */
/* } */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
} // .end method
public synchronized java.lang.Object b ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;TY;)TY;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = (( e.b.a.e0.o ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/b/a/e0/o;->b(Ljava/lang/Object;)I
/* int-to-long v1, v0 */
/* .line 2 */
/* iget-wide v3, p0, Le/b/a/e0/o;->b:J */
int v5 = 0; // const/4 v5, 0x0
/* cmp-long v6, v1, v3 */
/* if-ltz v6, :cond_0 */
/* .line 3 */
(( e.b.a.e0.o ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/e0/o;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
/* monitor-exit p0 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
try { // :try_start_1
/* iget-wide v3, p0, Le/b/a/e0/o;->c:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, p0, Le/b/a/e0/o;->c:J */
/* .line 6 */
} // :cond_1
v1 = this.a;
/* if-nez p2, :cond_2 */
/* move-object v2, v5 */
} // :cond_2
/* new-instance v2, Le/b/a/e0/n; */
/* invoke-direct {v2, p2, v0}, Le/b/a/e0/n;-><init>(Ljava/lang/Object;I)V */
} // :goto_0
/* check-cast v0, Le/b/a/e0/n; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 7 */
/* iget-wide v1, p0, Le/b/a/e0/o;->c:J */
/* iget v3, v0, Le/b/a/e0/n;->b:I */
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Le/b/a/e0/o;->c:J */
/* .line 8 */
v1 = this.a;
p2 = (( java.lang.Object ) v1 ).equals ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez p2, :cond_3 */
/* .line 9 */
p2 = this.a;
(( e.b.a.e0.o ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/e0/o;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 10 */
} // :cond_3
(( e.b.a.e0.o ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/e0/o;->b()V
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
v5 = this.a;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_4
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 12 */
/* iget-wide v0, p0, Le/b/a/e0/o;->b:J */
(( e.b.a.e0.o ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/e0/o;->a(J)V
return;
} // .end method
public synchronized Long c ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-wide v0, p0, Le/b/a/e0/o;->b:J */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* return-wide v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.Object c ( java.lang.Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)TY;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.a;
/* check-cast p1, Le/b/a/e0/n; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* monitor-exit p0 */
/* .line 4 */
} // :cond_0
try { // :try_start_1
/* iget-wide v0, p0, Le/b/a/e0/o;->c:J */
/* iget v2, p1, Le/b/a/e0/n;->b:I */
/* int-to-long v2, v2 */
/* sub-long/2addr v0, v2 */
/* iput-wide v0, p0, Le/b/a/e0/o;->c:J */
/* .line 5 */
p1 = this.a;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
