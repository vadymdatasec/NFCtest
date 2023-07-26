public class e.h.d.a.a.o.b.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 /* # direct methods */
	 public static e.h.d.a.a.o.b.a ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [B */
		 /* .line 1 */
		 return;
	 } // .end method
	 public e.h.d.a.a.o.b.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 final String v1 = "AES/CBC/NoPadding"; // const-string v1, "AES/CBC/NoPadding"
		 /* .line 1 */
		 (( e.h.d.a.a.o.b.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;
	 } // .end method
	 public final fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Integer p2, java.lang.String p3 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 try { // :try_start_0
			 javax.crypto.Cipher .getInstance ( p4 );
			 /* .line 3 */
			 /* new-instance v0, Ljavax/crypto/spec/SecretKeySpec; */
			 (( fr.mbs.binary.Octets ) p1 ).toBytes ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B
			 final String v1 = "AES"; // const-string v1, "AES"
			 /* invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
			 /* .line 4 */
			 /* new-instance p1, Ljavax/crypto/spec/IvParameterSpec; */
			 v1 = e.h.d.a.a.o.b.a.a;
			 /* invoke-direct {p1, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
			 (( javax.crypto.Cipher ) p4 ).init ( p3, v0, p1 ); // invoke-virtual {p4, p3, v0, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
			 /* .line 5 */
			 (( fr.mbs.binary.Octets ) p2 ).toBytes ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toBytes()[B
			 (( javax.crypto.Cipher ) p4 ).doFinal ( p1 ); // invoke-virtual {p4, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
			 fr.mbs.binary.Octets .createOctets ( p1 );
			 /* :try_end_0 */
			 /* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 6 */
			 /* new-instance p2, Ljava/lang/RuntimeException; */
			 final String p3 = "Problem ciphering"; // const-string p3, "Problem ciphering"
			 /* invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* throw p2 */
		 } // .end method
		 public fr.mbs.binary.Octets b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
			 /* .locals 2 */
			 int v0 = 1; // const/4 v0, 0x1
			 final String v1 = "AES/CBC/PKCS5Padding"; // const-string v1, "AES/CBC/PKCS5Padding"
			 /* .line 1 */
			 (( e.h.d.a.a.o.b.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;
		 } // .end method
		 public fr.mbs.binary.Octets c ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
			 /* .locals 2 */
			 int v0 = 2; // const/4 v0, 0x2
			 final String v1 = "AES/CBC/NoPadding"; // const-string v1, "AES/CBC/NoPadding"
			 /* .line 1 */
			 (( e.h.d.a.a.o.b.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;
		 } // .end method
		 public fr.mbs.binary.Octets d ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
			 /* .locals 2 */
			 int v0 = 2; // const/4 v0, 0x2
			 final String v1 = "AES/CBC/PKCS5Padding"; // const-string v1, "AES/CBC/PKCS5Padding"
			 /* .line 1 */
			 (( e.h.d.a.a.o.b.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILjava/lang/String;)Lfr/mbs/binary/Octets;
		 } // .end method
