public class e.f.d.e0.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "-TT;>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.reflect.Type b;
public final Integer c;
/* # direct methods */
public e.f.d.e0.a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.f.d.d0.a .a ( p1 );
/* check-cast p1, Ljava/lang/reflect/Type; */
e.f.d.d0.e .c ( p1 );
this.b = p1;
/* .line 3 */
e.f.d.d0.e .f ( p1 );
this.a = p1;
/* .line 4 */
p1 = this.b;
p1 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
/* iput p1, p0, Le/f/d/e0/a;->c:I */
return;
} // .end method
public static e.f.d.e0.a a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;)", */
/* "Le/f/d/e0/a<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 3 */
/* new-instance v0, Le/f/d/e0/a; */
/* invoke-direct {v0, p0}, Le/f/d/e0/a;-><init>(Ljava/lang/reflect/Type;)V */
} // .end method
public static e.f.d.e0.a a ( java.lang.reflect.Type p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* ")", */
/* "Le/f/d/e0/a<", */
/* "*>;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Le/f/d/e0/a; */
/* invoke-direct {v0, p0}, Le/f/d/e0/a;-><init>(Ljava/lang/reflect/Type;)V */
} // .end method
/* # virtual methods */
public final java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "-TT;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
} // .end method
public final java.lang.reflect.Type b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/f/d/e0/a; */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
/* check-cast p1, Le/f/d/e0/a; */
p1 = this.b;
p1 = e.f.d.d0.e .a ( v0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/d/e0/a;->c:I */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
e.f.d.d0.e .i ( v0 );
} // .end method
