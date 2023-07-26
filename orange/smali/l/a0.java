public class l.a0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final l.a0 d;
	 /* # instance fields */
	 public Boolean a;
	 public Long b;
	 public Long c;
	 /* # direct methods */
	 public static l.a0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ll/z; */
		 /* invoke-direct {v0}, Ll/z;-><init>()V */
		 return;
	 } // .end method
	 public l.a0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput-boolean v0, p0, Ll/a0;->a:Z */
	 } // .end method
	 public l.a0 a ( Long p0 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 4 */
		 /* iput-boolean v0, p0, Ll/a0;->a:Z */
		 /* .line 5 */
		 /* iput-wide p1, p0, Ll/a0;->b:J */
	 } // .end method
	 public l.a0 a ( Long p0, java.util.concurrent.TimeUnit p1 ) {
		 /* .locals 3 */
		 /* const-wide/16 v0, 0x0 */
		 /* cmp-long v2, p1, v0 */
		 /* if-ltz v2, :cond_1 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 1 */
			 (( java.util.concurrent.TimeUnit ) p3 ).toNanos ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
			 /* move-result-wide p1 */
			 /* iput-wide p1, p0, Ll/a0;->c:J */
			 /* .line 2 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "unit == null"; // const-string p2, "unit == null"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
		 /* .line 3 */
	 } // :cond_1
	 /* new-instance p3, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "timeout < 0: "; // const-string v1, "timeout < 0: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p3 */
} // .end method
public l.a0 b ( ) {
	 /* .locals 2 */
	 /* const-wide/16 v0, 0x0 */
	 /* .line 1 */
	 /* iput-wide v0, p0, Ll/a0;->c:J */
} // .end method
public Long c ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Ll/a0;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* iget-wide v0, p0, Ll/a0;->b:J */
		 /* return-wide v0 */
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "No deadline"; // const-string v1, "No deadline"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public Boolean d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Ll/a0;->a:Z */
} // .end method
public void e ( ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = java.lang.Thread .interrupted ( );
/* if-nez v0, :cond_2 */
/* .line 2 */
/* iget-boolean v0, p0, Ll/a0;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* iget-wide v0, p0, Ll/a0;->b:J */
	 java.lang.System .nanoTime ( );
	 /* move-result-wide v2 */
	 /* sub-long/2addr v0, v2 */
	 /* const-wide/16 v2, 0x0 */
	 /* cmp-long v4, v0, v2 */
	 /* if-lez v4, :cond_0 */
	 /* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/io/InterruptedIOException; */
final String v1 = "deadline reached"; // const-string v1, "deadline reached"
/* invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
} // :goto_0
return;
/* .line 4 */
} // :cond_2
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 5 */
/* new-instance v0, Ljava/io/InterruptedIOException; */
final String v1 = "interrupted"; // const-string v1, "interrupted"
/* invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Long f ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Ll/a0;->c:J */
/* return-wide v0 */
} // .end method
