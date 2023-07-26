public class e.h.d.a.a.n.w.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.h.d.a.a.n.w.d b;
	 /* # instance fields */
	 public android.content.Context a;
	 /* # direct methods */
	 public e.h.d.a.a.n.w.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = e.h.d.a.a.n.w.d.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "packid.KeyStoreManager"; // const-string v0, "packid.KeyStoreManager"
		 final String v1 = "KeyStoreManager Initialised"; // const-string v1, "KeyStoreManager Initialised"
		 /* .line 2 */
		 android.util.Log .d ( v0,v1 );
		 /* .line 3 */
		 /* new-instance v0, Le/h/d/a/a/n/w/d; */
		 /* invoke-direct {v0, p0}, Le/h/d/a/a/n/w/d;-><init>(Landroid/content/Context;)V */
	 } // :cond_0
	 return;
} // .end method
public static e.h.d.a.a.n.w.d c ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/g; */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = e.h.d.a.a.n.w.d.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/g; */
final String v1 = "need to call init"; // const-string v1, "need to call init"
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/g;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
public final android.security.keystore.KeyInfo a ( java.security.KeyStore$SecretKeyEntry p0 ) {
/* .locals 2 */
/* .line 75 */
try { // :try_start_0
	 (( java.security.KeyStore$SecretKeyEntry ) p1 ).getSecretKey ( ); // invoke-virtual {p1}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;
	 final String v1 = "AndroidKeyStore"; // const-string v1, "AndroidKeyStore"
	 javax.crypto.SecretKeyFactory .getInstance ( v0,v1 );
	 /* .line 76 */
	 (( java.security.KeyStore$SecretKeyEntry ) p1 ).getSecretKey ( ); // invoke-virtual {p1}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;
	 /* const-class v1, Landroid/security/keystore/KeyInfo; */
	 (( javax.crypto.SecretKeyFactory ) v0 ).getKeySpec ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljavax/crypto/SecretKeyFactory;->getKeySpec(Ljavax/crypto/SecretKey;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
	 /* check-cast p1, Landroid/security/keystore/KeyInfo; */
	 /* :try_end_0 */
	 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/security/NoSuchProviderException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p1 = "packid.KeyStoreManager"; // const-string p1, "packid.KeyStoreManager"
	 final String v0 = "Unable to fetch Secret Key Info"; // const-string v0, "Unable to fetch Secret Key Info"
	 /* .line 77 */
	 android.util.Log .d ( p1,v0 );
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.security.keystore.KeyProtection a ( Boolean p0 ) {
	 /* .locals 6 */
	 /* .line 14 */
	 /* new-instance v0, Landroid/security/keystore/KeyProtection$Builder; */
	 int v1 = 3; // const/4 v1, 0x3
	 /* invoke-direct {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;-><init>(I)V */
	 final String v1 = "CBC"; // const-string v1, "CBC"
	 /* filled-new-array {v1}, [Ljava/lang/String; */
	 /* .line 15 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setBlockModes ( v1 ); // invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyProtection$Builder;
	 final String v1 = "PKCS7Padding"; // const-string v1, "PKCS7Padding"
	 /* filled-new-array {v1}, [Ljava/lang/String; */
	 /* .line 16 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setEncryptionPaddings ( v1 ); // invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyProtection$Builder;
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 17 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setRandomizedEncryptionRequired ( v1 ); // invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyProtection$Builder;
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 18 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setUserAuthenticationRequired ( v2 ); // invoke-virtual {v0, v2}, Landroid/security/keystore/KeyProtection$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyProtection$Builder;
	 /* const v3, 0x278d00 */
	 /* .line 19 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setUserAuthenticationValidityDurationSeconds ( v3 ); // invoke-virtual {v0, v3}, Landroid/security/keystore/KeyProtection$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyProtection$Builder;
	 /* .line 20 */
	 final String v4 = "packid.KeyStoreManager"; // const-string v4, "packid.KeyStoreManager"
	 /* const/16 v5, 0x1f */
	 /* if-lt v3, v5, :cond_0 */
	 v3 = this.a;
	 v3 = 	 e.h.a.a.a.a.b .a ( v3 );
	 /* if-nez v3, :cond_0 */
	 /* .line 21 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).setIsStrongBoxBacked ( p1 ); // invoke-virtual {v0, p1}, Landroid/security/keystore/KeyProtection$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyProtection$Builder;
	 /* .line 22 */
	 p1 = this.a;
	 e.h.a.a.a.a.b .b ( p1,v2 );
	 /* .line 23 */
	 try { // :try_start_0
		 (( android.security.keystore.KeyProtection$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/security/keystore/KeyProtection$Builder;->build()Landroid/security/keystore/KeyProtection;
		 /* :try_end_0 */
		 /* .catch Landroid/security/keystore/StrongBoxUnavailableException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 final String p1 = "unable to put key in secure element falling back to TEE"; // const-string p1, "unable to put key in secure element falling back to TEE"
		 /* .line 24 */
		 android.util.Log .e ( v4,p1 );
		 /* .line 25 */
		 (( android.security.keystore.KeyProtection$Builder ) v0 ).setIsStrongBoxBacked ( v1 ); // invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyProtection$Builder;
	 } // :cond_0
	 final String p1 = "API 31 version requirement not met in secure element falling back to TEE"; // const-string p1, "API 31 version requirement not met in secure element falling back to TEE"
	 /* .line 26 */
	 android.util.Log .i ( v4,p1 );
	 /* .line 27 */
	 (( android.security.keystore.KeyProtection$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/security/keystore/KeyProtection$Builder;->build()Landroid/security/keystore/KeyProtection;
} // .end method
public final java.security.KeyStore$SecretKeyEntry a ( java.lang.String p0, java.security.KeyStore p1 ) {
	 /* .locals 6 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/security/KeyStoreException;, */
	 /* Ljava/security/NoSuchAlgorithmException;, */
	 /* Ljava/security/UnrecoverableEntryException;, */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 67 */
(( java.security.KeyStore ) p2 ).getEntry ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;
/* check-cast v1, Ljava/security/KeyStore$SecretKeyEntry; */
/* .line 68 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore$SecretKeyEntry;)Landroid/security/keystore/KeyInfo;
/* .line 69 */
final String v4 = "packid.KeyStoreManager"; // const-string v4, "packid.KeyStoreManager"
/* const/16 v5, 0x1f */
/* if-lt v3, v5, :cond_1 */
if ( v2 != null) { // if-eqz v2, :cond_0
	 v2 = 	 (( android.security.keystore.KeyInfo ) v2 ).getSecurityLevel ( ); // invoke-virtual {v2}, Landroid/security/keystore/KeyInfo;->getSecurityLevel()I
	 int v3 = 2; // const/4 v3, 0x2
	 /* if-eq v2, v3, :cond_1 */
} // :cond_0
v2 = this.a;
/* .line 70 */
v2 = e.h.a.a.a.a.b .a ( v2 );
/* if-nez v2, :cond_1 */
final String v1 = "Secret Key is not in secure element Migrating to secure element"; // const-string v1, "Secret Key is not in secure element Migrating to secure element"
/* .line 71 */
android.util.Log .d ( v4,v1 );
/* .line 72 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;)Z
/* .line 73 */
(( java.security.KeyStore ) p2 ).getEntry ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;
/* move-object v1, p1 */
/* check-cast v1, Ljava/security/KeyStore$SecretKeyEntry; */
} // :cond_1
final String p1 = "Secure Element Migration is not needed"; // const-string p1, "Secure Element Migration is not needed"
/* .line 74 */
android.util.Log .d ( v4,p1 );
} // :goto_0
} // .end method
public java.security.KeyStore$SecretKeyEntry a ( java.security.KeyStore p0, java.lang.String p1, Object[] p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/KeyStoreException;, */
/* Ljava/security/NoSuchAlgorithmException;, */
/* Ljava/security/UnrecoverableEntryException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 78 */
v0 = (( java.security.KeyStore ) p1 ).containsAlias ( p2 ); // invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
final String v1 = "packid.KeyStoreManager"; // const-string v1, "packid.KeyStoreManager"
if ( v0 != null) { // if-eqz v0, :cond_0
final String p3 = "RSA TO AES Migration is already done !!!"; // const-string p3, "RSA TO AES Migration is already done !!!"
/* .line 79 */
android.util.Log .d ( v1,p3 );
/* .line 80 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/w/d;->a(Ljava/lang/String;Ljava/security/KeyStore;)Ljava/security/KeyStore$SecretKeyEntry;
/* .line 81 */
} // :cond_0
v0 = (( e.h.d.a.a.n.w.d ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/d;->b(Ljava/security/KeyStore;Ljava/lang/String;)Z
int v2 = 0; // const/4 v2, 0x0
final String v3 = "PACKID"; // const-string v3, "PACKID"
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "RSA TO AES Migration is needed !!!"; // const-string v0, "RSA TO AES Migration is needed !!!"
/* .line 82 */
android.util.Log .d ( v1,v0 );
/* .line 83 */
v0 = (( java.lang.String ) p2 ).equals ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "NFCO"; // const-string v0, "NFCO"
} // :cond_1
final String v0 = "UNSECURED_NFCO"; // const-string v0, "UNSECURED_NFCO"
} // :goto_0
(( e.h.d.a.a.n.w.d ) p0 ).a ( p1, p3, v0, p2 ); // invoke-virtual {p0, p1, p3, v0, p2}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;[BLjava/lang/String;Ljava/lang/String;)Z
/* .line 84 */
(( java.security.KeyStore ) p1 ).getEntry ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;
/* check-cast p1, Ljava/security/KeyStore$SecretKeyEntry; */
} // :cond_2
final String p3 = "No migration needed generating new AES key !!!"; // const-string p3, "No migration needed generating new AES key !!!"
/* .line 85 */
android.util.Log .d ( v1,p3 );
/* .line 86 */
/* const/16 v0, 0x1c */
/* if-lt p3, v0, :cond_3 */
/* .line 87 */
p3 = (( java.lang.String ) p2 ).equals ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
(( e.h.d.a.a.n.w.d ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/n/w/d;->b(Ljava/security/KeyStore;Ljava/lang/String;Z)Z
/* .line 88 */
} // :cond_3
p3 = (( java.lang.String ) p2 ).equals ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
(( e.h.d.a.a.n.w.d ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;Z)Z
/* .line 89 */
} // :goto_1
(( java.security.KeyStore ) p1 ).getEntry ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;
/* check-cast p1, Ljava/security/KeyStore$SecretKeyEntry; */
} // .end method
public java.security.KeyStore a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "AndroidKeyStore"; // const-string v0, "AndroidKeyStore"
/* .line 4 */
java.security.KeyStore .getInstance ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
(( java.security.KeyStore ) v0 ).load ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* .line 6 */
} // :goto_0
/* new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v1 */
} // .end method
public final java.security.spec.AlgorithmParameterSpec a ( Boolean p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 28 */
/* new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V */
/* const/16 p2, 0x100 */
/* .line 29 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) v0 ).setKeySize ( p2 ); // invoke-virtual {v0, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String v1 = "CBC"; // const-string v1, "CBC"
/* filled-new-array {v1}, [Ljava/lang/String; */
/* .line 30 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p2 ).setBlockModes ( v1 ); // invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String v1 = "PKCS7Padding"; // const-string v1, "PKCS7Padding"
/* filled-new-array {v1}, [Ljava/lang/String; */
/* .line 31 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p2 ).setEncryptionPaddings ( v1 ); // invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
int v1 = 0; // const/4 v1, 0x0
/* .line 32 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p2 ).setRandomizedEncryptionRequired ( v1 ); // invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;
/* .line 33 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p2 ).setUserAuthenticationRequired ( p1 ); // invoke-virtual {p2, p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;
/* const p2, 0x278d00 */
/* .line 34 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p1 ).setUserAuthenticationValidityDurationSeconds ( p2 ); // invoke-virtual {p1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String p1 = "packid.KeyStoreManager"; // const-string p1, "packid.KeyStoreManager"
final String p2 = "Need API version 28 to use Secure Element falling back to TEE "; // const-string p2, "Need API version 28 to use Secure Element falling back to TEE "
/* .line 35 */
android.util.Log .e ( p1,p2 );
/* .line 36 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;
} // .end method
public final java.security.spec.AlgorithmParameterSpec a ( Boolean p0, Boolean p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/security/keystore/StrongBoxUnavailableException; */
/* } */
} // .end annotation
/* .line 37 */
/* new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V */
/* const/16 p3, 0x100 */
/* .line 38 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) v0 ).setKeySize ( p3 ); // invoke-virtual {v0, p3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String v1 = "CBC"; // const-string v1, "CBC"
/* filled-new-array {v1}, [Ljava/lang/String; */
/* .line 39 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p3 ).setBlockModes ( v1 ); // invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String v1 = "PKCS7Padding"; // const-string v1, "PKCS7Padding"
/* filled-new-array {v1}, [Ljava/lang/String; */
/* .line 40 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p3 ).setEncryptionPaddings ( v1 ); // invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;
int v1 = 0; // const/4 v1, 0x0
/* .line 41 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p3 ).setRandomizedEncryptionRequired ( v1 ); // invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;
/* .line 42 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p3 ).setUserAuthenticationRequired ( p1 ); // invoke-virtual {p3, p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;
/* const p3, 0x278d00 */
/* .line 43 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p1 ).setUserAuthenticationValidityDurationSeconds ( p3 ); // invoke-virtual {p1, p3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;
/* .line 44 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) p1 ).setIsStrongBoxBacked ( p2 ); // invoke-virtual {p1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;
final String p1 = "packid.KeyStoreManager"; // const-string p1, "packid.KeyStoreManager"
if ( p2 != null) { // if-eqz p2, :cond_0
final String p2 = "Try to PUT Key in secure ELEMENT !!!"; // const-string p2, "Try to PUT Key in secure ELEMENT !!!"
/* .line 45 */
android.util.Log .d ( p1,p2 );
} // :cond_0
final String p2 = "Falling Back to TEE"; // const-string p2, "Falling Back to TEE"
/* .line 46 */
android.util.Log .d ( p1,p2 );
/* .line 47 */
} // :goto_0
p1 = this.a;
int p2 = 1; // const/4 p2, 0x1
e.h.a.a.a.a.b .b ( p1,p2 );
/* .line 48 */
(( android.security.keystore.KeyGenParameterSpec$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;
} // .end method
public Boolean a ( java.security.KeyStore p0, java.lang.String p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.KeyStoreManager"; // const-string v0, "packid.KeyStoreManager"
/* .line 58 */
v1 = this.a;
int v2 = 1; // const/4 v2, 0x1
e.h.a.a.a.a.b .b ( v1,v2 );
int v1 = 0; // const/4 v1, 0x0
/* .line 59 */
try { // :try_start_0
(( java.security.KeyStore ) p1 ).getKey ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;
/* .line 60 */
/* instance-of v3, v1, Ljavax/crypto/SecretKey; */
if ( v3 != null) { // if-eqz v3, :cond_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 61 */
/* new-instance v3, Ljavax/crypto/spec/SecretKeySpec; */
final String v4 = "AES"; // const-string v4, "AES"
/* invoke-direct {v3, v1, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
/* .line 62 */
/* new-instance v1, Ljava/security/KeyStore$SecretKeyEntry; */
/* invoke-direct {v1, v3}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V */
/* .line 63 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/n/w/d;->a(Z)Landroid/security/keystore/KeyProtection;
(( java.security.KeyStore ) p1 ).setEntry ( p2, v1, v3 ); // invoke-virtual {p1, p2, v1, v3}, Ljava/security/KeyStore;->setEntry(Ljava/lang/String;Ljava/security/KeyStore$Entry;Ljava/security/KeyStore$ProtectionParameter;)V
} // :cond_0
final String p1 = "Unable to fetch the secret key : it\'s already StrongBoxBacked \nThe migration is not needed"; // const-string p1, "Unable to fetch the secret key : it\'s already StrongBoxBacked \nThe migration is not needed"
/* .line 64 */
android.util.Log .d ( v0,p1 );
/* :try_end_0 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
int p1 = 0; // const/4 p1, 0x0
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p1 */
} // :goto_0
final String p2 = "Fail to migrateExistingAEStoSecureElement"; // const-string p2, "Fail to migrateExistingAEStoSecureElement"
/* .line 65 */
android.util.Log .e ( v0,p2,p1 );
/* .line 66 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
public Boolean a ( java.security.KeyStore p0, java.lang.String p1, Boolean p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.KeyStoreManager"; // const-string v0, "packid.KeyStoreManager"
final String v1 = "Try to generate new AES Key"; // const-string v1, "Try to generate new AES Key"
/* .line 49 */
android.util.Log .e ( v0,v1 );
try { // :try_start_0
final String v1 = "AES"; // const-string v1, "AES"
final String v2 = "AndroidKeyStore"; // const-string v2, "AndroidKeyStore"
/* .line 50 */
javax.crypto.KeyGenerator .getInstance ( v1,v2 );
/* .line 51 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( p3, p2 ); // invoke-virtual {p0, p3, p2}, Le/h/d/a/a/n/w/d;->a(ZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;
(( javax.crypto.KeyGenerator ) v1 ).init ( p3 ); // invoke-virtual {v1, p3}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 52 */
(( javax.crypto.KeyGenerator ) v1 ).generateKey ( ); // invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
/* .line 53 */
p1 = (( java.security.KeyStore ) p1 ).containsAlias ( p2 ); // invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "Generated New AES Key Success"; // const-string p1, "Generated New AES Key Success"
/* .line 54 */
android.util.Log .e ( v0,p1 );
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
final String p1 = "Generated New AES Key FAILED"; // const-string p1, "Generated New AES Key FAILED"
/* .line 55 */
android.util.Log .e ( v0,p1 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/security/NoSuchProviderException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
int p1 = 0; // const/4 p1, 0x0
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p1 */
/* :catch_3 */
/* move-exception p1 */
} // :goto_0
final String p2 = "Fail to generateNewAESKey"; // const-string p2, "Fail to generateNewAESKey"
/* .line 56 */
android.util.Log .e ( v0,p2,p1 );
/* .line 57 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
public Boolean a ( java.security.KeyStore p0, Object[] p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 7 */
try { // :try_start_0
/* new-instance v0, Ljavax/crypto/spec/SecretKeySpec; */
final String v1 = "AES"; // const-string v1, "AES"
/* invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
/* .line 8 */
/* new-instance p2, Ljava/security/KeyStore$SecretKeyEntry; */
/* invoke-direct {p2, v0}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V */
int v0 = 1; // const/4 v0, 0x1
/* .line 9 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/d;->a(Z)Landroid/security/keystore/KeyProtection;
(( java.security.KeyStore ) p1 ).setEntry ( p4, p2, v1 ); // invoke-virtual {p1, p4, p2, v1}, Ljava/security/KeyStore;->setEntry(Ljava/lang/String;Ljava/security/KeyStore$Entry;Ljava/security/KeyStore$ProtectionParameter;)V
/* .line 10 */
p2 = (( java.security.KeyStore ) p1 ).containsAlias ( p4 ); // invoke-virtual {p1, p4}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 11 */
(( java.security.KeyStore ) p1 ).deleteEntry ( p3 ); // invoke-virtual {p1, p3}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* :catch_0 */
/* move-exception p1 */
final String p2 = "packid.KeyStoreManager"; // const-string p2, "packid.KeyStoreManager"
final String p3 = "Fail to handleRSATOAESMigration"; // const-string p3, "Fail to handleRSATOAESMigration"
/* .line 12 */
android.util.Log .e ( p2,p3,p1 );
/* .line 13 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
public void b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Ljava/security/KeyStoreException; */
/* } */
} // .end annotation
/* .line 16 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/w/d;->a()Ljava/security/KeyStore;
final String v1 = "PACKID"; // const-string v1, "PACKID"
/* .line 17 */
(( java.security.KeyStore ) v0 ).deleteEntry ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
final String v1 = "UNSECURED_PACKID"; // const-string v1, "UNSECURED_PACKID"
/* .line 18 */
(( java.security.KeyStore ) v0 ).deleteEntry ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
return;
} // .end method
public Boolean b ( java.security.KeyStore p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "PACKID"; // const-string v0, "PACKID"
/* .line 1 */
p2 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
final String p2 = "NFCO"; // const-string p2, "NFCO"
/* .line 2 */
p1 = (( java.security.KeyStore ) p1 ).containsAlias ( p2 ); // invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
} // :cond_0
final String p2 = "UNSECURED_NFCO"; // const-string p2, "UNSECURED_NFCO"
/* .line 3 */
p1 = (( java.security.KeyStore ) p1 ).containsAlias ( p2 ); // invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
/* :try_end_0 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
public Boolean b ( java.security.KeyStore p0, java.lang.String p1, Boolean p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.KeyStoreManager"; // const-string v0, "packid.KeyStoreManager"
final String v1 = "Try to generate new AES Key"; // const-string v1, "Try to generate new AES Key"
/* .line 5 */
android.util.Log .e ( v0,v1 );
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
final String v2 = "AES"; // const-string v2, "AES"
final String v3 = "AndroidKeyStore"; // const-string v3, "AndroidKeyStore"
/* .line 6 */
javax.crypto.KeyGenerator .getInstance ( v2,v3 );
/* .line 7 */
v3 = this.a;
v3 = e.h.a.a.a.a.b .a ( v3 );
int v4 = 1; // const/4 v4, 0x1
/* xor-int/2addr v3, v4 */
(( e.h.d.a.a.n.w.d ) p0 ).a ( p3, v3, p2 ); // invoke-virtual {p0, p3, v3, p2}, Le/h/d/a/a/n/w/d;->a(ZZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;
(( javax.crypto.KeyGenerator ) v2 ).init ( p3 ); // invoke-virtual {v2, p3}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 8 */
(( javax.crypto.KeyGenerator ) v2 ).generateKey ( ); // invoke-virtual {v2}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
/* .line 9 */
p3 = (( java.security.KeyStore ) p1 ).containsAlias ( p2 ); // invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
if ( p3 != null) { // if-eqz p3, :cond_0
final String p3 = "Generated New AES Key Success"; // const-string p3, "Generated New AES Key Success"
/* .line 10 */
android.util.Log .d ( v0,p3 );
} // :cond_0
final String p3 = "Generated New AES Key FAILED"; // const-string p3, "Generated New AES Key FAILED"
/* .line 11 */
android.util.Log .d ( v0,p3 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/security/NoSuchProviderException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Landroid/security/keystore/StrongBoxUnavailableException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p3 = "unable to put key in secure element falling back to TEE"; // const-string p3, "unable to put key in secure element falling back to TEE"
/* .line 12 */
android.util.Log .e ( v0,p3 );
/* .line 13 */
p1 = (( e.h.d.a.a.n.w.d ) p0 ).a ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;Z)Z
/* :catch_1 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p1 */
/* :catch_3 */
/* move-exception p1 */
/* :catch_4 */
/* move-exception p1 */
} // :goto_0
final String p2 = "Fail to generateNewAESKey"; // const-string p2, "Fail to generateNewAESKey"
/* .line 14 */
android.util.Log .e ( v0,p2,p1 );
/* .line 15 */
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
