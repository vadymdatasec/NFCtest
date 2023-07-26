public abstract class e.f.b.b.h extends e.f.b.b.e implements java.util.Set {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/f/b/b/e<", */
	 /* "TE;>;", */
	 /* "Ljava/util/Set<", */
	 /* "TE;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public transient e.f.b.b.g c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.b.b.h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/b/b/e;-><init>()V */
return;
} // .end method
public static Integer a ( Integer p0 ) {
/* .locals 6 */
int v0 = 2; // const/4 v0, 0x2
/* .line 20 */
p0 = java.lang.Math .max ( p0,v0 );
int v0 = 1; // const/4 v0, 0x1
/* const v1, 0x2ccccccc */
/* if-ge p0, v1, :cond_1 */
/* add-int/lit8 v1, p0, -0x1 */
/* .line 21 */
v1 = java.lang.Integer .highestOneBit ( v1 );
/* shl-int/lit8 v0, v1, 0x1 */
} // :goto_0
/* int-to-double v1, v0 */
/* const-wide v3, 0x3fe6666666666666L # 0.7 */
/* mul-double v1, v1, v3 */
/* int-to-double v3, p0 */
/* cmpg-double v5, v1, v3 */
/* if-gez v5, :cond_0 */
/* shl-int/lit8 v0, v0, 0x1 */
} // :cond_0
} // :cond_1
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ge p0, v1, :cond_2 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
final String p0 = "collection too large"; // const-string p0, "collection too large"
/* .line 22 */
e.f.b.a.p .a ( v0,p0 );
} // .end method
public static e.f.b.b.h a ( Integer p0, java.lang.Object...p1 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(I[", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Le/f/b/b/h<", */
/* "TE;>;" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_7
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-eq p0, v1, :cond_6 */
/* .line 1 */
v2 = e.f.b.b.h .a ( p0 );
/* .line 2 */
/* new-array v6, v2, [Ljava/lang/Object; */
/* add-int/lit8 v7, v2, -0x1 */
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
int v8 = 0; // const/4 v8, 0x0
} // :goto_0
/* if-ge v3, p0, :cond_2 */
/* .line 3 */
/* aget-object v4, p1, v3 */
e.f.b.b.o0 .a ( v4,v3 );
/* .line 4 */
v9 = (( java.lang.Object ) v4 ).hashCode ( ); // invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I
/* .line 5 */
v10 = e.f.b.b.d .a ( v9 );
} // :goto_1
/* and-int v11, v10, v7 */
/* .line 6 */
/* aget-object v12, v6, v11 */
/* if-nez v12, :cond_0 */
/* add-int/lit8 v10, v8, 0x1 */
/* .line 7 */
/* aput-object v4, p1, v8 */
/* .line 8 */
/* aput-object v4, v6, v11 */
/* add-int/2addr v5, v9 */
/* move v8, v10 */
/* .line 9 */
} // :cond_0
v11 = (( java.lang.Object ) v12 ).equals ( v4 ); // invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 10 */
java.util.Arrays .fill ( p1,v8,p0,v3 );
/* if-ne v8, v1, :cond_3 */
/* .line 11 */
/* aget-object p0, p1, v0 */
java.util.Objects .requireNonNull ( p0 );
/* .line 12 */
/* new-instance p1, Le/f/b/b/t0; */
/* invoke-direct {p1, p0}, Le/f/b/b/t0;-><init>(Ljava/lang/Object;)V */
/* .line 13 */
} // :cond_3
p0 = e.f.b.b.h .a ( v8 );
/* div-int/lit8 v2, v2, 0x2 */
/* if-ge p0, v2, :cond_4 */
/* .line 14 */
e.f.b.b.h .a ( v8,p1 );
/* .line 15 */
} // :cond_4
/* array-length p0, p1 */
p0 = e.f.b.b.h .a ( v8,p0 );
if ( p0 != null) { // if-eqz p0, :cond_5
java.util.Arrays .copyOf ( p1,v8 );
} // :cond_5
/* move-object v4, p1 */
/* .line 16 */
/* new-instance p0, Le/f/b/b/r0; */
/* move-object v3, p0 */
/* invoke-direct/range {v3 ..v8}, Le/f/b/b/r0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V */
/* .line 17 */
} // :cond_6
/* aget-object p0, p1, v0 */
java.util.Objects .requireNonNull ( p0 );
/* .line 18 */
e.f.b.b.h .of ( p0 );
/* .line 19 */
} // :cond_7
e.f.b.b.h .of ( );
} // .end method
public static e.f.b.b.h a ( java.lang.Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">([TE;)", */
/* "Le/f/b/b/h<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 23 */
/* array-length v0, p0 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_0 */
/* .line 24 */
/* array-length v0, p0 */
(( java.lang.Object ) p0 ).clone ( ); // invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
/* check-cast p0, [Ljava/lang/Object; */
e.f.b.b.h .a ( v0,p0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 25 */
/* aget-object p0, p0, v0 */
e.f.b.b.h .of ( p0 );
/* .line 26 */
} // :cond_1
e.f.b.b.h .of ( );
} // .end method
public static Boolean a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* shr-int/lit8 v0, p1, 0x1 */
/* shr-int/lit8 p1, p1, 0x2 */
/* add-int/2addr v0, p1 */
/* if-ge p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static e.f.b.b.h of ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">()", */
/* "Le/f/b/b/h<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.b.b.r0.j;
} // .end method
public static e.f.b.b.h of ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(TE;)", */
/* "Le/f/b/b/h<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Le/f/b/b/t0; */
/* invoke-direct {v0, p0}, Le/f/b/b/t0;-><init>(Ljava/lang/Object;)V */
} // .end method
public static e.f.b.b.h of ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(TE;TE;TE;)", */
/* "Le/f/b/b/h<", */
/* "TE;>;" */
/* } */
} // .end annotation
int v0 = 3; // const/4 v0, 0x3
/* new-array v1, v0, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
int p0 = 1; // const/4 p0, 0x1
/* aput-object p1, v1, p0 */
int p0 = 2; // const/4 p0, 0x2
/* aput-object p2, v1, p0 */
/* .line 3 */
e.f.b.b.h .a ( v0,v1 );
} // .end method
/* # virtual methods */
public e.f.b.b.g d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( e.f.b.b.h ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/h;->e()Le/f/b/b/g;
this.c = v0;
} // :cond_0
} // .end method
public e.f.b.b.g e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.b.b.e ) p0 ).toArray ( ); // invoke-virtual {p0}, Le/f/b/b/e;->toArray()[Ljava/lang/Object;
e.f.b.b.g .a ( v0 );
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-ne p1, p0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 1 */
} // :cond_0
/* instance-of v0, p1, Le/f/b/b/h; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( e.f.b.b.h ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/h;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* move-object v0, p1 */
/* check-cast v0, Le/f/b/b/h; */
/* .line 3 */
v0 = (( e.f.b.b.h ) v0 ).f ( ); // invoke-virtual {v0}, Le/f/b/b/h;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = (( e.f.b.b.h ) p0 ).hashCode ( ); // invoke-virtual {p0}, Le/f/b/b/h;->hashCode()I
v1 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
/* if-eq v0, v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_1
p1 = e.f.b.b.s0 .a ( p0,p1 );
} // .end method
public Boolean f ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Integer hashCode ( ) {
} // .end method
