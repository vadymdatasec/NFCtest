public abstract class i.l.p extends i.l.n {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Integer a ( java.lang.CharSequence p0 ) {
		 /* .locals 1 */
		 final String v0 = "$this$lastIndex"; // const-string v0, "$this$lastIndex"
		 i.h.c.k .c ( p0,v0 );
		 p0 = 		 /* .line 2 */
		 /* add-int/lit8 p0, p0, -0x1 */
	 } // .end method
	 public static final Integer a ( java.lang.CharSequence p0, Object p1, Integer p2, Boolean p3 ) {
		 /* .locals 2 */
		 final String v0 = "$this$lastIndexOf"; // const-string v0, "$this$lastIndexOf"
		 i.h.c.k .c ( p0,v0 );
		 /* if-nez p3, :cond_1 */
		 /* .line 29 */
		 /* instance-of v0, p0, Ljava/lang/String; */
		 /* if-nez v0, :cond_0 */
		 /* .line 30 */
	 } // :cond_0
	 /* check-cast p0, Ljava/lang/String; */
	 p0 = 	 (( java.lang.String ) p0 ).lastIndexOf ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->lastIndexOf(II)I
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [C */
int v1 = 0; // const/4 v1, 0x0
/* aput-char p1, v0, v1 */
/* .line 31 */
p0 = i.l.p .a ( p0,v0,p2,p3 );
} // :goto_1
} // .end method
public static Integer a ( java.lang.CharSequence p0, Object p1, Integer p2, Boolean p3, Integer p4, java.lang.Object p5 ) { //synthethic
/* .locals 0 */
/* and-int/lit8 p5, p4, 0x2 */
if ( p5 != null) { // if-eqz p5, :cond_0
/* .line 28 */
p2 = i.l.p .a ( p0 );
} // :cond_0
/* and-int/lit8 p4, p4, 0x4 */
if ( p4 != null) { // if-eqz p4, :cond_1
int p3 = 0; // const/4 p3, 0x0
} // :cond_1
p0 = i.l.p .a ( p0,p1,p2,p3 );
} // .end method
public static final Integer a ( java.lang.CharSequence p0, java.lang.CharSequence p1, Integer p2, Integer p3, Boolean p4, Boolean p5 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p5, :cond_0 */
/* .line 17 */
p2 = i.i.g .a ( p2,v0 );
v0 = /* new-instance p5, Li/i/e; */
p3 = i.i.g .b ( p3,v0 );
/* invoke-direct {p5, p2, p3}, Li/i/e;-><init>(II)V */
/* .line 18 */
} // :cond_0
p5 = i.l.p .a ( p0 );
p2 = i.i.g .b ( p2,p5 );
p3 = i.i.g .a ( p3,v0 );
i.i.g .c ( p2,p3 );
/* .line 19 */
} // :goto_0
/* instance-of p2, p0, Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_3
/* instance-of p2, p1, Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 20 */
p2 = (( i.i.b ) p5 ).a ( ); // invoke-virtual {p5}, Li/i/b;->a()I
p3 = (( i.i.b ) p5 ).b ( ); // invoke-virtual {p5}, Li/i/b;->b()I
p5 = (( i.i.b ) p5 ).c ( ); // invoke-virtual {p5}, Li/i/b;->c()I
/* if-ltz p5, :cond_1 */
/* if-gt p2, p3, :cond_6 */
} // :cond_1
/* if-lt p2, p3, :cond_6 */
/* .line 21 */
} // :goto_1
/* move-object v0, p1 */
/* check-cast v0, Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* move-object v2, p0 */
v4 = /* check-cast v2, Ljava/lang/String; */
/* move v3, p2 */
/* move v5, p4 */
v0 = /* invoke-static/range {v0 ..v5}, Li/l/n;->a(Ljava/lang/String;ILjava/lang/String;IIZ)Z */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
/* if-eq p2, p3, :cond_6 */
/* add-int/2addr p2, p5 */
/* .line 22 */
} // :cond_3
p2 = (( i.i.b ) p5 ).a ( ); // invoke-virtual {p5}, Li/i/b;->a()I
p3 = (( i.i.b ) p5 ).b ( ); // invoke-virtual {p5}, Li/i/b;->b()I
p5 = (( i.i.b ) p5 ).c ( ); // invoke-virtual {p5}, Li/i/b;->c()I
/* if-ltz p5, :cond_4 */
/* if-gt p2, p3, :cond_6 */
} // :cond_4
/* if-lt p2, p3, :cond_6 */
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
v4 = /* .line 23 */
/* move-object v0, p1 */
/* move-object v2, p0 */
/* move v3, p2 */
/* move v5, p4 */
v0 = /* invoke-static/range {v0 ..v5}, Li/l/p;->a(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z */
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
/* if-eq p2, p3, :cond_6 */
/* add-int/2addr p2, p5 */
} // :cond_6
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Integer a ( java.lang.CharSequence p0, java.lang.CharSequence p1, Integer p2, Integer p3, Boolean p4, Boolean p5, Integer p6, java.lang.Object p7 ) { //synthethic
/* .locals 6 */
/* and-int/lit8 p6, p6, 0x10 */
if ( p6 != null) { // if-eqz p6, :cond_0
int p5 = 0; // const/4 p5, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :cond_0
/* move v5, p5 */
} // :goto_0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* .line 16 */
p0 = /* invoke-static/range {v0 ..v5}, Li/l/p;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I */
} // .end method
public static final Integer a ( java.lang.CharSequence p0, java.lang.String p1, Integer p2, Boolean p3 ) {
/* .locals 8 */
final String v0 = "$this$indexOf"; // const-string v0, "$this$indexOf"
i.h.c.k .c ( p0,v0 );
final String v0 = "string"; // const-string v0, "string"
i.h.c.k .c ( p1,v0 );
/* if-nez p3, :cond_1 */
/* .line 25 */
/* instance-of v0, p0, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 26 */
} // :cond_0
/* check-cast p0, Ljava/lang/String; */
p0 = (( java.lang.String ) p0 ).indexOf ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* .line 27 */
} // :cond_1
v3 = } // :goto_0
int v5 = 0; // const/4 v5, 0x0
/* const/16 v6, 0x10 */
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v4, p3 */
p0 = /* invoke-static/range {v0 ..v7}, Li/l/p;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZILjava/lang/Object;)I */
} // :goto_1
} // .end method
public static Integer a ( java.lang.CharSequence p0, java.lang.String p1, Integer p2, Boolean p3, Integer p4, java.lang.Object p5 ) { //synthethic
/* .locals 1 */
/* and-int/lit8 p5, p4, 0x2 */
int v0 = 0; // const/4 v0, 0x0
if ( p5 != null) { // if-eqz p5, :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
/* and-int/lit8 p4, p4, 0x4 */
if ( p4 != null) { // if-eqz p4, :cond_1
int p3 = 0; // const/4 p3, 0x0
/* .line 24 */
} // :cond_1
p0 = i.l.p .a ( p0,p1,p2,p3 );
} // .end method
public static final Integer a ( java.lang.CharSequence p0, Object[] p1, Integer p2, Boolean p3 ) {
/* .locals 6 */
final String v0 = "$this$lastIndexOfAny"; // const-string v0, "$this$lastIndexOfAny"
i.h.c.k .c ( p0,v0 );
final String v0 = "chars"; // const-string v0, "chars"
i.h.c.k .c ( p1,v0 );
int v0 = 1; // const/4 v0, 0x1
/* if-nez p3, :cond_0 */
/* .line 9 */
/* array-length v1, p1 */
/* if-ne v1, v0, :cond_0 */
/* instance-of v1, p0, Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 10 */
p1 = i.f.d .a ( p1 );
/* .line 11 */
/* check-cast p0, Ljava/lang/String; */
p0 = (( java.lang.String ) p0 ).lastIndexOf ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->lastIndexOf(II)I
/* .line 12 */
} // :cond_0
v1 = i.l.p .a ( p0 );
p2 = i.i.g .b ( p2,v1 );
} // :goto_0
/* if-ltz p2, :cond_4 */
v1 = /* .line 13 */
/* .line 14 */
/* array-length v2, p1 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* if-ge v4, v2, :cond_2 */
/* aget-char v5, p1, v4 */
/* .line 15 */
v5 = i.l.b .a ( v5,v1,p3 );
if ( v5 != null) { // if-eqz v5, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_2
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_3
} // :cond_3
/* add-int/lit8 p2, p2, -0x1 */
} // :cond_4
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static final i.d a ( java.lang.CharSequence p0, java.util.Collection p1, Integer p2, Boolean p3, Boolean p4 ) { //synthethic
/* .locals 0 */
/* .line 1 */
i.l.p .b ( p0,p1,p2,p3,p4 );
} // .end method
public static final i.k.a a ( java.lang.CharSequence p0, java.lang.String[] p1, Integer p2, Boolean p3, Integer p4 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/CharSequence;", */
/* "[", */
/* "Ljava/lang/String;", */
/* "IZI)", */
/* "Li/k/a<", */
/* "Li/i/e;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 33 */
i.l.p .a ( p4 );
/* .line 34 */
i.f.c .a ( p1 );
/* .line 35 */
/* new-instance v0, Li/l/e; */
/* new-instance v1, Li/l/o; */
/* invoke-direct {v1, p1, p3}, Li/l/o;-><init>(Ljava/util/List;Z)V */
/* invoke-direct {v0, p0, p2, p4, v1}, Li/l/e;-><init>(Ljava/lang/CharSequence;IILi/h/b/p;)V */
} // .end method
public static i.k.a a ( java.lang.CharSequence p0, java.lang.String[] p1, Integer p2, Boolean p3, Integer p4, Integer p5, java.lang.Object p6 ) { //synthethic
/* .locals 1 */
/* and-int/lit8 p6, p5, 0x2 */
int v0 = 0; // const/4 v0, 0x0
if ( p6 != null) { // if-eqz p6, :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
/* and-int/lit8 p6, p5, 0x4 */
if ( p6 != null) { // if-eqz p6, :cond_1
int p3 = 0; // const/4 p3, 0x0
} // :cond_1
/* and-int/lit8 p5, p5, 0x8 */
if ( p5 != null) { // if-eqz p5, :cond_2
int p4 = 0; // const/4 p4, 0x0
/* .line 32 */
} // :cond_2
i.l.p .a ( p0,p1,p2,p3,p4 );
} // .end method
public static final java.lang.String a ( java.lang.CharSequence p0, Object p1 ) {
/* .locals 1 */
final String v0 = "$this$substring"; // const-string v0, "$this$substring"
i.h.c.k .c ( p0,v0 );
final String v0 = "range"; // const-string v0, "range"
i.h.c.k .c ( p1,v0 );
/* .line 3 */
(( i.i.e ) p1 ).e ( ); // invoke-virtual {p1}, Li/i/e;->e()Ljava/lang/Integer;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( i.i.e ) p1 ).d ( ); // invoke-virtual {p1}, Li/i/e;->d()Ljava/lang/Integer;
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 p1, p1, 0x1 */
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public static final java.lang.String a ( java.lang.String p0, Object p1, java.lang.String p2 ) {
/* .locals 7 */
final String v0 = "$this$substringAfterLast"; // const-string v0, "$this$substringAfterLast"
i.h.c.k .c ( p0,v0 );
final String v0 = "missingDelimiterValue"; // const-string v0, "missingDelimiterValue"
i.h.c.k .c ( p2,v0 );
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 6; // const/4 v5, 0x6
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* .line 5 */
p1 = /* invoke-static/range {v1 ..v6}, Li/l/p;->a(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
/* .line 6 */
p2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
(( java.lang.String ) p0 ).substring ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String p0 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"; // const-string p0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
i.h.c.k .b ( p2,p0 );
} // :goto_0
} // .end method
public static java.lang.String a ( java.lang.String p0, Object p1, java.lang.String p2, Integer p3, java.lang.Object p4 ) { //synthethic
/* .locals 0 */
/* and-int/lit8 p3, p3, 0x2 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* move-object p2, p0 */
/* .line 4 */
} // :cond_0
i.l.p .a ( p0,p1,p2 );
} // .end method
public static final java.util.List a ( java.lang.CharSequence p0, java.lang.String p1, Boolean p2, Integer p3 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/CharSequence;", */
/* "Ljava/lang/String;", */
/* "ZI)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 47 */
i.l.p .a ( p3 );
int v0 = 0; // const/4 v0, 0x0
/* .line 48 */
v1 = i.l.p .a ( p0,p1,v0,p2 );
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_5 */
int v3 = 1; // const/4 v3, 0x1
/* if-ne p3, v3, :cond_0 */
} // :cond_0
/* if-lez p3, :cond_1 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 49 */
} // :goto_0
/* new-instance v5, Ljava/util/ArrayList; */
/* const/16 v6, 0xa */
if ( v4 != null) { // if-eqz v4, :cond_2
v6 = i.i.g .b ( p3,v6 );
} // :cond_2
/* invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 50 */
} // :cond_3
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.util.ArrayList ) v5 ).add ( v0 ); // invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 51 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 52 */
v1 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v6, p3, -0x1 */
/* if-ne v1, v6, :cond_4 */
/* .line 53 */
} // :cond_4
v1 = i.l.p .a ( p0,p1,v0,p2 );
/* if-ne v1, v2, :cond_3 */
/* .line 54 */
p1 = } // :goto_1
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.util.ArrayList ) v5 ).add ( p0 ); // invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 55 */
} // :cond_5
} // :goto_2
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
i.f.f .a ( p0 );
} // .end method
public static final java.util.List a ( java.lang.CharSequence p0, java.lang.String[] p1, Boolean p2, Integer p3 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/CharSequence;", */
/* "[", */
/* "Ljava/lang/String;", */
/* "ZI)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "$this$split"; // const-string v0, "$this$split"
i.h.c.k .c ( p0,v0 );
final String v0 = "delimiters"; // const-string v0, "delimiters"
i.h.c.k .c ( p1,v0 );
/* .line 38 */
/* array-length v0, p1 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 39 */
/* aget-object v2, p1, v0 */
v3 = /* .line 40 */
/* if-nez v3, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 41 */
i.l.p .a ( p0,v2,p2,p3 );
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
int v5 = 2; // const/4 v5, 0x2
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* .line 42 */
/* invoke-static/range {v0 ..v6}, Li/l/p;->a(Ljava/lang/CharSequence;[Ljava/lang/String;IZIILjava/lang/Object;)Li/k/a; */
i.k.g .a ( p1 );
/* .line 43 */
/* new-instance p2, Ljava/util/ArrayList; */
/* const/16 p3, 0xa */
p3 = i.f.h .a ( p1,p3 );
/* invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 44 */
p3 = } // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 45 */
/* check-cast p3, Li/i/e; */
/* .line 46 */
i.l.p .a ( p0,p3 );
} // :cond_2
} // .end method
public static java.util.List a ( java.lang.CharSequence p0, java.lang.String[] p1, Boolean p2, Integer p3, Integer p4, java.lang.Object p5 ) { //synthethic
/* .locals 1 */
/* and-int/lit8 p5, p4, 0x2 */
int v0 = 0; // const/4 v0, 0x0
if ( p5 != null) { // if-eqz p5, :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
/* and-int/lit8 p4, p4, 0x4 */
if ( p4 != null) { // if-eqz p4, :cond_1
int p3 = 0; // const/4 p3, 0x0
/* .line 37 */
} // :cond_1
i.l.p .a ( p0,p1,p2,p3 );
} // .end method
public static final void a ( Integer p0 ) {
/* .locals 2 */
/* if-ltz p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 36 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Limit must be non-negative, but was "; // const-string v1, "Limit must be non-negative, but was "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static final Boolean a ( java.lang.CharSequence p0, Integer p1, java.lang.CharSequence p2, Integer p3, Integer p4, Boolean p5 ) {
/* .locals 4 */
final String v0 = "$this$regionMatchesImpl"; // const-string v0, "$this$regionMatchesImpl"
i.h.c.k .c ( p0,v0 );
final String v0 = "other"; // const-string v0, "other"
i.h.c.k .c ( p2,v0 );
int v0 = 0; // const/4 v0, 0x0
/* if-ltz p3, :cond_3 */
/* if-ltz p1, :cond_3 */
v1 = /* .line 7 */
/* sub-int/2addr v1, p4 */
v1 = /* if-gt p1, v1, :cond_3 */
/* sub-int/2addr v1, p4 */
/* if-le p3, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p4, :cond_2 */
/* add-int v2, p1, v1 */
v2 = /* .line 8 */
v3 = /* add-int v3, p3, v1 */
v2 = i.l.b .a ( v2,v3,p5 );
/* if-nez v2, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // :cond_3
} // :goto_1
} // .end method
public static final Integer b ( java.lang.CharSequence p0, java.lang.String p1, Integer p2, Boolean p3 ) {
/* .locals 6 */
final String v0 = "$this$lastIndexOf"; // const-string v0, "$this$lastIndexOf"
i.h.c.k .c ( p0,v0 );
final String v0 = "string"; // const-string v0, "string"
i.h.c.k .c ( p1,v0 );
/* if-nez p3, :cond_1 */
/* .line 16 */
/* instance-of v0, p0, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 17 */
} // :cond_0
/* check-cast p0, Ljava/lang/String; */
p0 = (( java.lang.String ) p0 ).lastIndexOf ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I
} // :cond_1
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
int v5 = 1; // const/4 v5, 0x1
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v4, p3 */
/* .line 18 */
p0 = /* invoke-static/range {v0 ..v5}, Li/l/p;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I */
} // :goto_1
} // .end method
public static Integer b ( java.lang.CharSequence p0, java.lang.String p1, Integer p2, Boolean p3, Integer p4, java.lang.Object p5 ) { //synthethic
/* .locals 0 */
/* and-int/lit8 p5, p4, 0x2 */
if ( p5 != null) { // if-eqz p5, :cond_0
/* .line 15 */
p2 = i.l.p .a ( p0 );
} // :cond_0
/* and-int/lit8 p4, p4, 0x4 */
if ( p4 != null) { // if-eqz p4, :cond_1
int p3 = 0; // const/4 p3, 0x0
} // :cond_1
p0 = i.l.p .b ( p0,p1,p2,p3 );
} // .end method
public static final i.d b ( java.lang.CharSequence p0, java.util.Collection p1, Integer p2, Boolean p3, Boolean p4 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/CharSequence;", */
/* "Ljava/util/Collection<", */
/* "Ljava/lang/String;", */
/* ">;IZZ)", */
/* "Li/d<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* if-nez p3, :cond_2 */
v1 = /* .line 1 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_2 */
/* .line 2 */
i.f.o .a ( p1 );
/* check-cast p1, Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
int v5 = 4; // const/4 v5, 0x4
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* if-nez p4, :cond_0 */
/* .line 3 */
p0 = /* invoke-static/range {v1 ..v6}, Li/l/p;->a(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I */
} // :cond_0
p0 = /* invoke-static/range {v1 ..v6}, Li/l/p;->b(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I */
} // :goto_0
/* if-gez p0, :cond_1 */
/* .line 4 */
} // :cond_1
java.lang.Integer .valueOf ( p0 );
i.e .a ( p0,p1 );
} // :goto_1
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* if-nez p4, :cond_3 */
/* .line 5 */
p2 = i.i.g .a ( p2,v1 );
v1 = /* new-instance p4, Li/i/e; */
/* invoke-direct {p4, p2, v1}, Li/i/e;-><init>(II)V */
} // :cond_3
p4 = i.l.p .a ( p0 );
p2 = i.i.g .b ( p2,p4 );
i.i.g .c ( p2,v1 );
/* .line 6 */
} // :goto_2
/* instance-of p2, p0, Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 7 */
p2 = (( i.i.b ) p4 ).a ( ); // invoke-virtual {p4}, Li/i/b;->a()I
v1 = (( i.i.b ) p4 ).b ( ); // invoke-virtual {p4}, Li/i/b;->b()I
p4 = (( i.i.b ) p4 ).c ( ); // invoke-virtual {p4}, Li/i/b;->c()I
/* if-ltz p4, :cond_4 */
/* if-gt p2, v1, :cond_d */
} // :cond_4
/* if-lt p2, v1, :cond_d */
/* .line 8 */
} // :goto_3
v2 = } // :cond_5
if ( v2 != null) { // if-eqz v2, :cond_6
/* move-object v2, v9 */
/* check-cast v2, Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
/* move-object v4, p0 */
/* check-cast v4, Ljava/lang/String; */
v6 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* move v5, p2 */
/* move v7, p3 */
v2 = /* invoke-static/range {v2 ..v7}, Li/l/n;->a(Ljava/lang/String;ILjava/lang/String;IIZ)Z */
if ( v2 != null) { // if-eqz v2, :cond_5
} // :cond_6
/* move-object v9, v0 */
} // :goto_4
/* check-cast v9, Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_7
/* .line 10 */
java.lang.Integer .valueOf ( p2 );
i.e .a ( p0,v9 );
} // :cond_7
/* if-eq p2, v1, :cond_d */
/* add-int/2addr p2, p4 */
/* .line 11 */
} // :cond_8
p2 = (( i.i.b ) p4 ).a ( ); // invoke-virtual {p4}, Li/i/b;->a()I
v1 = (( i.i.b ) p4 ).b ( ); // invoke-virtual {p4}, Li/i/b;->b()I
p4 = (( i.i.b ) p4 ).c ( ); // invoke-virtual {p4}, Li/i/b;->c()I
/* if-ltz p4, :cond_9 */
/* if-gt p2, v1, :cond_d */
} // :cond_9
/* if-lt p2, v1, :cond_d */
/* .line 12 */
} // :goto_5
v2 = } // :cond_a
if ( v2 != null) { // if-eqz v2, :cond_b
/* move-object v2, v9 */
/* check-cast v2, Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* .line 13 */
v6 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* move-object v4, p0 */
/* move v5, p2 */
/* move v7, p3 */
v2 = /* invoke-static/range {v2 ..v7}, Li/l/p;->a(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z */
if ( v2 != null) { // if-eqz v2, :cond_a
} // :cond_b
/* move-object v9, v0 */
} // :goto_6
/* check-cast v9, Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_c
/* .line 14 */
java.lang.Integer .valueOf ( p2 );
i.e .a ( p0,v9 );
} // :cond_c
/* if-eq p2, v1, :cond_d */
/* add-int/2addr p2, p4 */
} // :cond_d
} // .end method
