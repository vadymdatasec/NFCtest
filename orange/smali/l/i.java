public class l.i implements java.io.Serializable implements java.lang.Comparable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/io/Serializable;", */
	 /* "Ljava/lang/Comparable<", */
	 /* "Ll/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e;
public static final l.i f;
/* # instance fields */
public final b;
public transient Integer c;
public transient java.lang.String d;
/* # direct methods */
public static l.i ( ) {
	 /* .locals 1 */
	 /* const/16 v0, 0x10 */
	 /* new-array v0, v0, [C */
	 /* .line 1 */
	 /* fill-array-data v0, :array_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [B */
	 /* .line 2 */
	 l.i .a ( v0 );
	 return;
	 /* nop */
	 /* :array_0 */
	 /* .array-data 2 */
	 /* 0x30s */
	 /* 0x31s */
	 /* 0x32s */
	 /* 0x33s */
	 /* 0x34s */
	 /* 0x35s */
	 /* 0x36s */
	 /* 0x37s */
	 /* 0x38s */
	 /* 0x39s */
	 /* 0x61s */
	 /* 0x62s */
	 /* 0x63s */
	 /* 0x64s */
	 /* 0x65s */
	 /* 0x66s */
} // .end array-data
} // .end method
public l.i ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
return;
} // .end method
public static Integer a ( Object p0 ) {
/* .locals 3 */
/* const/16 v0, 0x30 */
/* if-lt p0, v0, :cond_0 */
/* const/16 v1, 0x39 */
/* if-gt p0, v1, :cond_0 */
/* sub-int/2addr p0, v0 */
} // :cond_0
/* const/16 v0, 0x61 */
/* if-lt p0, v0, :cond_1 */
/* const/16 v1, 0x66 */
/* if-gt p0, v1, :cond_1 */
} // :goto_0
/* sub-int/2addr p0, v0 */
/* add-int/lit8 p0, p0, 0xa */
} // :cond_1
/* const/16 v0, 0x41 */
/* if-lt p0, v0, :cond_2 */
/* const/16 v1, 0x46 */
/* if-gt p0, v1, :cond_2 */
/* .line 6 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected hex digit: "; // const-string v2, "Unexpected hex digit: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Integer a ( java.lang.String p0, Integer p1 ) {
/* .locals 5 */
/* .line 25 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_4 */
/* if-ne v2, p1, :cond_0 */
/* .line 26 */
} // :cond_0
v3 = (( java.lang.String ) p0 ).codePointAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I
/* .line 27 */
v4 = java.lang.Character .isISOControl ( v3 );
if ( v4 != null) { // if-eqz v4, :cond_1
/* const/16 v4, 0xa */
/* if-eq v3, v4, :cond_1 */
/* const/16 v4, 0xd */
/* if-ne v3, v4, :cond_2 */
} // :cond_1
/* const v4, 0xfffd */
/* if-ne v3, v4, :cond_3 */
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
/* .line 28 */
v3 = java.lang.Character .charCount ( v3 );
/* add-int/2addr v1, v3 */
/* .line 29 */
} // :cond_4
p0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
} // .end method
public static l.i a ( Object...p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
/* new-instance v0, Ll/i; */
(( ) p0 ).clone ( ); // invoke-virtual {p0}, [B->clone()Ljava/lang/Object;
/* check-cast p0, [B */
/* invoke-direct {v0, p0}, Ll/i;-><init>([B)V */
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "data == null"; // const-string v0, "data == null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static l.i b ( java.lang.String p0 ) {
/* .locals 5 */
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 6 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* rem-int/lit8 v0, v0, 0x2 */
/* if-nez v0, :cond_1 */
/* .line 7 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* div-int/lit8 v0, v0, 0x2 */
/* new-array v1, v0, [B */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* mul-int/lit8 v3, v2, 0x2 */
/* .line 8 */
v4 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
v4 = l.i .a ( v4 );
/* shl-int/lit8 v4, v4, 0x4 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 9 */
v3 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
v3 = l.i .a ( v3 );
/* add-int/2addr v4, v3 */
/* int-to-byte v3, v4 */
/* .line 10 */
/* aput-byte v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 11 */
} // :cond_0
l.i .a ( v1 );
/* .line 12 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected hex string: "; // const-string v2, "Unexpected hex string: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 13 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "hex == null"; // const-string v0, "hex == null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static l.i c ( java.lang.String p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
/* new-instance v0, Ll/i; */
v1 = l.b0.a;
(( java.lang.String ) p0 ).getBytes ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* invoke-direct {v0, v1}, Ll/i;-><init>([B)V */
/* .line 2 */
this.d = p0;
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "s == null"; // const-string v0, "s == null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public Object a ( Integer p0 ) {
/* .locals 1 */
/* .line 15 */
v0 = this.b;
/* aget-byte p1, v0, p1 */
} // .end method
public Integer a ( Object p0 ) {
/* .locals 9 */
/* .line 20 */
v0 = (( l.i ) p0 ).e ( ); // invoke-virtual {p0}, Ll/i;->e()I
/* .line 21 */
v1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* .line 22 */
v2 = java.lang.Math .min ( v0,v1 );
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
int v5 = -1; // const/4 v5, -0x1
int v6 = 1; // const/4 v6, 0x1
/* if-ge v4, v2, :cond_2 */
/* .line 23 */
v7 = (( l.i ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Ll/i;->a(I)B
/* and-int/lit16 v7, v7, 0xff */
/* .line 24 */
v8 = (( l.i ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Ll/i;->a(I)B
/* and-int/lit16 v8, v8, 0xff */
/* if-ne v7, v8, :cond_0 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_0
/* if-ge v7, v8, :cond_1 */
} // :cond_1
int v5 = 1; // const/4 v5, 0x1
} // :goto_1
} // :cond_2
/* if-ne v0, v1, :cond_3 */
} // :cond_3
/* if-ge v0, v1, :cond_4 */
} // :cond_4
int v5 = 1; // const/4 v5, 0x1
} // :goto_2
} // .end method
public java.lang.String a ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
l.e .a ( v0 );
} // .end method
public l.i a ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* if-ltz p1, :cond_3 */
/* .line 7 */
v0 = this.b;
/* array-length v1, v0 */
/* if-gt p2, v1, :cond_2 */
/* sub-int v1, p2, p1 */
/* if-ltz v1, :cond_1 */
/* if-nez p1, :cond_0 */
/* .line 8 */
/* array-length v0, v0 */
/* if-ne p2, v0, :cond_0 */
/* .line 9 */
} // :cond_0
/* new-array p2, v1, [B */
/* .line 10 */
v0 = this.b;
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( v0,p1,p2,v2,v1 );
/* .line 11 */
/* new-instance p1, Ll/i; */
/* invoke-direct {p1, p2}, Ll/i;-><init>([B)V */
/* .line 12 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "endIndex < beginIndex"; // const-string p2, "endIndex < beginIndex"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 13 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "endIndex > length("; // const-string v0, "endIndex > length("
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.b;
/* array-length v0, v0 */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = ")"; // const-string v0, ")"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 14 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "beginIndex < 0"; // const-string p2, "beginIndex < 0"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final l.i a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 4 */
try { // :try_start_0
java.security.MessageDigest .getInstance ( p1 );
v0 = this.b;
(( java.security.MessageDigest ) p1 ).digest ( v0 ); // invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->digest([B)[B
l.i .a ( p1 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v0 */
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 16 */
v0 = this.b;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
(( l.f ) p1 ).write ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Ll/f;->write([BII)Ll/f;
return;
} // .end method
public Boolean a ( Integer p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 17 */
v0 = this.b;
p1 = (( l.i ) p2 ).a ( p3, v0, p1, p4 ); // invoke-virtual {p2, p3, v0, p1, p4}, Ll/i;->a(I[BII)Z
} // .end method
public Boolean a ( Integer p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* if-ltz p1, :cond_0 */
/* .line 18 */
v0 = this.b;
/* array-length v1, v0 */
/* sub-int/2addr v1, p4 */
/* if-gt p1, v1, :cond_0 */
/* if-ltz p3, :cond_0 */
/* array-length v1, p2 */
/* sub-int/2addr v1, p4 */
/* if-gt p3, v1, :cond_0 */
/* .line 19 */
p1 = l.b0 .a ( v0,p1,p2,p3,p4 );
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.String b ( ) {
/* .locals 9 */
/* .line 1 */
v0 = this.b;
/* array-length v1, v0 */
/* mul-int/lit8 v1, v1, 0x2 */
/* new-array v1, v1, [C */
/* .line 2 */
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* aget-byte v5, v0, v3 */
/* add-int/lit8 v6, v4, 0x1 */
/* .line 3 */
v7 = l.i.e;
/* shr-int/lit8 v8, v5, 0x4 */
/* and-int/lit8 v8, v8, 0xf */
/* aget-char v8, v7, v8 */
/* aput-char v8, v1, v4 */
/* add-int/lit8 v4, v6, 0x1 */
/* and-int/lit8 v5, v5, 0xf */
/* .line 4 */
/* aget-char v5, v7, v5 */
/* aput-char v5, v1, v6 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
public final Boolean b ( Object p0 ) {
/* .locals 2 */
/* .line 14 */
v0 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
int v1 = 0; // const/4 v1, 0x0
p1 = (( l.i ) p0 ).a ( v1, p1, v1, v0 ); // invoke-virtual {p0, v1, p1, v1, v0}, Ll/i;->a(ILl/i;II)Z
} // .end method
public l.i c ( ) {
/* .locals 1 */
final String v0 = "SHA-1"; // const-string v0, "SHA-1"
/* .line 4 */
(( l.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Ll/i;->a(Ljava/lang/String;)Ll/i;
} // .end method
public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ll/i; */
p1 = (( l.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Ll/i;->a(Ll/i;)I
} // .end method
public l.i d ( ) {
/* .locals 1 */
final String v0 = "SHA-256"; // const-string v0, "SHA-256"
/* .line 1 */
(( l.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Ll/i;->a(Ljava/lang/String;)Ll/i;
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* array-length v0, v0 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Ll/i; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast p1, Ll/i; */
/* .line 2 */
v1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
v3 = this.b;
/* array-length v4, v3 */
/* if-ne v1, v4, :cond_1 */
/* array-length v1, v3 */
/* .line 3 */
p1 = (( l.i ) p1 ).a ( v2, v3, v2, v1 ); // invoke-virtual {p1, v2, v3, v2, v1}, Ll/i;->a(I[BII)Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public l.i f ( ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.b;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_5 */
/* .line 2 */
/* aget-byte v2, v1, v0 */
/* const/16 v3, 0x41 */
/* if-lt v2, v3, :cond_4 */
/* const/16 v4, 0x5a */
/* if-le v2, v4, :cond_0 */
/* .line 3 */
} // :cond_0
(( ) v1 ).clone ( ); // invoke-virtual {v1}, [B->clone()Ljava/lang/Object;
/* check-cast v1, [B */
/* add-int/lit8 v5, v0, 0x1 */
/* add-int/lit8 v2, v2, 0x20 */
/* int-to-byte v2, v2 */
/* .line 4 */
/* aput-byte v2, v1, v0 */
/* .line 5 */
} // :goto_1
/* array-length v0, v1 */
/* if-ge v5, v0, :cond_3 */
/* .line 6 */
/* aget-byte v0, v1, v5 */
/* if-lt v0, v3, :cond_2 */
/* if-le v0, v4, :cond_1 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x20 */
/* int-to-byte v0, v0 */
/* .line 7 */
/* aput-byte v0, v1, v5 */
} // :cond_2
} // :goto_2
/* add-int/lit8 v5, v5, 0x1 */
/* .line 8 */
} // :cond_3
/* new-instance v0, Ll/i; */
/* invoke-direct {v0, v1}, Ll/i;-><init>([B)V */
} // :cond_4
} // :goto_3
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_5
} // .end method
public g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( ) v0 ).clone ( ); // invoke-virtual {v0}, [B->clone()Ljava/lang/Object;
/* check-cast v0, [B */
} // .end method
public java.lang.String h ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
v1 = this.b;
v2 = l.b0.a;
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
this.d = v0;
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Ll/i;->c:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.b;
v0 = java.util.Arrays .hashCode ( v0 );
/* iput v0, p0, Ll/i;->c:I */
} // :goto_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 8 */
/* .line 1 */
v0 = this.b;
/* array-length v0, v0 */
/* if-nez v0, :cond_0 */
final String v0 = "[size=0]"; // const-string v0, "[size=0]"
/* .line 2 */
} // :cond_0
(( l.i ) p0 ).h ( ); // invoke-virtual {p0}, Ll/i;->h()Ljava/lang/String;
/* const/16 v1, 0x40 */
/* .line 3 */
v2 = l.i .a ( v0,v1 );
int v3 = -1; // const/4 v3, -0x1
final String v4 = "\u2026]"; // const-string v4, "\u2026]"
final String v5 = "[size="; // const-string v5, "[size="
final String v6 = "]"; // const-string v6, "]"
int v7 = 0; // const/4 v7, 0x0
/* if-ne v2, v3, :cond_2 */
/* .line 4 */
v0 = this.b;
/* array-length v0, v0 */
/* if-gt v0, v1, :cond_1 */
/* .line 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "[hex="; // const-string v1, "[hex="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( l.i ) p0 ).b ( ); // invoke-virtual {p0}, Ll/i;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
/* array-length v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " hex="; // const-string v2, " hex="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( l.i ) p0 ).a ( v7, v1 ); // invoke-virtual {p0, v7, v1}, Ll/i;->a(II)Ll/i;
(( l.i ) v1 ).b ( ); // invoke-virtual {v1}, Ll/i;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
/* .line 7 */
} // :cond_2
(( java.lang.String ) v0 ).substring ( v7, v2 ); // invoke-virtual {v0, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v3 = "\\"; // const-string v3, "\\"
final String v7 = "\\\\"; // const-string v7, "\\\\"
/* .line 8 */
(( java.lang.String ) v1 ).replace ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v3 = "\n"; // const-string v3, "\n"
final String v7 = "\\n"; // const-string v7, "\\n"
/* .line 9 */
(( java.lang.String ) v1 ).replace ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v3 = "\r"; // const-string v3, "\r"
final String v7 = "\\r"; // const-string v7, "\\r"
/* .line 10 */
(( java.lang.String ) v1 ).replace ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 11 */
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-ge v2, v0, :cond_3 */
/* .line 12 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
/* array-length v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " text="; // const-string v2, " text="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 13 */
} // :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "[text="; // const-string v2, "[text="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
} // .end method
