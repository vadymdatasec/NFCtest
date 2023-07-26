public class k.n implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final k.o b; //synthetic
	 /* # direct methods */
	 public k.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 6 */
		 /* .line 1 */
	 } // :cond_0
} // :goto_0
v0 = this.b;
java.lang.System .nanoTime ( );
/* move-result-wide v1 */
(( k.o ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lk/o;->a(J)J
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_1 */
return;
} // :cond_1
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_0 */
/* const-wide/32 v2, 0xf4240 */
/* .line 2 */
/* div-long v4, v0, v2 */
/* mul-long v2, v2, v4 */
/* sub-long/2addr v0, v2 */
/* .line 3 */
v2 = this.b;
/* monitor-enter v2 */
/* .line 4 */
try { // :try_start_0
v3 = this.b;
/* long-to-int v1, v0 */
(( java.lang.Object ) v3 ).wait ( v4, v5, v1 ); // invoke-virtual {v3, v4, v5, v1}, Ljava/lang/Object;->wait(JI)V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 5 */
/* :catch_0 */
} // :goto_1
try { // :try_start_1
/* monitor-exit v2 */
} // :goto_2
/* monitor-exit v2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
