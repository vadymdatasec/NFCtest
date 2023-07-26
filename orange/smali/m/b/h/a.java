public abstract class m.b.h.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.regex.Pattern a;
	 public static final b;
	 /* # direct methods */
	 public static m.b.h.a ( ) {
		 /* .locals 1 */
		 final String v0 = "(?i)\\bcharset=\\s*(?:\"|\')?([^\\s,;\"\']*)"; // const-string v0, "(?i)\\bcharset=\\s*(?:\"|\')?([^\\s,;\"\']*)"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 final String v0 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
		 /* .line 2 */
		 (( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p0, :cond_0 */
		 /* .line 33 */
	 } // :cond_0
	 v1 = m.b.h.a.a;
	 (( java.util.regex.Pattern ) v1 ).matcher ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
	 /* .line 34 */
	 v1 = 	 (( java.util.regex.Matcher ) p0 ).find ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 35 */
		 (( java.util.regex.Matcher ) p0 ).group ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
		 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
		 final String v0 = "charset="; // const-string v0, "charset="
		 final String v1 = ""; // const-string v1, ""
		 /* .line 36 */
		 (( java.lang.String ) p0 ).replace ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 /* .line 37 */
		 m.b.h.a .b ( p0 );
	 } // :cond_1
} // .end method
public static java.lang.String a ( java.nio.ByteBuffer p0, java.lang.String p1 ) {
	 /* .locals 8 */
	 /* .line 38 */
	 (( java.nio.ByteBuffer ) p0 ).mark ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;
	 int v0 = 4; // const/4 v0, 0x4
	 /* new-array v1, v0, [B */
	 /* .line 39 */
	 v2 = 	 (( java.nio.ByteBuffer ) p0 ).remaining ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->remaining()I
	 /* if-lt v2, v0, :cond_0 */
	 /* .line 40 */
	 (( java.nio.ByteBuffer ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
	 /* .line 41 */
	 (( java.nio.ByteBuffer ) p0 ).rewind ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 42 */
/* aget-byte v2, v1, v0 */
int v3 = 3; // const/4 v3, 0x3
int v4 = 2; // const/4 v4, 0x2
int v5 = -2; // const/4 v5, -0x2
int v6 = -1; // const/4 v6, -0x1
int v7 = 1; // const/4 v7, 0x1
/* if-nez v2, :cond_1 */
/* aget-byte v2, v1, v7 */
/* if-nez v2, :cond_1 */
/* aget-byte v2, v1, v4 */
/* if-ne v2, v5, :cond_1 */
/* aget-byte v2, v1, v3 */
/* if-eq v2, v6, :cond_2 */
} // :cond_1
/* aget-byte v2, v1, v0 */
/* if-ne v2, v6, :cond_3 */
/* aget-byte v2, v1, v7 */
/* if-ne v2, v5, :cond_3 */
/* aget-byte v2, v1, v4 */
/* if-nez v2, :cond_3 */
/* aget-byte v2, v1, v3 */
/* if-nez v2, :cond_3 */
} // :cond_2
final String p1 = "UTF-32"; // const-string p1, "UTF-32"
/* .line 43 */
} // :cond_3
/* aget-byte v2, v1, v0 */
/* if-ne v2, v5, :cond_4 */
/* aget-byte v2, v1, v7 */
/* if-eq v2, v6, :cond_5 */
} // :cond_4
/* aget-byte v2, v1, v0 */
/* if-ne v2, v6, :cond_6 */
/* aget-byte v2, v1, v7 */
/* if-ne v2, v5, :cond_6 */
} // :cond_5
final String p1 = "UTF-16"; // const-string p1, "UTF-16"
/* .line 44 */
} // :cond_6
/* aget-byte v0, v1, v0 */
/* const/16 v2, -0x11 */
/* if-ne v0, v2, :cond_7 */
/* aget-byte v0, v1, v7 */
/* const/16 v2, -0x45 */
/* if-ne v0, v2, :cond_7 */
/* aget-byte v0, v1, v4 */
/* const/16 v1, -0x41 */
/* if-ne v0, v1, :cond_7 */
/* .line 45 */
(( java.nio.ByteBuffer ) p0 ).position ( v3 ); // invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
final String p1 = "UTF-8"; // const-string p1, "UTF-8"
} // :cond_7
} // :goto_0
} // .end method
public static java.nio.ByteBuffer a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 32 */
java.nio.ByteBuffer .allocate ( v0 );
} // .end method
public static java.nio.ByteBuffer a ( java.io.InputStream p0, Integer p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-ltz p1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
final String v3 = "maxSize must be 0 (unlimited) or larger"; // const-string v3, "maxSize must be 0 (unlimited) or larger"
/* .line 24 */
m.b.h.j .b ( v2,v3 );
/* if-lez p1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* const v2, 0xea60 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-ge p1, v2, :cond_2 */
/* move v3, p1 */
} // :cond_2
/* const v3, 0xea60 */
/* .line 25 */
} // :goto_2
/* new-array v3, v3, [B */
/* .line 26 */
/* new-instance v4, Ljava/io/ByteArrayOutputStream; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v2, p1 */
} // :cond_3
/* invoke-direct {v4, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
/* .line 27 */
} // :goto_3
v2 = java.lang.Thread .interrupted ( );
/* if-nez v2, :cond_7 */
/* .line 28 */
v2 = (( java.io.InputStream ) p0 ).read ( v3 ); // invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I
int v5 = -1; // const/4 v5, -0x1
/* if-ne v2, v5, :cond_4 */
} // :cond_4
if ( v0 != null) { // if-eqz v0, :cond_6
/* if-le v2, p1, :cond_5 */
/* .line 29 */
(( java.io.ByteArrayOutputStream ) v4 ).write ( v3, v1, p1 ); // invoke-virtual {v4, v3, v1, p1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
} // :cond_5
/* sub-int/2addr p1, v2 */
/* .line 30 */
} // :cond_6
(( java.io.ByteArrayOutputStream ) v4 ).write ( v3, v1, v2 ); // invoke-virtual {v4, v3, v1, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 31 */
} // :cond_7
} // :goto_4
(( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
java.nio.ByteBuffer .wrap ( p0 );
} // .end method
public static m.b.i.i a ( java.nio.ByteBuffer p0, java.lang.String p1, java.lang.String p2, m.b.j.f0 p3 ) {
/* .locals 8 */
/* .line 3 */
m.b.h.a .a ( p0,p1 );
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_5 */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* .line 4 */
java.nio.charset.Charset .forName ( v1 );
(( java.nio.charset.Charset ) v2 ).decode ( p0 ); // invoke-virtual {v2, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
(( java.nio.CharBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;
/* .line 5 */
(( m.b.j.f0 ) p3 ).a ( v2, p2 ); // invoke-virtual {p3, v2, p2}, Lm/b/j/f0;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/i;
final String v4 = "meta[http-equiv=content-type], meta[charset]"; // const-string v4, "meta[http-equiv=content-type], meta[charset]"
/* .line 6 */
(( m.b.i.l ) v3 ).g ( v4 ); // invoke-virtual {v3, v4}, Lm/b/i/l;->g(Ljava/lang/String;)Lm/b/k/f;
(( m.b.k.f ) v4 ).a ( ); // invoke-virtual {v4}, Lm/b/k/f;->a()Lm/b/i/l;
if ( v4 != null) { // if-eqz v4, :cond_1
final String v5 = "http-equiv"; // const-string v5, "http-equiv"
/* .line 7 */
v5 = (( m.b.i.t ) v4 ).c ( v5 ); // invoke-virtual {v4, v5}, Lm/b/i/t;->c(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
final String v5 = "content"; // const-string v5, "content"
/* .line 8 */
(( m.b.i.t ) v4 ).b ( v5 ); // invoke-virtual {v4, v5}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
m.b.h.a .a ( v5 );
} // :cond_0
/* move-object v5, v0 */
} // :goto_0
/* if-nez v5, :cond_2 */
final String v6 = "charset"; // const-string v6, "charset"
/* .line 9 */
v7 = (( m.b.i.t ) v4 ).c ( v6 ); // invoke-virtual {v4, v6}, Lm/b/i/t;->c(Ljava/lang/String;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 10 */
(( m.b.i.t ) v4 ).b ( v6 ); // invoke-virtual {v4, v6}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
/* move-object v5, v0 */
} // :cond_2
} // :goto_1
/* if-nez v5, :cond_3 */
/* .line 11 */
v4 = (( m.b.i.t ) v3 ).d ( ); // invoke-virtual {v3}, Lm/b/i/t;->d()I
/* if-lez v4, :cond_3 */
int v4 = 0; // const/4 v4, 0x0
(( m.b.i.t ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lm/b/i/t;->a(I)Lm/b/i/t;
/* instance-of v6, v6, Lm/b/i/v; */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 12 */
(( m.b.i.t ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lm/b/i/t;->a(I)Lm/b/i/t;
/* check-cast v4, Lm/b/i/v; */
/* .line 13 */
(( m.b.i.v ) v4 ).r ( ); // invoke-virtual {v4}, Lm/b/i/v;->r()Ljava/lang/String;
final String v7 = "xml"; // const-string v7, "xml"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
final String v5 = "encoding"; // const-string v5, "encoding"
/* .line 14 */
(( m.b.i.t ) v4 ).b ( v5 ); // invoke-virtual {v4, v5}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
/* .line 15 */
} // :cond_3
m.b.h.a .b ( v5 );
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 16 */
v1 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_4 */
/* .line 17 */
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v1 = "[\"\']"; // const-string v1, "[\"\']"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 18 */
(( java.nio.ByteBuffer ) p0 ).rewind ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
/* .line 19 */
java.nio.charset.Charset .forName ( p1 );
(( java.nio.charset.Charset ) v1 ).decode ( p0 ); // invoke-virtual {v1, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
(( java.nio.CharBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;
} // :cond_4
/* move-object v0, v3 */
} // :cond_5
final String v1 = "Must set charset arg to character set of file to parse.Set to null to attempt to detect from HTML"; // const-string v1, "Must set charset arg to character set of file to parse.Set to null to attempt to detect from HTML"
/* .line 20 */
m.b.h.j .a ( p1,v1 );
/* .line 21 */
java.nio.charset.Charset .forName ( p1 );
(( java.nio.charset.Charset ) v1 ).decode ( p0 ); // invoke-virtual {v1, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
(( java.nio.CharBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;
} // :goto_2
/* if-nez v0, :cond_6 */
/* .line 22 */
(( m.b.j.f0 ) p3 ).a ( v2, p2 ); // invoke-virtual {p3, v2, p2}, Lm/b/j/f0;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/i;
/* .line 23 */
(( m.b.i.i ) v0 ).E ( ); // invoke-virtual {v0}, Lm/b/i/i;->E()Lm/b/i/g;
(( m.b.i.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/g;->a(Ljava/lang/String;)Lm/b/i/g;
} // :cond_6
} // .end method
public static void a ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const v0, 0xea60 */
/* new-array v0, v0, [B */
/* .line 1 */
} // :goto_0
v1 = (( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
(( java.io.OutputStream ) p1 ).write ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V
} // :cond_0
return;
} // .end method
public static java.lang.String b ( ) {
/* .locals 6 */
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x20 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 7 */
/* new-instance v2, Ljava/util/Random; */
/* invoke-direct {v2}, Ljava/util/Random;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_0 */
/* .line 8 */
v4 = m.b.h.a.b;
/* array-length v5, v4 */
v5 = (( java.util.Random ) v2 ).nextInt ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/Random;->nextInt(I)I
/* aget-char v4, v4, v5 */
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 9 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 1 */
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_0 */
/* .line 2 */
} // :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v1 = "[\"\']"; // const-string v1, "[\"\']"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p0 ).replaceAll ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
try { // :try_start_0
v1 = java.nio.charset.Charset .isSupported ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
} // :cond_1
v1 = java.util.Locale.ENGLISH;
(( java.lang.String ) p0 ).toUpperCase ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 5 */
v1 = java.nio.charset.Charset .isSupported ( p0 );
/* :try_end_0 */
/* .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* :catch_0 */
} // :cond_2
} // :goto_0
} // .end method
