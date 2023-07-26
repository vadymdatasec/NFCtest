public abstract class com.google.common.io.BaseEncoding {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/common/io/BaseEncoding$DecodingException; */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.google.common.io.BaseEncoding a;
public static final com.google.common.io.BaseEncoding b;
/* # direct methods */
public static com.google.common.io.BaseEncoding ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* new-instance v0, Le/f/b/c/c; */
	 /* const/16 v1, 0x3d */
	 /* .line 2 */
	 java.lang.Character .valueOf ( v1 );
	 final String v2 = "base64()"; // const-string v2, "base64()"
	 final String v3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"; // const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
	 /* invoke-direct {v0, v2, v3, v1}, Le/f/b/c/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V */
	 /* .line 3 */
	 /* new-instance v0, Le/f/b/c/c; */
	 final String v2 = "base64Url()"; // const-string v2, "base64Url()"
	 final String v3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"; // const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
	 /* .line 4 */
	 /* invoke-direct {v0, v2, v3, v1}, Le/f/b/c/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V */
	 /* .line 5 */
	 /* new-instance v0, Le/f/b/c/d; */
	 final String v2 = "base32()"; // const-string v2, "base32()"
	 final String v3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"; // const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
	 /* .line 6 */
	 /* invoke-direct {v0, v2, v3, v1}, Le/f/b/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V */
	 /* .line 7 */
	 /* new-instance v0, Le/f/b/c/d; */
	 final String v2 = "base32Hex()"; // const-string v2, "base32Hex()"
	 final String v3 = "0123456789ABCDEFGHIJKLMNOPQRSTUV"; // const-string v3, "0123456789ABCDEFGHIJKLMNOPQRSTUV"
	 /* .line 8 */
	 /* invoke-direct {v0, v2, v3, v1}, Le/f/b/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V */
	 /* .line 9 */
	 /* new-instance v0, Le/f/b/c/b; */
	 final String v1 = "base16()"; // const-string v1, "base16()"
	 final String v2 = "0123456789ABCDEF"; // const-string v2, "0123456789ABCDEF"
	 /* invoke-direct {v0, v1, v2}, Le/f/b/c/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
public com.google.common.io.BaseEncoding ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static a ( Object[] p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 7 */
	 /* array-length v0, p0 */
	 /* if-ne p1, v0, :cond_0 */
	 /* .line 8 */
} // :cond_0
/* new-array v0, p1, [B */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
} // .end method
public static com.google.common.io.BaseEncoding b ( ) {
/* .locals 1 */
/* .line 5 */
v0 = com.google.common.io.BaseEncoding.a;
} // .end method
public static com.google.common.io.BaseEncoding c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.google.common.io.BaseEncoding.b;
} // .end method
/* # virtual methods */
public abstract Integer a ( Integer p0 ) {
} // .end method
public abstract Integer a ( Object[] p0, java.lang.CharSequence p1 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/common/io/BaseEncoding$DecodingException; */
/* } */
} // .end annotation
} // .end method
public abstract com.google.common.io.BaseEncoding a ( ) {
} // .end method
public java.lang.String a ( Object[] p0 ) {
/* .locals 2 */
/* .line 1 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
(( com.google.common.io.BaseEncoding ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/google/common/io/BaseEncoding;->a([BII)Ljava/lang/String;
} // .end method
public final java.lang.String a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* add-int v0, p2, p3 */
/* .line 2 */
/* array-length v1, p1 */
e.f.b.a.p .b ( p2,v0,v1 );
/* .line 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = (( com.google.common.io.BaseEncoding ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Lcom/google/common/io/BaseEncoding;->b(I)I
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 4 */
try { // :try_start_0
(( com.google.common.io.BaseEncoding ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/common/io/BaseEncoding;->a(Ljava/lang/Appendable;[BII)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :catch_0 */
/* move-exception p1 */
/* .line 6 */
/* new-instance p2, Ljava/lang/AssertionError; */
/* invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw p2 */
} // .end method
public abstract void a ( java.lang.Appendable p0, Object[] p1, Integer p2, Integer p3 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public final a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 10 */
try { // :try_start_0
(( com.google.common.io.BaseEncoding ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/common/io/BaseEncoding;->b(Ljava/lang/CharSequence;)[B
/* :try_end_0 */
/* .catch Lcom/google/common/io/BaseEncoding$DecodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public abstract Integer b ( Integer p0 ) {
} // .end method
public final b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/common/io/BaseEncoding$DecodingException; */
/* } */
} // .end annotation
/* .line 1 */
(( com.google.common.io.BaseEncoding ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/common/io/BaseEncoding;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
v0 = /* .line 2 */
v0 = (( com.google.common.io.BaseEncoding ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/common/io/BaseEncoding;->a(I)I
/* new-array v0, v0, [B */
/* .line 3 */
p1 = (( com.google.common.io.BaseEncoding ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/google/common/io/BaseEncoding;->a([BLjava/lang/CharSequence;)I
/* .line 4 */
com.google.common.io.BaseEncoding .a ( v0,p1 );
} // .end method
public abstract java.lang.CharSequence c ( java.lang.CharSequence p0 ) {
} // .end method
