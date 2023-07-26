public class e.d.a.a.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.d.a.a.b b;
	 /* # instance fields */
	 public final e.d.a.a.c.g a;
	 /* # direct methods */
	 public e.d.a.a.b ( ) {
		 /* .locals 5 */
		 final String v0 = "N/A"; // const-string v0, "N/A"
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 /* .line 3 */
		 (( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 /* iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I */
		 /* and-int/lit8 v1, v1, 0x2 */
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 int v3 = 0; // const/4 v3, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 4 */
		 (( e.d.a.a.c.g ) p2 ).a ( ); // invoke-virtual {p2}, Le/d/a/a/c/g;->a()Ljava/util/Set;
		 if ( v3 != null) { // if-eqz v3, :cond_1
			 final String v1 = "App is debuggable - processing <debug-overrides> configuration."; // const-string v1, "App is debuggable - processing <debug-overrides> configuration."
			 /* .line 5 */
			 e.d.a.a.f.a .a ( v1 );
			 /* .line 6 */
		 } // :cond_1
		 p2 = 		 (( e.d.a.a.c.g ) p2 ).b ( ); // invoke-virtual {p2}, Le/d/a/a/c/g;->b()Z
	 } // :cond_2
	 int p2 = 0; // const/4 p2, 0x0
	 /* .line 7 */
} // :goto_1
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 8 */
try { // :try_start_0
	 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 (( android.content.pm.PackageManager ) v4 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 v2 = this.versionName;
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-object v2, v0 */
} // :goto_2
/* if-nez v2, :cond_3 */
} // :cond_3
/* move-object v0, v2 */
/* .line 9 */
} // :goto_3
e.d.a.a.f.b .a ( p1 );
/* .line 10 */
/* new-instance v4, Le/d/a/a/e/a; */
/* invoke-direct {v4, p1, v1, v0, v2}, Le/d/a/a/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 11 */
try { // :try_start_1
e.d.a.a.d.g .a ( v3,p2,v4 );
/* :try_end_1 */
/* .catch Ljava/security/cert/CertificateException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/security/KeyStoreException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
return;
/* .line 12 */
/* :catch_1 */
/* new-instance p1, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
final String p2 = "Could not parse <debug-overrides> certificates"; // const-string p2, "Could not parse <debug-overrides> certificates"
/* invoke-direct {p1, p2}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static Integer a ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* .line 2 */
/* new-instance v0, Le/d/a/a/a; */
/* invoke-direct {v0}, Le/d/a/a/a;-><init>()V */
final String v1 = ""; // const-string v1, ""
/* .line 3 */
(( android.content.pm.ApplicationInfo ) p0 ).dump ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/pm/ApplicationInfo;->dump(Landroid/util/Printer;Ljava/lang/String;)V
/* .line 4 */
p0 = e.d.a.a.a .a ( v0 );
} // .end method
public static synchronized e.d.a.a.b a ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
/* const-class v0, Le/d/a/a/b; */
/* monitor-enter v0 */
/* .line 5 */
try { // :try_start_0
v1 = e.d.a.a.b.b;
/* if-nez v1, :cond_3 */
/* .line 6 */
/* const/16 v2, 0x18 */
/* if-lt v1, v2, :cond_2 */
/* .line 7 */
v1 = e.d.a.a.b .a ( p0 );
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_1 */
/* if-ne v1, p1, :cond_0 */
/* .line 8 */
} // :cond_0
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
final String p1 = "TrustKit was initialized with a different network policy than the one configured in the App\'s manifest."; // const-string p1, "TrustKit was initialized with a different network policy than the one configured in the App\'s manifest."
/* invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 9 */
} // :cond_1
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
final String p1 = "TrustKit was initialized with a network policy that was not properly configured for Android N - make sure it is in the App\'s Manifest."; // const-string p1, "TrustKit was initialized with a network policy that was not properly configured for Android N - make sure it is in the App\'s Manifest."
/* invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 10 */
} // :cond_2
} // :goto_0
try { // :try_start_1
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getXml ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 11 */
e.d.a.a.c.g .a ( p0,p1 );
/* :try_end_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/security/cert/CertificateException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 12 */
try { // :try_start_2
/* new-instance v1, Le/d/a/a/b; */
/* invoke-direct {v1, p0, p1}, Le/d/a/a/b;-><init>(Landroid/content/Context;Le/d/a/a/c/g;)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 13 */
/* monitor-exit v0 */
/* .line 14 */
/* :catch_0 */
try { // :try_start_3
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
final String p1 = "Could not find the debug certificate in the network security police file"; // const-string p1, "Could not find the debug certificate in the network security police file"
/* invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 15 */
/* :catch_1 */
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
final String p1 = "Could not parse network security policy file"; // const-string p1, "Could not parse network security policy file"
/* invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 16 */
} // :cond_3
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String p1 = "TrustKit has already been initialized"; // const-string p1, "TrustKit has already been initialized"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
public static e.d.a.a.b b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.d.a.a.b.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "TrustKit has not been initialized"; // const-string v1, "TrustKit has not been initialized"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
public e.d.a.a.c.g a ( ) {
/* .locals 1 */
/* .line 17 */
v0 = this.a;
} // .end method
public javax.net.ssl.SSLSocketFactory a ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
final String v0 = "TLS"; // const-string v0, "TLS"
/* .line 18 */
javax.net.ssl.SSLContext .getInstance ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljavax/net/ssl/TrustManager; */
int v2 = 0; // const/4 v2, 0x0
/* .line 19 */
(( e.d.a.a.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/d/a/a/b;->b(Ljava/lang/String;)Ljavax/net/ssl/X509TrustManager;
/* aput-object p1, v1, v2 */
int p1 = 0; // const/4 p1, 0x0
(( javax.net.ssl.SSLContext ) v0 ).init ( p1, v1, p1 ); // invoke-virtual {v0, p1, v1, p1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
/* .line 20 */
(( javax.net.ssl.SSLContext ) v0 ).getSocketFactory ( ); // invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/KeyManagementException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 21 */
} // :goto_0
(( java.security.GeneralSecurityException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/security/GeneralSecurityException;->printStackTrace()V
/* .line 22 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Should not happen"; // const-string v0, "Should not happen"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public javax.net.ssl.X509TrustManager b ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 3 */
e.d.a.a.d.g .a ( p1 );
} // .end method
