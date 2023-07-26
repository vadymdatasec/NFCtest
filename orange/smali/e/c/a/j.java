public class e.c.a.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.c.a.e a;
	 public Boolean b;
	 /* # direct methods */
	 public e.c.a.j ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Le/c/a/j;->b:Z */
		 /* .line 4 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static Integer a ( java.util.List p0, Integer p1, e.c.a.f1 p2 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Le/c/a/d1;", */
		 /* ">;I", */
		 /* "Le/c/a/f1;", */
		 /* ")I" */
		 /* } */
	 } // .end annotation
	 int v0 = -1; // const/4 v0, -0x1
	 /* if-gez p1, :cond_0 */
	 /* .line 76 */
} // :cond_0
p1 = this.b;
/* if-eq p0, p1, :cond_1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
/* .line 77 */
v1 = } // :goto_0
/* if-nez v1, :cond_2 */
} // :cond_2
/* check-cast v1, Le/c/a/h1; */
/* if-ne v1, p2, :cond_3 */
} // :cond_3
/* add-int/lit8 p0, p0, 0x1 */
} // .end method
public static void a ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 0 */
/* .line 10 */
java.lang.String .format ( p0,p1 );
final String p1 = "AndroidSVG CSSParser"; // const-string p1, "AndroidSVG CSSParser"
android.util.Log .w ( p1,p0 );
return;
} // .end method
public static Boolean a ( Object p0, Integer p1, java.util.List p2, Integer p3 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/h;", */
/* "I", */
/* "Ljava/util/List<", */
/* "Le/c/a/d1;", */
/* ">;I)Z" */
/* } */
} // .end annotation
/* .line 66 */
(( e.c.a.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/h;->a(I)Le/c/a/i;
/* .line 67 */
/* check-cast v1, Le/c/a/f1; */
/* .line 68 */
v2 = e.c.a.j .a ( v0,p2,p3,v1 );
int v3 = 0; // const/4 v3, 0x0
/* if-nez v2, :cond_0 */
/* .line 69 */
} // :cond_0
v0 = this.a;
v2 = e.c.a.d.b;
int v4 = 1; // const/4 v4, 0x1
/* if-ne v0, v2, :cond_3 */
/* if-nez p1, :cond_1 */
} // :cond_1
/* if-gtz p3, :cond_2 */
} // :cond_2
/* add-int/lit8 v0, p1, -0x1 */
/* add-int/lit8 p3, p3, -0x1 */
/* .line 70 */
v0 = e.c.a.j .a ( p0,v0,p2,p3 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 71 */
} // :cond_3
v2 = e.c.a.d.c;
/* if-ne v0, v2, :cond_4 */
/* sub-int/2addr p1, v4 */
/* sub-int/2addr p3, v4 */
/* .line 72 */
p0 = e.c.a.j .a ( p0,p1,p2,p3 );
/* .line 73 */
} // :cond_4
v0 = e.c.a.j .a ( p2,p3,v1 );
/* if-gtz v0, :cond_5 */
/* .line 74 */
} // :cond_5
v1 = this.b;
/* sub-int/2addr v0, v4 */
/* check-cast v0, Le/c/a/f1; */
/* sub-int/2addr p1, v4 */
/* .line 75 */
p0 = e.c.a.j .a ( p0,p1,p2,p3,v0 );
} // .end method
public static Boolean a ( Object p0, Integer p1, java.util.List p2, Integer p3, e.c.a.f1 p4 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/h;", */
/* "I", */
/* "Ljava/util/List<", */
/* "Le/c/a/d1;", */
/* ">;I", */
/* "Le/c/a/f1;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 57 */
(( e.c.a.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/h;->a(I)Le/c/a/i;
/* .line 58 */
v1 = e.c.a.j .a ( v0,p2,p3,p4 );
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 59 */
} // :cond_0
v0 = this.a;
v1 = e.c.a.d.b;
int v3 = 1; // const/4 v3, 0x1
/* if-ne v0, v1, :cond_4 */
/* if-nez p1, :cond_1 */
} // :cond_1
} // :goto_0
/* if-gez p3, :cond_2 */
} // :cond_2
/* add-int/lit8 p4, p1, -0x1 */
/* .line 60 */
p4 = e.c.a.j .a ( p0,p4,p2,p3 );
if ( p4 != null) { // if-eqz p4, :cond_3
} // :cond_3
/* add-int/lit8 p3, p3, -0x1 */
/* .line 61 */
} // :cond_4
v1 = e.c.a.d.c;
/* if-ne v0, v1, :cond_5 */
/* sub-int/2addr p1, v3 */
/* .line 62 */
p0 = e.c.a.j .a ( p0,p1,p2,p3 );
/* .line 63 */
} // :cond_5
v0 = e.c.a.j .a ( p2,p3,p4 );
/* if-gtz v0, :cond_6 */
/* .line 64 */
} // :cond_6
p4 = this.b;
/* sub-int/2addr v0, v3 */
/* check-cast p4, Le/c/a/f1; */
/* sub-int/2addr p1, v3 */
/* .line 65 */
p0 = e.c.a.j .a ( p0,p1,p2,p3,p4 );
} // .end method
public static Boolean a ( Object p0, e.c.a.f1 p1 ) {
/* .locals 5 */
/* .line 49 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 50 */
v1 = this.b;
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
v1 = /* .line 51 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v1, v3 */
/* .line 52 */
v4 = (( e.c.a.h ) p0 ).e ( ); // invoke-virtual {p0}, Le/c/a/h;->e()I
/* if-ne v4, v3, :cond_0 */
/* .line 53 */
(( e.c.a.h ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/c/a/h;->a(I)Le/c/a/i;
p0 = e.c.a.j .a ( p0,v0,v1,p1 );
/* .line 54 */
} // :cond_0
v2 = (( e.c.a.h ) p0 ).e ( ); // invoke-virtual {p0}, Le/c/a/h;->e()I
/* sub-int/2addr v2, v3 */
p0 = e.c.a.j .a ( p0,v2,v0,v1,p1 );
/* .line 55 */
} // :cond_1
/* .line 56 */
/* check-cast v1, Le/c/a/h1; */
v1 = this.b;
} // .end method
public static Boolean a ( Object p0, java.util.List p1, Integer p2, e.c.a.f1 p3 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/i;", */
/* "Ljava/util/List<", */
/* "Le/c/a/d1;", */
/* ">;I", */
/* "Le/c/a/f1;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 78 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
final String v2 = "G"; // const-string v2, "G"
/* .line 79 */
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
/* instance-of v0, p3, Le/c/a/y; */
/* if-nez v0, :cond_1 */
/* .line 81 */
} // :cond_0
v0 = this.b;
(( java.lang.Object ) p3 ).getClass ( ); // invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
v3 = java.util.Locale.US;
(( java.lang.String ) v2 ).toLowerCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 82 */
} // :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 83 */
v2 = } // :cond_2
/* if-nez v2, :cond_3 */
} // :cond_3
/* check-cast v2, Le/c/a/a; */
/* .line 84 */
v3 = this.a;
final String v4 = "id"; // const-string v4, "id"
/* if-ne v3, v4, :cond_4 */
/* .line 85 */
v2 = this.c;
v3 = this.c;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_2 */
} // :cond_4
final String v4 = "class"; // const-string v4, "class"
/* if-ne v3, v4, :cond_6 */
/* .line 86 */
v3 = this.g;
/* if-nez v3, :cond_5 */
/* .line 87 */
} // :cond_5
v2 = v2 = this.c;
/* if-nez v2, :cond_2 */
} // :cond_6
/* .line 88 */
} // :cond_7
} // :goto_0
p0 = this.d;
if ( p0 != null) { // if-eqz p0, :cond_b
/* .line 89 */
v0 = } // :cond_8
/* if-nez v0, :cond_9 */
} // :cond_9
/* check-cast v0, Ljava/lang/String; */
final String v2 = "first-child"; // const-string v2, "first-child"
/* .line 90 */
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 91 */
v0 = e.c.a.j .a ( p1,p2,p3 );
if ( v0 != null) { // if-eqz v0, :cond_8
} // :cond_a
} // :cond_b
} // :goto_1
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean a ( java.lang.String p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Le/c/a/c; */
/* invoke-direct {v0, p0}, Le/c/a/c;-><init>(Ljava/lang/String;)V */
/* .line 5 */
(( e.c.a.o2 ) v0 ).q ( ); // invoke-virtual {v0}, Le/c/a/o2;->q()V
/* .line 6 */
e.c.a.j .e ( v0 );
/* .line 7 */
v0 = (( e.c.a.o2 ) v0 ).c ( ); // invoke-virtual {v0}, Le/c/a/o2;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
p0 = e.c.a.j .a ( p0,p1 );
/* .line 9 */
} // :cond_0
/* new-instance p0, Lorg/xml/sax/SAXException; */
final String p1 = "Invalid @media type list"; // const-string p1, "Invalid @media type list"
/* invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean a ( java.util.List p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/c/a/e;", */
/* ">;", */
/* "Le/c/a/e;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 11 */
v0 = } // :cond_0
/* if-nez v0, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
/* check-cast v0, Le/c/a/e; */
/* .line 12 */
v1 = e.c.a.e.b;
/* if-eq v0, v1, :cond_2 */
/* if-ne v0, p1, :cond_0 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static java.util.List b ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 17 */
/* new-instance v0, Le/c/a/c; */
/* invoke-direct {v0, p0}, Le/c/a/c;-><init>(Ljava/lang/String;)V */
int v1 = 0; // const/4 v1, 0x0
/* .line 18 */
} // :goto_0
v2 = (( e.c.a.o2 ) v0 ).c ( ); // invoke-virtual {v0}, Le/c/a/o2;->c()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 19 */
} // :cond_0
(( e.c.a.c ) v0 ).s ( ); // invoke-virtual {v0}, Le/c/a/c;->s()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_2
/* if-nez v1, :cond_1 */
/* .line 20 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 21 */
} // :cond_1
/* .line 22 */
(( e.c.a.o2 ) v0 ).q ( ); // invoke-virtual {v0}, Le/c/a/o2;->q()V
/* .line 23 */
} // :cond_2
/* new-instance v0, Lorg/xml/sax/SAXException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Invalid value for \"class\" attribute: "; // const-string v2, "Invalid value for \"class\" attribute: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.util.List e ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/c;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/c/a/e;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
} // :cond_0
v1 = (( e.c.a.o2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/o2;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
/* const/16 v1, 0x2c */
/* .line 3 */
(( e.c.a.o2 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/c/a/o2;->b(C)Ljava/lang/String;
/* .line 4 */
try { // :try_start_0
e.c.a.e .valueOf ( v1 );
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 5 */
v1 = (( e.c.a.o2 ) p0 ).p ( ); // invoke-virtual {p0}, Le/c/a/o2;->p()Z
/* if-nez v1, :cond_0 */
} // :goto_0
/* .line 6 */
/* :catch_0 */
/* new-instance p0, Lorg/xml/sax/SAXException; */
final String v0 = "Invalid @media type list"; // const-string v0, "Invalid @media type list"
/* invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public e.c.a.g a ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/c/a/c; */
/* invoke-direct {v0, p1}, Le/c/a/c;-><init>(Ljava/lang/String;)V */
/* .line 2 */
(( e.c.a.o2 ) v0 ).q ( ); // invoke-virtual {v0}, Le/c/a/o2;->q()V
/* .line 3 */
(( e.c.a.j ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;
} // .end method
public final e.c.a.y0 a ( Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 31 */
/* new-instance v0, Le/c/a/y0; */
/* invoke-direct {v0}, Le/c/a/y0;-><init>()V */
/* .line 32 */
} // :goto_0
(( e.c.a.c ) p1 ).s ( ); // invoke-virtual {p1}, Le/c/a/c;->s()Ljava/lang/String;
/* .line 33 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
/* const/16 v2, 0x3a */
/* .line 34 */
v2 = (( e.c.a.o2 ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/c/a/o2;->a(C)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 35 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
/* .line 36 */
(( e.c.a.c ) p1 ).t ( ); // invoke-virtual {p1}, Le/c/a/c;->t()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 37 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
/* const/16 v3, 0x21 */
/* .line 38 */
v3 = (( e.c.a.o2 ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/c/a/o2;->a(C)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 39 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
final String v3 = "important"; // const-string v3, "important"
/* .line 40 */
v3 = (( e.c.a.o2 ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/c/a/o2;->a(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 41 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
/* .line 42 */
} // :cond_0
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String v0 = "Malformed rule set in <style> element: found unexpected \'!\'"; // const-string v0, "Malformed rule set in <style> element: found unexpected \'!\'"
/* invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
} // :goto_1
/* const/16 v3, 0x3b */
/* .line 43 */
(( e.c.a.o2 ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/c/a/o2;->a(C)Z
/* .line 44 */
e.c.a.p2 .a ( v0,v1,v2 );
/* .line 45 */
(( e.c.a.o2 ) p1 ).q ( ); // invoke-virtual {p1}, Le/c/a/o2;->q()V
/* const/16 v1, 0x7d */
/* .line 46 */
v1 = (( e.c.a.o2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/c/a/o2;->a(C)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 47 */
} // :cond_2
v1 = (( e.c.a.o2 ) p1 ).c ( ); // invoke-virtual {p1}, Le/c/a/o2;->c()Z
/* if-nez v1, :cond_3 */
/* .line 48 */
} // :cond_3
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String v0 = "Malformed rule set in <style> element"; // const-string v0, "Malformed rule set in <style> element"
/* invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 13 */
(( e.c.a.c ) p2 ).s ( ); // invoke-virtual {p2}, Le/c/a/c;->s()Ljava/lang/String;
/* .line 14 */
(( e.c.a.o2 ) p2 ).q ( ); // invoke-virtual {p2}, Le/c/a/o2;->q()V
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 15 */
/* iget-boolean v1, p0, Le/c/a/j;->b:Z */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-nez v1, :cond_3 */
final String v1 = "media"; // const-string v1, "media"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 16 */
e.c.a.j .e ( p2 );
/* const/16 v1, 0x7b */
/* .line 17 */
v1 = (( e.c.a.o2 ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/c/a/o2;->a(C)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 18 */
(( e.c.a.o2 ) p2 ).q ( ); // invoke-virtual {p2}, Le/c/a/o2;->q()V
/* .line 19 */
v1 = this.a;
v0 = e.c.a.j .a ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 20 */
/* iput-boolean v3, p0, Le/c/a/j;->b:Z */
/* .line 21 */
(( e.c.a.j ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;
(( e.c.a.g ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/c/a/g;->a(Le/c/a/g;)V
/* .line 22 */
/* iput-boolean v2, p0, Le/c/a/j;->b:Z */
/* .line 23 */
} // :cond_0
(( e.c.a.j ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;
} // :goto_0
/* const/16 p1, 0x7d */
/* .line 24 */
p1 = (( e.c.a.o2 ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/c/a/o2;->a(C)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 25 */
} // :cond_1
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String p2 = "Invalid @media rule: expected \'}\' at end of rule set"; // const-string p2, "Invalid @media rule: expected \'}\' at end of rule set"
/* invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 26 */
} // :cond_2
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String p2 = "Invalid @media rule: missing rule set"; // const-string p2, "Invalid @media rule: missing rule set"
/* invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_3
/* new-array p1, v3, [Ljava/lang/Object; */
/* aput-object v0, p1, v2 */
final String v0 = "Ignoring @%s rule"; // const-string v0, "Ignoring @%s rule"
/* .line 27 */
e.c.a.j .a ( v0,p1 );
/* .line 28 */
(( e.c.a.j ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Le/c/a/j;->d(Le/c/a/c;)V
/* .line 29 */
} // :goto_1
(( e.c.a.o2 ) p2 ).q ( ); // invoke-virtual {p2}, Le/c/a/o2;->q()V
return;
/* .line 30 */
} // :cond_4
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String p2 = "Invalid \'@\' rule in <style> element"; // const-string p2, "Invalid \'@\' rule in <style> element"
/* invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final e.c.a.g b ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/c/a/g; */
/* invoke-direct {v0}, Le/c/a/g;-><init>()V */
/* .line 2 */
} // :goto_0
v1 = (( e.c.a.o2 ) p1 ).c ( ); // invoke-virtual {p1}, Le/c/a/o2;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
final String v1 = "<!--"; // const-string v1, "<!--"
/* .line 3 */
v1 = (( e.c.a.o2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/c/a/o2;->a(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
final String v1 = "-->"; // const-string v1, "-->"
/* .line 4 */
v1 = (( e.c.a.o2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/c/a/o2;->a(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
/* const/16 v1, 0x40 */
/* .line 5 */
v1 = (( e.c.a.o2 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/c/a/o2;->a(C)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 6 */
(( e.c.a.j ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/j;->a(Le/c/a/g;Le/c/a/c;)V
/* .line 7 */
} // :cond_3
v1 = (( e.c.a.j ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/j;->b(Le/c/a/g;Le/c/a/c;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
} // :cond_4
} // :goto_1
} // .end method
public final Boolean b ( Object p0, Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 8 */
(( e.c.a.j ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/c/a/j;->c(Le/c/a/c;)Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_2
v1 = /* .line 9 */
/* if-nez v1, :cond_2 */
/* const/16 v1, 0x7b */
/* .line 10 */
v1 = (( e.c.a.o2 ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/c/a/o2;->a(C)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 11 */
(( e.c.a.o2 ) p2 ).q ( ); // invoke-virtual {p2}, Le/c/a/o2;->q()V
/* .line 12 */
(( e.c.a.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/c/a/j;->a(Le/c/a/c;)Le/c/a/y0;
/* .line 13 */
(( e.c.a.o2 ) p2 ).q ( ); // invoke-virtual {p2}, Le/c/a/o2;->q()V
/* .line 14 */
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* check-cast v0, Le/c/a/h; */
/* .line 15 */
/* new-instance v2, Le/c/a/f; */
/* invoke-direct {v2, v0, v1}, Le/c/a/f;-><init>(Le/c/a/h;Le/c/a/y0;)V */
(( e.c.a.g ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/c/a/g;->a(Le/c/a/f;)V
/* .line 16 */
} // :cond_1
/* new-instance p1, Lorg/xml/sax/SAXException; */
final String p2 = "Malformed rule block in <style> element: missing \'{\'"; // const-string p2, "Malformed rule block in <style> element: missing \'{\'"
/* invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.util.List c ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/c;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/c/a/h;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.c.a.o2 ) p1 ).c ( ); // invoke-virtual {p1}, Le/c/a/o2;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 3 */
/* new-instance v1, Le/c/a/h; */
/* invoke-direct {v1}, Le/c/a/h;-><init>()V */
/* .line 4 */
} // :goto_0
v2 = (( e.c.a.o2 ) p1 ).c ( ); // invoke-virtual {p1}, Le/c/a/o2;->c()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
} // :cond_1
v2 = (( e.c.a.c ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/c/a/c;->a(Le/c/a/h;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 6 */
v2 = (( e.c.a.o2 ) p1 ).p ( ); // invoke-virtual {p1}, Le/c/a/o2;->p()Z
/* if-nez v2, :cond_2 */
/* .line 7 */
} // :cond_2
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 8 */
/* new-instance v1, Le/c/a/h; */
/* invoke-direct {v1}, Le/c/a/h;-><init>()V */
/* .line 9 */
} // :cond_3
} // :goto_1
p1 = (( e.c.a.h ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/h;->d()Z
/* if-nez p1, :cond_4 */
/* .line 10 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_4
} // .end method
public final void d ( Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :cond_0
} // :goto_0
v1 = (( e.c.a.o2 ) p1 ).c ( ); // invoke-virtual {p1}, Le/c/a/o2;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_1
return;
/* .line 2 */
} // :cond_1
(( e.c.a.o2 ) p1 ).e ( ); // invoke-virtual {p1}, Le/c/a/o2;->e()Ljava/lang/Integer;
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* const/16 v2, 0x3b */
/* if-ne v1, v2, :cond_2 */
/* if-nez v0, :cond_2 */
return;
} // :cond_2
/* const/16 v2, 0x7b */
/* if-ne v1, v2, :cond_3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* const/16 v2, 0x7d */
/* if-ne v1, v2, :cond_0 */
/* if-lez v0, :cond_0 */
/* add-int/lit8 v0, v0, -0x1 */
/* if-nez v0, :cond_0 */
return;
} // .end method
