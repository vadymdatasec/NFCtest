public abstract class e.f.b.b.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0 ) {
		 /* .locals 4 */
		 final String v0 = "arraySize"; // const-string v0, "arraySize"
		 /* .line 6 */
		 e.f.b.b.c .a ( p0,v0 );
		 /* int-to-long v0, p0 */
		 /* const-wide/16 v2, 0x5 */
		 /* add-long/2addr v0, v2 */
		 /* .line 7 */
		 /* div-int/lit8 p0, p0, 0xa */
		 /* int-to-long v2, p0 */
		 /* add-long/2addr v0, v2 */
		 p0 = 		 e.f.b.e.c .a ( v0,v1 );
	 } // .end method
	 public static java.util.ArrayList a ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<E:", */
		 /* "Ljava/lang/Object;", */
		 /* ">()", */
		 /* "Ljava/util/ArrayList<", */
		 /* "TE;>;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
} // .end method
public static java.util.ArrayList a ( java.lang.Object...p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">([TE;)", */
	 /* "Ljava/util/ArrayList<", */
	 /* "TE;>;" */
	 /* } */
} // .end annotation
/* .annotation runtime Ljava/lang/SafeVarargs; */
} // .end annotation
/* .line 2 */
e.f.b.a.p .a ( p0 );
/* .line 3 */
/* array-length v0, p0 */
v0 = e.f.b.b.k .a ( v0 );
/* .line 4 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 5 */
java.util.Collections .addAll ( v1,p0 );
} // .end method
public static Boolean a ( java.util.List p0, java.lang.Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 8 */
e.f.b.a.p .a ( p0 );
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 9 */
} // :cond_0
/* instance-of v1, p1, Ljava/util/List; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 10 */
} // :cond_1
/* check-cast p1, Ljava/util/List; */
v1 = /* .line 11 */
v3 = /* .line 12 */
/* if-eq v1, v3, :cond_2 */
/* .line 13 */
} // :cond_2
/* instance-of v3, p0, Ljava/util/RandomAccess; */
if ( v3 != null) { // if-eqz v3, :cond_5
/* instance-of v3, p1, Ljava/util/RandomAccess; */
if ( v3 != null) { // if-eqz v3, :cond_5
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_4 */
/* .line 14 */
v4 = e.f.b.a.k .a ( v4,v5 );
/* if-nez v4, :cond_3 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
/* .line 15 */
} // :cond_5
p0 = e.f.b.b.j .a ( p0,p1 );
} // .end method
public static Integer b ( java.util.List p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")I" */
/* } */
} // .end annotation
/* .line 3 */
/* instance-of v0, p0, Ljava/util/RandomAccess; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
p0 = e.f.b.b.k .c ( p0,p1 );
/* .line 5 */
} // :cond_0
/* .line 6 */
v0 = } // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
v0 = e.f.b.a.k .a ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
p0 = /* .line 8 */
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static java.util.ArrayList b ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(I)", */
/* "Ljava/util/ArrayList<", */
/* "TE;>;" */
/* } */
} // .end annotation
final String v0 = "initialArraySize"; // const-string v0, "initialArraySize"
/* .line 1 */
e.f.b.b.c .a ( p0,v0 );
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V */
} // .end method
public static Integer c ( java.util.List p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")I" */
/* } */
} // .end annotation
v0 = /* .line 1 */
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_1 */
} // :goto_0
/* if-ge v1, v0, :cond_3 */
/* .line 2 */
/* if-nez p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // :goto_1
/* if-ge v1, v0, :cond_3 */
/* .line 3 */
v2 = (( java.lang.Object ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Integer d ( java.util.List p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")I" */
/* } */
} // .end annotation
/* .line 1 */
/* instance-of v0, p0, Ljava/util/RandomAccess; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p0 = e.f.b.b.k .e ( p0,p1 );
/* .line 3 */
v0 = } // :cond_0
/* .line 4 */
v0 = } // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
v0 = e.f.b.a.k .a ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
p0 = /* .line 6 */
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Integer e ( java.util.List p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")I" */
/* } */
} // .end annotation
/* if-nez p1, :cond_1 */
p1 = /* .line 1 */
/* add-int/lit8 p1, p1, -0x1 */
} // :goto_0
/* if-ltz p1, :cond_3 */
/* .line 2 */
/* if-nez v0, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, -0x1 */
/* .line 3 */
v0 = } // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_1
/* if-ltz v0, :cond_3 */
/* .line 4 */
v1 = (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_3
int p0 = -1; // const/4 p0, -0x1
} // .end method
