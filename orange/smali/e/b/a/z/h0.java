public class e.b.a.z.h0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.z.j0 b; //synthetic
	 /* # direct methods */
	 public e.b.a.z.h0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 /* iget-boolean v0, v0, Le/b/a/z/j0;->d:Z */
		 /* .line 2 */
		 v1 = this.b;
		 v2 = 		 (( e.b.a.z.j0 ) v1 ).c ( ); // invoke-virtual {v1}, Le/b/a/z/j0;->c()Z
		 /* iput-boolean v2, v1, Le/b/a/z/j0;->d:Z */
		 /* .line 3 */
		 v1 = this.b;
		 /* iget-boolean v1, v1, Le/b/a/z/j0;->d:Z */
		 /* if-eq v0, v1, :cond_1 */
		 int v0 = 3; // const/4 v0, 0x3
		 final String v1 = "ConnectivityMonitor"; // const-string v1, "ConnectivityMonitor"
		 /* .line 4 */
		 v0 = 		 android.util.Log .isLoggable ( v1,v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "connectivity changed, isConnected: "; // const-string v2, "connectivity changed, isConnected: "
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.b;
			 /* iget-boolean v2, v2, Le/b/a/z/j0;->d:Z */
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .d ( v1,v0 );
			 /* .line 6 */
		 } // :cond_0
		 v0 = this.b;
		 /* iget-boolean v1, v0, Le/b/a/z/j0;->d:Z */
		 (( e.b.a.z.j0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/z/j0;->a(Z)V
	 } // :cond_1
	 return;
} // .end method
