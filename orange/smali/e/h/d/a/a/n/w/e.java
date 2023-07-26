public class e.h.d.a.a.n.w.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Boolean a;
	 public final e.h.d.a.a.n.w.b b;
	 public final android.content.Context c;
	 /* # direct methods */
	 public e.h.d.a.a.n.w.e ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.c = p1;
	 /* .line 3 */
	 /* iput-boolean p3, p0, Le/h/d/a/a/n/w/e;->a:Z */
	 /* .line 4 */
	 e.h.d.a.a.n.w.b .c ( p1,p3 );
	 this.b = p1;
	 /* .line 5 */
	 p1 = 	 (( e.h.d.a.a.n.w.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->e()Z
	 /* if-nez p1, :cond_1 */
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance p1, Lcom/orange/oab/contactless/packid/g/u/i; */
	 /* invoke-direct {p1}, Lcom/orange/oab/contactless/packid/g/u/i;-><init>()V */
	 /* throw p1 */
	 /* .line 7 */
} // :cond_1
} // :goto_0
p1 = (( e.h.d.a.a.n.w.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->e()Z
/* if-nez p1, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 8 */
(( e.h.d.a.a.n.w.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->b()V
} // :cond_2
return;
} // .end method
public static void a ( android.content.Context p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
e.h.d.a.a.n.w.e .e ( p0,v0 );
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
e.h.d.a.a.n.w.e .e ( p0,v0 );
return;
} // .end method
public static void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 2 */
/* .line 3 */
e.h.d.a.a.n.w.e .b ( p0,p1 );
/* .line 4 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "deleteSecretKeyFile "; // const-string v0, "deleteSecretKeyFile "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.SecretKeyRepo"; // const-string v0, "packid.SecretKeyRepo"
android.util.Log .d ( v0,p1 );
/* .line 5 */
p1 = (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* if-nez p1, :cond_0 */
/* .line 6 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Can\'t delete secretKeyConfigurationFile, "; // const-string v1, "Can\'t delete secretKeyConfigurationFile, "
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getAbsolutePath ( ); // invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " do not exists."; // const-string p0, " do not exists."
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p0 );
} // :cond_0
return;
} // .end method
public static java.io.File b ( android.content.Context p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
(( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "privatekey.cfg"; // const-string p1, "privatekey.cfg"
} // :cond_0
final String p1 = "privateunsecuredkey.cfg"; // const-string p1, "privateunsecuredkey.cfg"
} // :goto_0
/* invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public static Boolean c ( android.content.Context p0, Boolean p1 ) {
/* .locals 0 */
/* .line 1 */
e.h.d.a.a.n.w.e .b ( p0,p1 );
p0 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
} // .end method
public static Boolean d ( android.content.Context p0, Boolean p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Ljava/security/KeyStoreException; */
/* } */
} // .end annotation
/* .line 1 */
e.h.d.a.a.n.w.b .c ( p0,p1 );
/* .line 2 */
v0 = (( e.h.d.a.a.n.w.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
p0 = e.h.d.a.a.n.w.e .c ( p0,p1 );
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static void e ( android.content.Context p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
e.h.d.a.a.n.w.b .c ( p0,p1 );
/* .line 2 */
v1 = (( e.h.d.a.a.n.w.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( e.h.d.a.a.n.w.b ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->b()V
/* .line 4 */
} // :cond_0
e.h.d.a.a.n.w.e .a ( p0,p1 );
/* :try_end_0 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* :catch_1 */
/* move-exception p0 */
} // :goto_0
final String p1 = "packid.SecretKeyRepo"; // const-string p1, "packid.SecretKeyRepo"
final String v0 = "Fail to reset SecretKeyRepository"; // const-string v0, "Fail to reset SecretKeyRepository"
/* .line 5 */
android.util.Log .e ( p1,v0,p0 );
} // :goto_1
return;
} // .end method
/* # virtual methods */
public final void a ( Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 12 */
try { // :try_start_0
v0 = this.c;
/* iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z */
e.h.d.a.a.n.w.e .b ( v0,v1 );
e.f.b.c.s .a ( p1,v0 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
final String v0 = "packid.SecretKeyRepo"; // const-string v0, "packid.SecretKeyRepo"
final String v1 = "Can\'t write Private Key configuration file"; // const-string v1, "Can\'t write Private Key configuration file"
/* .line 13 */
android.util.Log .w ( v0,v1,p1 );
/* .line 14 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
final String v1 = "Could not create secret key"; // const-string v1, "Could not create secret key"
/* invoke-direct {v0, v1, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
public a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "Unexpected secret key!"; // const-string v0, "Unexpected secret key!"
/* .line 7 */
try { // :try_start_0
(( e.h.d.a.a.n.w.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->d()[B
/* .line 8 */
v2 = this.b;
(( e.h.d.a.a.n.w.b ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/b;->b([B)[B
/* .line 9 */
/* array-length v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 10 */
} // :cond_0
/* new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 11 */
} // :goto_0
/* new-instance v2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v2, v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v2 */
} // .end method
public final void b ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.SecretKeyRepo"; // const-string v0, "packid.SecretKeyRepo"
/* .line 2 */
try { // :try_start_0
v1 = this.b;
/* iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z */
(( e.h.d.a.a.n.w.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/b;->a(Z)V
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Creating AES secret "; // const-string v2, "Creating AES secret "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z */
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
final String v3 = "secured"; // const-string v3, "secured"
final String v4 = "unsecured"; // const-string v4, "unsecured"
if ( v2 != null) { // if-eqz v2, :cond_0
/* move-object v2, v3 */
} // :cond_0
/* move-object v2, v4 */
} // :goto_0
try { // :try_start_1
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " key file..."; // const-string v2, " key file..."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 4 */
(( e.h.d.a.a.n.w.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->c()Ljavax/crypto/SecretKey;
/* .line 5 */
v2 = this.b;
(( e.h.d.a.a.n.w.b ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/b;->a([B)[B
/* .line 6 */
(( e.h.d.a.a.n.w.e ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/n/w/e;->a([B)V
/* .line 7 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AES secret "; // const-string v2, "AES secret "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
/* move-object v3, v4 */
} // :goto_1
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " key file created"; // const-string v2, " key file created"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_1 ..:try_end_1} :catch_0 */
return;
/* :catch_0 */
/* move-exception v1 */
final String v2 = "createSecretKey exception"; // const-string v2, "createSecretKey exception"
/* .line 8 */
android.util.Log .e ( v0,v2,v1 );
/* .line 9 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
public final javax.crypto.SecretKey c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/NoSuchAlgorithmException; */
/* } */
} // .end annotation
final String v0 = "AES"; // const-string v0, "AES"
/* .line 2 */
javax.crypto.KeyGenerator .getInstance ( v0 );
/* .line 3 */
/* new-instance v1, Ljava/security/SecureRandom; */
/* invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V */
/* const/16 v2, 0x100 */
(( javax.crypto.KeyGenerator ) v0 ).init ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V
/* .line 4 */
(( javax.crypto.KeyGenerator ) v0 ).generateKey ( ); // invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
} // .end method
public final d ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 3 */
try { // :try_start_0
v0 = this.c;
/* iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z */
e.h.d.a.a.n.w.e .b ( v0,v1 );
e.f.b.c.s .b ( v0 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e; */
final String v2 = "Could not read secret key"; // const-string v2, "Could not read secret key"
/* invoke-direct {v1, v2, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v1 */
} // .end method
public final Boolean e ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 6 */
try { // :try_start_0
v0 = this.c;
/* iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z */
v0 = e.h.d.a.a.n.w.e .d ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "packid.SecretKeyRepo"; // const-string v1, "packid.SecretKeyRepo"
final String v2 = "isSecretKeyExist exception"; // const-string v2, "isSecretKeyExist exception"
/* .line 7 */
android.util.Log .e ( v1,v2,v0 );
/* .line 8 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v1 */
} // .end method
