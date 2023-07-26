public class e.f.c.l.e.m.n1 extends e.f.c.l.e.m.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String b; //synthetic
	 public final java.util.concurrent.ExecutorService c; //synthetic
	 public final Long d; //synthetic
	 public final java.util.concurrent.TimeUnit e; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.m.n1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* iput-wide p3, p0, Le/f/c/l/e/m/n1;->d:J */
		 this.e = p5;
		 /* invoke-direct {p0}, Le/f/c/l/e/m/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 try { // :try_start_0
			 e.f.c.l.e.b .a ( );
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Executing shutdown hook for "; // const-string v2, "Executing shutdown hook for "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.b;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 2 */
			 v0 = this.c;
			 /* .line 3 */
			 v0 = this.c;
			 /* iget-wide v1, p0, Le/f/c/l/e/m/n1;->d:J */
			 v0 = 			 v3 = this.e;
			 /* if-nez v0, :cond_0 */
			 /* .line 4 */
			 e.f.c.l.e.b .a ( );
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 v2 = this.b;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = " did not shut down in the allocated time.Requesting immediate shutdown."; // const-string v2, " did not shut down in the allocated time.Requesting immediate shutdown."
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 5 */
			 (( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 6 */
			 v0 = this.c;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 7 */
			 /* :catch_0 */
			 e.f.c.l.e.b .a ( );
			 v1 = java.util.Locale.US;
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 int v3 = 0; // const/4 v3, 0x0
			 v4 = this.b;
			 /* aput-object v4, v2, v3 */
			 final String v3 = "Interrupted while waiting for %s to shut down.Requesting immediate shutdown."; // const-string v3, "Interrupted while waiting for %s to shut down.Requesting immediate shutdown."
			 /* .line 8 */
			 java.lang.String .format ( v1,v3,v2 );
			 /* .line 9 */
			 (( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 10 */
			 v0 = this.c;
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
