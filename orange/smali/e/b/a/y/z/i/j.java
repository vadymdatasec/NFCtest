public class e.b.a.y.z.i.j extends e.b.a.c0.o.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/c0/o/c<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.os.Handler e;
public final Integer f;
public final Long g;
public android.graphics.Bitmap h;
/* # direct methods */
public e.b.a.y.z.i.j ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Le/b/a/c0/o/c;-><init>()V */
	 /* .line 2 */
	 this.e = p1;
	 /* .line 3 */
	 /* iput p2, p0, Le/b/a/y/z/i/j;->f:I */
	 /* .line 4 */
	 /* iput-wide p3, p0, Le/b/a/y/z/i/j;->g:J */
	 return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.Bitmap p0, Object p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* "Le/b/a/c0/p/d<", */
	 /* "-", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .line 2 */
this.h = p1;
/* .line 3 */
p1 = this.e;
int p2 = 1; // const/4 p2, 0x1
(( android.os.Handler ) p1 ).obtainMessage ( p2, p0 ); // invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
/* .line 4 */
p2 = this.e;
/* iget-wide v0, p0, Le/b/a/y/z/i/j;->g:J */
(( android.os.Handler ) p2 ).sendMessageAtTime ( p1, v0, v1 ); // invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z
return;
} // .end method
public void a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/graphics/Bitmap; */
(( e.b.a.y.z.i.j ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/j;->a(Landroid/graphics/Bitmap;Le/b/a/c0/p/d;)V
return;
} // .end method
public void c ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
this.h = p1;
return;
} // .end method
public android.graphics.Bitmap d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
