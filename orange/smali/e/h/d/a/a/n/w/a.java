public class e.h.d.a.a.n.w.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c;
	 /* # instance fields */
	 public java.security.KeyStore a;
	 public java.security.KeyStore$SecretKeyEntry b;
	 /* # direct methods */
	 public static e.h.d.a.a.n.w.a ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [B */
		 /* .line 1 */
		 return;
	 } // .end method
	 public e.h.d.a.a.n.w.a ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 /* .line 3 */
	 try { // :try_start_0
		 e.h.d.a.a.n.w.d .c ( );
		 v0 = this.a;
		 (( e.h.d.a.a.n.w.d ) p1 ).a ( v0, p2, p3 ); // invoke-virtual {p1, v0, p2, p3}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;[B)Ljava/security/KeyStore$SecretKeyEntry;
		 this.b = p1;
		 /* :try_end_0 */
		 /* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_3 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/security/UnrecoverableEntryException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* :catch_1 */
		 /* move-exception p1 */
		 /* :catch_2 */
		 /* move-exception p1 */
		 /* :catch_3 */
		 /* move-exception p1 */
		 /* .line 4 */
	 } // :goto_0
	 /* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
	 /* throw p2 */
} // .end method
public static e.h.d.a.a.n.w.a a ( Boolean p0, Object[] p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 final String p0 = "PACKID"; // const-string p0, "PACKID"
} // :cond_0
final String p0 = "UNSECURED_PACKID"; // const-string p0, "UNSECURED_PACKID"
/* .line 1 */
} // :goto_0
try { // :try_start_0
e.h.d.a.a.n.w.d .c ( );
(( e.h.d.a.a.n.w.d ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/w/d;->a()Ljava/security/KeyStore;
/* .line 2 */
/* new-instance v1, Le/h/d/a/a/n/w/a; */
/* invoke-direct {v1, v0, p0, p1}, Le/h/d/a/a/n/w/a;-><init>(Ljava/security/KeyStore;Ljava/lang/String;[B)V */
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 3 */
} // :goto_1
/* new-instance p1, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p1, p0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p1 */
} // .end method
public static void a ( ) {
/* .locals 3 */
final String v0 = "packid.AESEncryptor"; // const-string v0, "packid.AESEncryptor"
try { // :try_start_0
final String v1 = "reset AES keys"; // const-string v1, "reset AES keys"
/* .line 9 */
android.util.Log .d ( v0,v1 );
/* .line 10 */
e.h.d.a.a.n.w.d .c ( );
(( e.h.d.a.a.n.w.d ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/n/w/d;->b()V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/KeyStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
} // :goto_0
final String v2 = "Fail to reset SecretKeyRepository"; // const-string v2, "Fail to reset SecretKeyRepository"
/* .line 11 */
android.util.Log .e ( v0,v2,v1 );
} // :goto_1
return;
} // .end method
/* # virtual methods */
public a ( Object[] p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "AES/CBC/PKCS7Padding"; // const-string v0, "AES/CBC/PKCS7Padding"
/* .line 4 */
javax.crypto.Cipher .getInstance ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* .line 5 */
v2 = this.b;
(( java.security.KeyStore$SecretKeyEntry ) v2 ).getSecretKey ( ); // invoke-virtual {v2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;
/* new-instance v3, Ljavax/crypto/spec/IvParameterSpec; */
v4 = e.h.d.a.a.n.w.a.c;
/* invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
(( javax.crypto.Cipher ) v0 ).init ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 6 */
(( javax.crypto.Cipher ) v0 ).doFinal ( p1 ); // invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "packid.AESEncryptor"; // const-string v0, "packid.AESEncryptor"
final String v1 = "Ciphering exception"; // const-string v1, "Ciphering exception"
/* .line 7 */
android.util.Log .e ( v0,v1,p1 );
/* .line 8 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
public b ( Object[] p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "AES/CBC/PKCS7Padding"; // const-string v0, "AES/CBC/PKCS7Padding"
/* .line 1 */
javax.crypto.Cipher .getInstance ( v0 );
int v1 = 2; // const/4 v1, 0x2
/* .line 2 */
v2 = this.b;
(( java.security.KeyStore$SecretKeyEntry ) v2 ).getSecretKey ( ); // invoke-virtual {v2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;
/* new-instance v3, Ljavax/crypto/spec/IvParameterSpec; */
v4 = e.h.d.a.a.n.w.a.c;
/* invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
(( javax.crypto.Cipher ) v0 ).init ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 3 */
(( javax.crypto.Cipher ) v0 ).doFinal ( p1 ); // invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "packid.AESEncryptor"; // const-string v0, "packid.AESEncryptor"
final String v1 = "Unciphering exception"; // const-string v1, "Unciphering exception"
/* .line 4 */
android.util.Log .e ( v0,v1,p1 );
/* .line 5 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
