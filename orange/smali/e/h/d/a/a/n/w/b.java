public class e.h.d.a.a.n.w.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final java.security.KeyStore b;
	 public final java.lang.String c;
	 /* # direct methods */
	 public e.h.d.a.a.n.w.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 return;
	 } // .end method
	 public static e.h.d.a.a.n.w.b a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 e.h.d.a.a.n.w.b .d ( );
	 /* .line 2 */
	 /* new-instance v1, Le/h/d/a/a/n/w/b; */
	 /* invoke-direct {v1, p0, v0, p1}, Le/h/d/a/a/n/w/b;-><init>(Landroid/content/Context;Ljava/security/KeyStore;Ljava/lang/String;)V */
} // .end method
public static e.h.d.a.a.n.w.b c ( android.content.Context p0, Boolean p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_0
	 final String p1 = "NFCO"; // const-string p1, "NFCO"
} // :cond_0
final String p1 = "UNSECURED_NFCO"; // const-string p1, "UNSECURED_NFCO"
/* .line 1 */
} // :goto_0
e.h.d.a.a.n.w.b .a ( p0,p1 );
} // .end method
public static java.security.KeyStore d ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "AndroidKeyStore"; // const-string v0, "AndroidKeyStore"
/* .line 1 */
java.security.KeyStore .getInstance ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( java.security.KeyStore ) v0 ).load ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* .line 3 */
} // :goto_0
/* new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v1 */
} // .end method
/* # virtual methods */
public final android.security.KeyPairGeneratorSpec$Builder a ( android.security.KeyPairGeneratorSpec$Builder p0, Boolean p1 ) {
/* .locals 0 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 19 */
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setEncryptionRequired ( ); // invoke-virtual {p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEncryptionRequired()Landroid/security/KeyPairGeneratorSpec$Builder;
} // :cond_0
} // .end method
public final void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/GeneralSecurityException;, */
/* Lcom/orange/oab/contactless/packid/g/u/b; */
/* } */
} // .end annotation
final String v0 = "packid.KeyPairEncryptor"; // const-string v0, "packid.KeyPairEncryptor"
/* .line 7 */
try { // :try_start_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "generateKeyPair secureLockRequired="; // const-string v2, "generateKeyPair secureLockRequired="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
final String v0 = "RSA"; // const-string v0, "RSA"
final String v1 = "AndroidKeyStore"; // const-string v1, "AndroidKeyStore"
/* .line 8 */
java.security.KeyPairGenerator .getInstance ( v0,v1 );
/* .line 9 */
(( e.h.d.a.a.n.w.b ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/b;->b(Landroid/content/Context;Z)Landroid/security/KeyPairGeneratorSpec;
(( java.security.KeyPairGenerator ) v0 ).initialize ( p1 ); // invoke-virtual {v0, p1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 10 */
(( java.security.KeyPairGenerator ) v0 ).generateKeyPair ( ); // invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/b; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/b;-><init>(Ljava/lang/IllegalStateException;)V */
/* throw p2 */
} // .end method
public void a ( Boolean p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/GeneralSecurityException;, */
/* Lcom/orange/oab/contactless/packid/g/u/b; */
/* } */
} // .end annotation
/* .line 3 */
v0 = (( e.h.d.a.a.n.w.b ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->a()Z
/* if-nez v0, :cond_0 */
final String v0 = "packid.KeyPairEncryptor"; // const-string v0, "packid.KeyPairEncryptor"
final String v1 = "Creating RSA key pair in android key store...."; // const-string v1, "Creating RSA key pair in android key store...."
/* .line 4 */
android.util.Log .i ( v0,v1 );
/* .line 5 */
v1 = this.a;
(( e.h.d.a.a.n.w.b ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/h/d/a/a/n/w/b;->a(Landroid/content/Context;Z)V
final String p1 = "RSA key pair created in android key store"; // const-string p1, "RSA key pair created in android key store"
/* .line 6 */
android.util.Log .i ( v0,p1 );
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/KeyStoreException; */
/* } */
} // .end annotation
/* .line 12 */
v0 = this.c;
v0 = (( e.h.d.a.a.n.w.b ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/b;->a(Ljava/lang/String;)Z
} // .end method
public final Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/KeyStoreException; */
/* } */
} // .end annotation
/* .line 13 */
v0 = this.b;
p1 = (( java.security.KeyStore ) v0 ).containsAlias ( p1 ); // invoke-virtual {v0, p1}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
} // .end method
public a ( Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Ljava/security/GeneralSecurityException; */
/* } */
} // .end annotation
/* .line 14 */
(( e.h.d.a.a.n.w.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->c()Ljava/security/KeyStore$PrivateKeyEntry;
(( java.security.KeyStore$PrivateKeyEntry ) v0 ).getCertificate ( ); // invoke-virtual {v0}, Ljava/security/KeyStore$PrivateKeyEntry;->getCertificate()Ljava/security/cert/Certificate;
(( java.security.cert.Certificate ) v0 ).getPublicKey ( ); // invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;
int v1 = 1; // const/4 v1, 0x1
/* .line 15 */
(( e.h.d.a.a.n.w.b ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/n/w/b;->a([BLjava/security/Key;I)[B
} // .end method
public final a ( Object[] p0, java.security.Key p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/GeneralSecurityException; */
/* } */
} // .end annotation
final String v0 = "RSA/ECB/PKCS1Padding"; // const-string v0, "RSA/ECB/PKCS1Padding"
/* .line 16 */
javax.crypto.Cipher .getInstance ( v0 );
/* .line 17 */
(( javax.crypto.Cipher ) v0 ).init ( p3, p2 ); // invoke-virtual {v0, p3, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
/* .line 18 */
(( javax.crypto.Cipher ) v0 ).doFinal ( p1 ); // invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
public final android.security.KeyPairGeneratorSpec b ( android.content.Context p0, Boolean p1 ) {
/* .locals 4 */
/* .line 5 */
java.util.Calendar .getInstance ( );
/* .line 6 */
java.util.Calendar .getInstance ( );
int v2 = 1; // const/4 v2, 0x1
/* .line 7 */
(( java.util.Calendar ) v1 ).add ( v2, v2 ); // invoke-virtual {v1, v2, v2}, Ljava/util/Calendar;->add(II)V
/* .line 8 */
/* new-instance v2, Landroid/security/KeyPairGeneratorSpec$Builder; */
/* invoke-direct {v2, p1}, Landroid/security/KeyPairGeneratorSpec$Builder;-><init>(Landroid/content/Context;)V */
/* new-instance p1, Ljavax/security/auth/x500/X500Principal; */
final String v3 = "CN=NFCO"; // const-string v3, "CN=NFCO"
/* invoke-direct {p1, v3}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V */
/* .line 9 */
(( android.security.KeyPairGeneratorSpec$Builder ) v2 ).setSubject ( p1 ); // invoke-virtual {v2, p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/KeyPairGeneratorSpec$Builder;
/* new-instance v2, Ljava/security/SecureRandom; */
/* invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V */
/* const v3, 0x7fffffff */
/* .line 10 */
v2 = (( java.security.SecureRandom ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/security/SecureRandom;->nextInt(I)I
/* int-to-long v2, v2 */
java.math.BigInteger .valueOf ( v2,v3 );
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setSerialNumber ( v2 ); // invoke-virtual {p1, v2}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSerialNumber(Ljava/math/BigInteger;)Landroid/security/KeyPairGeneratorSpec$Builder;
/* .line 11 */
(( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setStartDate ( v0 ); // invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setStartDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;
/* .line 12 */
(( java.util.Calendar ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setEndDate ( v0 ); // invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEndDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;
v0 = this.c;
/* .line 13 */
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setAlias ( v0 ); // invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setAlias(Ljava/lang/String;)Landroid/security/KeyPairGeneratorSpec$Builder;
/* const/16 v0, 0x800 */
/* .line 14 */
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).setKeySize ( v0 ); // invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setKeySize(I)Landroid/security/KeyPairGeneratorSpec$Builder;
/* .line 15 */
(( e.h.d.a.a.n.w.b ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/b;->a(Landroid/security/KeyPairGeneratorSpec$Builder;Z)Landroid/security/KeyPairGeneratorSpec$Builder;
(( android.security.KeyPairGeneratorSpec$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->build()Landroid/security/KeyPairGeneratorSpec;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/KeyStoreException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "reset for "; // const-string v1, "reset for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.KeyPairEncryptor"; // const-string v1, "packid.KeyPairEncryptor"
android.util.Log .d ( v1,v0 );
/* .line 2 */
v0 = this.b;
v1 = this.c;
(( java.security.KeyStore ) v0 ).deleteEntry ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
return;
} // .end method
public b ( Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Ljava/security/GeneralSecurityException; */
/* } */
} // .end annotation
/* .line 3 */
(( e.h.d.a.a.n.w.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->c()Ljava/security/KeyStore$PrivateKeyEntry;
(( java.security.KeyStore$PrivateKeyEntry ) v0 ).getPrivateKey ( ); // invoke-virtual {v0}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;
int v1 = 2; // const/4 v1, 0x2
/* .line 4 */
(( e.h.d.a.a.n.w.b ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/n/w/b;->a([BLjava/security/Key;I)[B
} // .end method
public final java.security.KeyStore$PrivateKeyEntry c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 2 */
try { // :try_start_0
v0 = this.b;
v1 = this.c;
int v2 = 0; // const/4 v2, 0x0
(( java.security.KeyStore ) v0 ).getEntry ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;
/* check-cast v0, Ljava/security/KeyStore$PrivateKeyEntry; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
(( java.lang.Exception ) v0 ).getLocalizedMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
final String v1 = "packid.KeyPairEncryptor"; // const-string v1, "packid.KeyPairEncryptor"
android.util.Log .e ( v1,v0 );
/* .line 4 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
v1 = this.a;
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
