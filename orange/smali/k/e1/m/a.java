public class k.e1.m.a extends java.net.ProxySelector {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public k.e1.m.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/net/ProxySelector;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void connectFailed ( java.net.URI p0, java.net.SocketAddress p1, java.io.IOException p2 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public java.util.List select ( java.net.URI p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/net/URI;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/net/Proxy;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 1 */
		 p1 = java.net.Proxy.NO_PROXY;
		 java.util.Collections .singletonList ( p1 );
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "uri must not be null"; // const-string v0, "uri must not be null"
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
