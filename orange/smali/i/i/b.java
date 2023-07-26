public class i.i.b implements java.lang.Iterable implements i.h.c.q.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Iterable<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;", */
	 /* "Li/h/c/q/a;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final i.i.a e;
/* # instance fields */
public final Integer b;
public final Integer c;
public final Integer d;
/* # direct methods */
public static i.i.b ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Li/i/a; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1}, Li/i/a;-><init>(Li/h/c/g;)V */
	 return;
} // .end method
public i.i.b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 /* const/high16 v0, -0x80000000 */
		 /* if-eq p3, v0, :cond_0 */
		 /* .line 2 */
		 /* iput p1, p0, Li/i/b;->b:I */
		 /* .line 3 */
		 p1 = 		 i.g.a .b ( p1,p2,p3 );
		 /* iput p1, p0, Li/i/b;->c:I */
		 /* .line 4 */
		 /* iput p3, p0, Li/i/b;->d:I */
		 return;
		 /* .line 5 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String p2 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."; // const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
	 /* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Step must be non-zero."; // const-string p2, "Step must be non-zero."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Li/i/b;->b:I */
} // .end method
public final Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Li/i/b;->c:I */
} // .end method
public final Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Li/i/b;->d:I */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 1 */
/* instance-of v0, p1, Li/i/b; */
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = 	 (( i.i.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Li/i/b;->isEmpty()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* move-object v0, p1 */
		 /* check-cast v0, Li/i/b; */
		 v0 = 		 (( i.i.b ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Li/i/b;->isEmpty()Z
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 /* iget v0, p0, Li/i/b;->b:I */
	 /* check-cast p1, Li/i/b; */
	 /* iget v1, p1, Li/i/b;->b:I */
	 /* if-ne v0, v1, :cond_2 */
	 /* iget v0, p0, Li/i/b;->c:I */
	 /* iget v1, p1, Li/i/b;->c:I */
	 /* if-ne v0, v1, :cond_2 */
	 /* iget v0, p0, Li/i/b;->d:I */
	 /* iget p1, p1, Li/i/b;->d:I */
	 /* if-ne v0, p1, :cond_2 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( i.i.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Li/i/b;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :cond_0
/* iget v0, p0, Li/i/b;->b:I */
/* mul-int/lit8 v0, v0, 0x1f */
/* iget v1, p0, Li/i/b;->c:I */
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* iget v1, p0, Li/i/b;->d:I */
/* add-int/2addr v0, v1 */
} // :goto_0
} // .end method
public Boolean isEmpty ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Li/i/b;->d:I */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-lez v0, :cond_0 */
/* iget v0, p0, Li/i/b;->b:I */
/* iget v3, p0, Li/i/b;->c:I */
/* if-le v0, v3, :cond_1 */
} // :cond_0
/* iget v0, p0, Li/i/b;->b:I */
/* iget v3, p0, Li/i/b;->c:I */
/* if-ge v0, v3, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public i.f.t iterator ( ) {
/* .locals 4 */
/* .line 2 */
/* new-instance v0, Li/i/c; */
/* iget v1, p0, Li/i/b;->b:I */
/* iget v2, p0, Li/i/b;->c:I */
/* iget v3, p0, Li/i/b;->d:I */
/* invoke-direct {v0, v1, v2, v3}, Li/i/c;-><init>(III)V */
} // .end method
public java.util.Iterator iterator ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( i.i.b ) p0 ).iterator ( ); // invoke-virtual {p0}, Li/i/b;->iterator()Li/f/t;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Li/i/b;->d:I */
final String v1 = " step "; // const-string v1, " step "
/* if-lez v0, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v2, p0, Li/i/b;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ".."; // const-string v2, ".."
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Li/i/b;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Li/i/b;->d:I */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v2, p0, Li/i/b;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " downTo "; // const-string v2, " downTo "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Li/i/b;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Li/i/b;->d:I */
/* neg-int v1, v1 */
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
