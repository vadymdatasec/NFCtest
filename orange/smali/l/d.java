public class l.d extends l.a0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Long h;
	 public static final Long i;
	 public static l.d j;
	 /* # instance fields */
	 public Boolean e;
	 public l.d f;
	 public Long g;
	 /* # direct methods */
	 public static l.d ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = java.util.concurrent.TimeUnit.SECONDS;
		 /* const-wide/16 v1, 0x3c */
		 (( java.util.concurrent.TimeUnit ) v0 ).toMillis ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
		 /* move-result-wide v0 */
		 /* sput-wide v0, Ll/d;->h:J */
		 /* .line 2 */
		 v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
		 /* sget-wide v1, Ll/d;->h:J */
		 (( java.util.concurrent.TimeUnit ) v0 ).toNanos ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
		 /* move-result-wide v0 */
		 /* sput-wide v0, Ll/d;->i:J */
		 return;
	 } // .end method
	 public l.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ll/a0;-><init>()V */
		 return;
	 } // .end method
	 public static synchronized void a ( Object p0, Long p1, Boolean p2 ) {
		 /* .locals 6 */
		 /* const-class v0, Ll/d; */
		 /* monitor-enter v0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = l.d.j;
			 /* if-nez v1, :cond_0 */
			 /* .line 2 */
			 /* new-instance v1, Ll/d; */
			 /* invoke-direct {v1}, Ll/d;-><init>()V */
			 /* .line 3 */
			 /* new-instance v1, Ll/c; */
			 /* invoke-direct {v1}, Ll/c;-><init>()V */
			 (( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
			 /* .line 4 */
		 } // :cond_0
		 java.lang.System .nanoTime ( );
		 /* move-result-wide v1 */
		 /* const-wide/16 v3, 0x0 */
		 /* cmp-long v5, p1, v3 */
		 if ( v5 != null) { // if-eqz v5, :cond_1
			 if ( p3 != null) { // if-eqz p3, :cond_1
				 /* .line 5 */
				 (( l.a0 ) p0 ).c ( ); // invoke-virtual {p0}, Ll/a0;->c()J
				 /* move-result-wide v3 */
				 /* sub-long/2addr v3, v1 */
				 java.lang.Math .min ( p1,p2,v3,v4 );
				 /* move-result-wide p1 */
				 /* add-long/2addr p1, v1 */
				 /* iput-wide p1, p0, Ll/d;->g:J */
			 } // :cond_1
			 if ( v5 != null) { // if-eqz v5, :cond_2
				 /* add-long/2addr p1, v1 */
				 /* .line 6 */
				 /* iput-wide p1, p0, Ll/d;->g:J */
			 } // :cond_2
			 if ( p3 != null) { // if-eqz p3, :cond_6
				 /* .line 7 */
				 (( l.a0 ) p0 ).c ( ); // invoke-virtual {p0}, Ll/a0;->c()J
				 /* move-result-wide p1 */
				 /* iput-wide p1, p0, Ll/d;->g:J */
				 /* .line 8 */
			 } // :goto_0
			 (( l.d ) p0 ).b ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ll/d;->b(J)J
			 /* move-result-wide p1 */
			 /* .line 9 */
			 p3 = l.d.j;
			 /* .line 10 */
		 } // :goto_1
		 v3 = this.f;
		 if ( v3 != null) { // if-eqz v3, :cond_4
			 v3 = this.f;
			 (( l.d ) v3 ).b ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Ll/d;->b(J)J
			 /* move-result-wide v3 */
			 /* cmp-long v5, p1, v3 */
			 /* if-gez v5, :cond_3 */
			 /* .line 11 */
		 } // :cond_3
		 p3 = this.f;
		 /* .line 12 */
	 } // :cond_4
} // :goto_2
p1 = this.f;
this.f = p1;
/* .line 13 */
this.f = p0;
/* .line 14 */
p0 = l.d.j;
/* if-ne p3, p0, :cond_5 */
/* .line 15 */
(( java.lang.Object ) v0 ).notify ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 16 */
} // :cond_5
/* monitor-exit v0 */
return;
/* .line 17 */
} // :cond_6
try { // :try_start_1
/* new-instance p0, Ljava/lang/AssertionError; */
/* invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V */
/* throw p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
public static synchronized Boolean a ( Object p0 ) {
/* .locals 3 */
/* const-class v0, Ll/d; */
/* monitor-enter v0 */
/* .line 18 */
try { // :try_start_0
v1 = l.d.j;
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 19 */
v2 = this.f;
/* if-ne v2, p0, :cond_0 */
/* .line 20 */
v2 = this.f;
this.f = v2;
int v1 = 0; // const/4 v1, 0x0
/* .line 21 */
this.f = v1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 22 */
/* monitor-exit v0 */
/* .line 23 */
} // :cond_0
try { // :try_start_1
v1 = this.f;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_1
int p0 = 1; // const/4 p0, 0x1
/* .line 24 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
public static l.d j ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .line 1 */
/* const-class v0, Ll/d; */
v1 = l.d.j;
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
java.lang.System .nanoTime ( );
/* move-result-wide v3 */
/* .line 3 */
/* sget-wide v5, Ll/d;->h:J */
(( java.lang.Object ) v0 ).wait ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/lang/Object;->wait(J)V
/* .line 4 */
v0 = l.d.j;
v0 = this.f;
/* if-nez v0, :cond_0 */
java.lang.System .nanoTime ( );
/* move-result-wide v0 */
/* sub-long/2addr v0, v3 */
/* sget-wide v3, Ll/d;->i:J */
/* cmp-long v5, v0, v3 */
/* if-ltz v5, :cond_0 */
/* .line 5 */
v2 = l.d.j;
} // :cond_0
/* .line 6 */
} // :cond_1
java.lang.System .nanoTime ( );
/* move-result-wide v3 */
(( l.d ) v1 ).b ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ll/d;->b(J)J
/* move-result-wide v3 */
/* const-wide/16 v5, 0x0 */
/* cmp-long v7, v3, v5 */
/* if-lez v7, :cond_2 */
/* const-wide/32 v5, 0xf4240 */
/* .line 7 */
/* div-long v7, v3, v5 */
/* mul-long v5, v5, v7 */
/* sub-long/2addr v3, v5 */
/* long-to-int v1, v3 */
/* .line 8 */
(( java.lang.Object ) v0 ).wait ( v7, v8, v1 ); // invoke-virtual {v0, v7, v8, v1}, Ljava/lang/Object;->wait(JI)V
/* .line 9 */
} // :cond_2
v0 = l.d.j;
v3 = this.f;
this.f = v3;
/* .line 10 */
this.f = v2;
} // .end method
/* # virtual methods */
public final java.io.IOException a ( java.io.IOException p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 29 */
v0 = (( l.d ) p0 ).h ( ); // invoke-virtual {p0}, Ll/d;->h()Z
/* if-nez v0, :cond_0 */
/* .line 30 */
} // :cond_0
(( l.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Ll/d;->b(Ljava/io/IOException;)Ljava/io/IOException;
} // .end method
public final l.x a ( Object p0 ) {
/* .locals 1 */
/* .line 25 */
/* new-instance v0, Ll/a; */
/* invoke-direct {v0, p0, p1}, Ll/a;-><init>(Ll/d;Ll/x;)V */
} // .end method
public final l.y a ( Object p0 ) {
/* .locals 1 */
/* .line 26 */
/* new-instance v0, Ll/b; */
/* invoke-direct {v0, p0, p1}, Ll/b;-><init>(Ll/d;Ll/y;)V */
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 27 */
v0 = (( l.d ) p0 ).h ( ); // invoke-virtual {p0}, Ll/d;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 28 */
(( l.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Ll/d;->b(Ljava/io/IOException;)Ljava/io/IOException;
/* throw p1 */
} // :cond_1
} // :goto_0
return;
} // .end method
public final Long b ( Long p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Ll/d;->g:J */
/* sub-long/2addr v0, p1 */
/* return-wide v0 */
} // .end method
public java.io.IOException b ( java.io.IOException p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Ljava/io/InterruptedIOException; */
final String v1 = "timeout"; // const-string v1, "timeout"
/* invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( java.io.InterruptedIOException ) v0 ).initCause ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
} // :cond_0
} // .end method
public final void g ( ) {
/* .locals 6 */
/* .line 1 */
/* iget-boolean v0, p0, Ll/d;->e:Z */
/* if-nez v0, :cond_1 */
/* .line 2 */
(( l.a0 ) p0 ).f ( ); // invoke-virtual {p0}, Ll/a0;->f()J
/* move-result-wide v0 */
/* .line 3 */
v2 = (( l.a0 ) p0 ).d ( ); // invoke-virtual {p0}, Ll/a0;->d()Z
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v0, v3 */
/* if-nez v5, :cond_0 */
/* if-nez v2, :cond_0 */
return;
} // :cond_0
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
/* iput-boolean v3, p0, Ll/d;->e:Z */
/* .line 5 */
l.d .a ( p0,v0,v1,v2 );
return;
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Unbalanced enter/exit"; // const-string v1, "Unbalanced enter/exit"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final Boolean h ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Ll/d;->e:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* iput-boolean v1, p0, Ll/d;->e:Z */
/* .line 3 */
v0 = l.d .a ( p0 );
} // .end method
public void i ( ) {
/* .locals 0 */
return;
} // .end method
