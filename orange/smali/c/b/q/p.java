public class c.b.q.p extends android.widget.CheckedTextView {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c;
	 /* # instance fields */
	 public final c.b.q.u0 b;
	 /* # direct methods */
	 public static c.b.q.p ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x1010108 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public c.b.q.p ( ) {
		 /* .locals 1 */
		 /* const v0, 0x10103c8 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.p ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/u0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
		 /* .line 5 */
		 p1 = this.b;
		 (( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
		 /* .line 6 */
		 (( android.widget.CheckedTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/CheckedTextView;->getContext()Landroid/content/Context;
		 v0 = c.b.q.p.c;
		 int v1 = 0; // const/4 v1, 0x0
		 c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
		 /* .line 7 */
		 (( c.b.q.k2 ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 (( android.widget.CheckedTextView ) p0 ).setCheckMarkDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 8 */
		 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V */
		 /* .line 2 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( c.b.q.u0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/u0;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
		 c.b.q.u .a ( v0,p1,p0 );
	 } // .end method
	 public void setCheckMarkDrawable ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.widget.CheckedTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/CheckedTextView;->getContext()Landroid/content/Context;
		 c.b.l.a.b .c ( v0,p1 );
		 (( android.widget.CheckedTextView ) p0 ).setCheckMarkDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 c.h.o.p .a ( p0,p1 );
		 /* .line 2 */
		 /* invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
		 return;
	 } // .end method
	 public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V */
		 /* .line 2 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;I)V
		 } // :cond_0
		 return;
	 } // .end method
