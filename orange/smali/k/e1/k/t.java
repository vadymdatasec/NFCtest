public class k.e1.k.t extends k.e1.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.e1.k.e0 c; //synthetic
	 public final k.e1.k.w d; //synthetic
	 /* # direct methods */
	 public k.e1.k.t ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 this.c = p4;
		 /* invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.d;
			 v0 = this.d;
			 v0 = this.c;
			 v1 = this.c;
			 (( k.e1.k.r ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/e1/k/r;->a(Lk/e1/k/e0;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 2 */
			 k.e1.l.j .c ( );
			 int v2 = 4; // const/4 v2, 0x4
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v4 = "Http2Connection.Listener failure for "; // const-string v4, "Http2Connection.Listener failure for "
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v4 = this.d;
			 v4 = this.d;
			 v4 = this.e;
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( k.e1.l.j ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lk/e1/l/j;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
			 /* .line 3 */
			 try { // :try_start_1
				 v0 = this.c;
				 v1 = k.e1.k.a.d;
				 (( k.e1.k.e0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/e1/k/e0;->a(Lk/e1/k/a;)V
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* :catch_1 */
			 } // :goto_0
			 return;
		 } // .end method
