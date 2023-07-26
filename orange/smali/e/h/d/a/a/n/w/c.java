public class e.h.d.a.a.n.w.c {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c;
	 /* # instance fields */
	 public final a;
	 public final e.h.d.a.a.n.w.a b;
	 /* # direct methods */
	 public static e.h.d.a.a.n.w.c ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [B */
		 /* .line 1 */
		 return;
	 } // .end method
	 public e.h.d.a.a.n.w.c ( ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 int v1 = 1; // const/4 v1, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/16 v3, 0x17 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* if-lt v0, v3, :cond_3 */
	 try { // :try_start_0
		 final String v0 = "AndroidKeyStore"; // const-string v0, "AndroidKeyStore"
		 /* .line 3 */
		 java.security.KeyStore .getInstance ( v0 );
		 /* .line 4 */
		 (( java.security.KeyStore ) v0 ).load ( v4 ); // invoke-virtual {v0, v4}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
		 /* :try_end_0 */
		 /* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 final String v5 = "NFCO"; // const-string v5, "NFCO"
		 } // :cond_0
		 final String v5 = "UNSECURED_NFCO"; // const-string v5, "UNSECURED_NFCO"
		 /* .line 5 */
	 } // :goto_0
	 try { // :try_start_1
		 v0 = 		 (( java.security.KeyStore ) v0 ).containsAlias ( v5 ); // invoke-virtual {v0, v5}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 6 */
			 /* new-instance v0, Le/h/d/a/a/n/w/e; */
			 /* if-ge v4, v3, :cond_1 */
		 } // :cond_1
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_1
	 /* invoke-direct {v0, p1, p3, p2, v1}, Le/h/d/a/a/n/w/e;-><init>(Landroid/content/Context;ZZZ)V */
	 (( e.h.d.a.a.n.w.e ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/w/e;->a()[B
	 this.a = p1;
	 /* .line 7 */
	 e.h.d.a.a.n.w.a .a ( p2,p1 );
	 this.b = p1;
	 /* .line 8 */
} // :cond_2
this.a = v4;
/* .line 9 */
e.h.d.a.a.n.w.a .a ( p2,v4 );
this.b = p1;
/* :try_end_1 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 10 */
} // :goto_2
/* new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw p2 */
/* .line 11 */
} // :cond_3
/* new-instance v5, Le/h/d/a/a/n/w/e; */
/* if-ge v0, v3, :cond_4 */
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :goto_3
/* invoke-direct {v5, p1, p3, p2, v1}, Le/h/d/a/a/n/w/e;-><init>(Landroid/content/Context;ZZZ)V */
(( e.h.d.a.a.n.w.e ) v5 ).a ( ); // invoke-virtual {v5}, Le/h/d/a/a/n/w/e;->a()[B
this.a = p1;
/* .line 12 */
this.b = v4;
} // :goto_4
return;
} // .end method
public static e.h.d.a.a.n.w.c a ( android.content.Context p0, Boolean p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/h/d/a/a/n/w/c; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, p1, v1}, Le/h/d/a/a/n/w/c;-><init>(Landroid/content/Context;ZZ)V */
} // .end method
public static void a ( android.content.Context p0 ) {
/* .locals 2 */
final String v0 = "packid.Encryptor"; // const-string v0, "packid.Encryptor"
final String v1 = "reset"; // const-string v1, "reset"
/* .line 2 */
android.util.Log .d ( v0,v1 );
/* .line 3 */
e.h.d.a.a.n.w.e .a ( p0 );
/* .line 4 */
/* const/16 v0, 0x17 */
/* if-lt p0, v0, :cond_0 */
/* .line 5 */
e.h.d.a.a.n.w.a .a ( );
} // :cond_0
return;
} // .end method
public static e.h.d.a.a.n.w.c b ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
e.h.d.a.a.n.w.c .a ( p0,v0 );
} // .end method
public static Boolean b ( android.content.Context p0, Boolean p1 ) {
/* .locals 3 */
final String v0 = "====================="; // const-string v0, "====================="
/* .line 2 */
try { // :try_start_0
/* new-instance v1, Le/h/d/a/a/n/w/c; */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v1, p0, p1, v2}, Le/h/d/a/a/n/w/c;-><init>(Landroid/content/Context;ZZ)V */
/* .line 3 */
/* new-instance p1, Le/h/d/a/a/r/a; */
/* invoke-direct {p1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/r/a;->a()V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/b; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
e.h.d.a.a.n.u .a ( p0 );
/* .line 5 */
/* new-instance v1, Le/h/d/a/a/r/a; */
/* invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/h/d/a/a/r/a;->a(ILjava/lang/Exception;)V
final String v1 = "user deleted by EncryptorException"; // const-string v1, "user deleted by EncryptorException"
/* .line 6 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v1 );
/* .line 7 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,p1 );
/* .line 8 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v0 );
/* :catch_1 */
/* move-exception p1 */
/* .line 9 */
e.h.d.a.a.n.u .a ( p0 );
/* .line 10 */
/* new-instance v1, Le/h/d/a/a/r/a; */
/* invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/h/d/a/a/r/a;->a(ILjava/lang/Exception;)V
final String v1 = "user deleted by AndroidKeystoreNotSecuredException"; // const-string v1, "user deleted by AndroidKeystoreNotSecuredException"
/* .line 11 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v1 );
/* .line 12 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,p1 );
/* .line 13 */
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p0,v0 );
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static e.h.d.a.a.n.w.c c ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
e.h.d.a.a.n.w.c .a ( p0,v0 );
} // .end method
/* # virtual methods */
public fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 6 */
(( fr.mbs.binary.Octets ) p1 ).toBytes ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B
(( e.h.d.a.a.n.w.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/w/c;->a([B)[B
fr.mbs.binary.Octets .createOctets ( p1 );
} // .end method
public a ( Object[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.Encryptor"; // const-string v0, "packid.Encryptor"
/* .line 7 */
try { // :try_start_0
/* const/16 v2, 0x17 */
/* if-lt v1, v2, :cond_0 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "Using new cypher"; // const-string v1, "Using new cypher"
/* .line 8 */
android.util.Log .d ( v0,v1 );
/* .line 9 */
v1 = this.b;
(( e.h.d.a.a.n.w.a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/a;->a([B)[B
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 10 */
(( e.h.d.a.a.n.w.c ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/n/w/c;->a([BI)[B
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v1 = "Ciphering exception"; // const-string v1, "Ciphering exception"
/* .line 11 */
android.util.Log .e ( v0,v1,p1 );
/* .line 12 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
public final a ( Object[] p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/GeneralSecurityException; */
/* } */
} // .end annotation
/* .line 13 */
/* new-instance v0, Ljavax/crypto/spec/IvParameterSpec; */
v1 = e.h.d.a.a.n.w.c.c;
/* invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
final String v1 = "AES/CBC/PKCS5Padding"; // const-string v1, "AES/CBC/PKCS5Padding"
/* .line 14 */
javax.crypto.Cipher .getInstance ( v1 );
/* .line 15 */
/* new-instance v2, Ljavax/crypto/spec/SecretKeySpec; */
v3 = this.a;
final String v4 = "AES"; // const-string v4, "AES"
/* invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
/* .line 16 */
(( javax.crypto.Cipher ) v1 ).init ( p2, v2, v0 ); // invoke-virtual {v1, p2, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 17 */
(( javax.crypto.Cipher ) v1 ).doFinal ( p1 ); // invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
public fr.mbs.binary.Octets b ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 14 */
(( fr.mbs.binary.Octets ) p1 ).toBytes ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B
(( e.h.d.a.a.n.w.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/w/c;->b([B)[B
fr.mbs.binary.Octets .createOctets ( p1 );
} // .end method
public b ( Object[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "packid.Encryptor"; // const-string v0, "packid.Encryptor"
/* .line 15 */
try { // :try_start_0
/* const/16 v2, 0x17 */
/* if-lt v1, v2, :cond_0 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "Using new cypher"; // const-string v1, "Using new cypher"
/* .line 16 */
android.util.Log .d ( v0,v1 );
/* .line 17 */
v1 = this.b;
(( e.h.d.a.a.n.w.a ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/a;->b([B)[B
} // :cond_0
int v1 = 2; // const/4 v1, 0x2
/* .line 18 */
(( e.h.d.a.a.n.w.c ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/n/w/c;->a([BI)[B
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v1 = "Unciphering exception"; // const-string v1, "Unciphering exception"
/* .line 19 */
android.util.Log .e ( v0,v1,p1 );
/* .line 20 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V */
/* throw v0 */
} // .end method
