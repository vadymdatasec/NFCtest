public class c.r.d.a$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/r/d/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public java.lang.Object c;
public Integer d;
/* # direct methods */
public c.r.d.a$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput p1, p0, Lc/r/d/a$b;->a:I */
/* .line 3 */
/* iput p2, p0, Lc/r/d/a$b;->b:I */
/* .line 4 */
/* iput p3, p0, Lc/r/d/a$b;->d:I */
/* .line 5 */
this.c = p4;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/r/d/a$b;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_3 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_2 */
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_1 */
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_0 */
final String v0 = "??"; // const-string v0, "??"
} // :cond_0
final String v0 = "mv"; // const-string v0, "mv"
} // :cond_1
final String v0 = "up"; // const-string v0, "up"
} // :cond_2
final String v0 = "rm"; // const-string v0, "rm"
} // :cond_3
final String v0 = "add"; // const-string v0, "add"
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 1 */
/* const-class v2, Lc/r/d/a$b; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v2, v3, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lc/r/d/a$b; */
/* .line 3 */
/* iget v2, p0, Lc/r/d/a$b;->a:I */
/* iget v3, p1, Lc/r/d/a$b;->a:I */
/* if-eq v2, v3, :cond_2 */
} // :cond_2
/* const/16 v3, 0x8 */
/* if-ne v2, v3, :cond_3 */
/* .line 4 */
/* iget v2, p0, Lc/r/d/a$b;->d:I */
/* iget v3, p0, Lc/r/d/a$b;->b:I */
/* sub-int/2addr v2, v3 */
v2 = java.lang.Math .abs ( v2 );
/* if-ne v2, v0, :cond_3 */
/* .line 5 */
/* iget v2, p0, Lc/r/d/a$b;->d:I */
/* iget v3, p1, Lc/r/d/a$b;->b:I */
/* if-ne v2, v3, :cond_3 */
/* iget v2, p0, Lc/r/d/a$b;->b:I */
/* iget v3, p1, Lc/r/d/a$b;->d:I */
/* if-ne v2, v3, :cond_3 */
/* .line 6 */
} // :cond_3
/* iget v2, p0, Lc/r/d/a$b;->d:I */
/* iget v3, p1, Lc/r/d/a$b;->d:I */
/* if-eq v2, v3, :cond_4 */
/* .line 7 */
} // :cond_4
/* iget v2, p0, Lc/r/d/a$b;->b:I */
/* iget v3, p1, Lc/r/d/a$b;->b:I */
/* if-eq v2, v3, :cond_5 */
/* .line 8 */
} // :cond_5
v2 = this.c;
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 9 */
p1 = this.c;
p1 = (( java.lang.Object ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_7 */
/* .line 10 */
} // :cond_6
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_7
} // :cond_7
} // :cond_8
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/r/d/a$b;->a:I */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
/* iget v1, p0, Lc/r/d/a$b;->b:I */
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 3 */
/* iget v1, p0, Lc/r/d/a$b;->d:I */
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
(( c.r.d.a$b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/a$b;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",s:"; // const-string v1, ",s:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/a$b;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "c:"; // const-string v1, "c:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/r/d/a$b;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",p:"; // const-string v1, ",p:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
