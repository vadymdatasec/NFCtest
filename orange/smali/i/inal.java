public class inal implements java.lang.Comparable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Comparable<", */
	 /* "Li/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final i.b f;
/* # instance fields */
public final Integer b;
public final Integer c;
public final Integer d;
public final Integer e;
/* # direct methods */
public static inal ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Li/a; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1}, Li/a;-><init>(Li/h/c/g;)V */
	 /* .line 1 */
	 i.c .a ( );
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* iput p1, p0, Li/b;->c:I */
	 /* iput p2, p0, Li/b;->d:I */
	 /* iput p3, p0, Li/b;->e:I */
	 /* .line 2 */
	 p1 = 	 (( i.b ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Li/b;->a(III)I
	 /* iput p1, p0, Li/b;->b:I */
	 return;
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 2 */
	 /* if-gez p1, :cond_0 */
} // :cond_0
/* const/16 v0, 0xff */
/* if-lt v0, p1, :cond_3 */
/* if-gez p2, :cond_1 */
} // :cond_1
/* if-lt v0, p2, :cond_3 */
/* if-gez p3, :cond_2 */
} // :cond_2
/* if-lt v0, p3, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* shl-int/lit8 p1, p1, 0x10 */
/* shl-int/lit8 p2, p2, 0x8 */
/* add-int/2addr p1, p2 */
/* add-int/2addr p1, p3 */
/* .line 1 */
} // :cond_4
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Version components are out of range: "; // const-string v1, "Version components are out of range: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 p1, 0x2e */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 2 */
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public Integer a ( Object p0 ) {
/* .locals 1 */
final String v0 = "other"; // const-string v0, "other"
i.h.c.k .c ( p1,v0 );
/* .line 3 */
/* iget v0, p0, Li/b;->b:I */
/* iget p1, p1, Li/b;->b:I */
/* sub-int/2addr v0, p1 */
} // .end method
public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Li/b; */
p1 = (( i.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Li/b;->a(Li/b;)I
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Li/b; */
/* if-nez v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
/* check-cast p1, Li/b; */
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 2 */
/* iget v2, p0, Li/b;->b:I */
/* iget p1, p1, Li/b;->b:I */
/* if-ne v2, p1, :cond_2 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_3
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Li/b;->b:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Li/b;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v1, 0x2e */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* iget v2, p0, Li/b;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* iget v1, p0, Li/b;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
