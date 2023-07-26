public class e.f.c.s.q {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Object a;
	 public static final Object b;
	 /* # direct methods */
	 public static e.f.c.s.q ( ) {
		 /* .locals 2 */
		 int v0 = 2; // const/4 v0, 0x2
		 final String v1 = "01110000"; // const-string v1, "01110000"
		 /* .line 1 */
		 v1 = 		 java.lang.Byte .parseByte ( v1,v0 );
		 /* sput-byte v1, Le/f/c/s/q;->a:B */
		 final String v1 = "00001111"; // const-string v1, "00001111"
		 /* .line 2 */
		 v0 = 		 java.lang.Byte .parseByte ( v1,v0 );
		 /* sput-byte v0, Le/f/c/s/q;->b:B */
		 return;
	 } // .end method
	 public e.f.c.s.q ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( Object[] p0 ) {
		 /* .locals 2 */
		 /* .line 5 */
		 /* new-instance v0, Ljava/lang/String; */
		 /* const/16 v1, 0xb */
		 /* .line 6 */
		 android.util.Base64 .encode ( p0,v1 );
		 /* .line 7 */
		 java.nio.charset.Charset .defaultCharset ( );
		 /* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
		 int p0 = 0; // const/4 p0, 0x0
		 /* const/16 v1, 0x16 */
		 /* .line 8 */
		 (( java.lang.String ) v0 ).substring ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
	 } // .end method
	 public static a ( java.util.UUID p0, Object[] p1 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 java.nio.ByteBuffer .wrap ( p1 );
		 /* .line 10 */
		 (( java.util.UUID ) p0 ).getMostSignificantBits ( ); // invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J
		 /* move-result-wide v0 */
		 (( java.nio.ByteBuffer ) p1 ).putLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;
		 /* .line 11 */
		 (( java.util.UUID ) p0 ).getLeastSignificantBits ( ); // invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J
		 /* move-result-wide v0 */
		 (( java.nio.ByteBuffer ) p1 ).putLong ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;
		 /* .line 12 */
		 (( java.nio.ByteBuffer ) p1 ).array ( ); // invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 java.util.UUID .randomUUID ( );
		 /* const/16 v1, 0x11 */
		 /* new-array v1, v1, [B */
		 e.f.c.s.q .a ( v0,v1 );
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 2 */
		 /* aget-byte v2, v0, v1 */
		 /* const/16 v3, 0x10 */
		 /* aput-byte v2, v0, v3 */
		 /* .line 3 */
		 /* sget-byte v2, Le/f/c/s/q;->b:B */
		 /* aget-byte v3, v0, v1 */
		 /* and-int/2addr v2, v3 */
		 /* sget-byte v3, Le/f/c/s/q;->a:B */
		 /* or-int/2addr v2, v3 */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 /* .line 4 */
		 e.f.c.s.q .a ( v0 );
	 } // .end method
