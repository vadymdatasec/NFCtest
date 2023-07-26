public class c.b.q.z extends android.widget.PopupWindow {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Boolean b;
	 /* # instance fields */
	 public Boolean a;
	 /* # direct methods */
	 public static c.b.q.z ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x15 */
		 /* if-ge v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
c.b.q.z.b = (v0!= 0);
return;
} // .end method
public c.b.q.z ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
/* .line 2 */
(( c.b.q.z ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lc/b/q/z;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V
return;
} // .end method
/* # virtual methods */
public final void a ( android.content.Context p0, android.util.AttributeSet p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.b.j.PopupWindow;
c.b.q.k2 .a ( p1,p2,v0,p3,p4 );
/* .line 2 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 3 */
	 int p3 = 0; // const/4 p3, 0x0
	 p2 = 	 (( c.b.q.k2 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->a(IZ)Z
	 (( c.b.q.z ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/z;->a(Z)V
	 /* .line 4 */
} // :cond_0
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.PopupWindow ) p0 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 5 */
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 6 */
/* sget-boolean v0, Lc/b/q/z;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 7 */
	 /* iput-boolean p1, p0, Lc/b/q/z;->a:Z */
	 /* .line 8 */
} // :cond_0
c.h.o.n .a ( p0,p1 );
} // :goto_0
return;
} // .end method
public void showAsDropDown ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lc/b/q/z;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lc/b/q/z;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 v0 = 	 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
	 /* sub-int/2addr p3, v0 */
	 /* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V */
return;
} // .end method
public void showAsDropDown ( android.view.View p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 4 */
/* sget-boolean v0, Lc/b/q/z;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean v0, p0, Lc/b/q/z;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 5 */
		 v0 = 		 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
		 /* sub-int/2addr p3, v0 */
		 /* .line 6 */
	 } // :cond_0
	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V */
	 return;
} // .end method
public void update ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 6 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/b/q/z;->b:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v0, p0, Lc/b/q/z;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = 			 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
			 /* sub-int/2addr p3, v0 */
		 } // :cond_0
		 /* move v3, p3 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* .line 3 */
		 /* invoke-super/range {v0 ..v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V */
		 return;
	 } // .end method
