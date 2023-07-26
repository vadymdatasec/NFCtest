public abstract class c.h.n.q0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.CharSequence a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).getAccessibilityPaneTitle ( ); // invoke-virtual {p0}, Landroid/view/View;->getAccessibilityPaneTitle()Ljava/lang/CharSequence;
	 } // .end method
	 public static java.lang.Object a ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/view/View;", */
		 /* "I)TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( android.view.View ) p0 ).requireViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;
} // .end method
public static void a ( android.view.View p0, c.h.n.t0 p1 ) {
	 /* .locals 2 */
	 /* .line 5 */
	 /* .line 6 */
	 (( android.view.View ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
	 /* check-cast v0, Lc/e/i; */
	 /* if-nez v0, :cond_0 */
	 /* .line 7 */
	 /* new-instance v0, Lc/e/i; */
	 /* invoke-direct {v0}, Lc/e/i;-><init>()V */
	 /* .line 8 */
	 (( android.view.View ) p0 ).setTag ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
	 /* .line 9 */
} // :cond_0
java.util.Objects .requireNonNull ( p1 );
/* new-instance v1, Lc/h/n/b; */
/* invoke-direct {v1, p1}, Lc/h/n/b;-><init>(Lc/h/n/t0;)V */
/* .line 10 */
(( c.e.i ) v0 ).put ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 11 */
(( android.view.View ) p0 ).addOnUnhandledKeyEventListener ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->addOnUnhandledKeyEventListener(Landroid/view/View$OnUnhandledKeyEventListener;)V
return;
} // .end method
public static void a ( android.view.View p0, java.lang.CharSequence p1 ) {
/* .locals 0 */
/* .line 3 */
(( android.view.View ) p0 ).setAccessibilityPaneTitle ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public static void a ( android.view.View p0, Boolean p1 ) {
/* .locals 0 */
/* .line 4 */
(( android.view.View ) p0 ).setAccessibilityHeading ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityHeading(Z)V
return;
} // .end method
public static void b ( android.view.View p0, c.h.n.t0 p1 ) {
/* .locals 1 */
/* .line 3 */
/* .line 4 */
(( android.view.View ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Lc/e/i; */
/* if-nez v0, :cond_0 */
return;
/* .line 5 */
} // :cond_0
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/View$OnUnhandledKeyEventListener; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
(( android.view.View ) p0 ).removeOnUnhandledKeyEventListener ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->removeOnUnhandledKeyEventListener(Landroid/view/View$OnUnhandledKeyEventListener;)V
} // :cond_1
return;
} // .end method
public static void b ( android.view.View p0, Boolean p1 ) {
/* .locals 0 */
/* .line 2 */
(( android.view.View ) p0 ).setScreenReaderFocusable ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setScreenReaderFocusable(Z)V
return;
} // .end method
public static Boolean b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).isAccessibilityHeading ( ); // invoke-virtual {p0}, Landroid/view/View;->isAccessibilityHeading()Z
} // .end method
public static Boolean c ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).isScreenReaderFocusable ( ); // invoke-virtual {p0}, Landroid/view/View;->isScreenReaderFocusable()Z
} // .end method
