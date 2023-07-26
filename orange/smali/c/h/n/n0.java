public abstract class c.h.n.n0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.res.ColorStateList a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 19 */
		 (( android.view.View ) p0 ).getBackgroundTintList ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;
	 } // .end method
	 public static c.h.n.u1 a ( android.view.View p0, c.h.n.u1 p1, android.graphics.Rect p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.view.View ) p0 ).computeSystemWindowInsets ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;
			 /* .line 3 */
			 c.h.n.u1 .a ( p1,p0 );
			 /* .line 4 */
		 } // :cond_0
		 (( android.graphics.Rect ) p2 ).setEmpty ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->setEmpty()V
	 } // .end method
	 public static void a ( android.view.View p0, Float p1 ) {
		 /* .locals 0 */
		 /* .line 16 */
		 (( android.view.View ) p0 ).setElevation ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, android.content.res.ColorStateList p1 ) {
		 /* .locals 0 */
		 /* .line 18 */
		 (( android.view.View ) p0 ).setBackgroundTintList ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, android.graphics.PorterDuff$Mode p1 ) {
		 /* .locals 0 */
		 /* .line 20 */
		 (( android.view.View ) p0 ).setBackgroundTintMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Object p1 ) {
		 /* .locals 2 */
		 /* .line 5 */
		 /* const/16 v1, 0x1e */
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 6 */
		 (( android.view.View ) p0 ).setTag ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
	 } // :cond_0
	 /* if-nez p1, :cond_1 */
	 /* .line 7 */
	 /* .line 8 */
	 (( android.view.View ) p0 ).getTag ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
	 /* check-cast p1, Landroid/view/View$OnApplyWindowInsetsListener; */
	 /* .line 9 */
	 (( android.view.View ) p0 ).setOnApplyWindowInsetsListener ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
	 return;
	 /* .line 10 */
} // :cond_1
/* new-instance v0, Lc/h/n/m0; */
/* invoke-direct {v0, p0, p1}, Lc/h/n/m0;-><init>(Landroid/view/View;Lc/h/n/x;)V */
(( android.view.View ) p0 ).setOnApplyWindowInsetsListener ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
return;
} // .end method
public static void a ( android.view.View p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 17 */
(( android.view.View ) p0 ).setTransitionName ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V
return;
} // .end method
public static void a ( android.view.View p0, Boolean p1 ) {
/* .locals 0 */
/* .line 21 */
(( android.view.View ) p0 ).setNestedScrollingEnabled ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setNestedScrollingEnabled(Z)V
return;
} // .end method
public static void a ( android.view.WindowInsets p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 11 */
/* .line 12 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View$OnApplyWindowInsetsListener; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 13 */
} // :cond_0
return;
} // .end method
public static Boolean a ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
/* .line 15 */
p0 = (( android.view.View ) p0 ).dispatchNestedPreFling ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/View;->dispatchNestedPreFling(FF)Z
} // .end method
public static Boolean a ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
/* .line 14 */
p0 = (( android.view.View ) p0 ).dispatchNestedFling ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->dispatchNestedFling(FFZ)Z
} // .end method
public static Boolean a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
/* .line 22 */
p0 = (( android.view.View ) p0 ).startNestedScroll ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->startNestedScroll(I)Z
} // .end method
public static Boolean a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer[] p5 ) {
/* .locals 0 */
/* .line 23 */
p0 = /* invoke-virtual/range {p0 ..p5}, Landroid/view/View;->dispatchNestedScroll(IIII[I)Z */
} // .end method
public static Boolean a ( android.view.View p0, Integer p1, Integer p2, Integer[] p3, Integer[] p4 ) {
/* .locals 0 */
/* .line 24 */
p0 = (( android.view.View ) p0 ).dispatchNestedPreScroll ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->dispatchNestedPreScroll(II[I[I)Z
} // .end method
public static android.graphics.PorterDuff$Mode b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
(( android.view.View ) p0 ).getBackgroundTintMode ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
} // .end method
public static void b ( android.view.View p0, Float p1 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p0 ).setTranslationZ ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationZ(F)V
return;
} // .end method
public static Float c ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
p0 = (( android.view.View ) p0 ).getElevation ( ); // invoke-virtual {p0}, Landroid/view/View;->getElevation()F
} // .end method
public static void c ( android.view.View p0, Float p1 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p0 ).setZ ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setZ(F)V
return;
} // .end method
public static c.h.n.u1 d ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.n.g1 .a ( p0 );
} // .end method
public static java.lang.String e ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p0 ).getTransitionName ( ); // invoke-virtual {p0}, Landroid/view/View;->getTransitionName()Ljava/lang/String;
} // .end method
public static Float f ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).getTranslationZ ( ); // invoke-virtual {p0}, Landroid/view/View;->getTranslationZ()F
} // .end method
public static Float g ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).getZ ( ); // invoke-virtual {p0}, Landroid/view/View;->getZ()F
} // .end method
public static Boolean h ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).hasNestedScrollingParent ( ); // invoke-virtual {p0}, Landroid/view/View;->hasNestedScrollingParent()Z
} // .end method
public static Boolean i ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).isImportantForAccessibility ( ); // invoke-virtual {p0}, Landroid/view/View;->isImportantForAccessibility()Z
} // .end method
public static Boolean j ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = (( android.view.View ) p0 ).isNestedScrollingEnabled ( ); // invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z
} // .end method
public static void k ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p0 ).stopNestedScroll ( ); // invoke-virtual {p0}, Landroid/view/View;->stopNestedScroll()V
return;
} // .end method
