public abstract class c.h.n.f0 {
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
public final Integer a;
public final java.lang.Class b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer c;
/* # direct methods */
public c.h.n.f0 ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/lang/Class<", */
/* "TT;>;I)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, p2, v0, p3}, Lc/h/n/f0;-><init>(ILjava/lang/Class;II)V */
return;
} // .end method
public c.h.n.f0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/lang/Class<", */
/* "TT;>;II)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* iput p1, p0, Lc/h/n/f0;->a:I */
/* .line 4 */
this.b = p2;
/* .line 5 */
/* iput p4, p0, Lc/h/n/f0;->c:I */
return;
} // .end method
/* # virtual methods */
public abstract java.lang.Object a ( android.view.View p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* ")TT;" */
/* } */
} // .end annotation
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Object b ( android.view.View p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( c.h.n.f0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/n/f0;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.h.n.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/f0;->a(Landroid/view/View;)Ljava/lang/Object;
/* .line 3 */
} // :cond_0
v0 = (( c.h.n.f0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/f0;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* iget v0, p0, Lc/h/n/f0;->a:I */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* .line 5 */
v0 = this.b;
v0 = (( java.lang.Class ) v0 ).isInstance ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean b ( ) {
/* .locals 2 */
/* .line 6 */
/* iget v1, p0, Lc/h/n/f0;->c:I */
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
