public class c.h.n.e0 implements android.view.ViewTreeObserver$OnGlobalLayoutListener implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.WeakHashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/WeakHashMap<", */
	 /* "Landroid/view/View;", */
	 /* "Ljava/lang/Boolean;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.h.n.e0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public final void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 4 */
(( android.view.View ) p1 ).getViewTreeObserver ( ); // invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
(( android.view.ViewTreeObserver ) p1 ).addOnGlobalLayoutListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
return;
} // .end method
public final void a ( android.view.View p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-eq p2, v0, :cond_2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 p2, 0x10 */
} // :cond_1
/* const/16 p2, 0x20 */
/* .line 2 */
} // :goto_1
c.h.n.v0 .c ( p1,p2 );
/* .line 3 */
p2 = this.b;
java.lang.Boolean .valueOf ( v0 );
(( java.util.WeakHashMap ) p2 ).put ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
return;
} // .end method
public void onGlobalLayout ( ) {
/* .locals 3 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
(( java.util.WeakHashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 3 */
/* check-cast v2, Landroid/view/View; */
/* check-cast v1, Ljava/lang/Boolean; */
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
(( c.h.n.e0 ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lc/h/n/e0;->a(Landroid/view/View;Z)V
} // :cond_0
return;
} // .end method
public void onViewAttachedToWindow ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.h.n.e0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/e0;->a(Landroid/view/View;)V
return;
} // .end method
public void onViewDetachedFromWindow ( android.view.View p0 ) {
/* .locals 0 */
return;
} // .end method
