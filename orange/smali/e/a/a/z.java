public class e.a.a.z {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Boolean c;
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/a/a/y;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean b;
/* # direct methods */
public static e.a.a.z ( ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Le/a/a/a0;->a:Z */
e.a.a.z.c = (v0!= 0);
return;
} // .end method
public e.a.a.z ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Le/a/a/z;->b:Z */
return;
} // .end method
/* # virtual methods */
public final Long a ( ) {
/* .locals 4 */
/* .line 13 */
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* return-wide v0 */
/* .line 14 */
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Le/a/a/y; */
/* iget-wide v0, v0, Le/a/a/y;->c:J */
/* .line 15 */
v3 = v2 = this.a;
/* add-int/lit8 v3, v3, -0x1 */
/* check-cast v2, Le/a/a/y; */
/* iget-wide v2, v2, Le/a/a/y;->c:J */
/* sub-long/2addr v2, v0 */
/* return-wide v2 */
} // .end method
public synchronized void a ( java.lang.String p0 ) {
/* .locals 4 */
/* monitor-enter p0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
try { // :try_start_0
/* iput-boolean p1, p0, Le/a/a/z;->b:Z */
/* .line 6 */
(( e.a.a.z ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/z;->a()J
/* move-result-wide v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
/* if-gtz p1, :cond_0 */
/* .line 7 */
/* monitor-exit p0 */
return;
/* .line 8 */
} // :cond_0
try { // :try_start_1
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
/* check-cast p1, Le/a/a/y; */
/* iget-wide v0, p1, Le/a/a/y;->c:J */
/* .line 9 */
p1 = this.a;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Le/a/a/y; */
/* .line 10 */
/* iget-wide v1, v0, Le/a/a/y;->c:J */
/* .line 11 */
/* iget-wide v1, v0, Le/a/a/y;->b:J */
v0 = this.a;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 12 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( java.lang.String p0, Long p1 ) {
/* .locals 8 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/a/a/z;->b:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.a;
/* new-instance v7, Le/a/a/y; */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v5 */
/* move-object v1, v7 */
/* move-object v2, p1 */
/* move-wide v3, p2 */
/* invoke-direct/range {v1 ..v6}, Le/a/a/y;-><init>(Ljava/lang/String;JJ)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* .line 4 */
} // :cond_0
try { // :try_start_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Marker added to finished log"; // const-string p2, "Marker added to finished log"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void finalize ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Le/a/a/z;->b:Z */
/* if-nez v0, :cond_0 */
final String v0 = "Request on the loose"; // const-string v0, "Request on the loose"
/* .line 2 */
(( e.a.a.z ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/a/a/z;->a(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
