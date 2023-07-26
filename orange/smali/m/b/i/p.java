public abstract class m.b.i.p {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.HashMap a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final b;
/* # direct methods */
public static m.b.i.p ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [C */
/* .line 2 */
/* fill-array-data v0, :array_0 */
return;
/* :array_0 */
/* .array-data 2 */
/* 0x2cs */
/* 0x3bs */
} // .end array-data
} // .end method
public static Integer a ( java.lang.String p0, Integer[] p1 ) {
/* .locals 3 */
/* .line 3 */
v0 = m.b.i.p.a;
(( java.util.HashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
p0 = (( java.lang.String ) v0 ).codePointAt ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I
/* aput p0, p1, v2 */
/* .line 5 */
p0 = (( java.lang.String ) v0 ).codePointAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I
/* aput p0, p1, v1 */
int p0 = 2; // const/4 p0, 0x2
/* .line 6 */
} // :cond_0
v0 = m.b.i.o.h;
p0 = (( m.b.i.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_1 */
/* .line 7 */
/* aput p0, p1, v2 */
} // :cond_1
} // .end method
public static void a ( java.lang.Appendable p0, java.lang.String p1, Object p2, Boolean p3, Boolean p4, Boolean p5 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
(( m.b.i.g ) p2 ).d ( ); // invoke-virtual {p2}, Lm/b/i/g;->d()Lm/b/i/o;
/* .line 9 */
(( m.b.i.g ) p2 ).b ( ); // invoke-virtual {p2}, Lm/b/i/g;->b()Ljava/nio/charset/CharsetEncoder;
/* .line 10 */
(( java.nio.charset.CharsetEncoder ) p2 ).charset ( ); // invoke-virtual {p2}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;
(( java.nio.charset.Charset ) v1 ).name ( ); // invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
m.b.i.n .a ( v1 );
/* .line 11 */
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_12 */
/* .line 12 */
v7 = (( java.lang.String ) p1 ).codePointAt ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->codePointAt(I)I
int v8 = 1; // const/4 v8, 0x1
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 13 */
v9 = m.b.h.i .a ( v7 );
if ( v9 != null) { // if-eqz v9, :cond_2
if ( p5 != null) { // if-eqz p5, :cond_0
if ( v5 != null) { // if-eqz v5, :cond_11
} // :cond_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* goto/16 :goto_2 */
} // :cond_1
/* const/16 v6, 0x20 */
/* .line 14 */
int v6 = 1; // const/4 v6, 0x1
/* goto/16 :goto_2 */
} // :cond_2
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
} // :cond_3
/* const/high16 v8, 0x10000 */
/* if-ge v7, v8, :cond_f */
/* int-to-char v8, v7 */
/* const/16 v9, 0x22 */
/* if-eq v8, v9, :cond_d */
/* const/16 v9, 0x26 */
/* if-eq v8, v9, :cond_c */
/* const/16 v9, 0x3c */
/* if-eq v8, v9, :cond_9 */
/* const/16 v9, 0x3e */
/* if-eq v8, v9, :cond_7 */
/* const/16 v9, 0xa0 */
/* if-eq v8, v9, :cond_5 */
/* .line 15 */
v9 = m.b.i.p .a ( v1,v8,p2 );
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 16 */
/* .line 17 */
} // :cond_4
m.b.i.p .a ( p0,v0,v7 );
/* .line 18 */
} // :cond_5
v8 = m.b.i.o.f;
/* if-eq v0, v8, :cond_6 */
final String v8 = "&nbsp;"; // const-string v8, "&nbsp;"
/* .line 19 */
} // :cond_6
final String v8 = "&#xa0;"; // const-string v8, "&#xa0;"
/* .line 20 */
} // :cond_7
/* if-nez p3, :cond_8 */
final String v8 = "&gt;"; // const-string v8, "&gt;"
/* .line 21 */
/* .line 22 */
} // :cond_8
} // :cond_9
if ( p3 != null) { // if-eqz p3, :cond_b
/* .line 23 */
v9 = m.b.i.o.f;
/* if-ne v0, v9, :cond_a */
/* .line 24 */
} // :cond_a
} // :cond_b
} // :goto_1
final String v8 = "&lt;"; // const-string v8, "&lt;"
/* .line 25 */
} // :cond_c
final String v8 = "&amp;"; // const-string v8, "&amp;"
/* .line 26 */
} // :cond_d
if ( p3 != null) { // if-eqz p3, :cond_e
final String v8 = "&quot;"; // const-string v8, "&quot;"
/* .line 27 */
/* .line 28 */
} // :cond_e
/* .line 29 */
} // :cond_f
/* new-instance v8, Ljava/lang/String; */
java.lang.Character .toChars ( v7 );
/* invoke-direct {v8, v9}, Ljava/lang/String;-><init>([C)V */
/* .line 30 */
v9 = (( java.nio.charset.CharsetEncoder ) p2 ).canEncode ( v8 ); // invoke-virtual {p2, v8}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z
if ( v9 != null) { // if-eqz v9, :cond_10
/* .line 31 */
/* .line 32 */
} // :cond_10
m.b.i.p .a ( p0,v0,v7 );
/* .line 33 */
} // :cond_11
} // :goto_2
v7 = java.lang.Character .charCount ( v7 );
/* add-int/2addr v4, v7 */
/* goto/16 :goto_0 */
} // :cond_12
return;
} // .end method
public static void a ( java.lang.Appendable p0, Object p1, Integer p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 34 */
(( m.b.i.o ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lm/b/i/o;->a(I)Ljava/lang/String;
/* const/16 v0, 0x3b */
final String v1 = ""; // const-string v1, ""
/* if-eq p1, v1, :cond_0 */
/* const/16 p2, 0x26 */
/* .line 35 */
} // :cond_0
final String p1 = "&#x"; // const-string p1, "&#x"
/* .line 36 */
java.lang.Integer .toHexString ( p2 );
} // :goto_0
return;
} // .end method
public static void a ( Object p0, java.lang.String p1, Integer p2 ) { //synthethic
/* .locals 0 */
/* .line 1 */
m.b.i.p .b ( p0,p1,p2 );
return;
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = m.b.i.o.g;
p0 = (( m.b.i.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( Object p0, Object p1, java.nio.charset.CharsetEncoder p2 ) {
/* .locals 2 */
/* .line 37 */
v0 = m.b.i.m.a;
p0 = (( java.lang.Enum ) p0 ).ordinal ( ); // invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I
/* aget p0, v0, p0 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p0, v0, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq p0, v1, :cond_0 */
/* .line 38 */
p0 = (( java.nio.charset.CharsetEncoder ) p2 ).canEncode ( p1 ); // invoke-virtual {p2, p1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z
} // :cond_0
} // :cond_1
/* const/16 p0, 0x80 */
/* if-ge p1, p0, :cond_2 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static void b ( Object p0, java.lang.String p1, Integer p2 ) {
/* .locals 11 */
/* .line 2 */
/* const-class v0, Lm/b/i/p; */
/* new-array v1, p2, [Ljava/lang/String; */
m.b.i.o .a ( p0,v1 );
/* .line 3 */
/* new-array v1, p2, [I */
m.b.i.o .a ( p0,v1 );
/* .line 4 */
/* new-array v1, p2, [I */
m.b.i.o .b ( p0,v1 );
/* .line 5 */
/* new-array p2, p2, [Ljava/lang/String; */
m.b.i.o .b ( p0,p2 );
/* .line 6 */
(( java.lang.Class ) v0 ).getResourceAsStream ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
if ( p2 != null) { // if-eqz p2, :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
try { // :try_start_0
m.b.h.a .a ( p2,v0 );
final String v1 = "ascii"; // const-string v1, "ascii"
/* .line 8 */
java.nio.charset.Charset .forName ( v1 );
(( java.nio.charset.Charset ) v1 ).decode ( p2 ); // invoke-virtual {v1, p2}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
(( java.nio.CharBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;
/* .line 9 */
/* new-instance v1, Lm/b/j/a; */
/* invoke-direct {v1, p2}, Lm/b/j/a;-><init>(Ljava/lang/String;)V */
int p2 = 0; // const/4 p2, 0x0
/* .line 10 */
} // :goto_0
v2 = (( m.b.j.a ) v1 ).k ( ); // invoke-virtual {v1}, Lm/b/j/a;->k()Z
/* if-nez v2, :cond_3 */
/* const/16 v2, 0x3d */
/* .line 11 */
(( m.b.j.a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lm/b/j/a;->a(C)Ljava/lang/String;
/* .line 12 */
(( m.b.j.a ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/j/a;->a()V
/* .line 13 */
v3 = m.b.i.p.b;
(( m.b.j.a ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lm/b/j/a;->a([C)Ljava/lang/String;
/* const/16 v4, 0x24 */
v3 = java.lang.Integer .parseInt ( v3,v4 );
/* .line 14 */
v5 = (( m.b.j.a ) v1 ).j ( ); // invoke-virtual {v1}, Lm/b/j/a;->j()C
/* .line 15 */
(( m.b.j.a ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/j/a;->a()V
/* const/16 v6, 0x2c */
int v7 = -1; // const/4 v7, -0x1
/* if-ne v5, v6, :cond_0 */
/* const/16 v5, 0x3b */
/* .line 16 */
(( m.b.j.a ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Lm/b/j/a;->a(C)Ljava/lang/String;
v5 = java.lang.Integer .parseInt ( v5,v4 );
/* .line 17 */
(( m.b.j.a ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/j/a;->a()V
} // :cond_0
int v5 = -1; // const/4 v5, -0x1
} // :goto_1
/* const/16 v6, 0xa */
/* .line 18 */
(( m.b.j.a ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lm/b/j/a;->a(C)Ljava/lang/String;
/* .line 19 */
v8 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
int v9 = 1; // const/4 v9, 0x1
/* sub-int/2addr v8, v9 */
v8 = (( java.lang.String ) v6 ).charAt ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C
/* const/16 v10, 0xd */
/* if-ne v8, v10, :cond_1 */
/* .line 20 */
v8 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* sub-int/2addr v8, v9 */
(( java.lang.String ) v6 ).substring ( v0, v8 ); // invoke-virtual {v6, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 21 */
} // :cond_1
v4 = java.lang.Integer .parseInt ( v6,v4 );
/* .line 22 */
(( m.b.j.a ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/j/a;->a()V
/* .line 23 */
m.b.i.o .a ( p0 );
/* aput-object v2, v6, p2 */
/* .line 24 */
m.b.i.o .b ( p0 );
/* aput v3, v6, p2 */
/* .line 25 */
m.b.i.o .c ( p0 );
/* aput v3, v6, v4 */
/* .line 26 */
m.b.i.o .d ( p0 );
/* aput-object v2, v6, v4 */
/* if-eq v5, v7, :cond_2 */
/* .line 27 */
v4 = m.b.i.p.a;
/* new-instance v6, Ljava/lang/String; */
int v7 = 2; // const/4 v7, 0x2
/* new-array v8, v7, [I */
/* aput v3, v8, v0 */
/* aput v5, v8, v9 */
/* invoke-direct {v6, v8, v0, v7}, Ljava/lang/String;-><init>([III)V */
(( java.util.HashMap ) v4 ).put ( v2, v6 ); // invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_2
/* add-int/lit8 p2, p2, 0x1 */
/* goto/16 :goto_0 */
} // :cond_3
return;
/* .line 28 */
/* :catch_0 */
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Error reading resource "; // const-string v0, "Error reading resource "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 29 */
} // :cond_4
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Could not read resource "; // const-string v1, "Could not read resource "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".Make sure you copy resources for "; // const-string p1, ".Make sure you copy resources for "
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = m.b.i.o.h;
p0 = (( m.b.i.o ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
