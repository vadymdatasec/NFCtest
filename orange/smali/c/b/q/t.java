public class c.b.q.t extends android.widget.EditText implements c.h.n.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final c.b.q.u0 c;
	 public final c.b.q.r0 d;
	 /* # direct methods */
	 public c.b.q.t ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.t ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/m; */
		 /* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
		 /* .line 5 */
		 /* new-instance p1, Lc/b/q/u0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
		 this.c = p1;
		 /* .line 6 */
		 (( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
		 /* .line 7 */
		 p1 = this.c;
		 (( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
		 /* .line 8 */
		 /* new-instance p1, Lc/b/q/r0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/r0;-><init>(Landroid/widget/TextView;)V */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V */
		 /* .line 2 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( c.b.q.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/m;->a()V
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 5 */
			 (( c.b.q.u0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/u0;->a()V
		 } // :cond_1
		 return;
	 } // .end method
	 public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( c.b.q.m ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/m;->b()Landroid/content/res/ColorStateList;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( c.b.q.m ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/m;->c()Landroid/graphics/PorterDuff$Mode;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.text.Editable getText ( ) {
/* .locals 2 */
/* .line 2 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 3 */
/* invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable; */
/* .line 4 */
} // :cond_0
/* invoke-super {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable; */
} // .end method
public java.lang.CharSequence getText ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( c.b.q.t ) p0 ).getText ( ); // invoke-virtual {p0}, Lc/b/q/t;->getText()Landroid/text/Editable;
} // .end method
public android.view.textclassifier.TextClassifier getTextClassifier ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-ge v0, v1, :cond_1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.b.q.r0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/r0;->a()Landroid/view/textclassifier/TextClassifier;
/* .line 3 */
} // :cond_1
} // :goto_0
/* invoke-super {p0}, Landroid/widget/EditText;->getTextClassifier()Landroid/view/textclassifier/TextClassifier; */
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
c.b.q.u .a ( v0,p1,p0 );
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setTextClassifier ( android.view.textclassifier.TextClassifier p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-ge v0, v1, :cond_1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.b.q.r0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/r0;->a(Landroid/view/textclassifier/TextClassifier;)V
return;
/* .line 3 */
} // :cond_1
} // :goto_0
/* invoke-super {p0, p1}, Landroid/widget/EditText;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V */
return;
} // .end method
