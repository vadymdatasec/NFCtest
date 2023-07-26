public class e.f.c.l.e.m.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.concurrent.atomic.AtomicLong a;
	 public static java.lang.String b;
	 /* # direct methods */
	 public static e.f.c.l.e.m.g ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicLong; */
		 /* const-wide/16 v1, 0x0 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V */
		 return;
	 } // .end method
	 public e.f.c.l.e.m.g ( ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0xa */
		 /* new-array v0, v0, [B */
		 /* .line 2 */
		 (( e.f.c.l.e.m.g ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/g;->c([B)V
		 /* .line 3 */
		 (( e.f.c.l.e.m.g ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/g;->b([B)V
		 /* .line 4 */
		 (( e.f.c.l.e.m.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/g;->a([B)V
		 /* .line 5 */
		 (( e.f.c.l.e.m.q1 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;
		 e.f.c.l.e.m.j .c ( p1 );
		 /* .line 6 */
		 e.f.c.l.e.m.j .a ( v0 );
		 /* .line 7 */
		 v1 = java.util.Locale.US;
		 int v2 = 4; // const/4 v2, 0x4
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 /* const/16 v3, 0xc */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 8 */
		 (( java.lang.String ) v0 ).substring ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 /* aput-object v5, v2, v4 */
		 /* const/16 v5, 0x10 */
		 /* .line 9 */
		 (( java.lang.String ) v0 ).substring ( v3, v5 ); // invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 int v7 = 1; // const/4 v7, 0x1
		 /* aput-object v6, v2, v7 */
		 /* const/16 v6, 0x14 */
		 /* .line 10 */
		 (( java.lang.String ) v0 ).subSequence ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;
		 int v5 = 2; // const/4 v5, 0x2
		 /* aput-object v0, v2, v5 */
		 /* .line 11 */
		 (( java.lang.String ) p1 ).substring ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 int v0 = 3; // const/4 v0, 0x3
		 /* aput-object p1, v2, v0 */
		 final String p1 = "%s-%s-%s-%s"; // const-string p1, "%s-%s-%s-%s"
		 /* .line 12 */
		 java.lang.String .format ( v1,p1,v2 );
		 v0 = java.util.Locale.US;
		 /* .line 13 */
		 (( java.lang.String ) p1 ).toUpperCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
		 return;
	 } // .end method
	 public static a ( Long p0 ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 5 */
		 java.nio.ByteBuffer .allocate ( v0 );
		 /* long-to-int p1, p0 */
		 /* .line 6 */
		 (( java.nio.ByteBuffer ) v0 ).putInt ( p1 ); // invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
		 /* .line 7 */
		 p0 = java.nio.ByteOrder.BIG_ENDIAN;
		 (( java.nio.ByteBuffer ) v0 ).order ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 8 */
		 (( java.nio.ByteBuffer ) v0 ).position ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
		 /* .line 9 */
		 (( java.nio.ByteBuffer ) v0 ).array ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B
	 } // .end method
	 public static b ( Long p0 ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* .line 4 */
		 java.nio.ByteBuffer .allocate ( v0 );
		 /* long-to-int p1, p0 */
		 /* int-to-short p0, p1 */
		 /* .line 5 */
		 (( java.nio.ByteBuffer ) v0 ).putShort ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;
		 /* .line 6 */
		 p0 = java.nio.ByteOrder.BIG_ENDIAN;
		 (( java.nio.ByteBuffer ) v0 ).order ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 7 */
		 (( java.nio.ByteBuffer ) v0 ).position ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
		 /* .line 8 */
		 (( java.nio.ByteBuffer ) v0 ).array ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object[] p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 android.os.Process .myPid ( );
		 java.lang.Integer .valueOf ( v0 );
		 /* .line 2 */
		 v0 = 		 (( java.lang.Integer ) v0 ).shortValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->shortValue()S
		 /* int-to-long v0, v0 */
		 e.f.c.l.e.m.g .b ( v0,v1 );
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 /* aget-byte v1, v0, v1 */
		 /* const/16 v2, 0x8 */
		 /* aput-byte v1, p1, v2 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 4 */
		 /* aget-byte v0, v0, v1 */
		 /* const/16 v1, 0x9 */
		 /* aput-byte v0, p1, v1 */
		 return;
	 } // .end method
	 public final void b ( Object[] p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = e.f.c.l.e.m.g.a;
		 (( java.util.concurrent.atomic.AtomicLong ) v0 ).incrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
		 /* move-result-wide v0 */
		 e.f.c.l.e.m.g .b ( v0,v1 );
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 2 */
		 /* aget-byte v1, v0, v1 */
		 int v2 = 6; // const/4 v2, 0x6
		 /* aput-byte v1, p1, v2 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 3 */
		 /* aget-byte v0, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput-byte v0, p1, v1 */
		 return;
	 } // .end method
	 public final void c ( Object[] p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/Date; */
		 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
		 /* .line 2 */
		 (( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x3e8 */
		 /* .line 3 */
		 /* div-long v4, v0, v2 */
		 /* .line 4 */
		 /* rem-long/2addr v0, v2 */
		 /* .line 5 */
		 e.f.c.l.e.m.g .a ( v4,v5 );
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 6 */
		 /* aget-byte v4, v2, v3 */
		 /* aput-byte v4, p1, v3 */
		 int v4 = 1; // const/4 v4, 0x1
		 /* .line 7 */
		 /* aget-byte v5, v2, v4 */
		 /* aput-byte v5, p1, v4 */
		 int v5 = 2; // const/4 v5, 0x2
		 /* .line 8 */
		 /* aget-byte v6, v2, v5 */
		 /* aput-byte v6, p1, v5 */
		 int v5 = 3; // const/4 v5, 0x3
		 /* .line 9 */
		 /* aget-byte v2, v2, v5 */
		 /* aput-byte v2, p1, v5 */
		 /* .line 10 */
		 e.f.c.l.e.m.g .b ( v0,v1 );
		 /* .line 11 */
		 /* aget-byte v1, v0, v3 */
		 int v2 = 4; // const/4 v2, 0x4
		 /* aput-byte v1, p1, v2 */
		 /* .line 12 */
		 /* aget-byte v0, v0, v4 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput-byte v0, p1, v1 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.c.l.e.m.g.b;
	 } // .end method
