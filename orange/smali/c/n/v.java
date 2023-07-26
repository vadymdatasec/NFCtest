public abstract class c.n.v {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.n.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
return;
} // .end method
public static void a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 11 */
/* instance-of v0, p0, Ljava/io/Closeable; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 12 */
	 try { // :try_start_0
		 /* check-cast p0, Ljava/io/Closeable; */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 13 */
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 /* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v0 */
	 } // :cond_0
} // :goto_0
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .line 7 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
} // :cond_0
/* monitor-enter v0 */
/* .line 9 */
try { // :try_start_0
v1 = this.a;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 10 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
	 v1 = this.a;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 4 */
	 c.n.v .a ( v2 );
	 /* .line 5 */
} // :cond_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
/* .line 6 */
} // :cond_1
} // :goto_1
(( c.n.v ) p0 ).b ( ); // invoke-virtual {p0}, Lc/n/v;->b()V
return;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
