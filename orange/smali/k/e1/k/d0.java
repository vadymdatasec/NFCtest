public class k.e1.k.d0 extends l.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.e1.k.e0 k; //synthetic
	 /* # direct methods */
	 public k.e1.k.d0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.k = p1;
		 /* invoke-direct {p0}, Ll/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.IOException b ( java.io.IOException p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/net/SocketTimeoutException; */
		 final String v1 = "timeout"; // const-string v1, "timeout"
		 /* invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( java.net.SocketTimeoutException ) v0 ).initCause ( p1 ); // invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 } // :cond_0
	 } // .end method
	 public void i ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.k;
		 v1 = k.e1.k.a.h;
		 (( k.e1.k.e0 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lk/e1/k/e0;->c(Lk/e1/k/a;)V
		 return;
	 } // .end method
	 public void k ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 (( l.d ) p0 ).h ( ); // invoke-virtual {p0}, Ll/d;->h()Z
	 /* if-nez v0, :cond_0 */
	 return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( k.e1.k.d0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lk/e1/k/d0;->b(Ljava/io/IOException;)Ljava/io/IOException;
/* throw v0 */
} // .end method
