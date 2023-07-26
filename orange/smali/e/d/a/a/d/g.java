public abstract class e.d.a.a.d.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static javax.net.ssl.X509TrustManager a;
	 public static Boolean b;
	 public static e.d.a.a.e.a c;
	 /* # direct methods */
	 public static e.d.a.a.d.g ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static e.d.a.a.e.a a ( ) {
		 /* .locals 2 */
		 /* .line 17 */
		 v0 = e.d.a.a.d.g.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 18 */
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 final String v1 = "TrustManagerBuilder has not been initialized"; // const-string v1, "TrustManagerBuilder has not been initialized"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 public static javax.net.ssl.X509TrustManager a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 9 */
		 v0 = e.d.a.a.d.g.a;
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 10 */
			 /* const/16 v1, 0x11 */
			 /* if-ge v0, v1, :cond_0 */
			 /* .line 11 */
			 p0 = e.d.a.a.d.g.a;
			 /* .line 12 */
		 } // :cond_0
		 e.d.a.a.b .b ( );
		 (( e.d.a.a.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/d/a/a/b;->a()Le/d/a/a/c/g;
		 (( e.d.a.a.c.g ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/d/a/a/c/g;->a(Ljava/lang/String;)Le/d/a/a/c/b;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 13 */
			 /* sget-boolean v1, Le/d/a/a/d/g;->b:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 14 */
			 } // :cond_1
			 /* new-instance v1, Le/d/a/a/d/d; */
			 v2 = e.d.a.a.d.g.a;
			 /* invoke-direct {v1, p0, v0, v2}, Le/d/a/a/d/d;-><init>(Ljava/lang/String;Le/d/a/a/c/b;Ljavax/net/ssl/X509TrustManager;)V */
			 /* .line 15 */
		 } // :cond_2
	 } // :goto_0
	 p0 = e.d.a.a.d.g.a;
	 /* .line 16 */
} // :cond_3
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String v0 = "TrustManagerBuilder has not been initialized"; // const-string v0, "TrustManagerBuilder has not been initialized"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( java.util.Set p0, Boolean p1, Object p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set<", */
/* "Ljava/security/cert/Certificate;", */
/* ">;Z", */
/* "Le/d/a/a/e/a;", */
/* ")V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/cert/CertificateException;, */
/* Ljava/security/NoSuchAlgorithmException;, */
/* Ljava/security/KeyStoreException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.d.a.a.d.g.a;
/* if-nez v0, :cond_2 */
/* .line 2 */
e.d.a.a.d.f .a ( );
/* .line 3 */
/* const/16 v1, 0x11 */
/* if-ge v0, v1, :cond_0 */
return;
/* .line 4 */
} // :cond_0
e.d.a.a.d.g.b = (p1!= 0);
if ( p0 != null) { // if-eqz p0, :cond_1
p1 = /* .line 5 */
/* if-lez p1, :cond_1 */
/* const/16 v0, 0x18 */
/* if-ge p1, v0, :cond_1 */
/* .line 6 */
e.d.a.a.d.a .a ( p0 );
/* .line 7 */
} // :cond_1
return;
/* .line 8 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String p1 = "TrustManagerBuilder has already been initialized"; // const-string p1, "TrustManagerBuilder has already been initialized"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
