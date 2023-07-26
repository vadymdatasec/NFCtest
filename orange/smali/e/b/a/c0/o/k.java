public abstract class e.b.a.c0.o.k extends e.b.a.c0.o.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Landroid/view/View;", */
	 /* "Z:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/b/a/c0/o/a<", */
	 /* "TZ;>;" */
	 /* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # static fields */
public static Integer g;
/* # instance fields */
public final android.view.View b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.c0.o.j c;
public android.view.View$OnAttachStateChangeListener d;
public Boolean e;
public Boolean f;
/* # direct methods */
public static e.b.a.c0.o.k ( ) {
/* .locals 1 */
/* .line 1 */
return;
} // .end method
public e.b.a.c0.o.k ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Le/b/a/c0/o/a;-><init>()V */
/* .line 2 */
e.b.a.e0.r .a ( p1 );
/* move-object v0, p1 */
/* check-cast v0, Landroid/view/View; */
this.b = v0;
/* .line 3 */
/* new-instance v0, Le/b/a/c0/o/j; */
/* invoke-direct {v0, p1}, Le/b/a/c0/o/j;-><init>(Landroid/view/View;)V */
this.c = v0;
return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Le/b/a/c0/o/a;->a(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
(( e.b.a.c0.o.k ) p0 ).e ( ); // invoke-virtual {p0}, Le/b/a/c0/o/k;->e()V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 4 */
(( e.b.a.c0.o.k ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/c0/o/k;->a(Ljava/lang/Object;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.c;
(( e.b.a.c0.o.j ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/c0/o/j;->b(Le/b/a/c0/o/g;)V
return;
} // .end method
public final void a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.b;
(( android.view.View ) v0 ).setTag ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( e.b.a.c0.o.j ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/c0/o/j;->a(Le/b/a/c0/o/g;)V
return;
} // .end method
public e.b.a.c0.d c ( ) {
/* .locals 2 */
/* .line 5 */
(( e.b.a.c0.o.k ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/c0/o/k;->d()Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* instance-of v1, v0, Le/b/a/c0/d; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
/* check-cast v0, Le/b/a/c0/d; */
/* .line 8 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "You must not call setTag() on a view Glide is targeting"; // const-string v1, "You must not call setTag() on a view Glide is targeting"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void c ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Le/b/a/c0/o/a;->c(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
(( e.b.a.c0.o.j ) p1 ).b ( ); // invoke-virtual {p1}, Le/b/a/c0/o/j;->b()V
/* .line 3 */
/* iget-boolean p1, p0, Le/b/a/c0/o/k;->e:Z */
/* if-nez p1, :cond_0 */
/* .line 4 */
(( e.b.a.c0.o.k ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/c0/o/k;->f()V
} // :cond_0
return;
} // .end method
public final java.lang.Object d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( android.view.View ) v0 ).getTag ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
} // .end method
public final void e ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v1, p0, Le/b/a/c0/o/k;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
} // :cond_0
v1 = this.b;
(( android.view.View ) v1 ).addOnAttachStateChangeListener ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Le/b/a/c0/o/k;->f:Z */
} // :cond_1
} // :goto_0
return;
} // .end method
public final void f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v1, p0, Le/b/a/c0/o/k;->f:Z */
/* if-nez v1, :cond_0 */
/* .line 2 */
} // :cond_0
v1 = this.b;
(( android.view.View ) v1 ).removeOnAttachStateChangeListener ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Le/b/a/c0/o/k;->f:Z */
} // :cond_1
} // :goto_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Target for: "; // const-string v1, "Target for: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
