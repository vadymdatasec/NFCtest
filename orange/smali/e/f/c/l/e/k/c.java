public class e.f.c.l.e.k.c implements e.f.c.l.e.k.b implements e.f.c.l.e.k.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.c.l.e.k.e a;
	 public final Integer b;
	 public final java.util.concurrent.TimeUnit c;
	 public final java.lang.Object d;
	 public java.util.concurrent.CountDownLatch e;
	 /* # direct methods */
	 public e.f.c.l.e.k.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.d = v0;
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 /* iput p2, p0, Le/f/c/l/e/k/c;->b:I */
		 /* .line 5 */
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0, android.os.Bundle p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.d;
		 /* monitor-enter v0 */
		 /* .line 2 */
		 try { // :try_start_0
			 e.f.c.l.e.b .a ( );
			 final String v2 = "Logging Crashlytics event to Firebase"; // const-string v2, "Logging Crashlytics event to Firebase"
			 (( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 3 */
			 /* new-instance v1, Ljava/util/concurrent/CountDownLatch; */
			 int v2 = 1; // const/4 v2, 0x1
			 /* invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
			 this.e = v1;
			 /* .line 4 */
			 v1 = this.a;
			 (( e.f.c.l.e.k.e ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Le/f/c/l/e/k/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V
			 /* .line 5 */
			 e.f.c.l.e.b .a ( );
			 final String p2 = "Awaiting app exception callback from FA..."; // const-string p2, "Awaiting app exception callback from FA..."
			 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 6 */
			 try { // :try_start_1
				 p1 = this.e;
				 /* iget p2, p0, Le/f/c/l/e/k/c;->b:I */
				 /* int-to-long v1, p2 */
				 p2 = this.c;
				 p1 = 				 (( java.util.concurrent.CountDownLatch ) p1 ).await ( v1, v2, p2 ); // invoke-virtual {p1, v1, v2, p2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 /* .line 7 */
					 e.f.c.l.e.b .a ( );
					 final String p2 = "App exception callback received from FA listener."; // const-string p2, "App exception callback received from FA listener."
					 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
					 /* .line 8 */
				 } // :cond_0
				 e.f.c.l.e.b .a ( );
				 final String p2 = "Timeout exceeded while awaiting app exception callback from FA listener."; // const-string p2, "Timeout exceeded while awaiting app exception callback from FA listener."
				 /* .line 9 */
				 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 10 */
				 /* :catch_0 */
				 try { // :try_start_2
					 e.f.c.l.e.b .a ( );
					 final String p2 = "Interrupted while awaiting app exception callback from FA listener."; // const-string p2, "Interrupted while awaiting app exception callback from FA listener."
					 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
				 } // :goto_0
				 int p1 = 0; // const/4 p1, 0x0
				 /* .line 11 */
				 this.e = p1;
				 /* .line 12 */
				 /* monitor-exit v0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* monitor-exit v0 */
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 /* throw p1 */
			 } // .end method
