public class k.v implements k.w {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public k.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.util.List a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/net/InetAddress;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/net/UnknownHostException; */
	 /* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 1 */
	 try { // :try_start_0
		 java.net.InetAddress .getAllByName ( p1 );
		 java.util.Arrays .asList ( v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 2 */
		 /* new-instance v1, Ljava/net/UnknownHostException; */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Broken system behaviour for dns lookup of "; // const-string v3, "Broken system behaviour for dns lookup of "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 (( java.net.UnknownHostException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Ljava/net/UnknownHostException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 /* .line 4 */
		 /* throw v1 */
		 /* .line 5 */
	 } // :cond_0
	 /* new-instance p1, Ljava/net/UnknownHostException; */
	 final String v0 = "hostname == null"; // const-string v0, "hostname == null"
	 /* invoke-direct {p1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
