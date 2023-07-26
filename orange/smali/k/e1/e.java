public abstract class k.e1.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 public static final java.lang.String b;
	 public static final k.b1 c;
	 public static final l.i d;
	 public static final l.i e;
	 public static final l.i f;
	 public static final l.i g;
	 public static final l.i h;
	 public static final java.nio.charset.Charset i;
	 public static final java.nio.charset.Charset j;
	 public static final java.nio.charset.Charset k;
	 public static final java.nio.charset.Charset l;
	 public static final java.nio.charset.Charset m;
	 public static final java.util.TimeZone n;
	 public static final java.util.Comparator o;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.reflect.Method p;
public static final java.util.regex.Pattern q;
/* # direct methods */
public static k.e1.e ( ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [B */
/* .line 1 */
/* new-array v2, v0, [Ljava/lang/String; */
/* .line 2 */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
k.b1 .a ( v2,v1 );
/* .line 4 */
v1 = k.e1.e.a;
k.x0 .a ( v2,v1 );
final String v1 = "efbbbf"; // const-string v1, "efbbbf"
/* .line 5 */
l.i .b ( v1 );
final String v1 = "feff"; // const-string v1, "feff"
/* .line 6 */
l.i .b ( v1 );
final String v1 = "fffe"; // const-string v1, "fffe"
/* .line 7 */
l.i .b ( v1 );
final String v1 = "0000ffff"; // const-string v1, "0000ffff"
/* .line 8 */
l.i .b ( v1 );
final String v1 = "ffff0000"; // const-string v1, "ffff0000"
/* .line 9 */
l.i .b ( v1 );
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* .line 10 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "ISO-8859-1"; // const-string v1, "ISO-8859-1"
/* .line 11 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "UTF-16BE"; // const-string v1, "UTF-16BE"
/* .line 12 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "UTF-16LE"; // const-string v1, "UTF-16LE"
/* .line 13 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "UTF-32BE"; // const-string v1, "UTF-32BE"
/* .line 14 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "UTF-32LE"; // const-string v1, "UTF-32LE"
/* .line 15 */
java.nio.charset.Charset .forName ( v1 );
final String v1 = "GMT"; // const-string v1, "GMT"
/* .line 16 */
java.util.TimeZone .getTimeZone ( v1 );
/* .line 17 */
/* new-instance v1, Lk/e1/c; */
/* invoke-direct {v1}, Lk/e1/c;-><init>()V */
/* .line 18 */
try { // :try_start_0
	 /* const-class v1, Ljava/lang/Throwable; */
	 final String v3 = "addSuppressed"; // const-string v3, "addSuppressed"
	 int v4 = 1; // const/4 v4, 0x1
	 /* new-array v4, v4, [Ljava/lang/Class; */
	 /* const-class v5, Ljava/lang/Throwable; */
	 /* aput-object v5, v4, v0 */
	 (( java.lang.Class ) v1 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 19 */
	 /* :catch_0 */
	 final String v0 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"; // const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
	 /* .line 20 */
	 java.util.regex.Pattern .compile ( v0 );
	 return;
} // .end method
public static Integer a ( Object p0 ) {
	 /* .locals 2 */
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
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Integer a ( java.lang.String p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
} // :goto_0
/* if-ge p1, p2, :cond_1 */
/* .line 36 */
v0 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
/* if-ne v0, p3, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // .end method
public static Integer a ( java.lang.String p0, Integer p1, Integer p2, java.lang.String p3 ) {
/* .locals 2 */
} // :goto_0
/* if-ge p1, p2, :cond_1 */
/* .line 35 */
v0 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
v0 = (( java.lang.String ) p3 ).indexOf ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // .end method
public static Integer a ( java.lang.String p0, Long p1, java.util.concurrent.TimeUnit p2 ) {
/* .locals 5 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-ltz v2, :cond_4 */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 63 */
(( java.util.concurrent.TimeUnit ) p3 ).toMillis ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide p1 */
/* const-wide/32 v3, 0x7fffffff */
/* cmp-long p3, p1, v3 */
/* if-gtz p3, :cond_2 */
/* cmp-long p3, p1, v0 */
/* if-nez p3, :cond_1 */
/* if-gtz v2, :cond_0 */
/* .line 64 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " too small."; // const-string p0, " too small."
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
} // :goto_0
/* long-to-int p0, p1 */
/* .line 65 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " too large."; // const-string p0, " too large."
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 66 */
} // :cond_3
/* new-instance p0, Ljava/lang/NullPointerException; */
final String p1 = "unit == null"; // const-string p1, "unit == null"
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 67 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " < 0"; // const-string p0, " < 0"
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static Integer a ( java.util.Comparator p0, java.lang.String[] p1, java.lang.String p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Comparator<", */
/* "Ljava/lang/String;", */
/* ">;[", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")I" */
/* } */
} // .end annotation
/* .line 30 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 31 */
v2 = /* aget-object v2, p1, v1 */
/* if-nez v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static java.lang.AssertionError a ( java.lang.String p0, java.lang.Exception p1 ) {
/* .locals 1 */
/* .line 68 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* .line 69 */
try { // :try_start_0
(( java.lang.AssertionError ) v0 ).initCause ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 3 */
final String v0 = ":"; // const-string v0, ":"
/* .line 37 */
v0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "["; // const-string v0, "["
/* .line 38 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "]"; // const-string v0, "]"
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
k.e1.e .a ( p0,v2,v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 40 */
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
k.e1.e .a ( p0,v0,v2 );
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 41 */
} // :cond_1
(( java.net.InetAddress ) v0 ).getAddress ( ); // invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B
/* .line 42 */
/* array-length v1, v0 */
/* const/16 v2, 0x10 */
/* if-ne v1, v2, :cond_2 */
k.e1.e .a ( v0 );
/* .line 43 */
} // :cond_2
/* new-instance v0, Ljava/lang/AssertionError; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid IPv6 address: \'"; // const-string v2, "Invalid IPv6 address: \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "\'"; // const-string p0, "\'"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v0 */
/* .line 44 */
} // :cond_3
try { // :try_start_0
java.net.IDN .toASCII ( p0 );
v0 = java.util.Locale.US;
(( java.lang.String ) p0 ).toLowerCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 45 */
v0 = (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 46 */
} // :cond_4
v0 = k.e1.e .b ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
/* :catch_0 */
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .line 47 */
v0 = java.util.Locale.US;
java.lang.String .format ( v0,p0,p1 );
} // .end method
public static java.lang.String a ( k.f0 p0, Boolean p1 ) {
/* .locals 3 */
/* .line 23 */
(( k.f0 ) p0 ).g ( ); // invoke-virtual {p0}, Lk/f0;->g()Ljava/lang/String;
final String v1 = ":"; // const-string v1, ":"
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "["; // const-string v2, "["
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( k.f0 ) p0 ).g ( ); // invoke-virtual {p0}, Lk/f0;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "]"; // const-string v2, "]"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 25 */
} // :cond_0
(( k.f0 ) p0 ).g ( ); // invoke-virtual {p0}, Lk/f0;->g()Ljava/lang/String;
} // :goto_0
/* if-nez p1, :cond_1 */
/* .line 26 */
p1 = (( k.f0 ) p0 ).j ( ); // invoke-virtual {p0}, Lk/f0;->j()I
(( k.f0 ) p0 ).l ( ); // invoke-virtual {p0}, Lk/f0;->l()Ljava/lang/String;
v2 = k.f0 .c ( v2 );
/* if-eq p1, v2, :cond_2 */
/* .line 27 */
} // :cond_1
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( k.f0 ) p0 ).j ( ); // invoke-virtual {p0}, Lk/f0;->j()I
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
} // .end method
public static java.lang.String a ( Object[] p0 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 86 */
} // :goto_0
/* array-length v4, p0 */
/* const/16 v5, 0x10 */
/* if-ge v2, v4, :cond_2 */
/* move v4, v2 */
} // :goto_1
/* if-ge v4, v5, :cond_0 */
/* .line 87 */
/* aget-byte v6, p0, v4 */
/* if-nez v6, :cond_0 */
/* add-int/lit8 v6, v4, 0x1 */
/* aget-byte v6, p0, v6 */
/* if-nez v6, :cond_0 */
/* add-int/lit8 v4, v4, 0x2 */
} // :cond_0
/* sub-int v5, v4, v2 */
/* if-le v5, v3, :cond_1 */
int v6 = 4; // const/4 v6, 0x4
/* if-lt v5, v6, :cond_1 */
/* move v1, v2 */
/* move v3, v5 */
} // :cond_1
/* add-int/lit8 v2, v4, 0x2 */
/* .line 88 */
} // :cond_2
/* new-instance v2, Ll/f; */
/* invoke-direct {v2}, Ll/f;-><init>()V */
/* .line 89 */
} // :cond_3
} // :goto_2
/* array-length v4, p0 */
/* if-ge v0, v4, :cond_6 */
/* const/16 v4, 0x3a */
/* if-ne v0, v1, :cond_4 */
/* .line 90 */
(( l.f ) v2 ).writeByte ( v4 ); // invoke-virtual {v2, v4}, Ll/f;->writeByte(I)Ll/f;
/* add-int/2addr v0, v3 */
/* if-ne v0, v5, :cond_3 */
/* .line 91 */
(( l.f ) v2 ).writeByte ( v4 ); // invoke-virtual {v2, v4}, Ll/f;->writeByte(I)Ll/f;
} // :cond_4
/* if-lez v0, :cond_5 */
/* .line 92 */
(( l.f ) v2 ).writeByte ( v4 ); // invoke-virtual {v2, v4}, Ll/f;->writeByte(I)Ll/f;
/* .line 93 */
} // :cond_5
/* aget-byte v4, p0, v0 */
/* and-int/lit16 v4, v4, 0xff */
/* shl-int/lit8 v4, v4, 0x8 */
/* add-int/lit8 v6, v0, 0x1 */
/* aget-byte v6, p0, v6 */
/* and-int/lit16 v6, v6, 0xff */
/* or-int/2addr v4, v6 */
/* int-to-long v6, v4 */
/* .line 94 */
(( l.f ) v2 ).a ( v6, v7 ); // invoke-virtual {v2, v6, v7}, Ll/f;->a(J)Ll/f;
/* add-int/lit8 v0, v0, 0x2 */
/* .line 95 */
} // :cond_6
(( l.f ) v2 ).p ( ); // invoke-virtual {v2}, Ll/f;->p()Ljava/lang/String;
} // .end method
public static java.net.InetAddress a ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 11 */
/* const/16 v0, 0x10 */
/* new-array v1, v0, [B */
int v2 = -1; // const/4 v2, -0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
int v6 = -1; // const/4 v6, -0x1
} // :goto_0
int v7 = 0; // const/4 v7, 0x0
/* if-ge p1, p2, :cond_c */
/* if-ne v4, v0, :cond_0 */
} // :cond_0
/* add-int/lit8 v8, p1, 0x2 */
/* if-gt v8, p2, :cond_3 */
int v9 = 2; // const/4 v9, 0x2
final String v10 = "::"; // const-string v10, "::"
/* .line 70 */
v9 = (( java.lang.String ) p0 ).regionMatches ( p1, v10, v3, v9 ); // invoke-virtual {p0, p1, v10, v3, v9}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* if-eq v5, v2, :cond_1 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x2 */
/* move v5, v4 */
/* if-ne v8, p2, :cond_2 */
} // :cond_2
/* move v6, v8 */
} // :cond_3
if ( v4 != null) { // if-eqz v4, :cond_7
int v8 = 1; // const/4 v8, 0x1
final String v9 = ":"; // const-string v9, ":"
/* .line 71 */
v9 = (( java.lang.String ) p0 ).regionMatches ( p1, v9, v3, v8 ); // invoke-virtual {p0, p1, v9, v3, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z
if ( v9 != null) { // if-eqz v9, :cond_4
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_4
final String v9 = "."; // const-string v9, "."
/* .line 72 */
p1 = (( java.lang.String ) p0 ).regionMatches ( p1, v9, v3, v8 ); // invoke-virtual {p0, p1, v9, v3, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* add-int/lit8 p1, v4, -0x2 */
/* .line 73 */
p0 = k.e1.e .a ( p0,v6,p2,v1,p1 );
/* if-nez p0, :cond_5 */
} // :cond_5
/* add-int/lit8 v4, v4, 0x2 */
} // :cond_6
} // :cond_7
} // :goto_1
/* move v6, p1 */
} // :goto_2
/* move p1, v6 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_3
/* if-ge p1, p2, :cond_9 */
/* .line 74 */
v9 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
/* .line 75 */
v9 = k.e1.e .a ( v9 );
/* if-ne v9, v2, :cond_8 */
} // :cond_8
/* shl-int/lit8 v8, v8, 0x4 */
/* add-int/2addr v8, v9 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_9
} // :goto_4
/* sub-int v9, p1, v6 */
if ( v9 != null) { // if-eqz v9, :cond_b
int v10 = 4; // const/4 v10, 0x4
/* if-le v9, v10, :cond_a */
} // :cond_a
/* add-int/lit8 v7, v4, 0x1 */
/* ushr-int/lit8 v9, v8, 0x8 */
/* and-int/lit16 v9, v9, 0xff */
/* int-to-byte v9, v9 */
/* .line 76 */
/* aput-byte v9, v1, v4 */
/* add-int/lit8 v4, v7, 0x1 */
/* and-int/lit16 v8, v8, 0xff */
/* int-to-byte v8, v8 */
/* .line 77 */
/* aput-byte v8, v1, v7 */
} // :cond_b
} // :goto_5
} // :cond_c
} // :goto_6
/* if-eq v4, v0, :cond_e */
/* if-ne v5, v2, :cond_d */
} // :cond_d
/* sub-int p0, v4, v5 */
/* rsub-int/lit8 p1, p0, 0x10 */
/* .line 78 */
java.lang.System .arraycopy ( v1,v5,v1,p1,p0 );
/* sub-int/2addr v0, v4 */
/* add-int/2addr v0, v5 */
/* .line 79 */
java.util.Arrays .fill ( v1,v5,v0,v3 );
/* .line 80 */
} // :cond_e
try { // :try_start_0
java.net.InetAddress .getByAddress ( v1 );
/* :try_end_0 */
/* .catch Ljava/net/UnknownHostException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 81 */
/* :catch_0 */
/* new-instance p0, Ljava/lang/AssertionError; */
/* invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V */
/* throw p0 */
} // .end method
public static java.nio.charset.Charset a ( Object p0, java.nio.charset.Charset p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 48 */
v0 = k.e1.e.d;
v0 = /* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 49 */
p1 = k.e1.e.d;
p1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* int-to-long v0, p1 */
/* .line 50 */
p0 = k.e1.e.i;
/* .line 51 */
} // :cond_0
v0 = v0 = k.e1.e.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 52 */
p1 = k.e1.e.e;
p1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* int-to-long v0, p1 */
/* .line 53 */
p0 = k.e1.e.j;
/* .line 54 */
} // :cond_1
v0 = v0 = k.e1.e.f;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 55 */
p1 = k.e1.e.f;
p1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* int-to-long v0, p1 */
/* .line 56 */
p0 = k.e1.e.k;
/* .line 57 */
} // :cond_2
v0 = v0 = k.e1.e.g;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 58 */
p1 = k.e1.e.g;
p1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* int-to-long v0, p1 */
/* .line 59 */
p0 = k.e1.e.l;
/* .line 60 */
} // :cond_3
v0 = v0 = k.e1.e.h;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 61 */
p1 = k.e1.e.h;
p1 = (( l.i ) p1 ).e ( ); // invoke-virtual {p1}, Ll/i;->e()I
/* int-to-long v0, p1 */
/* .line 62 */
p0 = k.e1.e.m;
} // :cond_4
} // .end method
public static java.util.List a ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/List<", */
/* "TT;>;)", */
/* "Ljava/util/List<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 11 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
java.util.Collections .unmodifiableList ( v0 );
} // .end method
public static java.util.List a ( java.lang.Object...p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;)", */
/* "Ljava/util/List<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 15 */
(( java.lang.Object ) p0 ).clone ( ); // invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
/* check-cast p0, [Ljava/lang/Object; */
java.util.Arrays .asList ( p0 );
java.util.Collections .unmodifiableList ( p0 );
} // .end method
public static java.util.Map a ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;)", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
v0 = /* .line 12 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 13 */
java.util.Collections .emptyMap ( );
/* .line 14 */
} // :cond_0
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V */
java.util.Collections .unmodifiableMap ( v0 );
} // :goto_0
} // .end method
public static java.util.concurrent.ThreadFactory a ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* .line 16 */
/* new-instance v0, Lk/e1/d; */
/* invoke-direct {v0, p0, p1}, Lk/e1/d;-><init>(Ljava/lang/String;Z)V */
} // .end method
public static javax.net.ssl.X509TrustManager a ( ) {
/* .locals 4 */
/* .line 96 */
try { // :try_start_0
javax.net.ssl.TrustManagerFactory .getDefaultAlgorithm ( );
/* .line 97 */
javax.net.ssl.TrustManagerFactory .getInstance ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* .line 98 */
(( javax.net.ssl.TrustManagerFactory ) v0 ).init ( v1 ); // invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
/* .line 99 */
(( javax.net.ssl.TrustManagerFactory ) v0 ).getTrustManagers ( ); // invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
/* .line 100 */
/* array-length v1, v0 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* aget-object v2, v0, v1 */
/* instance-of v2, v2, Ljavax/net/ssl/X509TrustManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 101 */
/* aget-object v0, v0, v1 */
/* check-cast v0, Ljavax/net/ssl/X509TrustManager; */
/* .line 102 */
} // :cond_0
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unexpected default trust managers:"; // const-string v3, "Unexpected default trust managers:"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 103 */
java.util.Arrays .toString ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "No System TLS"; // const-string v1, "No System TLS"
/* .line 104 */
k.e1.e .a ( v1,v0 );
/* throw v0 */
} // .end method
public static void a ( Long p0, Long p1, Long p2 ) {
/* .locals 5 */
/* or-long v0, p2, p4 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, v0, v2 */
/* if-ltz v4, :cond_0 */
/* cmp-long v0, p2, p0 */
/* if-gtz v0, :cond_0 */
/* sub-long/2addr p0, p2 */
/* cmp-long p2, p0, p4 */
/* if-ltz p2, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V */
/* throw p0 */
} // .end method
public static void a ( java.io.Closeable p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 5 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception p0 */
/* .line 6 */
/* throw p0 */
/* :catch_1 */
} // :cond_0
} // :goto_0
return;
} // .end method
public static void a ( java.lang.Throwable p0, java.lang.Throwable p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = k.e1.e.p;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
/* .line 2 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
return;
} // .end method
public static void a ( java.net.Socket p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 7 */
try { // :try_start_0
(( java.net.Socket ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/net/Socket;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/AssertionError; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* :catch_0 */
/* move-exception p0 */
/* .line 8 */
/* throw p0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 9 */
v0 = k.e1.e .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* throw p0 */
/* :catch_2 */
} // :cond_1
} // :goto_0
return;
} // .end method
public static Boolean a ( java.lang.AssertionError p0 ) {
/* .locals 1 */
/* .line 28 */
(( java.lang.AssertionError ) p0 ).getCause ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.lang.AssertionError ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
(( java.lang.AssertionError ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;
final String v0 = "getsockname failed"; // const-string v0, "getsockname failed"
p0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-eq p0, p1, :cond_1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 4 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean a ( java.lang.String p0, Integer p1, Integer p2, Object[] p3, Integer p4 ) {
/* .locals 7 */
/* move v0, p4 */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* if-ge p1, p2, :cond_8 */
/* .line 82 */
/* array-length v2, p3 */
/* if-ne v0, v2, :cond_0 */
} // :cond_0
/* if-eq v0, p4, :cond_2 */
/* .line 83 */
v2 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x2e */
/* if-eq v2, v3, :cond_1 */
} // :cond_1
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_2
/* move v2, p1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v2, p2, :cond_6 */
/* .line 84 */
v4 = (( java.lang.String ) p0 ).charAt ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
/* const/16 v5, 0x30 */
/* if-lt v4, v5, :cond_6 */
/* const/16 v6, 0x39 */
/* if-le v4, v6, :cond_3 */
} // :cond_3
/* if-nez v3, :cond_4 */
/* if-eq p1, v2, :cond_4 */
} // :cond_4
/* mul-int/lit8 v3, v3, 0xa */
/* add-int/2addr v3, v4 */
/* sub-int/2addr v3, v5 */
/* const/16 v4, 0xff */
/* if-le v3, v4, :cond_5 */
} // :cond_5
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_6
} // :goto_2
/* sub-int p1, v2, p1 */
/* if-nez p1, :cond_7 */
} // :cond_7
/* add-int/lit8 p1, v0, 0x1 */
/* int-to-byte v1, v3 */
/* .line 85 */
/* aput-byte v1, p3, v0 */
/* move v0, p1 */
/* move p1, v2 */
} // :cond_8
/* add-int/lit8 p4, p4, 0x4 */
/* if-eq v0, p4, :cond_9 */
} // :cond_9
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean a ( Object p0, Integer p1, java.util.concurrent.TimeUnit p2 ) {
/* .locals 0 */
/* .line 10 */
try { // :try_start_0
p0 = k.e1.e .b ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.String a ( java.util.Comparator p0, java.lang.String[] p1, java.lang.String[] p2 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Comparator<", */
/* "-", */
/* "Ljava/lang/String;", */
/* ">;[", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/String;", */
/* ")[", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .line 17 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 18 */
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_2 */
/* aget-object v4, p1, v3 */
/* .line 19 */
/* array-length v5, p2 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
/* if-ge v6, v5, :cond_1 */
/* aget-object v7, p2, v6 */
v7 = /* .line 20 */
/* if-nez v7, :cond_0 */
/* .line 21 */
} // :cond_0
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_1
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 22 */
p0 = } // :cond_2
/* new-array p0, p0, [Ljava/lang/String; */
/* check-cast p0, [Ljava/lang/String; */
} // .end method
public static java.lang.String a ( java.lang.String[] p0, java.lang.String p1 ) {
/* .locals 4 */
/* .line 32 */
/* array-length v0, p0 */
/* add-int/lit8 v0, v0, 0x1 */
/* new-array v1, v0, [Ljava/lang/String; */
/* .line 33 */
/* array-length v2, p0 */
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( p0,v3,v1,v3,v2 );
/* add-int/lit8 v0, v0, -0x1 */
/* .line 34 */
/* aput-object p1, v1, v0 */
} // .end method
public static Integer b ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 2 */
} // :goto_0
/* if-ge p1, p2, :cond_1 */
/* .line 18 */
v0 = (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
/* const/16 v1, 0x9 */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xa */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xc */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xd */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0x20 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // .end method
public static k.d0 b ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lk/e1/k/c;", */
/* ">;)", */
/* "Lk/d0;" */
/* } */
} // .end annotation
/* .line 22 */
/* new-instance v0, Lk/c0; */
/* invoke-direct {v0}, Lk/c0;-><init>()V */
/* .line 23 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lk/e1/k/c; */
/* .line 24 */
v2 = k.e1.a.a;
v3 = this.a;
(( l.i ) v3 ).h ( ); // invoke-virtual {v3}, Ll/i;->h()Ljava/lang/String;
v1 = this.b;
(( l.i ) v1 ).h ( ); // invoke-virtual {v1}, Ll/i;->h()Ljava/lang/String;
(( k.e1.a ) v2 ).a ( v0, v3, v1 ); // invoke-virtual {v2, v0, v3, v1}, Lk/e1/a;->a(Lk/c0;Ljava/lang/String;Ljava/lang/String;)V
/* .line 25 */
} // :cond_0
(( k.c0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/c0;->a()Lk/d0;
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 19 */
} // :goto_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v1, v2, :cond_3 */
/* .line 20 */
v2 = (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x1f */
int v4 = 1; // const/4 v4, 0x1
/* if-le v2, v3, :cond_2 */
/* const/16 v3, 0x7f */
/* if-lt v2, v3, :cond_0 */
} // :cond_0
final String v3 = " #%/:?@[\\]"; // const-string v3, " #%/:?@[\\]"
/* .line 21 */
v2 = (( java.lang.String ) v3 ).indexOf ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // :goto_1
} // :cond_3
} // .end method
public static Boolean b ( java.util.Comparator p0, java.lang.String[] p1, java.lang.String[] p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Comparator<", */
/* "Ljava/lang/String;", */
/* ">;[", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/String;", */
/* ")Z" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_3
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 14 */
/* array-length v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* array-length v1, p2 */
/* if-nez v1, :cond_0 */
/* .line 15 */
} // :cond_0
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_3 */
/* aget-object v3, p1, v2 */
/* .line 16 */
/* array-length v4, p2 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v4, :cond_2 */
/* aget-object v6, p2, v5 */
v6 = /* .line 17 */
/* if-nez v6, :cond_1 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // :goto_2
} // .end method
public static Boolean b ( Object p0, Integer p1, java.util.concurrent.TimeUnit p2 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
java.lang.System .nanoTime ( );
/* move-result-wide v0 */
/* .line 2 */
v2 = (( l.a0 ) v2 ).d ( ); // invoke-virtual {v2}, Ll/a0;->d()Z
/* const-wide v3, 0x7fffffffffffffffL */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
(( l.a0 ) v2 ).c ( ); // invoke-virtual {v2}, Ll/a0;->c()J
/* move-result-wide v5 */
/* sub-long/2addr v5, v0 */
} // :cond_0
/* move-wide v5, v3 */
/* .line 4 */
} // :goto_0
/* int-to-long v7, p1 */
(( java.util.concurrent.TimeUnit ) p2 ).toNanos ( v7, v8 ); // invoke-virtual {p2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
/* move-result-wide p1 */
java.lang.Math .min ( v5,v6,p1,p2 );
/* move-result-wide p1 */
/* add-long/2addr p1, v0 */
(( l.a0 ) v2 ).a ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Ll/a0;->a(J)Ll/a0;
/* .line 5 */
try { // :try_start_0
/* new-instance p1, Ll/f; */
/* invoke-direct {p1}, Ll/f;-><init>()V */
} // :goto_1
/* const-wide/16 v7, 0x2000 */
/* .line 6 */
/* move-result-wide v7 */
/* const-wide/16 v9, -0x1 */
/* cmp-long p2, v7, v9 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 7 */
(( l.f ) p1 ).l ( ); // invoke-virtual {p1}, Ll/f;->l()V
/* :try_end_0 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* cmp-long p2, v5, v3 */
/* if-nez p2, :cond_2 */
/* .line 8 */
(( l.a0 ) p0 ).a ( ); // invoke-virtual {p0}, Ll/a0;->a()Ll/a0;
/* .line 9 */
} // :cond_2
/* add-long/2addr v0, v5 */
(( l.a0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/a0;->a(J)Ll/a0;
} // :goto_2
/* :catchall_0 */
/* move-exception p1 */
/* cmp-long p2, v5, v3 */
/* if-nez p2, :cond_3 */
/* .line 10 */
(( l.a0 ) p0 ).a ( ); // invoke-virtual {p0}, Ll/a0;->a()Ll/a0;
/* .line 11 */
} // :cond_3
/* add-long/2addr v0, v5 */
(( l.a0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/a0;->a(J)Ll/a0;
} // :goto_3
/* throw p1 */
/* :catch_0 */
/* nop */
int p1 = 0; // const/4 p1, 0x0
/* cmp-long p2, v5, v3 */
/* if-nez p2, :cond_4 */
/* .line 12 */
(( l.a0 ) p0 ).a ( ); // invoke-virtual {p0}, Ll/a0;->a()Ll/a0;
/* .line 13 */
} // :cond_4
/* add-long/2addr v0, v5 */
(( l.a0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/a0;->a(J)Ll/a0;
} // :goto_4
} // .end method
public static Integer c ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 2 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 3 */
v2 = (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x1f */
/* if-le v2, v3, :cond_1 */
/* const/16 v3, 0x7f */
/* if-lt v2, v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // :goto_1
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Integer c ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* add-int/lit8 p2, p2, -0x1 */
} // :goto_0
/* if-lt p2, p1, :cond_1 */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).charAt ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C
/* const/16 v1, 0x9 */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xa */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xc */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0xd */
/* if-eq v0, v1, :cond_0 */
/* const/16 v1, 0x20 */
/* if-eq v0, v1, :cond_0 */
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
/* add-int/lit8 p2, p2, -0x1 */
} // :cond_1
} // .end method
public static java.lang.String d ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = k.e1.e .b ( p0,p1,p2 );
/* .line 2 */
p2 = k.e1.e .c ( p0,p1,p2 );
/* .line 3 */
(( java.lang.String ) p0 ).substring ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static Boolean d ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = k.e1.e.q;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
p0 = (( java.util.regex.Matcher ) p0 ).matches ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z
} // .end method
