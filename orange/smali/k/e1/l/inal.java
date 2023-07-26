public class inal extends k.e1.n.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final java.lang.reflect.Method b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lk/e1/n/c;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.util.List a ( java.util.List p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/security/cert/Certificate;", */
		 /* ">;", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/security/cert/Certificate;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljavax/net/ssl/SSLPeerUnverifiedException; */
	 /* } */
} // .end annotation
/* .line 1 */
	 v0 = try { // :try_start_0
	 /* new-array v0, v0, [Ljava/security/cert/X509Certificate; */
	 /* check-cast p1, [Ljava/security/cert/X509Certificate; */
	 /* .line 2 */
	 v0 = this.b;
	 v1 = this.a;
	 int v2 = 3; // const/4 v2, 0x3
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object p1, v2, v3 */
	 int p1 = 1; // const/4 p1, 0x1
	 final String v3 = "RSA"; // const-string v3, "RSA"
	 /* aput-object v3, v2, p1 */
	 int p1 = 2; // const/4 p1, 0x2
	 /* aput-object p2, v2, p1 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/util/List; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 3 */
	 /* new-instance p2, Ljava/lang/AssertionError; */
	 /* invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
	 /* throw p2 */
	 /* :catch_1 */
	 /* move-exception p1 */
	 /* .line 4 */
	 /* new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException; */
	 (( java.lang.reflect.InvocationTargetException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;
	 /* invoke-direct {p2, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V */
	 /* .line 5 */
	 (( javax.net.ssl.SSLPeerUnverifiedException ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
	 /* .line 6 */
	 /* throw p2 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* instance-of p1, p1, Lk/e1/l/a; */
} // .end method
public Integer hashCode ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
