public class fr.mbs.binary.Octets implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lfr/mbs/binary/Octets$TooBigForConversionException; */
	 /* } */
} // .end annotation
/* # static fields */
public static final org.apache.log4j.Logger c;
/* # instance fields */
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lg/a/a/a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static fr.mbs.binary.Octets ( ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lfr/mbs/binary/Octets; */
org.apache.log4j.Logger .getLogger ( v0 );
return;
} // .end method
public fr.mbs.binary.Octets ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
return;
} // .end method
public fr.mbs.binary.Octets ( ) {
/* .locals 0 */
/* .line 5 */
/* invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V */
/* .line 6 */
(( fr.mbs.binary.Octets ) p0 ).put ( p1 ); // invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
return;
} // .end method
public fr.mbs.binary.Octets ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V */
/* .line 4 */
(( fr.mbs.binary.Octets ) p0 ).put ( p1 ); // invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put([B)Lfr/mbs/binary/Octets;
return;
} // .end method
public static fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 4 */
/* .line 12 */
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
v1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* if-gt v0, v1, :cond_1 */
/* .line 13 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 14 */
} // :goto_0
v2 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* if-ge v1, v2, :cond_0 */
/* .line 15 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
v2 = (( g.a.a.a ) v2 ).a ( ); // invoke-virtual {v2}, Lg/a/a/a;->a()B
/* .line 16 */
(( fr.mbs.binary.Octets ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
v3 = (( g.a.a.a ) v3 ).a ( ); // invoke-virtual {v3}, Lg/a/a/a;->a()B
/* and-int/2addr v2, v3 */
/* int-to-byte v2, v2 */
/* .line 17 */
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* .line 18 */
} // :cond_1
/* new-instance v0, Lfr/mbs/binary/OctetInvalidSizeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid AND mask size, expected "; // const-string v2, "Invalid AND mask size, expected "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = " but get "; // const-string p0, " but get "
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Lfr/mbs/binary/OctetInvalidSizeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.lang.String a ( java.lang.String p0, Integer p1 ) {
/* .locals 8 */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* int-to-float v0, v0 */
/* int-to-float v1, p1 */
/* div-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .ceil ( v0,v1 );
/* move-result-wide v0 */
/* double-to-int v0, v0 */
/* .line 2 */
/* new-array v1, v0, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_1 */
/* .line 3 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, p1, :cond_0 */
/* mul-int v6, v3, p1 */
/* add-int/2addr v6, v5 */
/* .line 4 */
v7 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v6, v7, :cond_0 */
/* .line 5 */
v6 = (( java.lang.String ) p0 ).charAt ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v5, v5, 0x1 */
/* .line 6 */
} // :cond_0
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput-object v4, v1, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
} // .end method
public static fr.mbs.binary.Octets b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
v1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* if-gt v0, v1, :cond_1 */
/* .line 2 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* if-ge v1, v2, :cond_0 */
/* .line 4 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
/* .line 5 */
(( fr.mbs.binary.Octets ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
/* .line 6 */
v2 = (( g.a.a.a ) v2 ).a ( ); // invoke-virtual {v2}, Lg/a/a/a;->a()B
v3 = (( g.a.a.a ) v3 ).a ( ); // invoke-virtual {v3}, Lg/a/a/a;->a()B
/* xor-int/2addr v2, v3 */
/* int-to-byte v2, v2 */
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* .line 7 */
} // :cond_1
/* new-instance v0, Lfr/mbs/binary/OctetInvalidSizeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid XOR mask size, expected "; // const-string v2, "Invalid XOR mask size, expected "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = " but get "; // const-string p0, " but get "
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Lfr/mbs/binary/OctetInvalidSizeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static fr.mbs.binary.Octets createFromBase64 ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
com.google.common.io.BaseEncoding .b ( );
(( com.google.common.io.BaseEncoding ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;
(( com.google.common.io.BaseEncoding ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/google/common/io/BaseEncoding;->a(Ljava/lang/CharSequence;)[B
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static fr.mbs.binary.Octets createFromBase64Url ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
com.google.common.io.BaseEncoding .c ( );
(( com.google.common.io.BaseEncoding ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;
(( com.google.common.io.BaseEncoding ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/google/common/io/BaseEncoding;->a(Ljava/lang/CharSequence;)[B
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( Object p0 ) {
/* .locals 1 */
/* .line 10 */
java.lang.Byte .valueOf ( p0 );
int v0 = 1; // const/4 v0, 0x1
fr.mbs.binary.Octets .createOctets ( v0,p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( Integer p0 ) {
/* .locals 1 */
/* .line 12 */
java.lang.Integer .valueOf ( p0 );
int v0 = 4; // const/4 v0, 0x4
fr.mbs.binary.Octets .createOctets ( v0,p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( Integer p0, java.lang.Number p1 ) {
/* .locals 2 */
/* .line 14 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "%0"; // const-string v1, "%0"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* mul-int/lit8 p0, p0, 0x2 */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = "X"; // const-string p0, "X"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, v0, v1 */
java.lang.String .format ( p0,v0 );
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( Long p0 ) {
/* .locals 0 */
/* .line 13 */
java.lang.Long .valueOf ( p0,p1 );
/* const/16 p1, 0x8 */
fr.mbs.binary.Octets .createOctets ( p1,p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>(Lfr/mbs/binary/Octets;)V */
} // .end method
public static fr.mbs.binary.Octets createOctets ( Object p0 ) {
/* .locals 1 */
/* .line 15 */
fr.mbs.binary.Octets .empty ( );
(( fr.mbs.binary.Octets ) v0 ).put ( p0 ); // invoke-virtual {v0, p0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
} // .end method
public static fr.mbs.binary.Octets createOctets ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = ":"; // const-string v0, ":"
/* .line 2 */
fr.mbs.binary.Octets .createOctets ( p0,v0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 3 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
/* .line 4 */
v1 = (( java.lang.String ) p0 ).contains ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
(( java.lang.String ) p0 ).split ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
} // :cond_0
int p1 = 2; // const/4 p1, 0x2
/* .line 6 */
fr.mbs.binary.Octets .a ( p0,p1 );
/* .line 7 */
} // :goto_0
/* array-length p1, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, p1, :cond_1 */
/* aget-object v2, p0, v1 */
/* .line 8 */
g.a.a.a .a ( v2 );
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public static fr.mbs.binary.Octets createOctets ( java.math.BigInteger p0 ) {
/* .locals 1 */
/* .line 16 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
(( java.math.BigInteger ) p0 ).toByteArray ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B
/* invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>([B)V */
} // .end method
public static fr.mbs.binary.Octets createOctets ( Object p0 ) {
/* .locals 1 */
/* .line 11 */
java.lang.Short .valueOf ( p0 );
int v0 = 2; // const/4 v0, 0x2
fr.mbs.binary.Octets .createOctets ( v0,p0 );
} // .end method
public static fr.mbs.binary.Octets createOctets ( Object[] p0 ) {
/* .locals 1 */
/* .line 9 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>([B)V */
} // .end method
public static fr.mbs.binary.Octets createWithASCII8BString ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
/* .line 1 */
java.nio.charset.Charset .forName ( v0 );
(( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static fr.mbs.binary.Octets createWithUtf8String ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* .line 1 */
java.nio.charset.Charset .forName ( v0 );
(( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static fr.mbs.binary.Octets empty ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
} // .end method
public static java.util.List fromBytes ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "[B>;)", */
/* "Ljava/util/List<", */
/* "Lfr/mbs/binary/Octets;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, [B */
/* .line 3 */
fr.mbs.binary.Octets .createOctets ( v1 );
} // :cond_0
} // .end method
public static fr.mbs.binary.Octets join ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lfr/mbs/binary/Octets;", */
/* ">;)", */
/* "Lfr/mbs/binary/Octets;" */
/* } */
} // .end annotation
/* .line 1 */
fr.mbs.binary.Octets .empty ( );
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lfr/mbs/binary/Octets; */
/* .line 3 */
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // :cond_0
} // .end method
public static fr.mbs.binary.Octets random ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-array p0, p0, [B */
/* .line 2 */
/* new-instance v0, Ljava/security/SecureRandom; */
/* invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V */
(( java.security.SecureRandom ) v0 ).nextBytes ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V
/* .line 3 */
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static java.util.List toBytes ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lfr/mbs/binary/Octets;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "[B>;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lfr/mbs/binary/Octets; */
/* .line 3 */
(( fr.mbs.binary.Octets ) v1 ).toBytes ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B
} // :cond_0
} // .end method
public static java.util.List toHexa ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lfr/mbs/binary/Octets;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.b.k .a ( );
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lfr/mbs/binary/Octets; */
/* .line 3 */
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :cond_0
} // .end method
/* # virtual methods */
public final Long a ( Long p0 ) {
/* .locals 3 */
/* .line 7 */
(( fr.mbs.binary.Octets ) p0 ).toBigInteger ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBigInteger()Ljava/math/BigInteger;
/* .line 8 */
java.math.BigInteger .valueOf ( p1,p2 );
/* const-wide/16 v1, 0x2 */
java.math.BigInteger .valueOf ( v1,v2 );
(( java.math.BigInteger ) p1 ).multiply ( p2 ); // invoke-virtual {p1, p2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;
/* const-wide/16 v1, 0x1 */
java.math.BigInteger .valueOf ( v1,v2 );
(( java.math.BigInteger ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;
/* .line 9 */
p2 = (( java.math.BigInteger ) v0 ).compareTo ( p1 ); // invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I
/* if-gtz p2, :cond_0 */
/* .line 10 */
(( java.math.BigInteger ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J
/* move-result-wide p1 */
/* return-wide p1 */
/* .line 11 */
} // :cond_0
/* new-instance p2, Lfr/mbs/binary/Octets$TooBigForConversionException; */
/* invoke-direct {p2, p1, v0}, Lfr/mbs/binary/Octets$TooBigForConversionException;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V */
/* throw p2 */
} // .end method
public fr.mbs.binary.Octets and ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
fr.mbs.binary.Octets .a ( p0,p1 );
} // .end method
public fr.mbs.binary.Octets cycleTosize ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
fr.mbs.binary.Octets .createOctets ( p0 );
/* .line 2 */
v1 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
/* if-ge v1, p1, :cond_1 */
/* .line 3 */
v1 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
} // :goto_0
/* sub-int/2addr p1, v1 */
/* .line 4 */
v1 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* if-le p1, v1, :cond_0 */
/* .line 5 */
(( fr.mbs.binary.Octets ) v0 ).put ( p0 ); // invoke-virtual {v0, p0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 6 */
v1 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // :cond_1
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
/* instance-of v0, p1, Lfr/mbs/binary/Octets; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( fr.mbs.binary.Octets ) p0 ).toString ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public fr.mbs.binary.Octets get ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
/* move v1, p1 */
} // :goto_0
/* add-int v2, p1, p2 */
/* if-ge v1, v2, :cond_0 */
/* .line 3 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public g.a.a.a get ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* check-cast p1, Lg/a/a/a; */
} // .end method
public java.util.List getAll ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lg/a/a/a;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
} // .end method
public g.a.a.a getFirst ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
public fr.mbs.binary.Octets getLast ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = v0 = this.b;
/* sub-int/2addr v0, p1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
public g.a.a.a getLast ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
/* add-int/lit8 v0, v0, -0x1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
public fr.mbs.binary.Octets getLastFrom ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
/* sub-int/2addr v0, p1 */
(( fr.mbs.binary.Octets ) p0 ).get ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
public java.lang.String getSerializedFormat ( ) {
/* .locals 1 */
/* .annotation runtime Ljavax/xml/bind/annotation/XmlValue; */
} // .end annotation
final String v0 = ""; // const-string v0, ""
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).toString ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).toString ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
} // .end method
public fr.mbs.binary.Octets padLeft ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
} // :goto_0
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* if-ge v0, p1, :cond_0 */
/* .line 2 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
v2 = g.a.a.a.e;
} // :cond_0
} // .end method
public fr.mbs.binary.Octets padRight ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
} // :goto_0
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* if-ge v0, p1, :cond_0 */
/* .line 2 */
v0 = g.a.a.a.e;
(( fr.mbs.binary.Octets ) p0 ).put ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
} // :cond_0
} // .end method
public fr.mbs.binary.Octets padWith ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, p1, :cond_0 */
/* .line 1 */
/* new-instance v1, Lg/a/a/a; */
/* invoke-direct {v1}, Lg/a/a/a;-><init>()V */
(( fr.mbs.binary.Octets ) p0 ).put ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
} // .end method
public fr.mbs.binary.Octets pop ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lfr/mbs/exception/LengthTooLongException; */
/* } */
} // .end annotation
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).popWithoutException ( p1 ); // invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->popWithoutException(I)Lfr/mbs/binary/Octets;
/* .line 2 */
v1 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
/* if-gt p1, v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance p1, Lfr/mbs/exception/LengthTooLongException; */
/* invoke-direct {p1}, Lfr/mbs/exception/LengthTooLongException;-><init>()V */
/* throw p1 */
} // .end method
public g.a.a.a pop ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Lg/a/a/a; */
} // .end method
public fr.mbs.binary.Octets popWithoutException ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Lfr/mbs/binary/Octets; */
/* invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_0 */
/* .line 2 */
try { // :try_start_0
(( fr.mbs.binary.Octets ) p0 ).pop ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->pop()Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
/* :try_end_0 */
/* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 3 */
/* :catch_0 */
v1 = fr.mbs.binary.Octets.c;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "pop "; // const-string v3, "pop "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = "octets on "; // const-string p1, "octets on "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).info ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
} // :cond_0
} // .end method
public fr.mbs.binary.Octets put ( Object p0 ) {
/* .locals 1 */
/* .line 6 */
/* new-instance v0, Lg/a/a/a; */
/* invoke-direct {v0, p1}, Lg/a/a/a;-><init>(B)V */
(( fr.mbs.binary.Octets ) p0 ).put ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
} // .end method
public fr.mbs.binary.Octets put ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = this.b;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lg/a/a/a; */
/* .line 3 */
/* new-instance v1, Lg/a/a/a; */
/* invoke-direct {v1, v0}, Lg/a/a/a;-><init>(Lg/a/a/a;)V */
(( fr.mbs.binary.Octets ) p0 ).put ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
} // :cond_0
} // .end method
public fr.mbs.binary.Octets put ( Object p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
v0 = this.b;
} // :cond_0
} // .end method
public fr.mbs.binary.Octets put ( Object[] p0 ) {
/* .locals 3 */
/* .line 4 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget-byte v2, p1, v1 */
/* .line 5 */
(( fr.mbs.binary.Octets ) p0 ).put ( v2 ); // invoke-virtual {p0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public fr.mbs.binary.Octets reverse ( ) {
/* .locals 5 */
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).toBytes ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B
/* .line 2 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* array-length v3, v0 */
/* div-int/lit8 v3, v3, 0x2 */
/* if-ge v2, v3, :cond_0 */
/* .line 3 */
/* aget-byte v3, v0, v2 */
/* .line 4 */
/* aget-byte v4, v0, v1 */
/* aput-byte v4, v0, v2 */
/* .line 5 */
/* aput-byte v3, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 6 */
} // :cond_0
fr.mbs.binary.Octets .createOctets ( v0 );
} // .end method
public void set ( Integer p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
return;
} // .end method
public void setSerializedFormat ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
fr.mbs.binary.Octets .createOctets ( p1 );
(( fr.mbs.binary.Octets ) p0 ).put ( p1 ); // invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
} // .end method
public java.lang.String toAsciiString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/String; */
(( fr.mbs.binary.Octets ) p0 ).toBytes ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B
final String v2 = "US-ASCII"; // const-string v2, "US-ASCII"
java.nio.charset.Charset .forName ( v2 );
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public java.lang.String toBase64 ( ) {
/* .locals 2 */
/* .line 1 */
com.google.common.io.BaseEncoding .b ( );
(( com.google.common.io.BaseEncoding ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;
(( fr.mbs.binary.Octets ) p0 ).toBytes ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B
(( com.google.common.io.BaseEncoding ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/common/io/BaseEncoding;->a([B)Ljava/lang/String;
} // .end method
public java.lang.String toBase64Url ( ) {
/* .locals 2 */
/* .line 1 */
com.google.common.io.BaseEncoding .c ( );
(( com.google.common.io.BaseEncoding ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;
(( fr.mbs.binary.Octets ) p0 ).toBytes ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B
(( com.google.common.io.BaseEncoding ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/common/io/BaseEncoding;->a([B)Ljava/lang/String;
} // .end method
public java.math.BigInteger toBigInteger ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/math/BigInteger; */
final String v1 = ""; // const-string v1, ""
(( fr.mbs.binary.Octets ) p0 ).toString ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;
/* const/16 v2, 0x10 */
/* invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V */
} // .end method
public java.lang.String toBitsString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 2 */
v1 = this.b;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Lg/a/a/a; */
/* .line 3 */
(( g.a.a.a ) v2 ).toBitsString ( ); // invoke-virtual {v2}, Lg/a/a/a;->toBitsString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4 */
} // :cond_0
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public toBytes ( ) {
/* .locals 4 */
/* .line 4 */
v0 = v0 = this.b;
/* new-array v1, v0, [B */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* .line 5 */
v3 = this.b;
/* check-cast v3, Lg/a/a/a; */
v3 = (( g.a.a.a ) v3 ).a ( ); // invoke-virtual {v3}, Lg/a/a/a;->a()B
/* aput-byte v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
public java.lang.String toHexa ( ) {
/* .locals 1 */
final String v0 = ""; // const-string v0, ""
/* .line 4 */
(( fr.mbs.binary.Octets ) p0 ).toString ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Integer toInt ( ) {
/* .locals 2 */
/* const-wide/32 v0, 0x7fffffff */
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J
/* move-result-wide v0 */
/* long-to-int v1, v0 */
} // .end method
public Long toLong ( ) {
/* .locals 2 */
/* const-wide v0, 0x7fffffffffffffffL */
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public Object toShort ( ) {
/* .locals 2 */
/* const-wide/16 v0, 0x7fff */
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J
/* move-result-wide v0 */
/* long-to-int v1, v0 */
/* int-to-short v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
final String v0 = ":"; // const-string v0, ":"
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).toString ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String toString ( java.lang.String p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
final String p1 = ""; // const-string p1, ""
/* .line 2 */
} // :cond_0
e.f.b.a.f .a ( p1 );
v0 = this.b;
(( e.f.b.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/b/a/f;->a(Ljava/lang/Iterable;)Ljava/lang/String;
} // .end method
public fr.mbs.binary.Octets unpadRight ( ) {
/* .locals 3 */
/* .line 1 */
v0 = g.a.a.a.e;
/* .line 2 */
v1 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* add-int/lit8 v1, v1, -0x1 */
/* .line 3 */
} // :goto_0
(( fr.mbs.binary.Octets ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
v2 = (( g.a.a.a ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Lg/a/a/a;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
public fr.mbs.binary.Octets valueOrNull ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
(( fr.mbs.binary.Octets ) p0 ).popWithoutException ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->popWithoutException(I)Lfr/mbs/binary/Octets;
} // :goto_0
} // .end method
public fr.mbs.binary.Octets xor ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
fr.mbs.binary.Octets .b ( p0,p1 );
} // .end method
