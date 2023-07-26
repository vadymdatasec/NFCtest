public abstract class c.b.k.t {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Integer b;
	 public static final c.e.d c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/d<", */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Lc/b/k/t;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.Object d;
/* # direct methods */
public static c.b.k.t ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/e/d; */
/* invoke-direct {v0}, Lc/e/d;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public c.b.k.t ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static c.b.k.t a ( android.app.Activity p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/k/n0; */
/* invoke-direct {v0, p0, p1}, Lc/b/k/n0;-><init>(Landroid/app/Activity;Lc/b/k/s;)V */
} // .end method
public static c.b.k.t a ( android.app.Dialog p0, Object p1 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Lc/b/k/n0; */
/* invoke-direct {v0, p0, p1}, Lc/b/k/n0;-><init>(Landroid/app/Dialog;Lc/b/k/s;)V */
} // .end method
public static void a ( Object p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = c.b.k.t.d;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
	 c.b.k.t .c ( p0 );
	 /* .line 5 */
	 v1 = c.b.k.t.c;
	 /* new-instance v2, Ljava/lang/ref/WeakReference; */
	 /* invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
	 (( c.e.d ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Lc/e/d;->add(Ljava/lang/Object;)Z
	 /* .line 6 */
	 /* monitor-exit v0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p0 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p0 */
} // .end method
public static void b ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = c.b.k.t.d;
	 /* monitor-enter v0 */
	 /* .line 2 */
	 try { // :try_start_0
		 c.b.k.t .c ( p0 );
		 /* .line 3 */
		 /* monitor-exit v0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p0 */
	 } // .end method
	 public static void c ( Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = c.b.k.t.d;
		 /* monitor-enter v0 */
		 /* .line 2 */
		 try { // :try_start_0
			 v1 = c.b.k.t.c;
			 (( c.e.d ) v1 ).iterator ( ); // invoke-virtual {v1}, Lc/e/d;->iterator()Ljava/util/Iterator;
			 /* .line 3 */
		 } // :cond_0
	 v2 = 	 } // :goto_0
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 /* .line 4 */
		 /* check-cast v2, Ljava/lang/ref/WeakReference; */
		 (( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
		 /* check-cast v2, Lc/b/k/t; */
		 /* if-eq v2, p0, :cond_1 */
		 /* if-nez v2, :cond_0 */
		 /* .line 5 */
	 } // :cond_1
	 /* .line 6 */
} // :cond_2
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static Integer j ( ) {
/* .locals 1 */
/* .line 1 */
} // .end method
/* # virtual methods */
public abstract Integer a ( ) {
} // .end method
public abstract android.view.View a ( Integer p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Landroid/view/View;", */
/* ">(I)TT;" */
/* } */
} // .end annotation
} // .end method
public abstract void a ( android.content.Context p0 ) {
} // .end method
public abstract void a ( android.content.res.Configuration p0 ) {
} // .end method
public abstract void a ( android.os.Bundle p0 ) {
} // .end method
public abstract void a ( android.view.View p0 ) {
} // .end method
public abstract void a ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
} // .end method
public abstract void a ( androidx.appcompat.widget.Toolbar p0 ) {
} // .end method
public abstract void a ( java.lang.CharSequence p0 ) {
} // .end method
public abstract android.view.MenuInflater b ( ) {
} // .end method
public abstract void b ( android.os.Bundle p0 ) {
} // .end method
public abstract void b ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
} // .end method
public abstract Boolean b ( Integer p0 ) {
} // .end method
public abstract c.b.k.a c ( ) {
} // .end method
public abstract void c ( Integer p0 ) {
} // .end method
public abstract void c ( android.os.Bundle p0 ) {
} // .end method
public abstract void d ( ) {
} // .end method
public abstract void d ( Integer p0 ) {
} // .end method
public abstract void e ( ) {
} // .end method
public abstract void f ( ) {
} // .end method
public abstract void g ( ) {
} // .end method
public abstract void h ( ) {
} // .end method
public abstract void i ( ) {
} // .end method
