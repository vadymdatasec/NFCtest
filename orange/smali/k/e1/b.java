public abstract class k.e1.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String b;
	 /* # direct methods */
	 public k.e1.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 k.e1.e .a ( p1,p2 );
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void b ( ) {
	 } // .end method
	 public final void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;
		 /* .line 2 */
		 java.lang.Thread .currentThread ( );
		 v2 = this.b;
		 (( java.lang.Thread ) v1 ).setName ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
		 /* .line 3 */
		 try { // :try_start_0
			 (( k.e1.b ) p0 ).b ( ); // invoke-virtual {p0}, Lk/e1/b;->b()V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 4 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v1 ).setName ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
			 return;
			 /* :catchall_0 */
			 /* move-exception v1 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v2 ).setName ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
			 /* throw v1 */
		 } // .end method
