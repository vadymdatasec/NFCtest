public class c.h.n.u0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Landroid/view/View;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public java.util.WeakHashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Landroid/view/View;", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public android.util.SparseArray b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/View;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public java.lang.ref.WeakReference c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/KeyEvent;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.h.n.u0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
return;
} // .end method
public c.h.n.u0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
this.b = v0;
/* .line 4 */
this.c = v0;
return;
} // .end method
public static c.h.n.u0 a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 4 */
/* .line 5 */
(( android.view.View ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Lc/h/n/u0; */
/* if-nez v0, :cond_0 */
/* .line 6 */
/* new-instance v0, Lc/h/n/u0; */
/* invoke-direct {v0}, Lc/h/n/u0;-><init>()V */
/* .line 7 */
(( android.view.View ) p0 ).setTag ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
} // :cond_0
} // .end method
/* # virtual methods */
public final android.util.SparseArray a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Landroid/util/SparseArray<", */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/View;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/util/SparseArray; */
/* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
this.b = v0;
/* .line 3 */
} // :cond_0
v0 = this.b;
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 5 */
/* .line 15 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-ne v0, p1, :cond_0 */
/* .line 17 */
} // :cond_0
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.c = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 18 */
(( c.h.n.u0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/u0;->a()Landroid/util/SparseArray;
/* .line 19 */
v3 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_1 */
/* .line 20 */
v3 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
v3 = (( android.util.SparseArray ) v2 ).indexOfKey ( v3 ); // invoke-virtual {v2, v3}, Landroid/util/SparseArray;->indexOfKey(I)I
/* if-ltz v3, :cond_1 */
/* .line 21 */
(( android.util.SparseArray ) v2 ).valueAt ( v3 ); // invoke-virtual {v2, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/ref/WeakReference; */
/* .line 22 */
(( android.util.SparseArray ) v2 ).removeAt ( v3 ); // invoke-virtual {v2, v3}, Landroid/util/SparseArray;->removeAt(I)V
} // :cond_1
/* if-nez v0, :cond_2 */
/* .line 23 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
(( android.util.SparseArray ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/ref/WeakReference; */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 24 */
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 25 */
v1 = c.h.n.v0 .C ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 26 */
(( c.h.n.u0 ) p0 ).c ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/h/n/u0;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z
} // :cond_3
} // :cond_4
} // .end method
public Boolean a ( android.view.View p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .line 8 */
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_0 */
/* .line 9 */
(( c.h.n.u0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/n/u0;->b()V
/* .line 10 */
} // :cond_0
(( c.h.n.u0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/n/u0;->b(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;
/* .line 11 */
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_1 */
/* .line 12 */
p2 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 13 */
v0 = android.view.KeyEvent .isModifierKey ( p2 );
/* if-nez v0, :cond_1 */
/* .line 14 */
(( c.h.n.u0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/u0;->a()Landroid/util/SparseArray;
/* new-instance v1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
(( android.util.SparseArray ) v0 ).put ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final android.view.View b ( android.view.View p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( java.util.WeakHashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
/* move-object v0, p1 */
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 4 */
v2 = (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
/* add-int/lit8 v2, v2, -0x1 */
} // :goto_0
/* if-ltz v2, :cond_2 */
/* .line 5 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 6 */
(( c.h.n.u0 ) p0 ).b ( v3, p2 ); // invoke-virtual {p0, v3, p2}, Lc/h/n/u0;->b(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_1
/* add-int/lit8 v2, v2, -0x1 */
/* .line 7 */
} // :cond_2
p2 = (( c.h.n.u0 ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/n/u0;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z
if ( p2 != null) { // if-eqz p2, :cond_3
} // :cond_3
} // :goto_1
} // .end method
public final void b ( ) {
/* .locals 6 */
/* .line 8 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
(( java.util.WeakHashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V
/* .line 10 */
} // :cond_0
v0 = c.h.n.u0.d;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 11 */
} // :cond_1
v0 = c.h.n.u0.d;
/* monitor-enter v0 */
/* .line 12 */
try { // :try_start_0
v1 = this.a;
/* if-nez v1, :cond_2 */
/* .line 13 */
/* new-instance v1, Ljava/util/WeakHashMap; */
/* invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V */
this.a = v1;
/* .line 14 */
} // :cond_2
v1 = c.h.n.u0.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_5 */
/* .line 15 */
v2 = c.h.n.u0.d;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/ref/WeakReference; */
/* .line 16 */
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
/* if-nez v2, :cond_3 */
/* .line 17 */
v2 = c.h.n.u0.d;
(( java.util.ArrayList ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 18 */
} // :cond_3
v3 = this.a;
v4 = java.lang.Boolean.TRUE;
(( java.util.WeakHashMap ) v3 ).put ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 19 */
(( android.view.View ) v2 ).getParent ( ); // invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 20 */
} // :goto_1
/* instance-of v3, v2, Landroid/view/View; */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 21 */
v3 = this.a;
/* move-object v4, v2 */
/* check-cast v4, Landroid/view/View; */
v5 = java.lang.Boolean.TRUE;
(( java.util.WeakHashMap ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 22 */
} // :cond_4
} // :goto_2
/* add-int/lit8 v1, v1, -0x1 */
/* .line 23 */
} // :cond_5
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public final Boolean c ( android.view.View p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .line 1 */
/* .line 2 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-ltz v1, :cond_1 */
/* .line 4 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v3 = /* check-cast v3, Lc/h/n/t0; */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
