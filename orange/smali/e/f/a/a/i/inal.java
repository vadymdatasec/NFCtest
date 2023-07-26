public class inal implements e.f.a.a.j.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String c;
	 public static final java.lang.String d;
	 public static final java.lang.String e;
	 public static final java.util.Set f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/f/a/a/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final e.f.a.a.i.a g;
/* # instance fields */
public final java.lang.String a;
public final java.lang.String b;
/* # direct methods */
public static inal ( ) {
/* .locals 4 */
final String v0 = "hts/frbslgiggolai.o/0clgbthfra=snpoo"; // const-string v0, "hts/frbslgiggolai.o/0clgbthfra=snpoo"
final String v1 = "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"; // const-string v1, "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"
/* .line 1 */
e.f.a.a.i.h .a ( v0,v1 );
final String v0 = "hts/frbslgigp.ogepscmv/ieo/eaybtho"; // const-string v0, "hts/frbslgigp.ogepscmv/ieo/eaybtho"
final String v1 = "tp:/ieaeogn-agolai.o/1frlglgc/aclg"; // const-string v1, "tp:/ieaeogn-agolai.o/1frlglgc/aclg"
/* .line 2 */
e.f.a.a.i.h .a ( v0,v1 );
final String v0 = "AzSCki82AwsLzKd5O8zo"; // const-string v0, "AzSCki82AwsLzKd5O8zo"
final String v1 = "IayckHiZRO1EFl1aGoK"; // const-string v1, "IayckHiZRO1EFl1aGoK"
/* .line 3 */
e.f.a.a.i.h .a ( v0,v1 );
/* .line 4 */
/* new-instance v0, Ljava/util/HashSet; */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Le/f/a/a/b; */
final String v2 = "proto"; // const-string v2, "proto"
/* .line 5 */
e.f.a.a.b .a ( v2 );
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
final String v2 = "json"; // const-string v2, "json"
e.f.a.a.b .a ( v2 );
int v3 = 1; // const/4 v3, 0x1
/* aput-object v2, v1, v3 */
java.util.Arrays .asList ( v1 );
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 6 */
java.util.Collections .unmodifiableSet ( v0 );
/* .line 7 */
/* new-instance v0, Le/f/a/a/i/a; */
v1 = e.f.a.a.i.a.c;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Le/f/a/a/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 8 */
/* new-instance v0, Le/f/a/a/i/a; */
v1 = e.f.a.a.i.a.d;
v2 = e.f.a.a.i.a.e;
/* invoke-direct {v0, v1, v2}, Le/f/a/a/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
return;
} // .end method
public static e.f.a.a.i.a a ( Object[] p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
java.nio.charset.Charset .forName ( v1 );
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
final String p0 = "1$"; // const-string p0, "1$"
/* .line 2 */
p0 = (( java.lang.String ) v0 ).startsWith ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_3
	 int p0 = 2; // const/4 p0, 0x2
	 /* .line 3 */
	 (( java.lang.String ) v0 ).substring ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 final String v1 = "\\"; // const-string v1, "\\"
	 /* .line 4 */
	 java.util.regex.Pattern .quote ( v1 );
	 (( java.lang.String ) v0 ).split ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
	 /* .line 5 */
	 /* array-length v1, v0 */
	 /* if-ne v1, p0, :cond_2 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 6 */
	 /* aget-object p0, v0, p0 */
	 /* .line 7 */
	 v1 = 	 (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
	 /* if-nez v1, :cond_1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 8 */
	 /* aget-object v0, v0, v1 */
	 /* .line 9 */
	 /* new-instance v1, Le/f/a/a/i/a; */
	 v2 = 	 (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_0
	 /* invoke-direct {v1, p0, v0}, Le/f/a/a/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 10 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Missing endpoint in CCTDestination extras"; // const-string v0, "Missing endpoint in CCTDestination extras"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 11 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Extra is not a valid encoded LegacyFlgDestination"; // const-string v0, "Extra is not a valid encoded LegacyFlgDestination"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 12 */
} // :cond_3
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Version marker missing from extras"; // const-string v0, "Version marker missing from extras"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public a ( ) {
/* .locals 1 */
/* .line 13 */
(( e.f.a.a.i.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/i/a;->c()[B
} // .end method
public java.util.Set b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/f/a/a/b;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.a.a.i.a.f;
} // .end method
public c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "1$"; // const-string v2, "1$"
/* aput-object v2, v0, v1 */
/* .line 2 */
v1 = this.a;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
int v1 = 2; // const/4 v1, 0x2
final String v2 = "\\"; // const-string v2, "\\"
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 3 */
v2 = this.b;
/* if-nez v2, :cond_1 */
final String v2 = ""; // const-string v2, ""
} // :cond_1
/* aput-object v2, v0, v1 */
final String v1 = "%s%s%s%s"; // const-string v1, "%s%s%s%s"
/* .line 4 */
java.lang.String .format ( v1,v0 );
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* .line 5 */
java.nio.charset.Charset .forName ( v1 );
(( java.lang.String ) v0 ).getBytes ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
} // .end method
public java.lang.String d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.String e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
final String v0 = "cct"; // const-string v0, "cct"
} // .end method
